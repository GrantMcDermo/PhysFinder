package com.PhysicsFinder.demo.Data;

import com.PhysicsFinder.demo.entities.*;
import com.PhysicsFinder.demo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedData(
            AncestryRepo ancestryRepo,
            HeritageRepo heritageRepo,
            BackgroundRepo backgroundRepo,
            CharacterClassRepo characterClassRepo,
            FeatRepo featRepo,
            SkillRepo skillRepo,
            AttributeBoostRuleRepo attributeBoostRuleRepo,
            AttributeFlawRuleRepo attributeFlawRuleRepo,
            ClassFeatureChoiceRepo classFeatureChoiceRepo,
            WeaponRepo weaponRepo,
            DeityRepo deityRepo){
        return args -> {
            if(ancestryRepo.count() > 0)
                return;

            Skill acrobatics = new Skill("Acrobatics", "Dexterity");
            Skill athletics = new Skill("Athletics", "Strength");
            Skill arcana = new Skill("Arcana", "Intelligence");
            Skill crafting = new Skill("Crafting", "Intelligence");
            Skill deception = new Skill("Deception", "Charisma");
            Skill diplomacy = new Skill("Diplomacy", "Charisma");
            Skill intimidation = new Skill("Intimidation", "Charisma");
            Skill medicine = new Skill("Medicine", "Wisdom");
            Skill nature = new Skill("Nature", "Wisdom");
            Skill occultism = new Skill("Occultism", "Intelligence");
            Skill performance = new Skill("Performance", "Charisma");
            Skill religion = new Skill("Religion", "Wisdom");
            Skill society = new Skill("Society", "Intelligence");
            Skill stealth = new Skill("Stealth", "Dexterity");
            Skill survival = new Skill("Survival", "Wisdom");
            Skill thievery = new Skill("Thievery", "Dexterity");

            skillRepo.saveAll(List.of(
                    acrobatics,
                    athletics,
                    arcana,
                    crafting,
                    deception,
                    diplomacy,
                    intimidation,
                    medicine,
                    nature,
                    occultism,
                    performance,
                    religion,
                    society,
                    stealth,
                    survival,
                    thievery
            ));

            Weapon crossbow = new Weapon();
            crossbow.setName("Crossbow");
            crossbow.setCategory(WeaponCategory.SIMPLE);

            Weapon warhammer = new Weapon();
            warhammer.setName("Warhammer");
            warhammer.setCategory(WeaponCategory.MARTIAL);

            Weapon sawtoothSaber = new Weapon();
            sawtoothSaber.setName("Sawtooth Saber");
            sawtoothSaber.setCategory(WeaponCategory.ADVANCED);

            weaponRepo.saveAll(List.of(crossbow, warhammer, sawtoothSaber));

            Deity abadar = new Deity();
            abadar.setName("Abadar");
            abadar.setFavoredWeapon(crossbow);
            abadar.setGrantedSkill(society);

            Deity torag = new Deity();
            torag.setName("Torag");
            torag.setFavoredWeapon(warhammer);
            torag.setGrantedSkill(crafting);

            deityRepo.saveAll(List.of(abadar, torag));

            CharacterClass fighter = new CharacterClass("Fighter", 10, List.of("Strength", "Dexterity"));
            fighter.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.EXPERT),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.EXPERT),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.EXPERT),
                    new InitialProficiency("Advanced Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.EXPERT),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Heavy Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Fighter Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));
            ClassSkillChoice fighterSkillChoice = new ClassSkillChoice();
            fighterSkillChoice.setCharacterClass(fighter);
            fighterSkillChoice.setSkillOptions(List.of(acrobatics, athletics));
            fighterSkillChoice.setRank(ProficiencyRank.TRAINED);
            fighterSkillChoice.setNumberToChoose(1);
            fighter.setSkillChoices(List.of(fighterSkillChoice));

            CharacterClass wizard = new CharacterClass("Wizard", 6, List.of("Intelligence"));
            wizard.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.TRAINED),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Arcana", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell Attack Modifier", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell DC", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Wizard Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            CharacterClass psychic = new CharacterClass("Psychic", 6, List.of());
            psychic.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.TRAINED),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Occultism", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell Attack Modifier", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell DC", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Psychic Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            CharacterClass thaumaturge = new CharacterClass("Thaumaturge", 8, List.of("Charisma"));
            thaumaturge.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.EXPERT),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Thaumaturge Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));
            ClassSkillChoice thaumaturgeSkillChoice = new ClassSkillChoice();
            thaumaturgeSkillChoice.setCharacterClass(thaumaturge);
            thaumaturgeSkillChoice.setSkillOptions(List.of(
                    arcana,
                    nature,
                    occultism,
                    religion
            ));
            thaumaturgeSkillChoice.setRank(ProficiencyRank.TRAINED);
            thaumaturgeSkillChoice.setNumberToChoose(1);

            thaumaturge.setSkillChoices(List.of(thaumaturgeSkillChoice));

            CharacterClass rogue = new CharacterClass("Rogue", 8, List.of());
            rogue.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.EXPERT),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Stealth", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Rogue Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            CharacterClass bard = new CharacterClass("Bard", 8, List.of("Charisma"));
            bard.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.EXPERT),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Occultism", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Performance", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell Attack Modifier", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell DC", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Bard Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));
            CharacterClass cleric = new CharacterClass("Cleric", 8, List.of("Wisdom"));
            cleric.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.TRAINED),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Religion", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell Attack Modifier", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell DC", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Cleric Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            CharacterClass druid = new CharacterClass("Druid", 8, List.of("Wisdom"));
            druid.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.TRAINED),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Nature", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell Attack Modifier", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell DC", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Druid Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            CharacterClass ranger = new CharacterClass("Ranger", 10, List.of("Strength", "Dexterity"));
            ranger.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.EXPERT),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Nature", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Survival", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Ranger Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            CharacterClass witch = new CharacterClass("Witch", 6, List.of("Intelligence"));
            witch.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.TRAINED),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell Attack Modifier", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell DC", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Witch Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            characterClassRepo.saveAll(List.of(bard, cleric, druid, fighter, psychic, ranger, rogue, thaumaturge, witch, wizard));

            Ancestry human = new Ancestry("Human", 8, 25, "MEDIUM");
            human.setTraits(List.of("Human", "Humanoid"));
            human.setLanguages(List.of("Common"));

            Ancestry dwarf = new Ancestry("Dwarf", 10, 20, "MEDIUM");
            dwarf.setTraits(List.of("DWARF", "HUMANOID"));
            dwarf.setLanguages(List.of("Common", "Dwarven"));

            Ancestry elf = new Ancestry("Elf", 6, 30, "MEDIUM");
            elf.setTraits(List.of("ELF", "HUMANOID"));
            elf.setLanguages(List.of("Common", "Elven"));

            Ancestry gnome = new Ancestry("Gnome", 8, 25, "SMALL");
            gnome.setTraits(List.of("GNOME", "HUMANOID"));
            gnome.setLanguages(List.of("Common", "Fey", "Gnomish"));

            ancestryRepo.saveAll(List.of(human, dwarf, elf, gnome));

            Heritage skilledHuman = new Heritage("Skilled Human", "You gain an additional trained skill.", HeritageType.ANCESTRY_SPECIFIC, human);

            Heritage ancientBlooded = new Heritage("Ancient Blooded", "Your ancestors' memory grants resistance to magic", HeritageType.ANCESTRY_SPECIFIC, dwarf);

            Heritage ancientElf = new Heritage("Ancient Elf", "In your long life, you've dabbled in many paths and many styles.", HeritageType.ANCESTRY_SPECIFIC, elf);

            Heritage chameleonGnome = new Heritage("Chameleon Gnome", "The color of your hair and skin is mutable, possibly due to latent magic from First World influences or lingering illusion effects.", HeritageType.ANCESTRY_SPECIFIC, gnome);

            Heritage aiuvarin = new Heritage("Aiuvarin", "You have the blood of Elves mixed into your ancestry.", HeritageType.VERSATILE, null);
            aiuvarin.setGrantedAncestryFeatAccess(List.of(elf));

            heritageRepo.saveAll(List.of(skilledHuman, ancientBlooded, ancientElf, chameleonGnome, aiuvarin));

            Feat intimidatingGlare = new Feat("Intimidating Glare", 1, FeatType.SKILL, "Demoralize a creature using only a look.");
            Feat terrainExpert = new Feat("Terrain Expertise", 1, FeatType.SKILL, "You are particularly skilled in rough terrain.");
            Feat assurance = new Feat("Assurance", 1, FeatType.SKILL, "Even in the worst circumstances, you can perform basic tasks.");
            Feat adoptedAncestry = new Feat("Adopted Ancestry", 1, FeatType.GENERAL, "You’re fully immersed in another ancestry’s culture and traditions, whether born into them, earned through rite of passage, or bonded through a deep friendship or romance.");
            Feat shieldBlock = new Feat("Shield Block", 1, FeatType.GENERAL, "You snap your shield in place to ward off a blow.");
            Feat combatAssessment = new Feat("Combat Assessment", 1, FeatType.CLASS, "You make a telegraphed attack to learn about your foe.");
            combatAssessment.setAvailableToClasses(List.of(fighter));
            Feat spellbookProdigy = new Feat("Spellbook Prodigy", 1, FeatType.CLASS, "You are particularly adept at learning spells to add to your spellbook.");
            spellbookProdigy.setAvailableToClasses(List.of(wizard));
            Feat ancestralMind = new Feat("Ancestral Mind", 1, FeatType.CLASS, "By unraveling memories and connections passed down from your progenitors and buried within your unconscious mind, you learn to convert your inherent magic into psychic power.");
            ancestralMind.setAvailableToClasses(List.of(psychic));
            Feat ammunitionThaumaturgy = new Feat("Ammunition Thaumaturgy", 1, FeatType.CLASS, "You're so used to handling your implement, weapon, and esoterica in the heat of combat that adding a few bullets or arrows to the mix is no extra burden.");
            ammunitionThaumaturgy.setAvailableToClasses(List.of(thaumaturge));
            Feat nimbleDodge = new Feat("Nimble Dodge", 1, FeatType.CLASS, "You deftly dodge out of the way, gaining a +2 circumstance bonus to AC against the triggering attack.");
            nimbleDodge.setAvailableToClasses(List.of(rogue));
            Feat bardicLore = new Feat("Bardic Lore", 1, FeatType.CLASS, "Your studies make you informed on every subject.");
            bardicLore.setAvailableToClasses(List.of(bard));
            Feat domainInitiate = new Feat("Domain Initiate", 1, FeatType.CLASS, "Your deity bestows a special spell related to their powers.");
            domainInitiate.setAvailableToClasses(List.of(cleric));
            Feat deadlySimplicity = new Feat("Deadly Simplicity", 1, FeatType.CLASS, "When you are wielding your deity’s favored weapon, increase the damage die size of that weapon by one step.");
            deadlySimplicity.setAvailableToClasses(List.of(cleric));
            Feat leshyFamiliar = new Feat("Leshy Familiar", 1, FeatType.CLASS, "You call a minor spirit of nature into a plant body, creating a leshy companion to aid you in your spellcasting.");
            leshyFamiliar.setAvailableToClasses(List.of(druid));
            Feat animalCompanion = new Feat("Animal Companion", 1, FeatType.CLASS, "You gain the service of a young animal companion that travels with you on your adventures and obeys any simple commands you give it to the best of its abilities.");
            animalCompanion.setAvailableToClasses(List.of(druid, ranger));
            Feat huntedShot = new Feat("Hunted Shot", 1, FeatType.CLASS, "You take two quick shots against the one you hunt.");
            huntedShot.setAvailableToClasses(List.of(ranger));
            Feat cackle = new Feat("Cackle", 1, FeatType.CLASS, "Your patron’s power fills you with confidence, letting you sustain a magical working even as a quick burst of laughter leaves your lips.");
            cackle.setAvailableToClasses(List.of(witch));
            Feat adaptedCantrip = new Feat("Adapted Cantrip", 1, FeatType.ANCESTRY, "Through study of multiple magical traditions, you’ve altered a spell to suit your spellcasting style.");
            adaptedCantrip.setAncestry(human);
            Feat dwarvenDoughtiness = new Feat("Dwarven Doughtiness", 1, FeatType.ANCESTRY, "You are naturally calm and collected in the face of imminent danger.");
            adaptedCantrip.setAncestry(dwarf);
            Feat ancestralLongevity = new Feat("Ancestral Longevity", 1, FeatType.ANCESTRY, "You have accumulated a vast array of lived knowledge over the years.");
            ancestralLongevity.setAncestry(elf);
            Feat nimbleElf = new Feat("Nimble Elf", 1, FeatType.ANCESTRY, "Your muscles are tightly honed.");
            nimbleElf.setAncestry(elf);
            Feat animalAccomplice = new Feat("Animal Accomplice", 1, FeatType.ANCESTRY, "You build a rapport with an animal, which becomes magically bonded to you.");
            animalAccomplice.setAncestry(gnome);
            Feat earnedGlory = new Feat("Earned Glory", 1, FeatType.ANCESTRY, "Elves often struggle with underestimating aiuvarins, and you are experienced at telling stories of your accomplishments to gain their respect.");
            earnedGlory.setHeritage(aiuvarin);
            Feat supernaturalCharm = new Feat("Supernatural Charm", 5, FeatType.ANCESTRY, "The elven magic in your blood manifests as a force you can use to become more appealing or alluring.");
            supernaturalCharm.setHeritage(aiuvarin);
            featRepo.saveAll(List.of(
                    intimidatingGlare, terrainExpert, assurance,
                    adoptedAncestry, shieldBlock,
                    combatAssessment, spellbookProdigy, ancestralMind, ammunitionThaumaturgy, nimbleDodge, bardicLore, domainInitiate, deadlySimplicity, leshyFamiliar, animalCompanion, huntedShot, cackle,
                    adaptedCantrip, dwarvenDoughtiness, ancestralLongevity, nimbleElf, earnedGlory, supernaturalCharm, animalAccomplice));

            Background warrior = new Background("Warrior", "You served as a soldier or mercenary.", List.of(intimidation), "Warfare Lore");
            warrior.setGrantedSkillFeat(intimidatingGlare);

            Background scholar = new Background("Scholar", "You studied ancient texts and forgotten lore.", List.of(arcana, nature, occultism, religion), "Academia Lore");
            scholar.setGrantedSkillFeat(assurance);

            backgroundRepo.saveAll(List.of(warrior, scholar));

            ClassFeatureChoice emotionalAcceptance = new ClassFeatureChoice();
            emotionalAcceptance.setCharacterClass(psychic);
            emotionalAcceptance.setFeatureName("Subconscious Mind");
            emotionalAcceptance.setOptionName("Emotional Acceptance");

            ClassFeatureChoice gatheredLore = new ClassFeatureChoice();
            gatheredLore.setCharacterClass(psychic);
            gatheredLore.setFeatureName("Subconscious Mind");
            gatheredLore.setOptionName("Gathered Lore");

            ClassFeatureChoice mastermind = new ClassFeatureChoice();
            mastermind.setCharacterClass(rogue);
            mastermind.setFeatureName("Racket");
            mastermind.setOptionName("Mastermind");

            FeatureGrantedProficiency mastermindSociety = new FeatureGrantedProficiency();
            mastermindSociety.setClassFeatureChoice(mastermind);
            mastermindSociety.setProficiencyName("Society");
            mastermindSociety.setCategory(ProficiencyCategory.SKILL);
            mastermindSociety.setRank(ProficiencyRank.TRAINED);

            mastermind.setGrantedProficiencies(List.of(mastermindSociety));

            FeatureSkillChoice mastermindSkillChoice = new FeatureSkillChoice();
            mastermindSkillChoice.setClassFeatureChoice(mastermind);
            mastermindSkillChoice.setSkillOptions(List.of(
                    arcana,
                    nature,
                    occultism,
                    religion
            ));
            mastermindSkillChoice.setNumberToChoose(1);
            mastermindSkillChoice.setRank(ProficiencyRank.TRAINED);

            mastermind.setSkillChoices(List.of(mastermindSkillChoice));

            ClassFeatureChoice ruffian = new ClassFeatureChoice();
            ruffian.setCharacterClass(rogue);
            ruffian.setFeatureName("Racket");
            ruffian.setOptionName("Ruffian");

            FeatureGrantedProficiency ruffianIntimidation = new FeatureGrantedProficiency();
            ruffianIntimidation.setClassFeatureChoice(ruffian);
            ruffianIntimidation.setProficiencyName("Intimidation");
            ruffianIntimidation.setCategory(ProficiencyCategory.SKILL);
            ruffianIntimidation.setRank(ProficiencyRank.TRAINED);

            FeatureGrantedProficiency ruffianMediumArmor = new FeatureGrantedProficiency();
            ruffianMediumArmor.setClassFeatureChoice(ruffian);
            ruffianMediumArmor.setProficiencyName("Medium Armor");
            ruffianMediumArmor.setCategory(ProficiencyCategory.DEFENSE);
            ruffianMediumArmor.setRank(ProficiencyRank.TRAINED);

            ruffian.setGrantedProficiencies(List.of(
                    ruffianIntimidation,
                    ruffianMediumArmor
            ));

            ClassFeatureChoice cloisteredCleric = new ClassFeatureChoice();
            cloisteredCleric.setCharacterClass(cleric);
            cloisteredCleric.setFeatureName("Doctrine");
            cloisteredCleric.setOptionName("Cloistered Cleric");

            FeatureGrantedFeat cloisteredDomainInitiate = new FeatureGrantedFeat();
            cloisteredDomainInitiate.setClassFeatureChoice(cloisteredCleric);
            cloisteredDomainInitiate.setFeat(domainInitiate);

            cloisteredCleric.setGrantedFeats(List.of(cloisteredDomainInitiate));

            ClassFeatureChoice warpriest = new ClassFeatureChoice();
            warpriest.setCharacterClass(cleric);
            warpriest.setFeatureName("Doctrine");
            warpriest.setOptionName("Warpriest");

            warpriest.setGrantedProficiencies(List.of(
                    new FeatureGrantedProficiency(warpriest, "Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new FeatureGrantedProficiency(warpriest, "Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new FeatureGrantedProficiency(warpriest, "Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT)
            ));

            FeatureGrantedFeat warpriestShieldBlock = new FeatureGrantedFeat();
            warpriestShieldBlock.setClassFeatureChoice(warpriest);
            warpriestShieldBlock.setFeat(shieldBlock);

            FeatureGrantedFeat warpriestDeadlySimplicity = new FeatureGrantedFeat();
            warpriestDeadlySimplicity.setClassFeatureChoice(warpriest);
            warpriestDeadlySimplicity.setFeat(deadlySimplicity);
            warpriestDeadlySimplicity.setRequiresSimpleOrUnarmedDeityWeapon(true);

            warpriest.setGrantedFeats(List.of(warpriestShieldBlock, warpriestDeadlySimplicity));

            ClassFeatureChoice animalOrder = new ClassFeatureChoice();
            animalOrder.setCharacterClass(druid);
            animalOrder.setFeatureName("Druidic Order");
            animalOrder.setOptionName("Animal");

            FeatureGrantedProficiency animalAthletics = new FeatureGrantedProficiency();
            animalAthletics.setClassFeatureChoice(animalOrder);
            animalAthletics.setProficiencyName("Athletics");
            animalAthletics.setCategory(ProficiencyCategory.SKILL);
            animalAthletics.setRank(ProficiencyRank.TRAINED);

            animalOrder.setGrantedProficiencies(List.of(animalAthletics));

            FeatureGrantedFeat animalOrderFeat = new FeatureGrantedFeat();
            animalOrderFeat.setClassFeatureChoice(animalOrder);
            animalOrderFeat.setFeat(animalCompanion);

            animalOrder.setGrantedFeats(List.of(animalOrderFeat));

            ClassFeatureChoice leafOrder = new ClassFeatureChoice();
            leafOrder.setCharacterClass(druid);
            leafOrder.setFeatureName("Druidic Order");
            leafOrder.setOptionName("Leaf");

            FeatureGrantedProficiency leafDiplomacy = new FeatureGrantedProficiency();
            leafDiplomacy.setClassFeatureChoice(leafOrder);
            leafDiplomacy.setProficiencyName("Diplomacy");
            leafDiplomacy.setCategory(ProficiencyCategory.SKILL);
            leafDiplomacy.setRank(ProficiencyRank.TRAINED);

            leafOrder.setGrantedProficiencies(List.of(leafDiplomacy));

            FeatureGrantedFeat leafOrderFeat = new FeatureGrantedFeat();
            leafOrderFeat.setClassFeatureChoice(leafOrder);
            leafOrderFeat.setFeat(leshyFamiliar);

            leafOrder.setGrantedFeats(List.of(leafOrderFeat));

            ClassFeatureChoice faithsFlamekeeper = new ClassFeatureChoice();
            faithsFlamekeeper.setCharacterClass(witch);
            faithsFlamekeeper.setFeatureName("Patron Theme");
            faithsFlamekeeper.setOptionName("Faith's Flamekeeper");

            FeatureGrantedProficiency faithReligion = new FeatureGrantedProficiency();
            faithReligion.setClassFeatureChoice(faithsFlamekeeper);
            faithReligion.setProficiencyName("Religion");
            faithReligion.setCategory(ProficiencyCategory.SKILL);
            faithReligion.setRank(ProficiencyRank.TRAINED);

            faithsFlamekeeper.setGrantedProficiencies(List.of(faithReligion));

            ClassFeatureChoice silenceInSnow = new ClassFeatureChoice();
            silenceInSnow.setCharacterClass(witch);
            silenceInSnow.setFeatureName("Patron Theme");
            silenceInSnow.setOptionName("Silence in Snow");

            FeatureGrantedProficiency snowNature = new FeatureGrantedProficiency();
            snowNature.setClassFeatureChoice(silenceInSnow);
            snowNature.setProficiencyName("Nature");
            snowNature.setCategory(ProficiencyCategory.SKILL);
            snowNature.setRank(ProficiencyRank.TRAINED);

            silenceInSnow.setGrantedProficiencies(List.of(snowNature));

            classFeatureChoiceRepo.saveAll(List.of(
                    emotionalAcceptance,
                    gatheredLore,
                    mastermind,
                    ruffian,
                    cloisteredCleric,
                    warpriest,
                    animalOrder,
                    leafOrder,
                    faithsFlamekeeper,
                    silenceInSnow
            ));

            AttributeBoostRule humanBoosts = new AttributeBoostRule();
            humanBoosts.setAncestry(human);
            humanBoosts.setBoostType(AttributeBoostType.FREE);
            humanBoosts.setNumberToChoose(2);

            AttributeBoostRule dwarfConBoost = new AttributeBoostRule();
            dwarfConBoost.setAncestry(dwarf);
            dwarfConBoost.setBoostType(AttributeBoostType.FIXED);
            dwarfConBoost.setAttributeOptions(List.of(AttributeName.CONSTITUTION));
            dwarfConBoost.setNumberToChoose(1);

            AttributeBoostRule dwarfWisBoost = new AttributeBoostRule();
            dwarfWisBoost.setAncestry(dwarf);
            dwarfWisBoost.setBoostType(AttributeBoostType.FIXED);
            dwarfWisBoost.setAttributeOptions(List.of(AttributeName.WISDOM));
            dwarfWisBoost.setNumberToChoose(1);

            AttributeBoostRule dwarfFreeBoost = new AttributeBoostRule();
            dwarfFreeBoost.setAncestry(dwarf);
            dwarfFreeBoost.setBoostType(AttributeBoostType.FREE);
            dwarfFreeBoost.setNumberToChoose(1);

            AttributeBoostRule elfDexBoost = new AttributeBoostRule();
            elfDexBoost.setAncestry(elf);
            elfDexBoost.setBoostType(AttributeBoostType.FIXED);
            elfDexBoost.setAttributeOptions(List.of(AttributeName.DEXTERITY));
            elfDexBoost.setNumberToChoose(1);

            AttributeBoostRule elfIntBoost = new AttributeBoostRule();
            elfIntBoost.setAncestry(elf);
            elfIntBoost.setBoostType(AttributeBoostType.FIXED);
            elfIntBoost.setAttributeOptions(List.of(AttributeName.INTELLIGENCE));
            elfIntBoost.setNumberToChoose(1);

            AttributeBoostRule elfFreeBoost = new AttributeBoostRule();
            elfFreeBoost.setAncestry(elf);
            elfFreeBoost.setBoostType(AttributeBoostType.FREE);
            elfFreeBoost.setNumberToChoose(1);

            AttributeBoostRule gnomeConBoost = new AttributeBoostRule();
            gnomeConBoost.setAncestry(gnome);
            gnomeConBoost.setBoostType(AttributeBoostType.FIXED);
            gnomeConBoost.setAttributeOptions(List.of(AttributeName.CONSTITUTION));
            gnomeConBoost.setNumberToChoose(1);

            AttributeBoostRule gnomeChaBoost = new AttributeBoostRule();
            gnomeChaBoost.setAncestry(gnome);
            gnomeChaBoost.setBoostType(AttributeBoostType.FIXED);
            gnomeChaBoost.setAttributeOptions(List.of(AttributeName.CHARISMA));
            gnomeChaBoost.setNumberToChoose(1);

            AttributeBoostRule gnomeFreeBoost = new AttributeBoostRule();
            gnomeFreeBoost.setAncestry(gnome);
            gnomeFreeBoost.setBoostType(AttributeBoostType.FREE);
            gnomeFreeBoost.setNumberToChoose(1);

            AttributeBoostRule scholarMentalBoost = new AttributeBoostRule();
            scholarMentalBoost.setBackground(scholar);
            scholarMentalBoost.setBoostType(AttributeBoostType.CHOICE);
            scholarMentalBoost.setAttributeOptions(List.of(
                    AttributeName.INTELLIGENCE,
                    AttributeName.WISDOM
            ));
            scholarMentalBoost.setNumberToChoose(1);

            AttributeBoostRule scholarFreeBoost = new AttributeBoostRule();
            scholarFreeBoost.setBackground(scholar);
            scholarFreeBoost.setBoostType(AttributeBoostType.FREE);
            scholarFreeBoost.setNumberToChoose(1);

            AttributeBoostRule warriorPhysBoost = new AttributeBoostRule();
            warriorPhysBoost.setBackground(warrior);
            warriorPhysBoost.setBoostType(AttributeBoostType.CHOICE);
            warriorPhysBoost.setAttributeOptions(List.of(AttributeName.STRENGTH, AttributeName.CONSTITUTION));
            warriorPhysBoost.setNumberToChoose(1);

            AttributeBoostRule warriorFreeBoost = new AttributeBoostRule();
            warriorFreeBoost.setBackground(warrior);
            warriorFreeBoost.setBoostType(AttributeBoostType.FREE);
            warriorFreeBoost.setNumberToChoose(1);

            AttributeBoostRule fighterBoost = new AttributeBoostRule();
            fighterBoost.setCharacterClass(fighter);
            fighterBoost.setBoostType(AttributeBoostType.CHOICE);
            fighterBoost.setAttributeOptions(List.of(
                    AttributeName.STRENGTH,
                    AttributeName.DEXTERITY
            ));
            fighterBoost.setNumberToChoose(1);

            AttributeBoostRule wizardBoost = new AttributeBoostRule();
            wizardBoost.setCharacterClass(wizard);
            wizardBoost.setBoostType(AttributeBoostType.FIXED);
            wizardBoost.setAttributeOptions(List.of(AttributeName.INTELLIGENCE));
            wizardBoost.setNumberToChoose(1);

            AttributeBoostRule emotionalAcceptanceBoost = new AttributeBoostRule();
            emotionalAcceptanceBoost.setClassFeatureChoice(emotionalAcceptance);
            emotionalAcceptanceBoost.setBoostType(AttributeBoostType.FIXED);
            emotionalAcceptanceBoost.setAttributeOptions(List.of(AttributeName.CHARISMA));
            emotionalAcceptanceBoost.setNumberToChoose(1);

            AttributeBoostRule gatheredLoreBoost = new AttributeBoostRule();
            gatheredLoreBoost.setClassFeatureChoice(gatheredLore);
            gatheredLoreBoost.setBoostType(AttributeBoostType.FIXED);
            gatheredLoreBoost.setAttributeOptions(List.of(AttributeName.INTELLIGENCE));
            gatheredLoreBoost.setNumberToChoose(1);

            AttributeBoostRule rogueDexBoost = new AttributeBoostRule();
            rogueDexBoost.setCharacterClass(rogue);
            rogueDexBoost.setBoostType(AttributeBoostType.CHOICE);
            rogueDexBoost.setAttributeOptions(List.of(AttributeName.DEXTERITY));
            rogueDexBoost.setNumberToChoose(1);

            AttributeBoostRule mastermindBoost = new AttributeBoostRule();
            mastermindBoost.setClassFeatureChoice(mastermind);
            mastermindBoost.setBoostType(AttributeBoostType.CHOICE);
            mastermindBoost.setAttributeOptions(List.of(AttributeName.INTELLIGENCE));
            mastermindBoost.setNumberToChoose(1);

            AttributeBoostRule ruffianBoost = new AttributeBoostRule();
            ruffianBoost.setClassFeatureChoice(ruffian);
            ruffianBoost.setBoostType(AttributeBoostType.CHOICE);
            ruffianBoost.setAttributeOptions(List.of(AttributeName.STRENGTH));
            ruffianBoost.setNumberToChoose(1);

            AttributeBoostRule thaumaturgeBoost = new AttributeBoostRule();
            thaumaturgeBoost.setCharacterClass(thaumaturge);
            thaumaturgeBoost.setBoostType(AttributeBoostType.FIXED);
            thaumaturgeBoost.setAttributeOptions(List.of(AttributeName.CHARISMA));
            thaumaturgeBoost.setNumberToChoose(1);

            AttributeBoostRule bardBoost = new AttributeBoostRule();
            bardBoost.setCharacterClass(bard);
            bardBoost.setBoostType(AttributeBoostType.FIXED);
            bardBoost.setAttributeOptions(List.of(AttributeName.CHARISMA));
            bardBoost.setNumberToChoose(1);

            AttributeBoostRule clericBoost = new AttributeBoostRule();
            clericBoost.setCharacterClass(cleric);
            clericBoost.setBoostType(AttributeBoostType.FIXED);
            clericBoost.setAttributeOptions(List.of(AttributeName.WISDOM));
            clericBoost.setNumberToChoose(1);

            AttributeBoostRule druidBoost = new AttributeBoostRule();
            druidBoost.setCharacterClass(druid);
            druidBoost.setBoostType(AttributeBoostType.FIXED);
            druidBoost.setAttributeOptions(List.of(AttributeName.WISDOM));
            druidBoost.setNumberToChoose(1);

            AttributeBoostRule rangerBoost = new AttributeBoostRule();
            rangerBoost.setCharacterClass(ranger);
            rangerBoost.setBoostType(AttributeBoostType.CHOICE);
            rangerBoost.setAttributeOptions(List.of(
                    AttributeName.STRENGTH,
                    AttributeName.DEXTERITY
            ));
            rangerBoost.setNumberToChoose(1);

            AttributeBoostRule witchBoost = new AttributeBoostRule();
            witchBoost.setCharacterClass(witch);
            witchBoost.setBoostType(AttributeBoostType.FIXED);
            witchBoost.setAttributeOptions(List.of(AttributeName.INTELLIGENCE));
            witchBoost.setNumberToChoose(1);

            attributeBoostRuleRepo.saveAll(List.of(
                    humanBoosts,
                    dwarfConBoost,
                    dwarfWisBoost,
                    dwarfFreeBoost,
                    elfDexBoost,
                    elfIntBoost,
                    elfFreeBoost,
                    scholarMentalBoost,
                    scholarFreeBoost,
                    warriorPhysBoost,
                    warriorFreeBoost,
                    fighterBoost,
                    wizardBoost,
                    emotionalAcceptanceBoost,
                    gatheredLoreBoost,
                    rogueDexBoost,
                    mastermindBoost,
                    ruffianBoost,
                    thaumaturgeBoost,
                    bardBoost,
                    clericBoost,
                    druidBoost,
                    rangerBoost,
                    witchBoost
            ));

            AttributeFlawRule dwarfFlaw = new AttributeFlawRule();
            dwarfFlaw.setAncestry(dwarf);
            dwarfFlaw.setAttributeOptions(List.of(AttributeName.CHARISMA));
            dwarfFlaw.setNumberToChoose(1);

            AttributeFlawRule elfFlaw = new AttributeFlawRule();
            elfFlaw.setAncestry(elf);
            elfFlaw.setAttributeOptions(List.of(AttributeName.CONSTITUTION));
            elfFlaw.setNumberToChoose(1);

            AttributeFlawRule gnomeFlaw = new AttributeFlawRule();
            gnomeFlaw.setAncestry(gnome);
            gnomeFlaw.setAttributeOptions(List.of(AttributeName.STRENGTH));
            gnomeFlaw.setNumberToChoose(1);

            attributeFlawRuleRepo.saveAll(List.of(
                    dwarfFlaw,
                    elfFlaw,
                    gnomeFlaw
            ));

            System.out.println("===== PATHFINDER DATA SEEDED =====");

        };
    }
}
