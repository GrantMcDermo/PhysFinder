package com.PhysicsFinder.demo.services;

import com.PhysicsFinder.demo.DTO.*;
import com.PhysicsFinder.demo.entities.*;
import com.PhysicsFinder.demo.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class CharacterCreationService {

    private final PlayerCharacterRepo playerCharacterRepo;
    private final AncestryRepo ancestryRepo;
    private final HeritageRepo heritageRepo;
    private final FeatRepo featRepo;
    private final CharacterClassRepo characterClassRepo;
    private final BackgroundRepo backgroundRepo;
    private final SkillRepo skillRepo;
    private final AttributeBoostRuleRepo attributeBoostRuleRepo;
    private final AttributeFlawRuleRepo attributeFlawRuleRepo;
    private final ClassFeatureChoiceRepo classFeatureChoiceRepo;
    private final DeityRepo deityRepo;
    private final WeaponRepo weaponRepo;
    private final LanguageRepo languageRepo;

    public PlayerCharacter createBlankCharacter(CreateCharacterRequest request){
        PlayerCharacter sheet = new PlayerCharacter();
        sheet.setName(request.characterName());
        sheet.setLevel(1);
        sheet.setAttributes(new AttributeModifiers());

        return playerCharacterRepo.save(sheet);
    }

    public PlayerCharacter assignAncestry(UUID characterId, AssignAncestryRequest request){
        PlayerCharacter sheet = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found."));
        Ancestry ancestry = ancestryRepo.findById(request.ancestryId()).orElseThrow(() -> new RuntimeException("Ancestry not found"));

        sheet.setAncestry(ancestry);
        sheet.setHeritage(null);
        sheet.setSpeed(ancestry.getSpeed());
        sheet.setSize(ancestry.getSize());
        rebuildTraitsAndSenses(sheet);
        rebuildLanguages(sheet);

        recalculateDerivedStats(sheet);

        return playerCharacterRepo.save(sheet);
    }

    private void rebuildLanguages(PlayerCharacter character){
        character.getKnownLanguages().clear();

        if(character.getAncestry() == null)
            return;

        character.getKnownLanguages().addAll(character.getAncestry().getStartingLanguages());
        character.getKnownLanguages().addAll(character.getChosenAdditionalLanguages());
    }

    public PlayerCharacter assignAdditionalLanguages(UUID characterId, AssignLanguagesRequest request){
        PlayerCharacter character = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found."));
        List<Language> chosenLanguages = new ArrayList<>();
        for(UUID additionalLanguageId : request.chosenAdditionalLanguageIds()){
            Language chosenLanguage = languageRepo.findById(additionalLanguageId).orElseThrow(() -> new RuntimeException("Language not found."));
            chosenLanguages.add(chosenLanguage);
        }

        validateAdditionalLanguages(character, chosenLanguages);
        character.setChosenAdditionalLanguages(chosenLanguages);
        rebuildLanguages(character);
        return playerCharacterRepo.save(character);
    }

    private void validateAdditionalLanguages(PlayerCharacter character, List<Language> selectedLanguages) {
        int intelligenceModifier = character.getAttributes().getIntelligence();
        int expectedCount = character.getAncestry().getAdditionalLanguageBase() + Math.max(0, intelligenceModifier);

        if (selectedLanguages.size() != expectedCount)
            throw new RuntimeException("Expected " + expectedCount + " additional languages.");
    }

    public PlayerCharacter assignHeritage(UUID characterId, AssignHeritageRequest request){
        PlayerCharacter character = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found."));

        if(character.getAncestry() == null)
            throw new RuntimeException("Choose an ancestry before choosing a heritage");

        Heritage heritage = heritageRepo.findById(request.heritageId()).orElseThrow(() -> new RuntimeException("Heritage not found"));

        boolean isAncestrySpecific = heritage.getHeritageType() == HeritageType.ANCESTRY_SPECIFIC;
        boolean isVersatile = heritage.getHeritageType() == HeritageType.VERSATILE;

        if(isAncestrySpecific && !heritage.getAncestry().getId().equals(character.getAncestry().getId()))
            throw new RuntimeException("Heritage does not belong to selected ancestry");

        if(!isAncestrySpecific && !isVersatile)
            throw new RuntimeException("Invalid heritage type");

        character.setHeritage(heritage);

        rebuildTraitsAndSenses(character);

        return playerCharacterRepo.save(character);
    }

    private void rebuildTraitsAndSenses(PlayerCharacter character){
        character.getTraits().clear();
        character.getSenses().clear();

        Ancestry ancestry = character.getAncestry();
        Heritage heritage = character.getHeritage();

        if (ancestry != null) {
            character.getTraits().addAll(ancestry.getTraits());

            for (SenseType sense : ancestry.getSenses()) {
                addSense(character, sense);
            }
        }

        if (heritage != null) {
            character.getTraits().removeAll(heritage.getTraitsToRemove());
            character.getTraits().addAll(heritage.getTraits());

            for (SenseType sense : heritage.getSenses()) {
                addSense(character, sense);
            }
        }
    }

    private void addSense(PlayerCharacter character, SenseType senseType){
        if (senseType == SenseType.DARKVISION) {
            character.getSenses().remove(SenseType.LOW_LIGHT_VISION);
            character.getSenses().add(SenseType.DARKVISION);
            return;
        }

        if (senseType == SenseType.LOW_LIGHT_VISION) {
            if (character.getSenses().contains(SenseType.DARKVISION)) {
                return;
            }

            if (character.getSenses().contains(SenseType.LOW_LIGHT_VISION)) {
                character.getSenses().remove(SenseType.LOW_LIGHT_VISION);
                character.getSenses().add(SenseType.DARKVISION);
                return;
            }

            character.getSenses().add(SenseType.LOW_LIGHT_VISION);
            return;
        }

        character.getSenses().add(senseType);
    }

    public PlayerCharacter assignBackground(UUID characterId, AssignBackgroundRequest request){
        PlayerCharacter sheet = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found"));
        Background background = backgroundRepo.findById(request.backgroundId()).orElseThrow(() -> new RuntimeException("Background not found"));
        Skill chosenSkill = skillRepo.findById(request.chosenBackgroundSkillId()).orElseThrow(() -> new RuntimeException("Skill not found"));

        validateBackgroundSkillChoice(background, chosenSkill);

        sheet.setBackground(background);
        sheet.setChosenBackgroundSkill(chosenSkill);
        rebuildProficiencies(sheet);
        return playerCharacterRepo.save(sheet);
    }

    public PlayerCharacter assignClass(UUID characterId, AssignClassRequest request){
        PlayerCharacter sheet = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found"));
        CharacterClass characterClass = characterClassRepo.findById(request.characterClassId()).orElseThrow(() -> new RuntimeException("Class not found"));
        List<ClassFeatureChoice> selectedFeatureChoices = classFeatureChoiceRepo.findAllById(request.selectedClassFeatureChoiceIds());

        for (ClassFeatureChoice choice : selectedFeatureChoices) {
            if (!choice.getCharacterClass().getId().equals(characterClass.getId()))
                throw new RuntimeException("Class feature choice does not belong to selected class");
        }

        List<Skill> chosenSkills = skillRepo.findAllById(request.chosenClassSkillIds());
        List<Skill> chosenFeatureSkills = skillRepo.findAllById(request.chosenFeatureSkillIds());
        List<Skill> chosenAdditionalSkills = skillRepo.findAllById(request.chosenAdditionalSkillIds());

        Deity deity = null;

        if (request.deityId() != null){
            deity = deityRepo.findById(request.deityId()).orElseThrow(() -> new RuntimeException("Deity not found"));
            sheet.setDeity(deity);
        }

        if (deity != null && request.chosenDeityWeaponId() != null) {
            Weapon chosenDeityWeapon = weaponRepo.findById(request.chosenDeityWeaponId()).orElseThrow(() -> new RuntimeException("Chosen deity weapon not found"));

            if (!deity.getFavoredWeaponOptions().contains(chosenDeityWeapon))
                throw new RuntimeException("Chosen weapon is not available for this deity");

            sheet.setChosenDeityWeapon(chosenDeityWeapon);
        }

        if (deity != null && request.chosenDeitySkillId() != null) {
            Skill chosenDeitySkill = skillRepo.findById(request.chosenDeitySkillId()).orElseThrow(() -> new RuntimeException("Chosen deity skill not found"));

            if (!deity.getGrantedSkillOptions().contains(chosenDeitySkill))
                throw new RuntimeException("Chosen skill is not available for this deity");

            sheet.setChosenDeitySkill(chosenDeitySkill);
        }

        validateClassSkillChoices(characterClass, chosenSkills);
        validateFeatureSkillChoices(selectedFeatureChoices, chosenFeatureSkills);
        validateAdditionalTrainedSkills(sheet, characterClass, chosenAdditionalSkills);

        sheet.setCharacterClass(characterClass);
        sheet.setSelectedClassFeatureChoices(selectedFeatureChoices);
        sheet.setChosenClassSkills(chosenSkills);
        sheet.setChosenAdditionalTrainedSkills(chosenAdditionalSkills);
        copyInitialClassProficiencies(sheet, characterClass, chosenSkills, selectedFeatureChoices, chosenFeatureSkills, chosenAdditionalSkills);
        recalculateDerivedStats(sheet);
        return playerCharacterRepo.save(sheet);
    }

    private void validateAdditionalTrainedSkills(PlayerCharacter character, CharacterClass characterClass, List<Skill> chosenAdditionalSkills){
        if(chosenAdditionalSkills == null)
            chosenAdditionalSkills = List.of();

        int intelligenceModifier = character.getAttributes() == null ? 0 : character.getAttributes().getIntelligence();
        int expectedCount = characterClass.getAdditionalTrainedSkillsBase() + intelligenceModifier;

        if(chosenAdditionalSkills.size() != expectedCount)
            throw new RuntimeException("Invalid number of additional trained skills. Expected " + expectedCount + ", got " + chosenAdditionalSkills.size());
    }

    private void validateClassSkillChoices(CharacterClass characterClass, List<Skill> chosenSkills){
        for(ClassSkillChoice choice : characterClass.getSkillChoices()){
            long matchingChoices = chosenSkills.stream().filter(skill -> choice.getSkillOptions().contains(skill)).count();
            if(matchingChoices != choice.getNumberToChoose())
                throw new RuntimeException("Invalid class skill choice");
        }
    }

    private void validateFeatureSkillChoices(List<ClassFeatureChoice> selectedFeatureChoices, List<Skill> chosenFeatureSkills){
        if(chosenFeatureSkills == null)
            chosenFeatureSkills = List.of();

        for(ClassFeatureChoice featureChoice : selectedFeatureChoices){
            for(FeatureSkillChoice skillChoice : featureChoice.getSkillChoices()){
                long matchingChoices = chosenFeatureSkills.stream().filter(skill -> skillChoice.getSkillOptions().contains(skill)).count();

                if(matchingChoices != skillChoice.getNumberToChoose())
                    throw new RuntimeException("Invalid skill choice for feature: " + featureChoice.getFeatureName() + " - " + featureChoice.getOptionName());
            }
        }
    }

    private void copyInitialClassProficiencies(PlayerCharacter sheet, CharacterClass characterClass, List<Skill> chosenSkills, List<ClassFeatureChoice> selectedFeatureChoices, List<Skill> chosenFeatureSkills, List<Skill> chosenAdditionalSkills){
        sheet.getProficiencies().clear();

        for(InitialProficiency proficiency : characterClass.getInitialProficiencies()){
            addProficiency(sheet, proficiency.getProficiencyName(), proficiency.getProficiencyCategory(), proficiency.getRank());
        }

        for (Skill skill : chosenSkills) {
            addProficiency(sheet, skill.getName(), ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
        }

        if(sheet.getDeity() != null && characterClass.getUsesDeitySkill() && sheet.getChosenDeitySkill() != null){
            addProficiency(sheet, sheet.getChosenDeitySkill().getName(), ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
        }

        if(sheet.getDeity() != null && characterClass.getUsesDeityFavoredWeapon() && sheet.getChosenDeityWeapon() != null){
            addProficiency(sheet, sheet.getChosenDeityWeapon().getName(), ProficiencyCategory.WEAPON, ProficiencyRank.TRAINED);
        }

        for (ClassFeatureChoice featureChoice : selectedFeatureChoices) {
            for (FeatureGrantedProficiency granted : featureChoice.getGrantedProficiencies()) {
                addProficiency(sheet, granted.getProficiencyName(), granted.getCategory(), granted.getRank());
            }
        }

        for(ClassFeatureChoice featureChoice : selectedFeatureChoices){
            for (FeatureGrantedFeat grantedFeat : featureChoice.getGrantedFeats()){
                if(grantedFeat.getRequiresSimpleOrUnarmedDeityWeapon()){
                    Weapon deityWeapon = sheet.getChosenDeityWeapon();
                    boolean qualifies = deityWeapon.getCategory() == WeaponCategory.SIMPLE || deityWeapon.getCategory() == WeaponCategory.UNARMED;
                    if(!qualifies)
                        continue;
                }
                addSelectedFeat(sheet, grantedFeat.getFeat());
            }
        }

        for (Skill skill : chosenFeatureSkills) {
            addProficiency(sheet, skill.getName(), ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
        }

        for(Skill skill : chosenAdditionalSkills){
            addProficiency(sheet, skill.getName(), ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
        }
    }

    private void addProficiency(PlayerCharacter character, String name, ProficiencyCategory category, ProficiencyRank rank){
        Optional<CharacterProficiency> existing = character.getProficiencies().stream().filter(p -> p.getProficiencyName().equals(name) && p.getCategory() == category).findFirst();

        if (existing.isPresent()) {
            if (rank.ordinal() > existing.get().getRank().ordinal())
                existing.get().setRank(rank);

            return;
        }
        CharacterProficiency proficiency = new CharacterProficiency();
        proficiency.setPlayerCharacter(character);
        proficiency.setProficiencyName(name);
        proficiency.setCategory(category);
        proficiency.setRank(rank);

        character.getProficiencies().add(proficiency);
    }

    private void addSelectedFeat(PlayerCharacter sheet, Feat feat){
        SelectedFeat selectedFeat = new SelectedFeat(sheet, feat);
        sheet.getSelectedFeats().add(selectedFeat);
    }

    private void recalculateDerivedStats(PlayerCharacter sheet){
        if(sheet.getAncestry() != null){
            sheet.setSpeed(sheet.getAncestry().getSpeed());
            sheet.setSize(sheet.getAncestry().getSize());
        }

        if(sheet.getAncestry() != null && sheet.getCharacterClass() != null){
            int ancestryHp = sheet.getAncestry().getHitPoints();
            int constitution = sheet.getAttributes().getConstitution();
            int classAndConHp = (sheet.getCharacterClass().getHitPointsPerLevel() + constitution) * sheet.getLevel();

            sheet.setMaxHitPoints(ancestryHp + classAndConHp);
        }
    }

    public List<Feat> getAvailableAncestryFeats(UUID characterId){
        PlayerCharacter sheet = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found"));
        List<UUID> ancestryIds = new ArrayList<>();

        if(sheet.getAncestry() != null)
            ancestryIds.add(sheet.getAncestry().getId());

        if (sheet.getHeritage() != null)
            sheet.getHeritage().getGrantedAncestryFeatAccess().forEach(ancestry -> ancestryIds.add(ancestry.getId()));

        List<Feat> ancestryFeats = ancestryIds.isEmpty() ? List.of() : featRepo.findByAncestryIdIn(ancestryIds);

        List<Feat> heritageFeats = sheet.getHeritage() == null ? List.of() : featRepo.findByHeritageIdAndFeatType(sheet.getHeritage().getId(), FeatType.ANCESTRY);

        List<Feat> result = new ArrayList<>();
        result.addAll(ancestryFeats);
        result.addAll(heritageFeats);
        return result;
    }

    public PlayerCharacter selectFeat(UUID characterId, SelectFeatRequest request){
        PlayerCharacter sheet = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found"));
        Feat feat = featRepo.findById(request.featId()).orElseThrow(() -> new RuntimeException("Feat not found"));

        if(feat.getFeatType() == FeatType.ANCESTRY){
            List<Feat> availableFeats = getAvailableAncestryFeats(characterId);
            if(!availableFeats.contains(feat))
                throw new RuntimeException("This ancestry feat is not available to this character");
        }

        SelectedFeat selectedFeat = new SelectedFeat(sheet, feat);

        sheet.getSelectedFeats().add(selectedFeat);

        return playerCharacterRepo.save(sheet);
    }

    public PlayerCharacter applyAttributeBoosts(UUID characterId, ApplyAttributeBoostRequest request){
        PlayerCharacter sheet = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found"));

        validateAttributeBoosts(sheet, request);

        sheet.getChosenAttributeBoosts().clear();
        sheet.getChosenAttributeFlaws().clear();

        AttributeModifiers attributes = new AttributeModifiers();

        applyBoostList(sheet, attributes, request.ancestryBoosts(), "ANCESTRY");
        applyFlawList(sheet, attributes, request.ancestryFlaws(), "ANCESTRY");
        applyBoostList(sheet, attributes, request.backgroundBoosts(), "BACKGROUND");
        applyBoostList(sheet, attributes, request.classBoosts(), "CLASS");
        applyBoostList(sheet, attributes, request.freeBoosts(), "FREE");

        sheet.setAttributes(attributes);
        recalculateDerivedStats(sheet);
        return playerCharacterRepo.save(sheet);
    }

    private void validateAttributeBoosts(PlayerCharacter sheet, ApplyAttributeBoostRequest request){
        if (sheet.getAncestry() == null)
            throw new RuntimeException("Choose an ancestry before applying ancestry boosts.");

        if(sheet.getBackground() == null)
            throw new RuntimeException("Choose a background before applying background boosts.");

        if(sheet.getCharacterClass() == null)
            throw new RuntimeException("Choose a class before applying class boosts.");

        validateBoostGroup(attributeBoostRuleRepo.findByAncestryId(sheet.getAncestry().getId()), request.ancestryBoosts(), "ancestry");
        validateFlawGroup(attributeFlawRuleRepo.findByAncestryId(sheet.getAncestry().getId()), request.ancestryFlaws(), "ancestry");
        validateBoostGroup(attributeBoostRuleRepo.findByBackgroundId(sheet.getBackground().getId()), request.backgroundBoosts(), "background");
        validateBoostGroup(getClassBoostRules(sheet), request.classBoosts(), "class");
    }

    private List<AttributeBoostRule> getClassBoostRules(PlayerCharacter sheet) {
        List<AttributeBoostRule> rules = new ArrayList<>();

        rules.addAll(
                attributeBoostRuleRepo.findByCharacterClassId(
                        sheet.getCharacterClass().getId()
                )
        );

        for (ClassFeatureChoice choice : sheet.getSelectedClassFeatureChoices()) {
            rules.addAll(
                    attributeBoostRuleRepo.findByClassFeatureChoiceId(
                            choice.getId()
                    )
            );
        }

        return rules;
    }

    private void validateBoostGroup(List<AttributeBoostRule> rules, List<AttributeName> chosenBoosts, String source){
        if(chosenBoosts == null)
            chosenBoosts = List.of();

        Set<AttributeName> uniqueBoosts = new HashSet<>(chosenBoosts);

        if(uniqueBoosts.size() != chosenBoosts.size())
            throw new RuntimeException("You cannot choose the same attribute more than once for " + source + " boosts.");

        int requiredBoostCount = rules.stream().mapToInt(AttributeBoostRule::getNumberToChoose).sum();

        if(chosenBoosts.size() != requiredBoostCount)
            throw new RuntimeException("Invalid number of " + source + " boosts. Expected " + requiredBoostCount + ", got " + chosenBoosts.size());

        List<AttributeName> remainingChoices = new ArrayList<>(chosenBoosts);

        for(AttributeBoostRule rule : rules){
            List<AttributeName> selectedForRule = remainingChoices.stream().filter(attribute -> isValidForRule(attribute, rule)).limit(rule.getNumberToChoose()).toList();

            if(selectedForRule.size() != rule.getNumberToChoose())
                throw new RuntimeException("Invalid " + source + " boost choice.");

            remainingChoices.removeAll(selectedForRule);
        }

        if(!remainingChoices.isEmpty())
            throw new RuntimeException("Invalid extra " + source + " boost choices.");
    }

    private void validateFlawGroup(List<AttributeFlawRule> rules, List<AttributeName> chosenFlaws, String source){
        if(chosenFlaws == null)
            chosenFlaws = List.of();

        int requiredFlawCount = rules.stream().mapToInt(AttributeFlawRule::getNumberToChoose).sum();

        if(chosenFlaws.size() != requiredFlawCount)
            throw new RuntimeException("Invalid number of " + source + " flaws. Expected " + requiredFlawCount + ", got " + chosenFlaws.size());

        List<AttributeName> remainingChoices = new ArrayList<>(chosenFlaws);

        for(AttributeFlawRule rule : rules){
            List<AttributeName> selectedForRule = remainingChoices.stream().filter(attribute -> rule.getAttributeOptions().contains(attribute)).limit(rule.getNumberToChoose()).toList();

            if(selectedForRule.size() != rule.getNumberToChoose())
                throw new RuntimeException("Invalid " + source + " flaw choice.");

            remainingChoices.removeAll(selectedForRule);
        }

        if(!remainingChoices.isEmpty())
            throw new RuntimeException("Invalid extra " + source + " flaw choices.");
    }

    private boolean isValidForRule(AttributeName attribute, AttributeBoostRule rule){
        if(rule.getBoostType() == AttributeBoostType.FREE)
            return true;

        return rule.getAttributeOptions().contains(attribute);
    }

    private void applyBoostList(PlayerCharacter sheet, AttributeModifiers attributes, List<AttributeName> boosts, String source){
        if (boosts == null)
            return;

        for(AttributeName boost : boosts){
            attributes.increase(boost);
            ChosenAttributeBoost chosenBoost = new ChosenAttributeBoost();
            chosenBoost.setPlayerCharacter(sheet);
            chosenBoost.setAttributeName(boost);
            chosenBoost.setSource(source);

            sheet.getChosenAttributeBoosts().add(chosenBoost);
        }
    }

    private void applyFlawList(PlayerCharacter sheet, AttributeModifiers attributes, List<AttributeName> flaws, String source){
        if(flaws == null)
            return;

        for (AttributeName flaw : flaws) {
            attributes.decrease(flaw);

            ChosenAttributeFlaw chosenFlaw = new ChosenAttributeFlaw();
            chosenFlaw.setPlayerCharacter(sheet);
            chosenFlaw.setAttributeName(flaw);
            chosenFlaw.setSource(source);

            sheet.getChosenAttributeFlaws().add(chosenFlaw);
        }

    }

    public PlayerCharacter assignAdditionalSkills(UUID characterId, AssignAdditionalSkillsRequest request){
        PlayerCharacter character = playerCharacterRepo.findById(characterId).orElseThrow(() -> new RuntimeException("Character not found"));

        if(character.getCharacterClass() == null)
            throw new RuntimeException("Choose a class before choosing additional skills.");

        List<Skill> chosenSkills = skillRepo.findAllById(request.chosenAdditionalSkillIds());

        validateAdditionalTrainedSkills(character, chosenSkills);
        character.setChosenAdditionalTrainedSkills(chosenSkills);
        rebuildProficiencies(character);
        return playerCharacterRepo.save(character);
    }

    private void validateAdditionalTrainedSkills(PlayerCharacter character, List<Skill> chosenSkills) {
        int allowedCount = getAllowedAdditionalSkillCount(character);
        if(chosenSkills.size() != allowedCount)
            throw new RuntimeException("Invalid number of additional trained skills. Expected " + allowedCount + ", got " + chosenSkills.size());
    }

    private int getAllowedAdditionalSkillCount(PlayerCharacter character) {
        int base = character.getCharacterClass().getAdditionalTrainedSkillsBase();
        int intelligenceModifier = character.getAttributes() == null ? 0 : character.getAttributes().getIntelligence();
        return base + intelligenceModifier;
    }

    private boolean hasValidAdditionalSkillCount(PlayerCharacter character) {
        return character.getChosenAdditionalTrainedSkills().size()
                == getAllowedAdditionalSkillCount(character);
    }

    private void rebuildProficiencies(PlayerCharacter character) {
        character.getProficiencies().clear();
        applyClassProficiencies(character);
        applyBackgroundProficiencies(character);
        applyDeityProficiencies(character);
        applyFeatureChoiceProficiencies(character);
        applyAdditionalSkillProficiencies(character);
        applyFeatProficiencies(character);
    }

    private void applyClassProficiencies(PlayerCharacter character) {

        CharacterClass characterClass = character.getCharacterClass();

        if (characterClass == null) {
            return;
        }

        for (InitialProficiency proficiency :
                characterClass.getInitialProficiencies()) {

            addProficiency(
                    character,
                    proficiency.getProficiencyName(),
                    proficiency.getProficiencyCategory(),
                    proficiency.getRank()
            );
        }
    }

    private void applyBackgroundProficiencies(PlayerCharacter character) {

        if (character.getBackground() == null) {
            return;
        }

        if (character.getChosenBackgroundSkill() != null) {

            addProficiency(
                    character,
                    character.getChosenBackgroundSkill().getName(),
                    ProficiencyCategory.SKILL,
                    ProficiencyRank.TRAINED
            );
        }
    }

    private void applyDeityProficiencies(PlayerCharacter character) {

        if (character.getDeity() == null)
            return;

        CharacterClass characterClass = character.getCharacterClass();

        if (characterClass == null)
            return;

        if (characterClass.getUsesDeitySkill() && character.getChosenDeitySkill() != null) {
            addProficiency(
                    character,
                    character.getChosenDeitySkill().getName(),
                    ProficiencyCategory.SKILL,
                    ProficiencyRank.TRAINED
            );
        }

        if (characterClass.getUsesDeityFavoredWeapon() && character.getChosenDeityWeapon() != null) {

            addProficiency(
                    character,
                    character.getChosenDeityWeapon().getName(),
                    ProficiencyCategory.WEAPON,
                    ProficiencyRank.TRAINED
            );
        }
    }

    private void applyFeatureChoiceProficiencies(PlayerCharacter character) {
        for (ClassFeatureChoice choice : character.getSelectedClassFeatureChoices()) {
            for (FeatureGrantedProficiency granted : choice.getGrantedProficiencies()) {
                addProficiency(
                        character,
                        granted.getProficiencyName(),
                        granted.getCategory(),
                        granted.getRank()
                );
            }
        }
    }

    private void applyAdditionalSkillProficiencies(PlayerCharacter character) {
        for (Skill skill : character.getChosenAdditionalTrainedSkills()) {
            addProficiency(
                    character,
                    skill.getName(),
                    ProficiencyCategory.SKILL,
                    ProficiencyRank.TRAINED
            );
        }
    }

    private void applyFeatProficiencies(PlayerCharacter character) {
        for (SelectedFeat selectedFeat : character.getSelectedFeats()) {
            Feat feat = selectedFeat.getFeat();
            // future feat-granted proficiencies
        }
    }

    private void validateBackgroundSkillChoice(Background background, Skill chosenSkill) {
        if (!background.getTrainedSkillOptions().contains(chosenSkill))
            throw new RuntimeException("Selected skill is not valid for background " + background.getName());
    }
}
