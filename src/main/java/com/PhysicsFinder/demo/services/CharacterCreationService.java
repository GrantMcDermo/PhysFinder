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

        recalculateDerivedStats(sheet);

        return playerCharacterRepo.save(sheet);
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

    private void copyAncestryAndHeritageTraitsAndSenses(PlayerCharacter character, Ancestry ancestry, Heritage heritage){
        character.getTraits().clear();
        character.getSenses().clear();

        character.getTraits().addAll(ancestry.getTraits());

        for(SenseType sense : ancestry.getSenses()){
            addSense(character, sense);
        }

        if(heritage != null){
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

        if(!background.getTrainedSkillOptions().contains(chosenSkill))
            throw new RuntimeException("Invalid background skill choice");

        sheet.setBackground(background);
        sheet.setChosenBackgroundSkill(chosenSkill);
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

        Deity deity = null;

        if (request.deityId() != null){
            deity = deityRepo.findById(request.deityId()).orElseThrow(() -> new RuntimeException("Deity not found"));
            sheet.setDeity(deity);
        }

        validateClassSkillChoices(characterClass, chosenSkills);
        validateFeatureSkillChoices(selectedFeatureChoices, chosenFeatureSkills);

        sheet.setCharacterClass(characterClass);
        sheet.setSelectedClassFeatureChoices(selectedFeatureChoices);
        sheet.setChosenClassSkills(chosenSkills);
        copyInitialClassProficiences(sheet, characterClass, chosenSkills, selectedFeatureChoices, chosenFeatureSkills);
        recalculateDerivedStats(sheet);
        return playerCharacterRepo.save(sheet);
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

    private void copyInitialClassProficiences(PlayerCharacter sheet, CharacterClass characterClass, List<Skill> chosenSkills, List<ClassFeatureChoice> selectedFeatureChoices, List<Skill> chosenFeatureSkills){
        sheet.getProficiencies().clear();

        for(InitialProficiency proficiency : characterClass.getInitialProficiencies()){
            addProficiency(sheet, proficiency.getProficiencyName(), proficiency.getProficiencyCategory(), proficiency.getRank());
        }

        for (Skill skill : chosenSkills) {
            addProficiency(sheet, skill.getName(), ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
        }

        if(sheet.getDeity() != null){
            addProficiency(sheet, sheet.getDeity().getGrantedSkill().getName(), ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            addProficiency(sheet, sheet.getDeity().getFavoredWeapon().getName(), ProficiencyCategory.WEAPON, ProficiencyRank.TRAINED);
        }

        for (ClassFeatureChoice featureChoice : selectedFeatureChoices) {
            for (FeatureGrantedProficiency granted : featureChoice.getGrantedProficiencies()) {
                addProficiency(sheet, granted.getProficiencyName(), granted.getCategory(), granted.getRank());
            }
        }

        for(ClassFeatureChoice featureChoice : selectedFeatureChoices){
            for (FeatureGrantedFeat grantedFeat : featureChoice.getGrantedFeats()){
                if(grantedFeat.getRequiresSimpleOrUnarmedDeityWeapon()){
                    Weapon deityWeapon = sheet.getDeity().getFavoredWeapon();
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
    }

    private void addProficiency(PlayerCharacter character, String name, ProficiencyCategory category, ProficiencyRank rank){
        CharacterProficiency proficiency = new CharacterProficiency();
        proficiency.setPlayerCharacter(character);
        proficiency.setProficiencyName(name);
        proficiency.setCategory(category);
        proficiency.setRank(rank);

        character.getProficiencies().add(proficiency);
    }

    private void addSelectedFeat(PlayerCharacter sheet, Feat feat){
        SelectedFeat selectedFeat = new SelectedFeat();
        selectedFeat.setPlayerCharacter(sheet);
        selectedFeat.setFeat(feat);
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

        SelectedFeat selectedFeat = new SelectedFeat();
        selectedFeat.setPlayerCharacter(sheet);
        selectedFeat.setFeat(feat);

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
}
