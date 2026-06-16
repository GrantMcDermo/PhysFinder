package com.PhysicsFinder.demo.Data;

import com.PhysicsFinder.demo.entities.*;
import com.PhysicsFinder.demo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.classfile.Signature;
import java.util.List;
import java.util.Set;

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
            ArmorRepo armorRepo,
            DeityRepo deityRepo,
            GameActionRepo gameActionRepo,
            LanguageRepo languageRepo,
            TraitRepo traitRepo){
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
            Skill lore = new Skill("Lore", "Intelligence");
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

            Trait generalTrait = new Trait("General", TraitCategory.GENERAL);
            Trait skillTrait = new Trait("Skill",  TraitCategory.SKILL);
            Trait fortuneTrait = new Trait("Fortune", TraitCategory.GENERAL);
            Trait commanderTrait = new Trait("Commander", TraitCategory.CLASS);
            Trait fighterTrait = new Trait("Fighter", TraitCategory.CLASS);
            Trait pressTrait = new Trait("Press", TraitCategory.ACTION);
            Trait stanceTrait = new Trait("Stance", TraitCategory.ACTION);
            Trait guardianTrait = new Trait("Guardian", TraitCategory.CLASS);
            Trait barbarianTrait = new Trait("Barbarian", TraitCategory.CLASS);
            Trait flourishTrait = new Trait("Flourish", TraitCategory.ACTION);
            Trait manipulateTrait = new Trait("Manipulate", TraitCategory.MAGIC);
            Trait emotionTrait = new Trait("Emotion", TraitCategory.ACTION);
            Trait fearTrait = new Trait("Fear",  TraitCategory.ACTION);
            Trait mentalTrait = new Trait("Mental",  TraitCategory.ACTION);
            Trait exemplarTrait = new Trait("Exemplar", TraitCategory.CLASS);
            Trait rangerTrait = new Trait("Ranger",   TraitCategory.CLASS);
            Trait championTrait = new Trait("Champion",   TraitCategory.CLASS);
            Trait investigatorTrait = new Trait("Investigator",   TraitCategory.CLASS);
            Trait rogueTrait = new Trait("Rogue",    TraitCategory.CLASS);
            Trait concentrateTrait = new Trait("Concentrate",  TraitCategory.MAGIC);
            Trait wizardTrait = new Trait("Wizard", TraitCategory.CLASS);
            Trait psychicTrait = new Trait("Psychic", TraitCategory.CLASS);
            Trait thaumaturgeTrait = new Trait("Thaumaturge", TraitCategory.CLASS);
            Trait bardTrait = new Trait("Bard", TraitCategory.CLASS);
            Trait clericTrait = new Trait("Cleric", TraitCategory.CLASS);
            Trait druidTrait = new Trait("Druid", TraitCategory.CLASS);
            Trait witchTrait = new Trait("Witch",  TraitCategory.CLASS);
            Trait magusTrait = new Trait("Magus",   TraitCategory.CLASS);
            Trait swashbucklerTrait = new Trait("Swashbuckler",  TraitCategory.CLASS);
            Trait humanTrait = new Trait("Human",  TraitCategory.ANCESTRY);
            Trait dwarfTrait = new Trait("Dwarf",   TraitCategory.ANCESTRY);
            Trait elfTrait = new Trait("Elf",    TraitCategory.ANCESTRY);
            Trait gnomeTrait = new Trait("Gnome",   TraitCategory.ANCESTRY);
            Trait goblinFeat = new Trait("Goblin",    TraitCategory.ANCESTRY);
            Trait halflingTrait = new Trait("Halfling", TraitCategory.ANCESTRY);
            Trait leshyTrait = new Trait("Leshy",    TraitCategory.ANCESTRY);
            Trait orcTrait = new Trait("Orc", TraitCategory.ANCESTRY);
            Trait aiuvarinTrait = new Trait("Aiuvarin",  TraitCategory.ANCESTRY);
            Trait dromaarTrait = new Trait("Dromaar", TraitCategory.ANCESTRY);
            Trait changelingTrait = new Trait("Changeling",  TraitCategory.ANCESTRY);
            Trait lineageTrait = new Trait("Lineage", TraitCategory.HERITAGE);
            Trait humanoidTrait = new Trait("Humanoid", TraitCategory.CREATURE);
            Trait plantTrait = new Trait("Plant", TraitCategory.CREATURE);
            Trait nephilimTrait = new Trait("Nephilim", TraitCategory.ANCESTRY);
            Trait koboldTrait = new Trait("Kobold", TraitCategory.ANCESTRY);
            Trait samsaranTrait = new Trait("Samsaran", TraitCategory.ANCESTRY);
            Trait kholoTrait = new Trait("Kholo", TraitCategory.ANCESTRY);
            Trait shadowTrait = new Trait("Shadow", TraitCategory.CREATURE);
            Trait wayangTrait = new Trait("Wayang", TraitCategory.ANCESTRY);
            Trait fungusTrait = new Trait("Fungus", TraitCategory.CREATURE);
            Trait feyTrait = new Trait("Fey", TraitCategory.CREATURE);
            Trait comfortTrait = new Trait("Comfort", TraitCategory.ARMOR);
            Trait aquadynamicTrait = new Trait("Aquadynamic", TraitCategory.ARMOR);
            Trait laminarTrait = new Trait("Laminar", TraitCategory.ARMOR);
            Trait flexibleTrait = new Trait("Flexible", TraitCategory.ARMOR);
            Trait noisyTrait = new Trait("Noisy", TraitCategory.ARMOR);
            Trait bulwarkTrait = new Trait("Bulwark", TraitCategory.ARMOR);
            Trait agileTrait = new Trait("Agile", TraitCategory.WEAPON);
            Trait finesseTrait = new Trait("Finesse", TraitCategory.WEAPON);
            Trait shoveTrait = new Trait("Shove", TraitCategory.WEAPON);
            Trait twinTrait = new Trait("Twin", TraitCategory.WEAPON);
            Trait deadlyTrait = new Trait("Deadly", TraitCategory.WEAPON);
            Trait fatalTrait = new Trait("Fatal", TraitCategory.WEAPON);
            Trait versatileTrait = new Trait("Versatile", TraitCategory.WEAPON);
            Trait parryTrait = new Trait("Parry", TraitCategory.WEAPON);
            Trait unarmedTrait = new Trait("Unarmed", TraitCategory.WEAPON);
            Trait thrownTrait = new Trait("Thrown", TraitCategory.WEAPON);
            Trait sweepTrait = new Trait("Sweep", TraitCategory.WEAPON);
            Trait propulsiveTrait = new Trait("Propulsive", TraitCategory.WEAPON);
            Trait volleyTrait = new Trait("Volley", TraitCategory.WEAPON);
            Trait disarmTrait = new Trait("Disarm", TraitCategory.WEAPON);
            Trait nonlethal = new Trait("Nonlethal", TraitCategory.WEAPON);
            Trait reachTrait = new Trait("Reach", TraitCategory.WEAPON);
            Trait tripTrait = new Trait("Trip", TraitCategory.WEAPON);
            Trait forcefulTrait = new Trait("Forceful", TraitCategory.WEAPON);
            Trait monkTrait = new Trait("Monk", TraitCategory.CLASS);
            Trait twoHandTrait = new Trait("Two Hand", TraitCategory.WEAPON);
            Trait backstabberTrait = new Trait("Backstabber", TraitCategory.WEAPON);
            Trait rangedTripTrait = new Trait("Ranged Trip", TraitCategory.WEAPON);
            Trait freeHandTrait = new Trait("Free-Hand", TraitCategory.WEAPON);
            Trait backswingTrait = new Trait("Backswing", TraitCategory.WEAPON);
            Trait joustingTrait = new Trait("Jousting", TraitCategory.WEAPON);
            Trait concealableTrait = new Trait("Concealable", TraitCategory.WEAPON);
            Trait attachedToShieldTrait = new Trait("Attached to Shield", TraitCategory.WEAPON);
            Trait healingTrait = new Trait("Healing", TraitCategory.MAGIC);
            Trait illusionTrait = new Trait("Illusion", TraitCategory.MAGIC);
            Trait explorationTrait = new Trait("Exploration", TraitCategory.ACTION);
            Trait linguisticTrait = new Trait("Linguistic", TraitCategory.MAGIC);
            Trait spellshapeTrait = new Trait("Spellshape", TraitCategory.MAGIC);
            Trait downtimeTrait = new Trait("Downtime", TraitCategory.ACTION);
            Trait auditoryTrait = new Trait("Auditory", TraitCategory.ACTION);
            Trait teleportationTrait = new Trait("Teleportation", TraitCategory.MAGIC);
            Trait divineTrait = new Trait("Divine", TraitCategory.MAGIC);
            Trait poisonTrait = new Trait("Poison", TraitCategory.ITEM);
            Trait secretTrait = new Trait("Secret", TraitCategory.ACTION);
            Trait vitalityTrait = new Trait("Vitality", TraitCategory.MAGIC);
            Trait incapactitationTrait = new Trait("Incapactitation", TraitCategory.ACTION);
            Trait sonicTrait = new Trait("Sonic", TraitCategory.MAGIC);
            Trait morphTrait = new Trait("Morph", TraitCategory.MAGIC);
            Trait magicalTrait = new Trait("Magical", TraitCategory.ITEM);
            Trait moveTrait = new Trait("Move", TraitCategory.ACTION);
            Trait visualTrait = new Trait("Visual", TraitCategory.ACTION);
            Trait arcaneTrait = new Trait("Arcane", TraitCategory.MAGIC);
            Trait detectionTrait = new Trait("Detection", TraitCategory.MAGIC);
            Trait predictionTrait = new Trait("Prediction", TraitCategory.MAGIC);
            Trait primalTrait = new Trait("Primal", TraitCategory.MAGIC);
            Trait polymorphTrait = new Trait("Polymorph", TraitCategory.MAGIC);
            Trait consecrationTrait = new Trait("Conescration", TraitCategory.MAGIC);
            Trait lightTrait = new Trait("Light", TraitCategory.MAGIC);
            Trait coldTrait = new Trait("Cold", TraitCategory.MAGIC);
            Trait earthTrait = new Trait("Earth", TraitCategory.MAGIC);

            traitRepo.saveAll(List.of(dwarfTrait, elfTrait, gnomeTrait, goblinFeat, halflingTrait, humanTrait, kholoTrait, koboldTrait, leshyTrait, orcTrait, samsaranTrait, wayangTrait,
                    aiuvarinTrait, changelingTrait, dromaarTrait, nephilimTrait,
                    bardTrait, clericTrait, druidTrait, fighterTrait, rangerTrait, rogueTrait, witchTrait, wizardTrait,
                    barbarianTrait, championTrait, commanderTrait, exemplarTrait, guardianTrait, investigatorTrait, magusTrait, monkTrait, psychicTrait, swashbucklerTrait, thaumaturgeTrait,
                    auditoryTrait, concentrateTrait, downtimeTrait, emotionTrait, explorationTrait, fearTrait, feyTrait, flourishTrait, fortuneTrait, fungusTrait, generalTrait, humanoidTrait, incapactitationTrait, lineageTrait, manipulateTrait, mentalTrait, moveTrait, plantTrait, pressTrait, secretTrait, shadowTrait, skillTrait, stanceTrait, visualTrait,
                    arcaneTrait, coldTrait, consecrationTrait, detectionTrait, divineTrait, earthTrait, healingTrait, illusionTrait, lightTrait, linguisticTrait, morphTrait, polymorphTrait, predictionTrait, primalTrait, sonicTrait, spellshapeTrait, teleportationTrait, vitalityTrait,
                    aquadynamicTrait, bulwarkTrait, comfortTrait, flexibleTrait, laminarTrait, noisyTrait,
                    agileTrait, attachedToShieldTrait, backstabberTrait, backswingTrait, concealableTrait, deadlyTrait, disarmTrait, fatalTrait, finesseTrait, forcefulTrait, freeHandTrait, joustingTrait, nonlethal, parryTrait, propulsiveTrait, rangedTripTrait, reachTrait, shoveTrait, sweepTrait, thrownTrait, tripTrait, twinTrait, twoHandTrait, unarmedTrait, versatileTrait, volleyTrait,
                    magicalTrait, poisonTrait));

            Weapon crossbow = new Weapon("Crossbow", WeaponCategory.SIMPLE, WeaponType.RANGED, WeaponGroup.CROSSBOW, 1, 8, DamageType.PIERCING);
            crossbow.setRangeFeet(120);
            crossbow.setReloadActions(1);
            crossbow.setAmmunition("Bolts");
            crossbow.setBulk(1.0);
            crossbow.setHandUsageType(HandUsageType.TWO_HAND);
            crossbow.setHandsRequiredToAttack(2);
            Weapon warhammer = new Weapon("Warhammer", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.HAMMER, 1, 8 ,DamageType.BLUDGEONING);
            warhammer.setTraits(Set.of(new WeaponTraitEntry(shoveTrait, null, null, null)));
            warhammer.setBulk(1.0);
            warhammer.setHandUsageType(HandUsageType.ONE_HAND);
            warhammer.setHandsRequiredToAttack(1);
            Weapon sawtoothSaber = new Weapon("Sawtooth Saber", WeaponCategory.ADVANCED, WeaponType.MELEE, WeaponGroup.SWORD, 1, 6, DamageType.SLASHING);
            sawtoothSaber.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(twinTrait, null, null, null)));
            sawtoothSaber.setBulk(0.1);
            sawtoothSaber.setHandUsageType(HandUsageType.ONE_HAND);
            sawtoothSaber.setHandsRequiredToAttack(1);
            Weapon clanDagger = new Weapon("Clan Dagger", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.KNIFE, 1, 4, DamageType.PIERCING);
            clanDagger.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null, null),
                    new WeaponTraitEntry(dwarfTrait, null, null, null),
                    new WeaponTraitEntry(parryTrait, null, null, null),
                    new WeaponTraitEntry(versatileTrait, DamageType.BLUDGEONING, null, null)));
            clanDagger.setBulk(0.1);
            clanDagger.setHandUsageType(HandUsageType.ONE_HAND);
            clanDagger.setHandsRequiredToAttack(1);
            Weapon jaws = new Weapon("Jaws", WeaponCategory.UNARMED, WeaponType.MELEE, WeaponGroup.BRAWLING, 1, 6, DamageType.PIERCING);
            jaws.setTraits(Set.of(
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(unarmedTrait, null, null, null)));
            Weapon spine = new Weapon("Spine", WeaponCategory.UNARMED, WeaponType.MELEE, WeaponGroup.BRAWLING, 1, 6, DamageType.PIERCING);
            spine.setTraits(Set.of(
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(unarmedTrait, null, null, null)));
            Weapon dagger = new Weapon("Dagger", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.KNIFE, 1, 4, DamageType.PIERCING);
            dagger.setBulk(0.1);
            dagger.setHandUsageType(HandUsageType.ONE_HAND);
            dagger.setHandsRequiredToAttack(1);
            dagger.setRangeFeet(10);
            dagger.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(thrownTrait, null, null, null),
                    new WeaponTraitEntry(versatileTrait, DamageType.SLASHING, null, null)
            ));
            Weapon battleAxe = new Weapon("Battle Axe", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.AXE, 1, 8, DamageType.SLASHING);
            battleAxe.setBulk(1.0);
            battleAxe.setHandUsageType(HandUsageType.ONE_HAND);
            battleAxe.setHandsRequiredToAttack(1);
            battleAxe.setTraits(Set.of(new WeaponTraitEntry(sweepTrait, null, null, null)));
            Weapon greatsword = new Weapon("Greatsword", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 12, DamageType.SLASHING);
            greatsword.setBulk(2.0);
            greatsword.setHandUsageType(HandUsageType.TWO_HAND);
            greatsword.setHandsRequiredToAttack(2);
            greatsword.setTraits(Set.of(new WeaponTraitEntry(versatileTrait, DamageType.PIERCING, null, null)));
            Weapon compositeLongbow = new Weapon("Composite Longbow", WeaponCategory.MARTIAL, WeaponType.RANGED, WeaponGroup.BOW, 1, 8, DamageType.PIERCING);
            compositeLongbow.setBulk(2.0);
            compositeLongbow.setHandUsageType(HandUsageType.ONE_PLUS_HAND);
            compositeLongbow.setHandsRequiredToAttack(2);
            compositeLongbow.setRangeFeet(100);
            compositeLongbow.setReloadActions(0);
            compositeLongbow.setAmmunition("Arrows");
            compositeLongbow.setTraits(Set.of(
                    new WeaponTraitEntry(deadlyTrait, null, 10, null),
                    new WeaponTraitEntry(propulsiveTrait, null, null, null),
                    new WeaponTraitEntry(volleyTrait, null, null, 30)
            ));
            Weapon club = new Weapon("Club", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.CLUB, 1, 6, DamageType.BLUDGEONING);
            club.setBulk(1.0);
            club.setHandUsageType(HandUsageType.ONE_HAND);
            club.setHandsRequiredToAttack(1);
            club.setRangeFeet(10);
            club.setTraits(Set.of(new WeaponTraitEntry(thrownTrait, null, null, null)));
            Weapon greatpick = new Weapon("Greatpick", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.PICK, 1, 10, DamageType.PIERCING);
            greatpick.setBulk(2.0);
            greatpick.setHandUsageType(HandUsageType.TWO_HAND);
            greatpick.setHandsRequiredToAttack(2);
            greatpick.setTraits(Set.of(new WeaponTraitEntry(fatalTrait, null, 12, null)));
            Weapon mace = new Weapon("Mace", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.CLUB,1, 6, DamageType.BLUDGEONING);
            mace.setBulk(1.0);
            mace.setHandUsageType(HandUsageType.ONE_HAND);
            mace.setHandsRequiredToAttack(1);
            mace.setTraits(Set.of(new WeaponTraitEntry(shoveTrait, null, null, null)));
            Weapon whip = new Weapon("Whip", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.FLAIL, 1, 4, DamageType.SLASHING);
            whip.setBulk(1.0);
            whip.setHandUsageType(HandUsageType.ONE_HAND);
            whip.setHandsRequiredToAttack(1);
            whip.setTraits(Set.of(
                    new WeaponTraitEntry(disarmTrait, null, null, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(nonlethal, null, null, null),
                    new WeaponTraitEntry(reachTrait, null, null, null),
                    new WeaponTraitEntry(tripTrait, null, null, null)
            ));
            Weapon rapier = new Weapon("Rapier", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 6, DamageType.PIERCING);
            rapier.setBulk(1.0);
            rapier.setHandUsageType(HandUsageType.ONE_HAND);
            rapier.setHandsRequiredToAttack(1);
            rapier.setTraits(Set.of(
                    new WeaponTraitEntry(deadlyTrait, null, 8, null),
                    new WeaponTraitEntry(disarmTrait, null, null, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null)
            ));
            Weapon starknife = new Weapon("Starknife", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.KNIFE, 1, 4, DamageType.PIERCING);
            starknife.setBulk(0.1);
            starknife.setHandUsageType(HandUsageType.ONE_HAND);
            starknife.setHandsRequiredToAttack(1);
            starknife.setRangeFeet(20);
            starknife.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null, null),
                    new WeaponTraitEntry(deadlyTrait, null, 6, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(thrownTrait, null, null, null),
                    new WeaponTraitEntry(versatileTrait, DamageType.SLASHING, null, null)
            ));
            Weapon longbow = new Weapon("Longbow", WeaponCategory.MARTIAL, WeaponType.RANGED, WeaponGroup.BOW, 1, 8, DamageType.PIERCING);
            longbow.setBulk(2.0);
            longbow.setHandUsageType(HandUsageType.ONE_PLUS_HAND);
            longbow.setHandsRequiredToAttack(2);
            longbow.setRangeFeet(100);
            longbow.setReloadActions(0);
            longbow.setAmmunition("Arrows");
            longbow.setTraits(Set.of(
                    new WeaponTraitEntry(deadlyTrait, null, 10, null),
                    new WeaponTraitEntry(volleyTrait, null, null, 30)
            ));
            Weapon trident = new Weapon("Trident", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SPEAR, 1, 8, DamageType.PIERCING);
            trident.setBulk(1.0);
            trident.setHandUsageType(HandUsageType.ONE_HAND);
            trident.setHandsRequiredToAttack(1);
            trident.setRangeFeet(20);
            trident.setTraits(Set.of(new WeaponTraitEntry(thrownTrait, null, null, null)));
            Weapon sickle = new Weapon("Sickle", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.KNIFE, 1, 4, DamageType.SLASHING);
            sickle.setBulk(0.1);
            sickle.setHandUsageType(HandUsageType.ONE_HAND);
            sickle.setHandsRequiredToAttack(1);
            sickle.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(tripTrait, null, null, null)
            ));
            Weapon longsword = new Weapon("Longsword", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 8, DamageType.SLASHING);
            longsword.setBulk(1.0);
            longsword.setHandUsageType(HandUsageType.ONE_HAND);
            longsword.setHandsRequiredToAttack(1);
            longsword.setTraits(Set.of(new WeaponTraitEntry(versatileTrait, DamageType.PIERCING, null, null)));
            Weapon fist = new Weapon("Fist", WeaponCategory.UNARMED, WeaponType.MELEE, WeaponGroup.BRAWLING, 1, 4, DamageType.BLUDGEONING);
            fist.setHandUsageType(HandUsageType.ONE_HAND);
            fist.setHandsRequiredToAttack(1);
            fist.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(nonlethal, null, null, null),
                    new WeaponTraitEntry(unarmedTrait, null, null, null)
            ));
            Weapon falchion = new Weapon("Falchion", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 10, DamageType.SLASHING);
            falchion.setBulk(2.0);
            falchion.setHandUsageType(HandUsageType.TWO_HAND);
            falchion.setHandsRequiredToAttack(2);
            falchion.setTraits(Set.of(
                    new WeaponTraitEntry(forcefulTrait, null, null, null),
                    new WeaponTraitEntry(sweepTrait, null, null, null)
            ));
            Weapon staff = new Weapon("Staff", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.CLUB, 1, 4, DamageType.BLUDGEONING);
            staff.setBulk(1.0);
            staff.setHandUsageType(HandUsageType.ONE_HAND);
            staff.setHandsRequiredToAttack(1);
            staff.setTraits(Set.of(
                    new WeaponTraitEntry(monkTrait, null, null, null),
                    new WeaponTraitEntry(twoHandTrait, null, 8, null)
            ));
            Weapon claw = new Weapon("Claw", WeaponCategory.UNARMED, WeaponType.MELEE, WeaponGroup.BRAWLING, 1, 4, DamageType.SLASHING);
            claw.setHandUsageType(HandUsageType.ONE_HAND);
            claw.setHandsRequiredToAttack(1);
            claw.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(nonlethal, null, null, null),
                    new WeaponTraitEntry(unarmedTrait, null, null, null)
            ));
            Weapon shortsword = new Weapon("Shortsword", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 6, DamageType.PIERCING);
            shortsword.setBulk(1.0);
            shortsword.setHandUsageType(HandUsageType.ONE_HAND);
            shortsword.setHandsRequiredToAttack(1);
            shortsword.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null,null),
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(versatileTrait, DamageType.SLASHING, null, null)
            ));
            Weapon greataxe = new Weapon("Greataxe", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.AXE, 1, 12, DamageType.SLASHING);
            greataxe.setBulk(2.0);
            greataxe.setHandUsageType(HandUsageType.TWO_HAND);
            greataxe.setHandsRequiredToAttack(2);
            greataxe.setTraits(Set.of(new WeaponTraitEntry(sweepTrait, null, null, null)));
            Weapon scimitar = new Weapon("Scimitar", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 6, DamageType.SLASHING);
            scimitar.setBulk(1.0);
            scimitar.setHandUsageType(HandUsageType.ONE_HAND);
            scimitar.setHandsRequiredToAttack(1);
            scimitar.setTraits(Set.of(
                    new WeaponTraitEntry(forcefulTrait, null, null, null),
                    new WeaponTraitEntry(sweepTrait, null, null, null)
            ));
            Weapon glaive = new Weapon("Glaive", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.POLEARM, 1, 8, DamageType.SLASHING);
            glaive.setBulk(2.0);
            glaive.setHandUsageType(HandUsageType.TWO_HAND);
            glaive.setHandsRequiredToAttack(2);
            glaive.setTraits(Set.of(
                    new WeaponTraitEntry(deadlyTrait, null, 8, null),
                    new WeaponTraitEntry(forcefulTrait, null, null, null),
                    new WeaponTraitEntry(reachTrait, null, null, null)
            ));
            Weapon scythe = new Weapon("Scythe", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.POLEARM, 1, 10, DamageType.SLASHING);
            scythe.setBulk(2.0);
            scythe.setHandUsageType(HandUsageType.TWO_HAND);
            scythe.setHandsRequiredToAttack(2);
            scythe.setTraits(Set.of(
                    new WeaponTraitEntry(deadlyTrait, null, 10, null),
                    new WeaponTraitEntry(tripTrait, null, null, null)
            ));
            Weapon spikedChain = new Weapon("Spiked Chain", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.FLAIL, 1, 8, DamageType.SLASHING);
            spikedChain.setBulk(1.0);
            spikedChain.setHandUsageType(HandUsageType.TWO_HAND);
            spikedChain.setHandsRequiredToAttack(2);
            spikedChain.setTraits(Set.of(
                    new WeaponTraitEntry(disarmTrait, null, null, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null),
                    new WeaponTraitEntry(tripTrait, null, null, null)
            ));
            Weapon arbalest = new Weapon("Arbalest", WeaponCategory.MARTIAL, WeaponType.RANGED, WeaponGroup.CROSSBOW,1, 10, DamageType.PIERCING);
            arbalest.setBulk(2.0);
            arbalest.setHandUsageType(HandUsageType.TWO_HAND);
            arbalest.setHandsRequiredToAttack(2);
            arbalest.setRangeFeet(110);
            arbalest.setReloadActions(1);
            arbalest.setAmmunition("Bolts");
            arbalest.setTraits(Set.of(new WeaponTraitEntry(backstabberTrait, null, null, null)));
            Weapon bola = new Weapon("Bola", WeaponCategory.MARTIAL, WeaponType.RANGED, WeaponGroup.SLING, 1, 6, DamageType.BLUDGEONING);
            bola.setBulk(0.1);
            bola.setHandUsageType(HandUsageType.ONE_HAND);
            bola.setHandsRequiredToAttack(1);
            bola.setRangeFeet(20);
            bola.setTraits(Set.of(
                    new WeaponTraitEntry(nonlethal, null, null, null),
                    new WeaponTraitEntry(rangedTripTrait, null, null, null),
                    new WeaponTraitEntry(thrownTrait, null, null, null)
            ));
            Weapon gauntlet = new Weapon("Gauntlet", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.BRAWLING, 1, 4, DamageType.BLUDGEONING);
            gauntlet.setBulk(0.1);
            gauntlet.setHandUsageType(HandUsageType.ONE_HAND);
            gauntlet.setHandsRequiredToAttack(1);
            gauntlet.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null, null),
                    new WeaponTraitEntry(freeHandTrait, null, null, null)
            ));
            Weapon greatclub = new Weapon("Greatclub", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.CLUB, 1, 10, DamageType.BLUDGEONING);
            greatclub.setBulk(2.0);
            greatclub.setHandUsageType(HandUsageType.TWO_HAND);
            greatclub.setHandsRequiredToAttack(2);
            greatclub.setTraits(Set.of(
                    new WeaponTraitEntry(backswingTrait, null, null, null),
                    new WeaponTraitEntry(shoveTrait, null, null, null)
            ));
            Weapon lance = new Weapon("Lance", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SPEAR, 1, 8, DamageType.PIERCING);
            lance.setBulk(2.0);
            lance.setHandUsageType(HandUsageType.TWO_HAND);
            lance.setHandsRequiredToAttack(2);
            lance.setTraits(Set.of(
                    new WeaponTraitEntry(deadlyTrait, null, 8, null),
                    new WeaponTraitEntry(joustingTrait, null, 6, null),
                    new WeaponTraitEntry(reachTrait, null, null, null)
            ));
            Weapon swordCane = new Weapon("Sword Cane", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 6, DamageType.PIERCING);
            swordCane.setBulk(1.0);
            swordCane.setHandUsageType(HandUsageType.ONE_HAND);
            swordCane.setHandsRequiredToAttack(1);
            swordCane.setTraits(Set.of(
                    new WeaponTraitEntry(agileTrait, null, null, null),
                    new WeaponTraitEntry(concealableTrait,  null, null, null),
                    new WeaponTraitEntry(finesseTrait, null, null, null)
            ));
            Weapon shieldBoss = new Weapon("Shield Boss", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SHIELD, 1, 6, DamageType.BLUDGEONING);
            shieldBoss.setHandUsageType(HandUsageType.ONE_HAND);
            shieldBoss.setHandsRequiredToAttack(1);
            shieldBoss.setTraits(Set.of(new WeaponTraitEntry(attachedToShieldTrait, null, null, null)));

            weaponRepo.saveAll(List.of(
                    arbalest, crossbow,
                    warhammer,
                    falchion, greatsword, longsword, rapier, sawtoothSaber, scimitar, shortsword, swordCane,
                    clanDagger, dagger, sickle, starknife,
                    gauntlet, claw, fist, jaws, spine,
                    battleAxe, greataxe,
                    compositeLongbow, longbow,
                    club, greatclub, mace, staff,
                    greatpick,
                    spikedChain, whip,
                    lance, trident,
                    glaive, scythe,
                    bola,
                    shieldBoss));

            Armor explorersClothing = new Armor("Explorer's Clothing", ArmorCategory.UNARMORED, ArmorGroup.CLOTH, 0, 5, 0, 0, 0.1);
            explorersClothing.setTraits(Set.of(comfortTrait));
            Armor paddedArmor = new Armor("Padded Armor", ArmorCategory.LIGHT, ArmorGroup.CLOTH, 1, 3, 0, 0, 0.1);
            paddedArmor.setStrengthRequirement(0);
            paddedArmor.setTraits(Set.of(comfortTrait));
            Armor hideArmor = new Armor("Hide Armor", ArmorCategory.MEDIUM, ArmorGroup.LEATHER, 3, 2, -2, -5, 3.0);
            hideArmor.setStrengthRequirement(2);
            Armor splintMail = new Armor("Splint Mail", ArmorCategory.HEAVY, ArmorGroup.COMPOSITE, 5, 1, -3, -10, 3.0);
            splintMail.setStrengthRequirement(3);
            Armor chainShirt = new Armor("Chain Shirt", ArmorCategory.LIGHT, ArmorGroup.CHAIN, 2, 3, -1, 0, 1.0);
            chainShirt.setStrengthRequirement(1);
            Armor breastplate = new Armor("Breastplate", ArmorCategory.MEDIUM, ArmorGroup.PLATE, 4, 1, -2, -5, 2.0);
            breastplate.setStrengthRequirement(3);
            Armor coralArmor = new Armor("Coral Armor", ArmorCategory.MEDIUM, ArmorGroup.SKELETAL, 3, 2, -2, -5, 2.0);
            coralArmor.setStrengthRequirement(2);
            coralArmor.setTraits(Set.of(aquadynamicTrait));
            Armor leafWeave = new Armor("Leaf Weave", ArmorCategory.LIGHT, ArmorGroup.WOOD, 1, 4, -1, 0, 1.0);
            leafWeave.setStrengthRequirement(0);
            leafWeave.setTraits(Set.of(laminarTrait));
            Armor chainMail = new Armor("Chain Mail", ArmorCategory.MEDIUM, ArmorGroup.CHAIN, 4, 1, -2, -5, 2.0);
            chainMail.setStrengthRequirement(3);
            chainMail.setTraits(Set.of(flexibleTrait, noisyTrait));
            Armor fullPlate = new Armor("Full Plate", ArmorCategory.HEAVY, ArmorGroup.PLATE, 6, 0, -3, -10, 4.0);
            fullPlate.setStrengthRequirement(4);
            fullPlate.setTraits(Set.of(bulwarkTrait));

            armorRepo.saveAll(List.of(explorersClothing, paddedArmor, hideArmor, splintMail, chainShirt, breastplate, coralArmor, leafWeave, chainMail, fullPlate));

            Deity abadar = new Deity("Abadar", List.of(crossbow), List.of(society));
            Deity asmodeus = new Deity("Asmodeus", List.of(mace), List.of(deception));
            Deity calistria = new Deity("Calistria", List.of(whip), List.of(deception));
            Deity caydenCailean = new Deity("Cayden Cailean", List.of(rapier), List.of(athletics));
            Deity desna = new Deity("Desna", List.of(starknife), List.of(acrobatics));
            Deity erastil = new Deity("Erastil", List.of(longbow), List.of(survival));
            Deity gorum = new Deity("Gorum", List.of(greatsword), List.of(athletics));
            Deity gozreh = new Deity("Gozreh", List.of(trident), List.of(survival));
            Deity greenFaith = new Deity("Green Faith", List.of(sickle, claw), List.of(nature));
            Deity iomedae = new Deity("Iomedae", List.of(longsword), List.of(intimidation));
            Deity irori = new Deity("Irori", List.of(fist), List.of(athletics));
            Deity lamashtu = new Deity("Lamashtu", List.of(falchion), List.of(survival));
            Deity nethys = new Deity("Nethys", List.of(staff), List.of(arcana));
            Deity norgorber = new Deity("Norgorber", List.of(shortsword), List.of(stealth));
            Deity pharasma = new Deity("Pharasma", List.of(dagger), List.of(medicine));
            Deity rovagug = new Deity("Rovagug", List.of(greataxe), List.of(athletics));
            Deity sarenrae = new Deity("Sarenrae", List.of(scimitar), List.of(medicine));
            Deity shelyn = new Deity("Shelyn", List.of(glaive), List.of(crafting, performance));
            Deity torag = new Deity("Torag", List.of(warhammer), List.of(crafting));
            Deity urgathoa = new Deity("Urgathoa", List.of(scythe), List.of(intimidation));
            Deity zonKuthon = new Deity("Zon-Kuthon", List.of(spikedChain), List.of(intimidation));

            deityRepo.saveAll(List.of(abadar, asmodeus, calistria, caydenCailean, desna, erastil, gorum, gozreh, greenFaith, iomedae, irori, lamashtu, nethys, norgorber, pharasma, rovagug, sarenrae, shelyn, torag, urgathoa, zonKuthon));

            Language aklo = new Language("Aklo");
            Language chthonian = new Language("Chthonian");
            Language common = new Language("Common");
            Language diabolic = new Language("Diabolic");
            Language draconic = new Language("Draconic");
            Language dwarven = new Language("Dwarven");
            Language elven = new Language("Elven");
            Language empyrean = new Language("Empyrean");
            Language feyLanguage = new Language("Fey");
            Language gnomish = new Language("Gnomish");
            Language goblinLanguage = new Language("Goblin");
            Language halflingLanguage = new Language("Halfling");
            Language jotun = new Language("Jotun");
            Language kholoLanguage = new Language("Kholo");
            Language necril = new Language("Necril");
            Language orcish = new Language("Orcish");
            Language petran = new Language("Petran");
            Language pyric = new Language("Pyric");
            Language sakvroth = new Language("Sakvroth");
            Language shadowTongue = new Language("Shadowtongue");
            Language sussuran = new Language("Sussuran");
            Language thalassic = new Language("Thalassic");
            Language wildSong = new Language("Wildsong");
            Language samsaranLanguage = new Language("Samsaran");
            Language iruxi = new Language("Iruxi");
            Language wayangLanguage = new Language("Wayang");
            Language dZiriakLanguage = new Language("D'ziriak");
            Language minatan = new Language("Minatan");
            Language nagajiLanguage = new Language("Nagaji");
            Language vudrani = new Language("Vudrani");
            Language yakshaLanguage = new Language("Yaksha");

            languageRepo.saveAll(List.of(aklo, chthonian,  diabolic, necril, pyric, shadowTongue, sussuran, thalassic, wildSong,
                    samsaranLanguage, iruxi, wayangLanguage, dZiriakLanguage, minatan, nagajiLanguage, vudrani, yakshaLanguage,
                    common, draconic, dwarven, elven, empyrean, feyLanguage, gnomish, goblinLanguage, halflingLanguage, jotun, kholoLanguage, orcish, petran, sakvroth));

            CharacterClass fighter = new CharacterClass("Fighter", 10, List.of("Strength", "Dexterity"), 3);
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
            ClassSkillChoice fighterSkillChoice = new ClassSkillChoice(fighter, List.of(acrobatics, athletics));
            fighterSkillChoice.setRank(ProficiencyRank.TRAINED);
            fighterSkillChoice.setNumberToChoose(1);
            fighter.setSkillChoices(List.of(fighterSkillChoice));

            CharacterClass wizard = new CharacterClass("Wizard", 6, List.of("Intelligence"), 2);
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

            CharacterClass psychic = new CharacterClass("Psychic", 6, List.of(), 3);
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

            CharacterClass thaumaturge = new CharacterClass("Thaumaturge", 8, List.of("Charisma"), 3);
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
            ClassSkillChoice thaumaturgeSkillChoice = new ClassSkillChoice(thaumaturge, List.of(arcana, nature, occultism, religion));
            thaumaturgeSkillChoice.setRank(ProficiencyRank.TRAINED);
            thaumaturgeSkillChoice.setNumberToChoose(1);
            thaumaturge.setSkillChoices(List.of(thaumaturgeSkillChoice));

            CharacterClass rogue = new CharacterClass("Rogue", 8, List.of(), 7);
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

            CharacterClass bard = new CharacterClass("Bard", 8, List.of("Charisma"), 4);
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

            CharacterClass cleric = new CharacterClass("Cleric", 8, List.of("Wisdom"), 2);
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
            cleric.setUsesDeitySkill(true);
            cleric.setUsesDeityFavoredWeapon(true);

            CharacterClass druid = new CharacterClass("Druid", 8, List.of("Wisdom"), 2);
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

            CharacterClass ranger = new CharacterClass("Ranger", 10, List.of("Strength", "Dexterity"), 4);
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

            CharacterClass witch = new CharacterClass("Witch", 6, List.of("Intelligence"), 3);
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

            CharacterClass commander = new CharacterClass("Commander", 8, List.of("Intelligence"), 2);
            commander.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.EXPERT),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Society", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Warfare Lore", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Heavy Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Commander Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)

            ));

            CharacterClass guardian = new CharacterClass("Guardian", 12, List.of("Strength"), 3);
            guardian.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.EXPERT),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Athletics", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Heavy Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Guardian Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            CharacterClass barbarian = new CharacterClass("Barbarian", 12, List.of("Strength"), 3);
            barbarian.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.EXPERT),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Athletics", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Barbarian Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            CharacterClass exemplar = new CharacterClass("Exemplar", 10, List.of("Strength", "Dexterity"), 3);
            exemplar.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.TRAINED),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Religion", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Exemplar Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            CharacterClass champion = new CharacterClass("Champion", 10, List.of("Strength", "Dexterity"), 2);
            champion.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.TRAINED),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Religion", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Heavy Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell Attack Modifier", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Spell DC", ProficiencyCategory.SPELL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Champion Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));
            champion.setUsesDeitySkill(true);
            champion.setUsesDeityFavoredWeapon(false);

            CharacterClass investigator = new CharacterClass("Investigator", 8, List.of("Intelligence"), 4);
            investigator.setInitialProficiencies(List.of(
                    new InitialProficiency("Perception", ProficiencyCategory.PERCEPTION, ProficiencyRank.EXPERT),
                    new InitialProficiency("Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Reflex", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Will", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT),
                    new InitialProficiency("Society", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED),
                    new InitialProficiency("Simple Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Martial Weapons", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmed Attacks", ProficiencyCategory.ATTACK, ProficiencyRank.TRAINED),
                    new InitialProficiency("Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Unarmored Defense", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new InitialProficiency("Investigator Class DC", ProficiencyCategory.CLASS_DC, ProficiencyRank.TRAINED)
            ));

            characterClassRepo.saveAll(List.of(
                    bard, cleric, druid, fighter, ranger, rogue, witch, wizard,
                    commander, guardian,
                    barbarian, champion, investigator,
                    psychic, thaumaturge,
                    exemplar));

            Ancestry human = new Ancestry("Human", 8, 25, "MEDIUM", Set.of(humanTrait, humanoidTrait), List.of(common), List.of(), 1);

            Ancestry dwarf = new Ancestry("Dwarf", 10, 20, "MEDIUM", Set.of(dwarfTrait, humanoidTrait), List.of(common, dwarven), List.of(gnomish, goblinLanguage, jotun, orcish, petran, sakvroth), 0);
            dwarf.setSenses(Set.of(SenseType.DARKVISION));
            AncestryFeature clanDaggerMechanic = new AncestryFeature(dwarf, "Clan Dagger", "You receive a clan dagger tied to your dwarven clan.");
            dwarf.setFeatures(List.of(clanDaggerMechanic));

            Ancestry elf = new Ancestry("Elf", 6, 30, "MEDIUM", Set.of(elfTrait, humanoidTrait), List.of(common, elven), List.of(draconic, empyrean, feyLanguage, gnomish, goblinLanguage, kholoLanguage, orcish), 0);
            elf.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Ancestry gnome = new Ancestry("Gnome", 8, 25, "SMALL", Set.of(gnomeTrait, humanoidTrait), List.of(common, feyLanguage, gnomish), List.of(draconic, dwarven, elven, goblinLanguage, jotun, orcish), 0);
            gnome.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Ancestry goblin = new Ancestry("Goblin", 6, 25, "SMALL", Set.of(goblinFeat, humanoidTrait), List.of(common, goblinLanguage), List.of(draconic, dwarven, gnomish, halflingLanguage, kholoLanguage, orcish), 0);
            goblin.setSenses(Set.of(SenseType.DARKVISION));

            Ancestry halfling = new Ancestry("Halfling", 6, 25, "SMALL", Set.of(halflingTrait, humanoidTrait), List.of(common, halflingLanguage), List.of(dwarven, elven, gnomish, goblinLanguage), 0);
            AncestryFeature keenEyes = new AncestryFeature(halfling, "Keen Eyes", "Your eyes are sharp, allowing you to make out small details about concealed or even invisible creatures that others might miss.");
            halfling.setFeatures(List.of(keenEyes));

            Ancestry leshy = new Ancestry("Leshy", 8, 25, "SMALL", Set.of(leshyTrait, plantTrait), List.of(common, feyLanguage), List.of(draconic, elven, gnomish, goblinLanguage, halflingLanguage, sakvroth), 0);
            leshy.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));
            AncestryFeature plantNourishment = new AncestryFeature(leshy, "Plant Nourishment", "You can sustain yourself through sunlight, water, and soil.");
            leshy.setFeatures(List.of(plantNourishment));

            Ancestry orc = new Ancestry("Orc", 10, 25, "MEDIUM", Set.of(humanoidTrait, orcTrait), List.of(common, orcish), List.of(goblinLanguage, jotun, petran, sakvroth), 0);
            orc.setSenses(Set.of(SenseType.DARKVISION));

            Ancestry kobold = new Ancestry("Kobold", 6, 25, "SMALL", Set.of(humanoidTrait, koboldTrait), List.of(common, sakvroth), List.of(aklo, diabolic, draconic, dwarven, empyrean, feyLanguage, gnomish, petran), 0);
            kobold.setSenses(Set.of(SenseType.DARKVISION));

            Ancestry samsaran = new Ancestry("Samsaran", 8, 25, "MEDIUM", Set.of(humanoidTrait, samsaranTrait), List.of(common, samsaranLanguage), List.of(chthonian, diabolic, draconic, empyrean, jotun, petran, pyric, sussuran, thalassic), 0);
            samsaran.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));
            AncestryFeature cryptomnesia = new AncestryFeature(samsaran, "Cryptomnesia", "You retain bits of knowledge from your former lives.");
            AncestryFeature wanderersSoul = new AncestryFeature(samsaran, "Wanderer's Soul", "Your soul is especially able to return to the cycle of reincarnation.");
            samsaran.setFeatures(List.of(cryptomnesia, wanderersSoul));

            Ancestry kholo = new Ancestry("Kholo", 8, 25, "MEDIUM", Set.of(humanoidTrait, kholoTrait), List.of(common, kholoLanguage), List.of(draconic, elven, feyLanguage, iruxi, necril, orcish), 0);
            kholo.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));
            AncestryFeature kholoBite = new AncestryFeature(kholo, "Bite", "Your sharp teeth and powerful jaws are fearsome weapons.");
            kholo.setFeatures(List.of(kholoBite));

            Ancestry wayang = new Ancestry("Wayang", 8, 25, "SMALL", Set.of(humanoidTrait, shadowTrait, wayangTrait), List.of(common, shadowTongue, wayangLanguage), List.of(dZiriakLanguage, diabolic, minatan, nagajiLanguage, thalassic, vudrani, yakshaLanguage), 0);
            wayang.setSenses(Set.of(SenseType.DARKVISION));

            ancestryRepo.saveAll(List.of(human, dwarf, elf, gnome, goblin, halfling, leshy, orc, kobold, samsaran, kholo, wayang));

            Heritage skilledHuman = new Heritage("Skilled Human", "You gain an additional trained skill.", HeritageType.ANCESTRY_SPECIFIC, human);

            Heritage versatileHuman = new Heritage("Versatile Human", "Humanity's versatility and ambition have fueled its ascendance to be the most common ancestry in most nations throughout the world.", HeritageType.ANCESTRY_SPECIFIC, human);

            Heritage deathWardenDwarf = new Heritage("Death Warden Dwarf", "Your ancestors were tomb guardians, and their power to ward off death passed on to you.", HeritageType.ANCESTRY_SPECIFIC, dwarf);

            Heritage forgeDwarf = new Heritage("Forge Dwarf", "You have a remarkable adaptation to hot environments.", HeritageType.ANCESTRY_SPECIFIC, dwarf);

            Heritage ancientBlooded = new Heritage("Ancient Blooded", "Your ancestors' memory grants resistance to magic", HeritageType.ANCESTRY_SPECIFIC, dwarf);

            Heritage rockyDwarf = new Heritage("Rocky Dwarf", "Your ancestors lived and worked among the ancient stones of the mountains or the depths of the earth.", HeritageType.ANCESTRY_SPECIFIC, dwarf);

            Heritage strongBloodedDwarf = new Heritage("Strong-Blooded Dwarf", "Your blood runs hearty and strong, and you can shake off toxins.", HeritageType.ANCESTRY_SPECIFIC, dwarf);

            Heritage ancientElf = new Heritage("Ancient Elf", "In your long life, you've dabbled in many paths and many styles.", HeritageType.ANCESTRY_SPECIFIC, elf);

            Heritage arcticElf = new Heritage("Arctic Elf", "You dwell deep in the frozen north and have gained incredible resilience against cold environments, granting you cold resistance equal to half your level (minimum 1).", HeritageType.ANCESTRY_SPECIFIC, elf);

            Heritage cavernElf = new Heritage("Cavern Elf", "You were born or spent many years in underground tunnels or caverns where light is scarce.", HeritageType.ANCESTRY_SPECIFIC, elf);
            cavernElf.setSenses(Set.of(SenseType.DARKVISION));

            Heritage seerElf = new Heritage("Seer Elf", "You have an inborn ability to detect and understand magical phenomena.", HeritageType.ANCESTRY_SPECIFIC, elf);

            Heritage whisperElf = new Heritage("Whisper Elf", "Your ears are finely tuned, able to detect even the slightest whispers of sound.", HeritageType.ANCESTRY_SPECIFIC, elf);

            Heritage woodlandElf = new Heritage("Woodland Elf", "You're adapted to life in the forest, the deep jungle, or a similar environment, and you know how to climb trees and use foliage to your advantage.", HeritageType.ANCESTRY_SPECIFIC, elf);

            Heritage chameleonGnome = new Heritage("Chameleon Gnome", "The color of your hair and skin is mutable, possibly due to latent magic from First World influences or lingering illusion effects.", HeritageType.ANCESTRY_SPECIFIC, gnome);

            Heritage feyTouchedGnome = new Heritage("Fey-Touched Gnome", "The blood of the fey flows through your veins, saturating you with their magic and making you truly one of them.", HeritageType.ANCESTRY_SPECIFIC, gnome);
            feyTouchedGnome.setTraits(Set.of(feyTrait));

            Heritage sensateGnome = new Heritage("Sensate Gnome", "You see all colors as brighter, hear all sounds as richer, and especially smell all scents with incredible detail.", HeritageType.ANCESTRY_SPECIFIC, gnome);
            sensateGnome.setSenses(Set.of(SenseType.SCENT));

            Heritage umbralGnome = new Heritage("Umbral Gnome", "Whether from a connection to dark or shadowy fey, from the underground gnomes known as drathnelar, or from another source, you can see in complete darkness.", HeritageType.ANCESTRY_SPECIFIC, gnome);
            umbralGnome.setSenses(Set.of(SenseType.DARKVISION));

            Heritage wellspringGnome = new Heritage("Wellspring Gnome", "Some other source of magic has a greater hold on you than the primal magic of your fey lineage does.", HeritageType.ANCESTRY_SPECIFIC, gnome);

            Heritage charhideGoblin = new Heritage("Charhide Goblin", "Your ancestors have always had a connection to fire and a thicker skin, which allows you to resist burning.", HeritageType.ANCESTRY_SPECIFIC, goblin);

            Heritage irongutGoblin = new Heritage("Irongut Goblin", "You can subsist on food that most folks would consider spoiled.", HeritageType.ANCESTRY_SPECIFIC, goblin);

            Heritage razortoothGoblin = new Heritage("Razortooth Goblin", "Your family's teeth are formidable weapons.", HeritageType.ANCESTRY_SPECIFIC, goblin);

            Heritage snowGoblin = new Heritage("Snow Goblin", "You are acclimated to living in frigid lands and have skin ranging from sky blue to navy in color, as well as blue fur.", HeritageType.ANCESTRY_SPECIFIC, goblin);

            Heritage unbreakableGoblin = new Heritage("Unbreakable Goblin", "You're able to bounce back from injuries easily due to an exceptionally thick skull, cartilaginous bones, or some other mixed blessing.", HeritageType.ANCESTRY_SPECIFIC, goblin);

            Heritage gutsyHalfling = new Heritage("Gutsy Halfling", "Your family line is known for keeping a level head and staving off fear when the chips were down.", HeritageType.ANCESTRY_SPECIFIC, halfling);

            Heritage hillockHalfling = new Heritage("Hillock Halfling", "Accustomed to a calm life in the hills, your people find rest and relaxation especially replenishing, particularly when indulging in creature comforts.", HeritageType.ANCESTRY_SPECIFIC, halfling);

            Heritage jinxedHalfling = new Heritage("Jinxed Halfling", "You were born with a strange blessing: bereft of the typical halfling luck, you can instead manipulate the fortunes of others.", HeritageType.ANCESTRY_SPECIFIC, halfling);

            Heritage nomadicHalfling = new Heritage("Nomadic Halfling", "Your ancestors have traveled from place to place for generations, never content to settle down.", HeritageType.ANCESTRY_SPECIFIC, halfling);

            Heritage twilightHalfling = new Heritage("Twilight Halfling", "Your ancestors performed many secret acts under the concealing cover of dusk, whether for good or ill, and over time they developed the ability to see in twilight beyond even the usual keen sight of halflings", HeritageType.ANCESTRY_SPECIFIC, halfling);
            twilightHalfling.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Heritage wildwoodHalfling = new Heritage("Wildwood Halfling", "You hail from deep within a jungle or forest, and you've learned how to use your small size to wriggle through undergrowth and other obstacles.", HeritageType.ANCESTRY_SPECIFIC, halfling);

            Heritage cactusLeshy = new Heritage("Cactus Leshy", "Spines cover your body.", HeritageType.ANCESTRY_SPECIFIC, leshy);

            Heritage fruitLeshy = new Heritage("Fruit Leshy", "Your body continually produces small fruits imbued with primal magic.", HeritageType.ANCESTRY_SPECIFIC, leshy);

            Heritage fungusLeshy = new Heritage("Fungus Leshy", "Your body was made from fungi that grows in the shade of caves and trees, and you are at home in dark caverns and warrens.", HeritageType.ANCESTRY_SPECIFIC, leshy);
            fungusLeshy.setSenses(Set.of(SenseType.DARKVISION));
            fungusLeshy.setTraitsToRemove(Set.of(plantTrait));
            fungusLeshy.setTraits(Set.of(fungusTrait));

            Heritage gourdLeshy = new Heritage("Gourd Leshy", "You have a large gourd for a skull, and since you don't have a physical brain, you can use the space inside your head.", HeritageType.ANCESTRY_SPECIFIC, leshy);

            Heritage leafLeshy = new Heritage("Leaf Leshy", "Your body is made mostly from natural foliage, and like a leaf tumbling from a tree, you land from falls with particular grace.", HeritageType.ANCESTRY_SPECIFIC, leshy);

            Heritage lotusLeshy = new Heritage("Lotus Leshy", "You effortlessly float on the surface of water.", HeritageType.ANCESTRY_SPECIFIC, leshy);

            Heritage rootLeshy = new Heritage("Root Leshy", "Your body is made from hardy roots that attach you firmly to the ground.", HeritageType.ANCESTRY_SPECIFIC, leshy);

            Heritage seaweedLeshy = new Heritage("Seaweed Leshy", "Your body is made from woven seaweed, and you're just as comfortable underwater as on land.", HeritageType.ANCESTRY_SPECIFIC, leshy);

            Heritage vineLeshy = new Heritage("Vine Leshy", "Your prehensile vines grant you unmatched skill at climbing.", HeritageType.ANCESTRY_SPECIFIC, leshy);

            Heritage badlandsOrc = new Heritage("Badlands Orc", "You come from sun-scorched badlands, where long legs and an ability to withstand the elements helped you thrive.", HeritageType.ANCESTRY_SPECIFIC, orc);

            Heritage battleReadyOrc = new Heritage("Battle-Ready Orc", "You descend from a line of terrifying battlefield commanders.", HeritageType.ANCESTRY_SPECIFIC, orc);

            Heritage deepOrc = new Heritage("Deep Orc", "Your calloused hands and red eyes speak to a life spent in the deep darkness of mountain caverns, where you learned to battle on rocky cliffs and survive with minimal resources.", HeritageType.ANCESTRY_SPECIFIC, orc);

            Heritage graveOrc = new Heritage("Grave Orc", "You were exposed to powerful necromantic energies that should have killed you—but you survived.", HeritageType.ANCESTRY_SPECIFIC, orc);

            Heritage holdScarredOrc = new Heritage("Hold-Scarred Orc", "You are part of an orc community that participates in ritual scarification or tattooing.", HeritageType.ANCESTRY_SPECIFIC, orc);

            Heritage rainfallOrc = new Heritage("Rainfall Orc", "You were born in a rain forest with only tangles of trees providing protection from torrential rainstorms and flash floods.", HeritageType.ANCESTRY_SPECIFIC, orc);

            Heritage winterOrc = new Heritage("Winter Orc", "Your ancestors survived in cold climates.", HeritageType.ANCESTRY_SPECIFIC, orc);

            Heritage aiuvarin = new Heritage("Aiuvarin", "You have the blood of Elves mixed into your ancestry.", HeritageType.VERSATILE, null);
            aiuvarin.setGrantedAncestryFeatAccess(List.of(elf));
            aiuvarin.setTraits(Set.of(elfTrait, aiuvarinTrait));
            aiuvarin.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Heritage dromaar = new Heritage("Dromaar", "You have the blood of Orcs mixed into your ancestry.", HeritageType.VERSATILE, null);
            dromaar.setGrantedAncestryFeatAccess(List.of(orc));
            dromaar.setTraits(Set.of(dromaarTrait, orcTrait));
            dromaar.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Heritage changeling = new Heritage("Changeling", "Your mother was a hag.", HeritageType.VERSATILE, null);
            changeling.setTraits(Set.of(changelingTrait));
            changeling.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Heritage nephilim = new Heritage("Nephilim", "Your nature is influenced by celestials, fiends, or monitors.", HeritageType.VERSATILE, null);
            nephilim.setTraits(Set.of(nephilimTrait));
            nephilim.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            heritageRepo.saveAll(List.of(
                    skilledHuman, versatileHuman,
                    ancientBlooded, deathWardenDwarf, forgeDwarf, rockyDwarf, strongBloodedDwarf,
                    ancientElf, arcticElf, cavernElf, seerElf, whisperElf, woodlandElf,
                    chameleonGnome, feyTouchedGnome, sensateGnome, umbralGnome, wellspringGnome,
                    charhideGoblin, irongutGoblin, razortoothGoblin, snowGoblin, unbreakableGoblin,
                    gutsyHalfling, hillockHalfling, jinxedHalfling, nomadicHalfling, twilightHalfling, wildwoodHalfling,
                    cactusLeshy, fruitLeshy, fungusLeshy, gourdLeshy, leafLeshy, lotusLeshy, rootLeshy, seaweedLeshy, vineLeshy,
                    badlandsOrc, battleReadyOrc, deepOrc, graveOrc, holdScarredOrc, rainfallOrc, winterOrc,
                    aiuvarin, dromaar, changeling, nephilim));

            Feat assurance = new Feat("Assurance", 1, Set.of(fortuneTrait, generalTrait, skillTrait), "Even in the worst circumstances, you can perform basic tasks.");
            Feat combatClimber = new Feat("Combat Climber", 1, Set.of(generalTrait, skillTrait), "Your techniques allow you to fight as you climb.");
            Feat quickClimb = new Feat("Quick Climb", 7, Set.of(generalTrait, skillTrait), "When Climbing, you move 5 more feet on a success and 10 more feet on a critical success, up to your Speed.");
            Feat intimidatingGlare = new Feat("Intimidating Glare", 1, Set.of(generalTrait, skillTrait), "Demoralize a creature using only a look.");
            Feat advancedFirstAid = new Feat("Advanced First Aid", 7, Set.of(generalTrait, healingTrait, manipulateTrait, skillTrait), "You use your medical training to ameliorate sickness or assuage fears");
            Feat bondedAnimal = new Feat("Bonded Animal", 2, Set.of(downtimeTrait, generalTrait, skillTrait), "You forge strong connections with animals.");
            Feat studentOfTheCanon = new Feat("Student of the Canon", 1, Set.of(generalTrait, skillTrait), "You’ve researched many faiths enough to recognize notions about them that are unlikely to be true.");
            Feat multilingual = new Feat("Multilingual", 1, Set.of(generalTrait, skillTrait), "You easily pick up new languages.");
            Feat terrainExpert = new Feat("Terrain Expertise", 1, Set.of(generalTrait, skillTrait), "You are particularly skilled in rough terrain.");

            Feat adoptedAncestry = new Feat("Adopted Ancestry", 1, Set.of(generalTrait), "You’re fully immersed in another ancestry’s culture and traditions, whether born into them, earned through rite of passage, or bonded through a deep friendship or romance.");
            Feat shieldBlock = new Feat("Shield Block", 1, Set.of(generalTrait), "You snap your shield in place to ward off a blow.");
            Feat diehard = new Feat("Diehard", 1, Set.of(generalTrait), "It takes more to kill you than most.");

            Feat doubleSlice = new Feat("Double Slice", 1, Set.of(fighterTrait), "You lash out at your foe with both weapons.");
            doubleSlice.setAvailableToClasses(List.of(fighter));
            Feat exactingStrike = new Feat("Exacting Strike", 1, Set.of(fighterTrait, pressTrait), "You make a controlled follow-up attack, fully accounting for your momentum.");
            exactingStrike.setAvailableToClasses(List.of(fighter));
            Feat pointBlankStance = new Feat("Point Blank Stance", 1, Set.of(fighterTrait, stanceTrait), "You take aim to pick off nearby enemies quickly.");
            pointBlankStance.setAvailableToClasses(List.of(fighter));
            Feat reactiveShield = new Feat("Reactive Shield", 1, Set.of(fighterTrait, guardianTrait), "You can snap your shield into place just as you would take a blow, avoiding the hit at the last second.");
            reactiveShield.setAvailableToClasses(List.of(fighter, guardian));
            Feat snaggingStrike = new Feat("Snagging Strike", 1, Set.of(fighterTrait), "You combine an attack with quick grappling moves to throw an enemy off balance as long as it stays in your reach.");
            snaggingStrike.setAvailableToClasses(List.of(fighter));
            Feat viciousSwing = new Feat("Vicious Swing", 1, Set.of(fighterTrait, flourishTrait), "You unleash a particularly powerful attack that clobbers your foe but leaves you a bit unsteady.");
            viciousSwing.setAvailableToClasses(List.of(fighter));
            Feat aggressiveBlock = new Feat("Aggressive Block", 2, Set.of(fighterTrait, guardianTrait), "You push back as you block, knocking your foe away or off balance.");
            aggressiveBlock.setAvailableToClasses(List.of(fighter, guardian));
            Feat assistingShot = new Feat("Assisting Shot", 2, Set.of(fighterTrait, pressTrait), "Using your last shot to gauge your accuracy, you can fire off a quick shot to interfere with a foe in combat.");
            assistingShot.setAvailableToClasses(List.of(fighter));
            Feat bladeBrake = new Feat("Blade Brake", 2, Set.of(fighterTrait, manipulateTrait), "You plow your weapon into a floor, wall, or another sturdy surface, anchoring yourself in place.");
            bladeBrake.setAvailableToClasses(List.of(fighter));
            Feat brutishShove = new Feat("Brutish Shove", 2, Set.of(fighterTrait, pressTrait), "Using the momentum of your last attack to throw your weight into another, you make your opponent stumble back.");
            brutishShove.setAvailableToClasses(List.of(fighter));
            Feat combatGrab = new Feat("Combat Grab", 2, Set.of(fighterTrait, pressTrait), "Using your prior attack to shift your opponent’s guard, you take another swing and grab them.");
            combatGrab.setAvailableToClasses(List.of(fighter));
            Feat duelingParry1 = new Feat("Dueling Parry", 2, Set.of(fighterTrait), "You can parry attacks against you with your one-handed weapon.");
            duelingParry1.setAvailableToClasses(List.of(fighter));
            Feat lunge = new Feat("Lunge", 2, Set.of(fighterTrait), "You attack an enemy at the edge of your reach.");
            lunge.setAvailableToClasses(List.of(fighter));
            Feat reboundingToss = new Feat("Rebounding Toss", 2, Set.of(fighterTrait, flourishTrait), "You bounce your weapon off one foe to strike another.");
            reboundingToss.setAvailableToClasses(List.of(fighter));
            Feat sleekReposition = new Feat("Sleek Reposition", 2, Set.of(fighterTrait, pressTrait), "While your opponent is still recovering from your prior attack, you snag its armor, clothing, or flesh to move it as you please.");
            sleekReposition.setAvailableToClasses(List.of(fighter));
            Feat doubleShot = new Feat("Double Shot", 4, Set.of(fighterTrait, flourishTrait), "You shoot twice in blindingly fast succession.");
            doubleShot.setAvailableToClasses(List.of(fighter));
            Feat dualHandedAssault = new Feat("Dual-Handed Assault", 4, Set.of(fighterTrait, flourishTrait), "You snap your free hand over to grip your weapon just long enough to add momentum and deliver a more powerful blow to your opponent.");
            dualHandedAssault.setAvailableToClasses(List.of(fighter));
            Feat partingShot = new Feat("Parting Shot", 4, Set.of(fighterTrait), "You jump back and make a quick shot that catches your opponent by surprise.");
            partingShot.setAvailableToClasses(List.of(fighter));
            Feat powerfulShove = new Feat("Powerful Shove", 4, Set.of(fighterTrait), "You can push larger foes around with your attack.");
            powerfulShove.setAvailableToClasses(List.of(fighter));
            Feat quickReversal = new Feat("Quick Reversal", 4, Set.of(fighterTrait, flourishTrait, pressTrait), "You turn your foes’ flanking against them with a quick reverse.");
            quickReversal.setAvailableToClasses(List.of(fighter));
            Feat shieldedStride = new Feat("Shielded Stride", 4, Set.of(fighterTrait), "When your shield is up, your enemies’ blows can’t touch you.");
            shieldedStride.setAvailableToClasses(List.of(fighter));
            Feat slamDown = new Feat("Slam Down", 4, Set.of(fighterTrait, flourishTrait), "You make an attack to knock a foe off balance, then follow up immediately with a sweep to topple them.");
            slamDown.setAvailableToClasses(List.of(fighter));
            Feat twinParry = new Feat("Twin Parry", 4, Set.of(fighterTrait, rangerTrait), "You use your two weapons to parry attacks.");
            twinParry.setAvailableToClasses(List.of(fighter, ranger));
            Feat advancedWeaponTraining = new Feat("Advanced Weapon Training", 6, Set.of(fighterTrait), "You’ve studied the art of wielding an advanced weapon.");
            advancedWeaponTraining.setAvailableToClasses(List.of(fighter));
            Feat advantageousAssault = new Feat("Advantageous Assault", 6, Set.of(fighterTrait, pressTrait), "After compromising your enemy’s movement, you deliver a more deadly blow.");
            advantageousAssault.setAvailableToClasses(List.of(fighter));
            Feat dazingBlow = new Feat("Dazing Blow", 6, Set.of(fighterTrait, pressTrait), "You pummel a held foe, hoping to stagger them.");
            dazingBlow.setAvailableToClasses(List.of(fighter));
            Feat disarmingStance = new Feat("Disarming Stance", 6, Set.of(fighterTrait, stanceTrait), "You adopt a fencing stance that improves your control over your weapon.");
            disarmingStance.setAvailableToClasses(List.of(fighter));
            Feat furiousFocus = new Feat("Furious Focus", 6, Set.of(fighterTrait), "You’ve learned to maintain your balance even when swinging furiously.");
            furiousFocus.setAvailableToClasses(List.of(fighter));
            Feat guardiansDeflection = new Feat("Guardian's Deflection", 6, Set.of(fighterTrait), "You use your weapon to deflect the attack against your ally, granting a +2 circumstance bonus to their Armor Class against the triggering attack.");
            guardiansDeflection.setAvailableToClasses(List.of(fighter));
            Feat reflexiveShield = new Feat("Reflexive Shield", 6, Set.of(fighterTrait, guardianTrait), "You can use your shield to fend off explosions and the like.");
            reflexiveShield.setAvailableToClasses(List.of(fighter, guardian));
            Feat revealingStab = new Feat("Revealing Stab", 6, Set.of(fighterTrait), "You drive your piercing weapon into an imperceptible foe, revealing its location to your allies.");
            revealingStab.setAvailableToClasses(List.of(fighter));
            Feat ricochetStance1 = new Feat("Ricochet Stance", 6, Set.of(fighterTrait, stanceTrait), "You adopt a stance to rebound your thrown weapons toward you.");
            ricochetStance1.setAvailableToClasses(List.of(fighter));
            Feat shatterDefenses = new Feat("Shatter Defenses", 6, Set.of(fighterTrait, pressTrait), "Your offense exploits your enemy’s fear.");
            shatterDefenses.setAvailableToClasses(List.of(fighter));
            Feat tripleShot = new Feat("Triple Shot", 6, Set.of(fighterTrait), "You can quickly fire multiple shots with greater control.");
            tripleShot.setAvailableToClasses(List.of(fighter));
            Feat blindFight = new Feat("Blind-Fight", 8, Set.of(fighterTrait, investigatorTrait, rangerTrait, rogueTrait), "Your battle instincts make you more aware of concealed and invisible opponents.");
            blindFight.setAvailableToClasses(List.of(fighter, investigator, ranger, rogue));
            Feat disorientingOpening = new Feat("Disorienting Opening", 8, Set.of(fighterTrait), "You use your foes’ openings to expose even greater weaknesses.");
            disorientingOpening.setAvailableToClasses(List.of(fighter));
            Feat duelingRiposte = new Feat("Dueling Riposte", 8, Set.of(fighterTrait), "You elegantly counterattack against your flailing enemy.");
            duelingRiposte.setAvailableToClasses(List.of(fighter));
            Feat fellingStrike = new Feat("Felling Strike", 8, Set.of(fighterTrait), "Your attack can ground an airborne foe.");
            fellingStrike.setAvailableToClasses(List.of(fighter));
            Feat incredibleAim = new Feat("Incredible Aim", 8, Set.of(concentrateTrait, fighterTrait), "By spending a moment to focus, you can ensure your attack strikes true.");
            incredibleAim.setAvailableToClasses(List.of(fighter));
            Feat mobileShotStance = new Feat("Mobile Shot Stance", 8, Set.of(fighterTrait, stanceTrait), "Your shots become nimble and deadly.");
            mobileShotStance.setAvailableToClasses(List.of(fighter));
            Feat positioningAssault = new Feat("Positioning Assault", 8, Set.of(fighterTrait, flourishTrait), "With punishing blows, you force your opponent into position.");
            positioningAssault.setAvailableToClasses(List.of(fighter));
            Feat resoundingBravery = new Feat("Resounding Bravery", 8, Set.of(fighterTrait), "Even your fears serve as fuel for your fighting spirit.");
            resoundingBravery.setAvailableToClasses(List.of(fighter));
            Feat agileGrace = new Feat("Agile Grace", 10, Set.of(fighterTrait), "Your graceful moves with agile weapons are beyond compare.");
            Feat certainStrike = new Feat("Ceratin Strike", 10, Set.of(fighterTrait, pressTrait), "Even when you don’t hit squarely, you can still score a glancing blow.");
            Feat crashingSlam = new Feat("Crashing Slam", 10, Set.of(fighterTrait), "You can dash your foe to the ground with a single blow.");
            Feat cutFromTheAir = new Feat("Cut from the Air", 10, Set.of(fighterTrait), "You can knock aside ranged attacks.");
            Feat debilitatingShot = new Feat("Debilitating Shot", 10, Set.of(fighterTrait, flourishTrait), "Aiming for a weak point, you impede your foe with a precise shot. Make a ranged weapon Strike.");
            Feat disarmingTwist = new Feat("Disarming Twist", 10, Set.of(fighterTrait, pressTrait), "After your initial attack redirects your foe’s defenses, your follow-up wrests their weapon from their grasp.");
            Feat disruptiveStance = new Feat("Disruptive Stance", 10, Set.of(fighterTrait, stanceTrait), "The slightest distraction can provoke your wrath, and you’re prepared to foil enemies’ actions.");
            Feat fearsomeBrute = new Feat("Fearsome Brute", 10, Set.of(fighterTrait), "Fear makes your foes weak and more vulnerable to your attacks.");
            Feat flingingCharge = new Feat("Flinging Charge", 10, Set.of(fighterTrait, flourishTrait), "You throw a weapon to distract your opponent as you close the gap to begin your assault.");
            Feat mirrorShield = new Feat("Mirror Shield", 10, Set.of(fighterTrait), "You reflect the spell back against its caster.");
            Feat tacticalReflexes = new Feat("Tactical Reflexes", 10, Set.of(fighterTrait), "You are particularly swift at punishing foes who leave you openings");
            Feat twinRiposte = new Feat("Twin Riposte", 10, Set.of(fighterTrait, rangerTrait), "A clever parry with one weapon leaves your opponent open to an attack with the other weapon.");
            Feat brutalFinish = new Feat("Brutal Finish", 12, Set.of(fighterTrait, pressTrait), "Your final blow can make an impact even if it rebounds off a foe’s defenses.");
            Feat dashingStrike = new Feat("Dashing Strike", 12, Set.of(fighterTrait, pressTrait), "Springing away from one foe, you Strike at another.");
            Feat duelingDance = new Feat("Dueling Dance", 12, Set.of(fighterTrait, stanceTrait), "Using a free hand as pivot and balance, you both attack and defend with your weapon.");
            Feat flingingShove = new Feat("Flinging Shove", 12, Set.of(fighterTrait), "Whether you’re shoving opponents with a shield or a large weapon, you’ve learned to push them even further.");
            Feat improvedDuelingRiposte = new Feat("Improved Dueling Riposte", 12, Set.of(fighterTrait), "Your weapon whirls and darts, striking foes whenever the slightest opening or moment of weakness presents itself.");
            Feat incredibleRicochet = new Feat("Incredible Ricochet", 12, Set.of(concentrateTrait, fighterTrait, pressTrait), "After your first shot singles out your opponent’s position, you direct another that ricochets around obstacles and strikes unerringly.");
            Feat lungingStance = new Feat("Lunging Stance", 12, Set.of(fighterTrait, stanceTrait), "Your body coiled to strike, you can lash out at distant enemies.");
            Feat paragonsGuard = new Feat("Paragon's Guard", 12, Set.of(fighterTrait, guardianTrait, stanceTrait), "Once you’ve had a moment to set your stance, you always have your shield ready without a thought.");
            Feat desperateFinisher = new Feat("Desperate Finisher", 14, Set.of(fighterTrait, pressTrait), "You throw everything you have into one last, reckless press.");
            Feat determination = new Feat("Determination", 14, Set.of(concentrateTrait, fighterTrait), "Your training allows you to shrug off your foes’ spells and conditions when the need is dire.");
            Feat guidingFinish = new Feat("Guiding Finish", 14, Set.of(fighterTrait, pressTrait), "Using your weapon as a lever, you force your opponent to end up right where you want them.");
            Feat guidingRiposte = new Feat("Guiding Riposte", 14, Set.of(fighterTrait), "By shifting your weight and angling your weapon, you guide your opponent to a more favorable position.");
            Feat improvedTwinRiposte1 = new Feat("Improved Twin Riposte", 14, Set.of(fighterTrait), "Your weapons are a blur, blocking and biting at your foes.");
            Feat openingStance1 = new Feat("Opening Stance", 14, Set.of(fighterTrait), "At the first sign of trouble, often before you consciously realize the danger, you drop into a stance with a mere thought.");
            Feat twoWeaponFlurry = new Feat("Two-Weapon Flurry", 14, Set.of(fighterTrait, flourishTrait, pressTrait), "Using the momentum of your prior attack, you lash out with both your weapons in a sudden frenzy.");
            Feat gracefulPoise = new Feat("Graceful Poise", 16, Set.of(fighterTrait, stanceTrait), "With the right positioning, your off-hand weapon can strike like a scorpion’s stinger.");
            Feat improvedReflexiveShield = new Feat("Improved Reflexive Shield", 16, Set.of(fighterTrait, guardianTrait), "Your shield can help save nearby allies.");
            Feat masterOfManyStyles = new Feat("Master of Many Styles", 16, Set.of(fighterTrait, monkTrait), "You move fluidly between stances, using your mastery of combat to always adopt the best tactics.");
            Feat multishotStance = new Feat("Multishot Stance", 16, Set.of(fighterTrait, stanceTrait), "You lock yourself in a stable position so you can fire swiftly and accurately.");
            Feat overwhelmingBlow = new Feat("Overwhelming Blow", 16, Set.of(fighterTrait), "You throw your weight into a powerful attack that leaves you vulnerable.");
            Feat twinnedDefense = new Feat("Twinned Defense", 16, Set.of(fighterTrait, stanceTrait), "You’re always ready to use your off-hand weapon to interfere with attacks against you.");
            Feat impossibleVolley = new Feat("Impossible Volley", 18, Set.of(fighterTrait, flourishTrait, rangerTrait), "You fire a volley at all foes in an area.");
            Feat savageCritical = new Feat("Savage Critical", 18, Set.of(fighterTrait), "The wounds you inflict are grievous.");
            Feat smashFromTheAir = new Feat("Smash from the Air", 18, Set.of(fighterTrait), "Your expertise enables you to knock away spells.");
            Feat boundlessReprisals = new Feat("Boundless Reprisals", 20, Set.of(fighterTrait, guardianTrait), "With a sixth sense for the flow of combat, you can quickly react to any situation as required.");
            Feat ultimateFlexibility = new Feat("Ultimate Flexibility", 20, Set.of(fighterTrait), "Your experience keeps you on your toes, helping you adopt complex strategies on the fly and face the most dangerous challenges.");
            Feat weaponSupremacy = new Feat("Weapon Supremacy", 20, Set.of(fighterTrait), "Your skill with weapons bends the laws of reality, allowing you to continuously attack with speed that would normally require magical assistance.");

            Feat spellbookProdigy = new Feat("Spellbook Prodigy", 1, Set.of(wizardTrait), "You are particularly adept at learning spells to add to your spellbook.");
            spellbookProdigy.setAvailableToClasses(List.of(wizard));
            Feat energyAblation = new Feat("Energy Ablation", 2, Set.of(spellshapeTrait, wizardTrait), "As you direct destructive energy at a foe, you can divert some of its power into a protective barrier that shields you from harm.");
            Feat nonlethalSpell = new Feat("Nonlethal Spell", 2, Set.of(manipulateTrait, spellshapeTrait, wizardTrait), "You can alter offensive spells to be less deadly.");
            Feat bespellStrikes = new Feat("Bespell Strikes", 4, Set.of(wizardTrait), "You siphon spell energy into one weapon you’re wielding, or into one of your unarmed attacks, such as a fist.");
            Feat callWizardlyTools = new Feat("Call Wizardly Tools", 4, Set.of(concentrateTrait, teleportationTrait, wizardTrait), "You’re mystically connected to your wizardly tools, ensuring you can always find them when you’ve misplaced them.");
            Feat linkedFocus = new Feat("Linked Focus", 4, Set.of(wizardTrait), "You have linked your bonded item to the well of energy that powers your school spells.");
            Feat spellProtectionArray = new Feat("Spell Protection Array", 4, Set.of(arcaneTrait, manipulateTrait, wizardTrait), "You inscribe a circle of arcane runes that dampen enemies’ magic.");
            Feat convincingIllusion = new Feat("Convincing Illusion", 6, Set.of(wizardTrait), "You use your deceptive skills to make your illusions seem even more real.");
            Feat explosiveArrival = new Feat("Explosive Arrival", 6, Set.of(concentrateTrait, manipulateTrait, spellshapeTrait, wizardTrait), "Your summoned creature appears in a detonation of arcane runes.");
            Feat irresistibleMagic = new Feat("Irresistible Magic", 6, Set.of(wizardTrait), "You’ve studied ways of overcoming the innate defenses against magic that dragons, otherworldly beings, and certain other powerful creatures have.");
            Feat splitSlot = new Feat("Split Slot", 6, Set.of(wizardTrait), "You can prepare two spells in one slot, giving you the freedom to choose the spell when you cast it.");
            Feat advancedSchoolSpell = new Feat("Advanced School Spell", 8, Set.of(wizardTrait), "You gain access to the advanced teachings of your arcane institution, learning a powerful new school spell.");
            Feat bondConservation = new Feat("Bond Conservation", 8, Set.of(manipulateTrait, spellshapeTrait, wizardTrait), "By efficiently and carefully manipulating the arcane energies unleashed by your bonded item, you can conserve just enough power to cast another spell, though this second spell is slightly weaker.");
            Feat formRetention = new Feat("Form Retention", 8, Set.of(wizardTrait), "You have trained your mind and body to tolerate polymorph magic for longer periods of time, so long as you prepare for the change appropriately.");
            Feat knowledgeIsPower = new Feat("Knowledge is Power", 8, Set.of(magusTrait, wizardTrait), "Your academic knowledge about a creature allows you to subtly alter your magic to defeat them.");
            Feat scrollAdept = new Feat("Scroll Adept", 10, Set.of(wizardTrait), "During your daily preparations, you can create two temporary scrolls containing arcane spells from your spellbook.");
            Feat cleverCounterspell = new Feat("Clever Counterspell", 12, Set.of(wizardTrait), "You creatively apply your prepared spells to Counterspell a much wider variety of your opponents’ magic.");
            Feat forcibleEnergy = new Feat("Forcible Energy", 12, Set.of(manipulateTrait, spellshapeTrait, wizardTrait), "You perform complex manipulations to make the energy from your spells so powerful that your enemies remain vulnerable to it afterward.");
            Feat keenMagicalDetection = new Feat("Keen Magical Detection", 12, Set.of(fortuneTrait, wizardTrait), "You sense magical dangers.");
            Feat magicSense = new Feat("Magic Sense", 12, Set.of(arcaneTrait, detectionTrait, magusTrait, wizardTrait), "You have a literal sixth sense for ambient magic in your vicinity.");
            Feat bondedFocus = new Feat("Bonded Focus", 14, Set.of(wizardTrait), "Your connection to your bonded item increases your focus pool.");
            Feat secondaryDetonationArray = new Feat("Secondary Detonation Array", 14, Set.of(manipulateTrait, spellshapeTrait, wizardTrait), "You divert some of your spell’s energy into an unstable runic array.");
            Feat superiorBond = new Feat("Superior Bond", 14, Set.of(wizardTrait), "When you draw upon your bonded item, you can leave a bit of energy within it for later use.");
            Feat scintillatingSpell = new Feat("Scintillating Spell", 16, Set.of(concentrateTrait, lightTrait, spellshapeTrait, wizardTrait), "Your spells become a radiant display of light and color.");
            Feat spellTinker = new Feat("Spell Tinker", 16, Set.of(concentrateTrait, wizardTrait), "You’ve learned to alter choices you make when casting spells on yourself.");
            Feat infinitePossibilities = new Feat("Infinite Possibilities", 18, Set.of(wizardTrait), "You can prepare a spell slot that exists in your mind as many different possibilities at once.");
            Feat reprepareSpell = new Feat("Reprepare Spell", 18, Set.of(wizardTrait), "You’ve discovered how to reuse some of your spell slots over and over.");
            Feat secondThoughts = new Feat("Second Thoughts", 18, Set.of(concentrateTrait, mentalTrait, wizardTrait), "When your target proves resilient to your magical deceptions, you can try them again on someone else.");
            Feat archwizardsMight = new Feat("Archwizard's Might", 20, Set.of(wizardTrait), "You have mastered the greatest secrets of arcane magic.");
            Feat spellCombination = new Feat("Spell Combination", 20, Set.of(wizardTrait), "You can merge spells, producing multiple effects with a single casting.");
            Feat spellMastery = new Feat("Spell Mastery", 20, Set.of(wizardTrait), "You have mastered a handful of spells to such a degree that you can cast them even if you haven’t prepared them in advance.");
            Feat spellshapeMastery = new Feat("Spellshape Mastery", 20, Set.of(wizardTrait), "Your mastery of magic ensures that you can alter your spells just as easily as you can cast them normally.");

            Feat ancestralMind = new Feat("Ancestral Mind", 1, Set.of(psychicTrait), "By unraveling memories and connections passed down from your progenitors and buried within your unconscious mind, you learn to convert your inherent magic into psychic power.");
            ancestralMind.setAvailableToClasses(List.of(psychic));

            Feat ammunitionThaumaturgy = new Feat("Ammunition Thaumaturgy", 1, Set.of(thaumaturgeTrait), "You're so used to handling your implement, weapon, and esoterica in the heat of combat that adding a few bullets or arrows to the mix is no extra burden.");
            ammunitionThaumaturgy.setAvailableToClasses(List.of(thaumaturge));
            Feat familiarFeat = new Feat("Familiar", 1, Set.of(magusTrait, thaumaturgeTrait, wizardTrait), "You make a pact with a creature that serves you and assists your spellcasting.");

            Feat nimbleDodge = new Feat("Nimble Dodge", 1, Set.of(rogueTrait), "You deftly dodge out of the way, gaining a +2 circumstance bonus to AC against the triggering attack.");
            nimbleDodge.setAvailableToClasses(List.of(rogue));
            Feat overextendingFeint = new Feat("Overextending Feint", 1, Set.of(rogueTrait), "You goad a foe into overextending.");
            Feat plantEvidence = new Feat("Plant Evidence", 1, Set.of(rogueTrait), "You can put a single item you’re holding of light or negligible Bulk onto a person without them noticing by succeeding at a Thievery check against their Perception DC.");
            Feat tumbleBehind1 = new Feat("Tumble Behind", 1, Set.of(rogueTrait), "You tumble under and behind your foe, your rapid movement letting you catch them off guard.");
            Feat twinFeint = new Feat("Twin Feint", 1, Set.of(rogueTrait), "You use an attack with one weapon to distract your foe from a second attack coming at a different angle.");
            Feat youreNext = new Feat("You're Next", 1, Set.of(emotionTrait, fearTrait, mentalTrait, rogueTrait, swashbucklerTrait, visualTrait), "After downing a foe, you menace another.");
            Feat brutalBeating = new Feat("Brutal Beating", 2, Set.of(emotionTrait, fearTrait, mentalTrait, rogueTrait), "Your critical hits shakes your foes’ confidence.");
            Feat cleverGambit = new Feat("Clever Gambit", 2, Set.of(rogueTrait), "Your battle tactics are aided by assessing your foe’s capabilities and range.");
            Feat distractingFeint = new Feat("Distracting Feint", 2, Set.of(rogueTrait), "Your Feints are far more distracting than normal.");
            Feat mobility = new Feat("Mobility", 2, Set.of(rogueTrait), "You move without leaving an opening.");
            Feat strongArm = new Feat("Strong Arm", 2, Set.of(rogueTrait), "When you Strike with a thrown weapon, the weapon’s range increment increases by 10 feet.");
            Feat unbalancingBlow = new Feat("Unbalancing Blow", 2, Set.of(rogueTrait), "Interweaving attacks, you unbalance your foes.");
            Feat underhandedAssault = new Feat("Underhanded Assault", 2, Set.of(rogueTrait), "You capitalize on the distraction provided by an ally.");
            Feat dreadStriker = new Feat("Dread Striker", 4, Set.of(rogueTrait), "You capitalize on your enemies’ fear to slip past their defenses.");
            Feat headStomp = new Feat("Head Stomp", 4, Set.of(rogueTrait), "Make an unarmed melee Strike against a prone target.");
            Feat mug = new Feat("Mug", 4, Set.of(rogueTrait), "You make a quick attack and rob your foe in the process.");
            Feat poisonWeapon = new Feat("Poison Weapon", 4, Set.of(manipulateTrait, rogueTrait), "You apply a contact poison or injury poison to the required weapon; if you have a free hand, you can Interact to draw a poison as part of this action.");
            Feat predictable = new Feat("Predictable!", 4, Set.of(rogueTrait), "By observing an opponent, you can get a sense of their next move and prepare to counter or resist it.");
            Feat reactivePursuit = new Feat("Reactive Pursuit", 4, Set.of(rogueTrait), "You keep pace with a retreating foe.");
            Feat sabotage = new Feat("Sabotage", 4, Set.of(incapactitationTrait, rogueTrait), "You subtly damage others’ equipment.");
            Feat scoundrelsSurprise = new Feat("Scoundrel's Surprise", 4, Set.of(manipulateTrait, rogueTrait), "You drop your disguise at the right moment and surprise your target.");
            Feat theHarderTheyFall2 = new Feat("The Harder They Fall", 4, Set.of(rogueTrait), "You make your foes fall painfully when you trip them.");
            Feat twinDistraction = new Feat("Twin Distraction", 4, Set.of(rogueTrait), "Your movements with two weapons are so swift and disorienting that they befuddle your opponent.");
            Feat analyzeWeakness = new Feat("Analyze Weakness", 6, Set.of(rogueTrait), "Your knowledge of a creature’s physiology helps you attack with pinpoint accuracy.");
            Feat anticipateAmbush = new Feat("Anticipate Ambush", 6, Set.of(explorationTrait, rogueTrait), "You keep watch for any hidden creatures or dangerous sites, moving at half your travel Speed.");
            Feat farThrow = new Feat("Far Throw", 6, Set.of(rogueTrait), "When you Strike with a thrown weapon, you take only a –1 penalty for each additional range increment between you and the target, rather than a –2 penalty.");
            Feat gangUp = new Feat("Gang Up", 6, Set.of(rogueTrait), "You and your allies harry an opponent in concert.");
            Feat lightStep = new Feat("Light Step", 6, Set.of(rogueTrait), "You aren’t bothered by tricky footing.");
            Feat shoveDown = new Feat("Shove Down", 6, Set.of(rogueTrait), "You leverage your weight to topple foes that you move.");
            Feat slyDisarm = new Feat("Sly Disarm", 6, Set.of(rogueTrait), "You can Disarm a creature through sleight of hand rather than brute force.");
            Feat twistTheKnife = new Feat("Twist the Knife", 6, Set.of(rogueTrait), "After stabbing your opponent in a weak spot, you tear the wound open.");
            Feat watchYourBack = new Feat("Watch your Back", 6, Set.of(emotionTrait, fearTrait, mentalTrait, rogueTrait), "You menace the target, stoking their fears and drawing their attention.");
            Feat bullseye = new Feat("Bullseye", 8, Set.of(rogueTrait), "You carefully take aim to avoid your foe’s concealment and cover.");
            Feat delayTrap = new Feat("Delay Trap", 8, Set.of(rogueTrait), "You try to jam the workings of a trap to delay its effects.");
            Feat improvedPoisonWeapon = new Feat("Improved Poison Weapon", 8, Set.of(rogueTrait), "You deliver poisons in ways that maximize their harmful effects.");
            Feat inspiredStratagem = new Feat("Inspired Stratagem", 8, Set.of(rogueTrait), "During your daily preparations, you can review stratagems for the day’s adventures with up to five allies.");
            Feat nimbleRoll = new Feat("Nimble Roll", 8, Set.of(rogueTrait), "You throw yourself into a roll to escape imminent danger.");
            Feat opportuneBackstab = new Feat("Opportune Backstab", 8, Set.of(rogueTrait), "When your enemy is hit by your ally, you capitalize upon the distraction.");
            Feat predictivePurchase2 = new Feat("Predictive Purchase", 8, Set.of(rogueTrait), "You somehow manage to have just the thing for the situation.");
            Feat ricochetStance2 = new Feat("Ricochet Stance", 8, Set.of(rogueTrait, stanceTrait), "You adopt a stance to rebound your thrown weapons toward you.");
            ricochetStance2.setAvailableToClasses(List.of(rogue));
            Feat sidestep = new Feat("Sidestep", 8, Set.of(rogueTrait), "You deftly step aside and gently redirect an attack.");
            Feat slyStriker = new Feat("Sly Striker", 8, Set.of(rogueTrait), "Your attacks deal more damage, even against creatures that aren’t off-guard.");
            Feat swipeSouvenir = new Feat("Swipe Souvenir", 8, Set.of(rogueTrait), "When you wriggle free from an enemy’s grasp, you take something of theirs with you.");
            Feat tacticalEntry = new Feat("Tactical Entry", 8, Set.of(rogueTrait), "You Stride. This movement doesn’t trigger any reactions.");
            Feat methodicalDebilitations = new Feat("Methodical Debilitations", 10, Set.of(rogueTrait), "You strategically craft your debilitations to lessen or negate an enemy’s tactical advantages.");
            Feat nimbleStrike = new Feat("Nimble Strike", 10, Set.of(rogueTrait), "You’re cunning enough to find an opening in an opponent’s attack.");
            Feat preciseDebilitations = new Feat("Precise Debilitations", 10, Set.of(rogueTrait), "You attack with great precision.");
            Feat sneakAdept = new Feat("Sneak Adept", 10, Set.of(rogueTrait), "It’s almost impossible to spot you.");
            Feat tacticalDebilitations = new Feat("Tactical Debilitations", 10, Set.of(rogueTrait), "You learn new debilitations that grant you tactical advantages against your foes.");
            Feat viciousDebilitations = new Feat("Vicious Debilitations", 10, Set.of(rogueTrait), "The debilitations you dish out seriously impair your foes.");
            Feat bloodyDebilitation = new Feat("Bloody Debilitation", 12, Set.of(rogueTrait), "Your attacks slice arteries and veins.");
            Feat criticalDebilitation = new Feat("Critical Debilitation", 12, Set.of(incapactitationTrait, rogueTrait), "Your debilitations are especially effective on your most powerful attacks.");
            Feat fantasticLeap = new Feat("Fantastic Leap", 12, Set.of(rogueTrait), "You launch yourself through the air at a foe.");
            Feat fellingShot = new Feat("Felling Shot", 12, Set.of(rogueTrait), "Your ranged attacks can shoot an unprepared foe right out of the air.");
            Feat preparation = new Feat("Preparation", 12, Set.of(flourishTrait, rogueTrait), "You survey the battlefield, calculating the possibilities.");
            Feat ricochetFeint = new Feat("Ricochet Feint", 12, Set.of(rogueTrait), "While in Ricochet Stance, you can bounce a thrown weapon off a foe to distract them.");
            Feat springFromTheShadows = new Feat("Spring from the Shadows", 12, Set.of(flourishTrait, rogueTrait), "You leap from hiding and assail your target.");
            Feat defensiveRoll = new Feat("Defensive Roll", 14, Set.of(rogueTrait), "Dropping into a roll to disperse the force of the blow, you can partially evade a lethal attack and stay conscious.");
            Feat instantOpening = new Feat("Instant Opening", 14, Set.of(concentrateTrait, rogueTrait), "You distract your opponent with a few choice words or a rude gesture.");
            Feat leaveAnOpening = new Feat("Leave an Opening", 14, Set.of(rogueTrait), "When you hit hard enough, you leave an opening so your ally can jump in on the action.");
            Feat stayDown = new Feat("Stay Down!", 14, Set.of(rogueTrait), "You have ways of keeping your foes down.");
            Feat blankSlate = new Feat("Blank Slate", 16, Set.of(rogueTrait), "Your deceptions confound even the most powerful magic that could spy on you.");
            Feat cloudStep = new Feat("Cloud Step", 16, Set.of(rogueTrait), "Using fantastic acrobatic skill, you can walk for brief stretches across insubstantial surfaces.");
            Feat cognitiveLoophole = new Feat("Cognitive Loophole", 16, Set.of(rogueTrait), "You can find a loophole in a mental effect to temporarily overcome it.");
            Feat dispellingSlice = new Feat("Dispelling Slice", 16, Set.of(rogueTrait), "Your sneak attack slices through the threads binding magic to a target.");
            Feat perfectDistraction = new Feat("Perfect Distraction", 16, Set.of(rogueTrait), "You use clever tactics to mislead your foes as you sneak away.");
            Feat swiftElusion = new Feat("Swift Elusion", 16, Set.of(rogueTrait), "Attempt an Acrobatics check against the foe’s Reflex DC. If you succeed, either Stride to a different space adjacent to the foe or move the foe to a different space adjacent to you.");
            Feat implausibleInfiltration = new Feat("Implausible Infiltration", 18, Set.of(magicalTrait, moveTrait, rogueTrait), "You find tiny imperfections and somehow fit yourself through them, possibly moving directly through the wall or floor.");
            Feat implausiblePurchase2 = new Feat("Implausible Purchase", 18, Set.of(rogueTrait), "You can use Prescient Planner even if you have already used it after purchasing goods, and you can Interact to draw the item as a single action instead of a 2-action activity. In addition, five times per day, you can use Prescient Planner to pull out a common consumable item up to 6 levels lower than your level.");
            Feat powerfulSneak = new Feat("Powerful Sneak", 18, Set.of(rogueTrait), "You’ve learned to exploit your enemies’ openings.");
            Feat hiddenParagon = new Feat("Hidden Paragon", 20, Set.of(rogueTrait), "When you slip out of sight, you disappear.");
            Feat impossibleStriker = new Feat("Impossible Striker", 20, Set.of(rogueTrait), "Nothing can prevent you from making a sneak attack, even if your opponent can see every blow coming.");
            Feat reactiveDistraction = new Feat("Reactive Distraction", 20, Set.of(concentrateTrait, manipulateTrait, rogueTrait), "You reactively switch with your decoy to foil your foe.");

            Feat bardicLore = new Feat("Bardic Lore", 1, Set.of(bardTrait), "Your studies make you informed on every subject.");
            bardicLore.setAvailableToClasses(List.of(bard));
            Feat reachSpell = new Feat("Reach Spell", 1, Set.of(bardTrait, clericTrait, concentrateTrait, druidTrait, spellshapeTrait, witchTrait, wizardTrait), "You can extend your spells’ range.");
            Feat cantripExpansion = new Feat("Cantrip Expansion", 2, Set.of(bardTrait, clericTrait, magusTrait, psychicTrait, witchTrait, wizardTrait), "Study broadens your range of simple spells.");
            Feat combatReading = new Feat("Combat Reading", 4, Set.of(bardTrait, secretTrait), "You use a performer’s cold reading techniques, aura reading, and other tricks to discover your foe’s strengths and weaknesses.");
            Feat steadySpellcasting = new Feat("Steady Spellcasting", 6, Set.of(bardTrait, clericTrait, druidTrait, psychicTrait, witchTrait, wizardTrait), "You don’t lose spells easily.");
            Feat callAndResponse = new Feat("Call and Response", 8, Set.of(auditoryTrait, bardTrait, concentrateTrait, spellshapeTrait), "Your composition takes the form of a call-and-response chant that lets your allies continue the effect without you.");
            Feat annotateComposition = new Feat("Annotate Composition", 10, Set.of(bardTrait, explorationTrait, linguisticTrait), "By putting composition to paper, you can create a source of stirring words or song that others can read and understand.");
            Feat quickenedCasting = new Feat("Quickened Casting", 10, Set.of(bardTrait, concentrateTrait, spellshapeTrait, witchTrait, wizardTrait), "If your next action is to cast a cantrip or a spell that is at least 2 ranks lower than the highest-rank spell slot you have, reduce the number of actions to cast it by 1 (minimum 1 action).");
            Feat effortlessConcentration = new Feat("Effortless Concentration", 16, Set.of(bardTrait, druidTrait, witchTrait, wizardTrait), "You can maintain a spell with hardly a thought.");
            Feat allInMyHead = new Feat("All In My Head", 18, Set.of(bardTrait, illusionTrait, mentalTrait), "Using your occult connections and incredible powers of persuasion, you convince yourself that the triggering damage is a figment of your imagination.");
            Feat discordantVoice = new Feat("Discordant Voice", 18, Set.of(bardTrait, sonicTrait), "Your courageous anthem lets loose a discordant shriek that imbues your allies’ attacks with powerful sonic reverberations.");

            Feat domainInitiate = new Feat("Domain Initiate", 1, Set.of(clericTrait), "Your deity bestows a special spell related to their powers.");
            domainInitiate.setAvailableToClasses(List.of(cleric));
            Feat deadlySimplicity = new Feat("Deadly Simplicity", 1, Set.of(clericTrait), "When you are wielding your deity’s favored weapon, increase the damage die size of that weapon by one step.");
            deadlySimplicity.setAvailableToClasses(List.of(cleric));
            Feat premonitionOfAvoidance = new Feat("Premonition of Avoidance", 1, Set.of(clericTrait, divineTrait, predictionTrait), "Your deity grants you a moment’s foresight.");
            Feat communalHealing = new Feat("Communal Healing", 2, Set.of(clericTrait, healingTrait, vitalityTrait), "You’re an exceptional conduit for vitality and, as you channel it through you, you can divert some to heal yourself or another creature.");
            Feat channelSmite = new Feat("Channel Smite", 4, Set.of(clericTrait, divineTrait), "You siphon the energies of life and death through a melee attack and into your foe.");
            Feat sacredGround = new Feat("Sacred Ground", 4, Set.of(clericTrait, consecrationTrait, divineTrait, explorationTrait), "You pray continuously for 1 minute to call a subtle shadow of your deity’s realm over a 30-foot burst centered on you.");

            Feat leshyFamiliar = new Feat("Leshy Familiar", 1, Set.of(druidTrait), "You call a minor spirit of nature into a plant body, creating a leshy companion to aid you in your spellcasting.");
            leshyFamiliar.setAvailableToClasses(List.of(druid));
            Feat animalCompanion = new Feat("Animal Companion", 1, Set.of(druidTrait, rangerTrait), "You gain the service of a young animal companion that travels with you on your adventures and obeys any simple commands you give it to the best of its abilities.");
            animalCompanion.setAvailableToClasses(List.of(druid, ranger));
            Feat widenSpell = new Feat("Widen Spell", 1, Set.of(druidTrait, manipulateTrait, spellshapeTrait, witchTrait, wizardTrait), "You manipulate the energy of your spell, causing it to spread out and affect a wider area.");
            Feat enhancedFamiliar = new Feat("Enhanced Familiar", 2, Set.of(druidTrait, magusTrait, thaumaturgeTrait, witchTrait, wizardTrait), "You infuse your familiar with additional primal energy, increasing its abilities.");
            Feat snowdriftSpell = new Feat("Snowdrift Spell", 4, Set.of(coldTrait, druidTrait, manipulateTrait, spellshapeTrait), "The howling wind and precipitation of your magic turn to thick snow.");
            Feat overwhelmingEnergy = new Feat("Overwhelming Energy", 10, Set.of(druidTrait, manipulateTrait, spellshapeTrait, wizardTrait), "With a complex gesture, you call upon the primal power of your spell to overcome enemies’ resistances.");

            Feat huntedShot = new Feat("Hunted Shot", 1, Set.of(flourishTrait, rangerTrait), "You take two quick shots against the one you hunt.");
            huntedShot.setAvailableToClasses(List.of(ranger));
            Feat quickDraw = new Feat("Quick Draw", 2, Set.of(rangerTrait, rogueTrait), "You draw your weapon and attack with the same motion.");
            Feat scoutsWarning = new Feat("Scout's Warning", 4, Set.of(rangerTrait, rogueTrait), "You visually or audibly warn your allies of danger, granting them each a +1 circumstance bonus to their initiative rolls, or a +2 circumstance bonus if you're using the Scout exploration activity.");
            Feat skirmishStrike = new Feat("Skirmish Strike", 6, Set.of(flourishTrait, rangerTrait, rogueTrait), "Your feet and weapon move in tandem.");
            Feat theHarderTheyFall1 = new Feat("The Harder They Fall", 8, Set.of(rangerTrait), "You know how to make a larger creature hurt when it falls to the ground.");
            Feat improvedTwinRiposte2 = new Feat("Improved Twin Riposte", 16, Set.of(rangerTrait), "At the start of each of your turns, you gain an additional reaction that you can use only to perform a Twin Riposte.");

            Feat cackle = new Feat("Cackle", 1, Set.of(witchTrait), "Your patron’s power fills you with confidence, letting you sustain a magical working even as a quick burst of laughter leaves your lips.");
            cackle.setAvailableToClasses(List.of(witch));
            Feat counterspell = new Feat("Counterspell", 1, Set.of(witchTrait, wizardTrait), "When a foe Casts a Spell and you can see its manifestations, you can use your magic to disrupt it.");
            Feat concealSpell = new Feat("Conceal Spell", 2, Set.of(concentrateTrait, spellshapeTrait, witchTrait, wizardTrait), "Through sheer mental effort, you can simplify the incantations and gestures needed to spellcast, leaving them barely noticeable.");
            Feat reflectSpell = new Feat("Reflect Spell", 14, Set.of(witchTrait, wizardTrait), "When you successfully use Counterspell to counteract a spell that affects targeted creatures or an area, you can turn that spell’s effect back on its caster.");

            Feat armorRegimentTraining = new Feat("Armor Regiment Training", 1, Set.of(commanderTrait), "You've trained for grueling marches in full battle kit.");
            armorRegimentTraining.setAvailableToClasses(List.of(commander));
            Feat combatAssessment = new Feat("Combat Assessment", 1, Set.of(commanderTrait, fighterTrait), "You make a telegraphed attack to learn about your foe.");
            combatAssessment.setAvailableToClasses(List.of(fighter, commander));
            Feat reactiveInterference = new Feat("Reactive Interference", 12, Set.of(commanderTrait, rogueTrait), "Grabbing a sleeve, swiping with your weapon, or creating another obstruction, you reflexively foil an enemy’s response.");

            Feat bodyguard = new Feat("Bodyguard", 1, Set.of(guardianTrait), "You swear a vow to protect one of your allies at all costs, regardless of the risk this might pose to you.");
            bodyguard.setAvailableToClasses(List.of(guardian));
            Feat openingStance2 = new Feat("Opening Stance", 14, Set.of(guardianTrait), "At the first sign of trouble, often before you consciously realize the danger, you drop into a stance with a mere thought.");

            Feat acuteVision = new Feat("Acute Vision", 1, Set.of(barbarianTrait), "When you are raging, your visual senses improve, granting you darkvision.");
            acuteVision.setAvailableToClasses(List.of(barbarian));
            Feat suddenCharge = new Feat("Sudden Charge", 1, Set.of(barbarianTrait, fighterTrait, flourishTrait), "With a quick sprint, you dash up to your foe and swing.");
            suddenCharge.setAvailableToClasses(List.of(fighter, barbarian));
            Feat intimidatingStrike = new Feat("Intimidating Strike", 2, Set.of(barbarianTrait, emotionTrait, fearTrait, fighterTrait, mentalTrait), "Your blow not only wounds creatures but also shatters their confidence.");
            intimidatingStrike.setAvailableToClasses(List.of(fighter, barbarian));
            Feat barrelingCharge = new Feat("Barreling Charge", 4, Set.of(barbarianTrait, fighterTrait, flourishTrait), "You rush forward, moving enemies aside to reach your foe.");
            barrelingCharge.setAvailableToClasses(List.of(fighter, barbarian));
            Feat swipe = new Feat("Swipe", 4, Set.of(barbarianTrait, fighterTrait, flourishTrait), "You make a wide, arcing swing.");
            swipe.setAvailableToClasses(List.of(fighter, barbarian));
            Feat reactiveStrikeFeat = new Feat("Reactive Strike", 6, Set.of(barbarianTrait, championTrait, commanderTrait, exemplarTrait, guardianTrait, magusTrait, swashbucklerTrait), "You lash out at a foe that leaves an opening.");
            reactiveStrikeFeat.setAvailableToClasses(List.of(
                    champion,
                    barbarian,
                    commander,
                    exemplar,
                    guardian
            ));
            Feat suddenLeap = new Feat("Sudden Leap", 8, Set.of(barbarianTrait, fighterTrait), "You make an impressive leap and swing while you soar.");
            suddenLeap.setAvailableToClasses(List.of(fighter, barbarian));
            Feat overpoweringCharge = new Feat("Overpowering Charge", 10, Set.of(barbarianTrait, fighterTrait), "You trample foes as you charge past.");
            Feat whirlwindStrikes = new Feat("Whirlwind Strikes", 14, Set.of(barbarianTrait, fighterTrait, flourishTrait), "You lash out in a blur of motion, attacking all nearby adversaries.");

            Feat energizedSpark = new Feat("Energized Spark", 1, Set.of(exemplarTrait), "The energy of your spirit manifests as crackling lightning, the chill of winter, or the power of an element.");
            energizedSpark.setAvailableToClasses(List.of(exemplar));
            Feat lightningSwap = new Feat("Lightning Swap", 2, Set.of(exemplarTrait, fighterTrait, flourishTrait), "You have practiced quickly switching between combat styles and the equipment needed for them.");
            lightningSwap.setAvailableToClasses(List.of(fighter, exemplar));

            Feat brilliantFlash = new Feat("Brilliant Flash", 1, Set.of(championTrait), "Your light cleanses souls of fear.");
            brilliantFlash.setAvailableToClasses(List.of(champion));
            Feat shieldWarden = new Feat("Shield Warden", 6, Set.of(championTrait, commanderTrait, fighterTrait), "When you have a shield raised, you can use your Shield Block reaction when an attack is made against an ally adjacent to you.");
            shieldWarden.setAvailableToClasses(List.of(fighter, commander, champion));
            Feat quickShieldBlock = new Feat("Quick Shield Block", 8, Set.of(championTrait, fighterTrait), "You can bring your shield into place with hardly a thought.");
            quickShieldBlock.setAvailableToClasses(List.of(fighter, champion));

            Feat eliminateRedHerrings = new Feat("Eliminate Red Herrings", 1, Set.of(investigatorTrait), "You have a keen sense for avoiding spurious lines of inquiry.");
            eliminateRedHerrings.setAvailableToClasses(List.of(investigator));
            Feat trapFinder = new Feat("Trap finder", 1, Set.of(investigatorTrait, rogueTrait), "You have an intuitive sense that alerts you to the presence of traps.");
            Feat predictivePurchase1 = new Feat("Predictive Purchase", 6, Set.of(investigatorTrait), "You have just the thing for the situation.");
            Feat senseTheUnseen = new Feat("Sense the Unseen", 14, Set.of(investigatorTrait, rangerTrait, rogueTrait), "When you look for foes, you can catch even the slightest cues, such as their minute movements or the shifting of air currents on your skin.");
            Feat implausiblePurchase1 = new Feat("Implausible Purchase", 16, Set.of(investigatorTrait), "It seems impossible, but you've analyzed every angle and are able to just keep pulling out exactly the item you need, even in far-flung locations.");
            Feat reconstructTheSenses = new Feat("Reconstruct the Senses", 16, Set.of(concentrateTrait, investigatorTrait, rogueTrait), "You spend 1 minute surveying a small location (such as a single room) to get an impression of events that occurred there in the last day.");

            Feat tumbleBehind2 = new Feat("Tumble Behind", 2, Set.of(swashbucklerTrait), "Your tumbling puts your foes on the back foot.");

            Feat adaptedCantrip = new Feat("Adapted Cantrip", 1, Set.of(humanTrait), "Through study of multiple magical traditions, you’ve altered a spell to suit your spellcasting style.");
            adaptedCantrip.setAncestry(human);
            Feat cooperativeNature = new Feat("Cooperative Nature", 1, Set.of(humanTrait), "The short human life span lends perspective and has taught you from a young age to set aside differences and work with others to achieve greatness.");
            Feat generalTraining = new Feat("General Training", 1, Set.of(humanTrait), "Your adaptability manifests in your mastery of a range of useful abilities.");
            Feat haughtyObstinancy = new Feat("Haughty Obstinancy", 1, Set.of(humanTrait), "Your powerful ego makes it harder for others to order you around.");
            Feat naturalAmbition = new Feat("Natural Ambition", 1, Set.of(humanTrait), "You were raised to be ambitious and always reach for the stars, leading you to progress quickly in your chosen field.");
            Feat naturalSkill = new Feat("Natural Skill", 1, Set.of(humanTrait), "Your ingenuity allows you to learn a wide variety of skills.");
            Feat unconventionalWeaponry = new Feat("Unconventional Weaponry", 1, Set.of(humanTrait), "You’ve familiarized yourself with a particular weapon, potentially from another ancestry or culture.");
            Feat adaptiveAdept = new Feat("Adaptive Adept", 5, Set.of(humanTrait), "You’ve continued adapting your magic to blend your class’s tradition with your adapted tradition.");
            Feat cleverImproviser = new Feat("Clever Improviser", 5, Set.of(humanTrait), "You’ve learned how to handle situations when you’re out of your depth.");
            Feat senseAllies = new Feat("Sense Allies", 5, Set.of(humanTrait), "Like many humans raised in a close-knit community, you have always been strongly attuned to the presence of others.");
            Feat cooperativeSoul = new Feat("Cooperative Soul", 9, Set.of(humanTrait), "You have developed a soul-deep bond with your comrades and maintain an even greater degree of cooperation with them.");
            Feat groupAid = new Feat("Group Aid", 9, Set.of(humanTrait), "Your upbringing emphasized teamwork, and helping your allies comes naturally to you.");
            Feat hardyTraveler = new Feat("Hardy Traveler", 9, Set.of(humanTrait), "There’s no journey too far or burden too heavy when you have friends at your side or hope within your heart.");
            Feat incredibleImprovisation = new Feat("Incredible Improvisation", 9, Set.of(humanTrait), "A stroke of brilliance gives you a major advantage with a skill despite your inexperience.");
            Feat multitalented = new Feat("Multitalented", 9, Set.of(humanTrait), "You’ve learned to split your focus between multiple classes with ease.");
            Feat advancedGeneralTraining = new Feat("Advanced General Training", 13, Set.of(humanTrait), "Over the long course of your adventuring life, your adaptability has let you pick up numerous useful abilities.");
            Feat bounceBack = new Feat("Bounce Back", 13, Set.of(humanTrait), "You recover from near-death experiences with astounding resilience.");
            Feat stubbornPersistence = new Feat("Stubborn Persistence", 13, Set.of(humanTrait), "Humans are renowned for their ability to persist through the most grueling of trials that would leave others ready to drop.");
            Feat heroicPresence = new Feat("Heroic Presence", 17, Set.of(emotionTrait, humanTrait, mentalTrait), "The blood of heroes courses through your veins, and you inspire your allies to dig deep and find a new level of resolve.");

            Feat dwarvenDoughtiness = new Feat("Dwarven Doughtiness", 1, Set.of(dwarfTrait), "You are naturally calm and collected in the face of imminent danger.");
            adaptedCantrip.setAncestry(dwarf);
            Feat stonewall = new Feat("Stonewall", 17, Set.of(dwarfTrait, earthTrait, polymorphTrait), "The strength of stone overcomes you so strongly that it replaces your stout body.");

            Feat ancestralLongevity = new Feat("Ancestral Longevity", 1, Set.of(elfTrait), "You have accumulated a vast array of lived knowledge over the years.");
            ancestralLongevity.setAncestry(elf);
            Feat elvenLore = new Feat("Elven Lore", 1, Set.of(elfTrait), "You've studied traditional elven arts, learning about arcane magic and the world around you.");
            Feat elvenWeaponFamiliarity = new Feat("Elven Weapon Familiarity", 1, Set.of(elfTrait), "You favor bows and other elegant weapons.");
            Feat forlorn = new Feat("Forlorn", 1, Set.of(elfTrait), "Watching your friends age and die fills you with moroseness that protects you against harmful emotions.");
            Feat nimbleElf = new Feat("Nimble Elf", 1, Set.of(elfTrait), "Your muscles are tightly honed.");
            nimbleElf.setAncestry(elf);
            Feat otherworldlyMagic = new Feat("Otherworldly Magic", 1, Set.of(elfTrait), "Your elven magic manifests as a simple arcane spell, even if you aren't formally trained in magic.");
            Feat unwaveringMien = new Feat("Unwavering Mien", 1, Set.of(elfTrait), "Your mystic control and meditations allow you to resist external influences upon your consciousness.");
            Feat agelessPatience = new Feat("Ageless Patience", 5, Set.of(elfTrait), "You work at a pace born from longevity that enhances your thoroughness.");
            Feat ancestralSuspicion = new Feat("Ancestral Suspicion", 5, Set.of(elfTrait), "Long-lived elves have seen civilizations rise and fall, often at the hands of outside forces.");
            Feat martialExperience = new Feat("Martial Experience", 5, Set.of(elfTrait), "You've crossed blades with a wide variety of foes wielding a wide variety of weapons, and you've learned the basics of fighting with nearly any of them.");
            Feat elfStep = new Feat("Elf Step", 9, Set.of(elfTrait), "You move in a graceful dance, and even your steps are broad.");
            Feat expertLongevity = new Feat("Expert Longevity", 9, Set.of(elfTrait), "You've continued to refine the knowledge and skills you've gained through your life.");
            Feat otherworldlyAcumen = new Feat("Otherworldly Acumen", 9, Set.of(elfTrait), "The arcane magic you possess grows in power and complexity.");
            Feat treeClimber = new Feat("Tree Climber", 9, Set.of(elfTrait), "You've spent much of your life among the treetops and have become an expert at quickly and safely climbing them.");
            Feat avengeAlly = new Feat("Avenge Ally", 13, Set.of(elfTrait, fortuneTrait), "Though you know that you will eventually outlive your companions, seeing them at death's door brings clarity to your attacks.");
            Feat universalLongevity = new Feat("Universal Longevity", 13, Set.of(elfTrait), "You’ve perfected your ability to keep up with all the skills you’ve learned over your long life, so you’re almost never truly untrained at a skill.");
            Feat magicRider = new Feat("Magic Rider", 17, Set.of(elfTrait), "Your people used powerful magic to travel between distant worlds in the distant past, and the remnants of that magic make such transportation easier for you.");

            Feat animalAccomplice = new Feat("Animal Accomplice", 1, Set.of(gnomeTrait), "You build a rapport with an animal, which becomes magically bonded to you.");
            animalAccomplice.setAncestry(gnome);
            Feat projectPersona = new Feat("Project Persona", 5, Set.of(concentrateTrait, gnomeTrait, illusionTrait, primalTrait, visualTrait), "Where others etch their armor to serve as a conduit for their imaginations, your vivid mind and bold personality allow you to project a more fitting persona over your lackluster armor.");
            Feat instinctiveObfuscation = new Feat("Instinctive Obfuscation", 13, Set.of(gnomeTrait, illusionTrait, visualTrait), "The magic within you manifests as a natural reaction to threats.");

            Feat burnIt = new Feat("Burn It!", 1, Set.of(goblinFeat), "Fire fascinates you.");
            burnIt.setAncestry(goblin);

            Feat distractingShadows = new Feat("Distracting Shadows", 1, Set.of(halflingTrait), "You have learned to remain hidden by using larger folk as a distraction to avoid drawing attention to yourself.");
            distractingShadows.setAncestry(halfling);
            Feat halflingLuck = new Feat("Halfling Luck", 1, Set.of(fortuneTrait, halflingTrait), "Your happy-go-lucky nature makes it seem like misfortune avoids you, and to an extent, that might even be true.");
            halflingLuck.setAncestry(halfling);

            Feat graspingReach = new Feat("Grasping Reach", 1, Set.of(leshyTrait), "You can extend a tangle of vines or tendrils to support your arms and extend your reach.");
            graspingReach.setAncestry(leshy);
            Feat ritualReversion = new Feat("Ritual Reversion", 5, Set.of(leshyTrait, polymorphTrait, primalTrait), "You can temporarily revert to a less conspicuous form without diminishing your senses.");
            Feat cloakOfPoison = new Feat("Cloak of Poison", 13, Set.of(leshyTrait, poisonTrait), "You secrete a cloak of concentrated poison that harms any who dare attack you.");

            Feat beastTrainer = new Feat("Beast Trainer", 1, Set.of(orcTrait), "You have an impressive innate ability to tame and command ferocious beasts.");
            beastTrainer.setAncestry(orc);
            Feat holdMark = new Feat("Hold Mark", 1, Set.of(orcTrait), "You bear scars or tattoos enhanced by the mark of your community’s prowess.");
            Feat ironFists = new Feat("Iron Fists", 1, Set.of(orcTrait), "Your fists have been forged by battle, your naturally tough skin and dense bone further hardened by conflict.");
            Feat orcFerocity = new Feat("Orc Ferocity", 1, Set.of(orcTrait), "Fierceness in battle runs through your blood, and you refuse to fall from your injuries no matter how terrible they may be.");
            Feat orcLore = new Feat("Orc Lore", 1, Set.of(orcTrait), "The hold elders taught you your people’s histories, told tales of great athletic feats, and shared with you the hardships your ancestors endured so that you can pass this wisdom down to future generations.");
            Feat orcSuperstition = new Feat("Orc Superstition", 1, Set.of(concentrateTrait, orcTrait), "You defend yourself against magic by relying on techniques derived from orc cultural superstitions.");
            Feat orcWeaponFamiliarity = new Feat("Orc Weapon Familiarity", 1, Set.of(orcTrait), "In combat, you favor the brutal weapons that are traditional for your orc ancestors.");
            Feat tusksFeat = new Feat("Tusks", 1, Set.of(orcTrait), "You have particularly long, jagged tusks perfect for tearing meat from bone.");
            Feat athleticMight = new Feat("Athletic Might", 5, Set.of(orcTrait), "Surviving in hostile terrain has given you a great talent for mobility.");
            Feat bloodyBlows = new Feat("Bloody Blows", 5, Set.of(orcTrait), "Your lethal unarmed attacks leave bloody gouges or cause severe internal bleeding.");
            Feat defyDeath = new Feat("Defy Death", 5, Set.of(orcTrait), "You’re exceptionally difficult to kill.");
            Feat scarThickSkin = new Feat("Scar-Thick Skin", 5, Set.of(orcTrait), "Glorious, storied scars cover and protect much of your body, girding you in fleshly armor that resists any wound weaker than those you have already survived.");
            Feat pervasiveSuperstition = new Feat("Pervasive Superstition", 9, Set.of(orcTrait), "You steep yourself in superstition and practice ancient orc mental exercises for shrugging off the effects of magic.");
            Feat undyingFerocity = new Feat("Undying Ferocity", 9, Set.of(orcTrait), "You resist death’s clutches with supernatural vigor, daring death to claim you while promising that any such attempt will surely fail.");
            Feat ferociousBeasts = new Feat("Ferocious Beasts", 13, Set.of(orcTrait), "Since ancient times, the mightiest orc beast tamers would draw out the true fighting spirit of their companion beasts by feeding the creatures a draft incorporating the orc’s own blood.");
            Feat incredibleFerocity = new Feat("Incredible Ferocity", 13, Set.of(orcTrait), "Given time to collect yourself after a near-death scrape, you can rebuild your ferocity and withstand additional finishing blows.");
            Feat spellDevourer = new Feat("Spell Devourer", 13, Set.of(orcTrait), "You don’t just resist magic; you devour it.");
            Feat rampagingFerocity = new Feat("Rampaging Ferocity", 17, Set.of(orcTrait), "You lash out viciously even as you fend off death.");

            Feat earnedGlory = new Feat("Earned Glory", 1, Set.of(aiuvarinTrait), "Elves often struggle with underestimating aiuvarins, and you are experienced at telling stories of your accomplishments to gain their respect.");
            earnedGlory.setHeritage(aiuvarin);
            Feat elfAtavism = new Feat("Elf Atavism", 1, Set.of(aiuvarinTrait), "Your elven blood runs particularly strong, granting you features far more elven than those of a typical aiuvarin.");
            Feat inspireImitation = new Feat("Inspire Imitation", 5, Set.of(aiuvarinTrait), "Your actions inspire your allies to great achievements.");
            Feat supernaturalCharm = new Feat("Supernatural Charm", 5, Set.of(aiuvarinTrait), "The elven magic in your blood manifests as a force you can use to become more appealing or alluring.");
            supernaturalCharm.setHeritage(aiuvarin);

            Feat monstrousPeacemaker = new Feat("Monstrous Peacemaker", 1, Set.of(dromaarTrait), "Your dual human and orc nature has given you a unique perspective, allowing you to bridge the gap between humans and the many intelligent creatures in the world that humans consider monsters.");
            monstrousPeacemaker.setHeritage(dromaar);
            Feat orcSight = new Feat("Orc Sight", 1, Set.of(dromaarTrait), "Your orc blood grants you the keen vision of your forebears.");

            Feat brineMay = new Feat("Brine May", 1, Set.of(changelingTrait, lineageTrait), "Your mother was a sea hag, granting you one sea-green or blue eye.");
            Feat callowMay = new Feat("Callow May", 1, Set.of(changelingTrait, lineageTrait), "You are among the most common of changelings—those born to sweet hags—and a vibrant green eye signifies that parentage.");
            Feat changelingLore = new Feat("Changeling Lore", 1, Set.of(changelingTrait), "All too aware of your true nature, you’ve studied hags and their powers.");
            Feat dreamMay = new Feat("Dream May", 1, Set.of(changelingTrait, lineageTrait), "You are the child of a cuckoo hag, making one of your eyes violet or even black.");
            Feat hagClaws = new Feat("Hag Claws", 1, Set.of(changelingTrait), "When you came of age, your fingernails grew long and sharp.");
            Feat hagsSight = new Feat("Hag's Sight", 1, Set.of(changelingTrait), "You’ve nurtured the supernatural abilities gifted by your hag mother, particularly your sight.");
            Feat slagMay = new Feat("Slag May", 1, Set.of(changelingTrait, lineageTrait), "Your mother was an iron hag known for physical prowess, and you have one violet or steel-gray eye.");
            Feat called = new Feat("Called", 5, Set.of(changelingTrait), "You’ve heard the Call, and by resisting it, you’ve developed a bulwark against effects that target your mind.");
            Feat mistChild = new Feat("Mist Child", 5, Set.of(changelingTrait), "You blend in with unnatural subtlety.");
            Feat accursedClaws = new Feat("Accursed Claws", 9, Set.of(changelingTrait), "Your claws carry your mother’s hag magic.");
            Feat occultResistance = new Feat("Occult Resistance", 9, Set.of(changelingTrait), "Your study of occult practices has shown you how to best defend against them.");
            Feat hagMagic = new Feat("Hag Magic", 13, Set.of(changelingTrait), "Through your heritage, you can replicate a hag’s magic.");

            Feat angelkin = new Feat("Angelkin", 1, Set.of(lineageTrait, nephilimTrait), "You descend from an angel, a winged messenger from Nirvana or one of the other celestial realms.");
            Feat divineWings = new Feat("Divine Wings", 9, Set.of(divineTrait, morphTrait, nephilimTrait), "With effort, you can call forth magical wings from your back, similar in appearance to those of your extraplanar forebear, whether they be elegantly feathered wings or ominous bat wings.");

            featRepo.saveAll(List.of(
                    advancedFirstAid, assurance, bondedAnimal, combatClimber, intimidatingGlare, multilingual, quickClimb, terrainExpert, studentOfTheCanon,
                    adoptedAncestry, shieldBlock, diehard,
                    doubleSlice, exactingStrike, pointBlankStance, reactiveShield, snaggingStrike, viciousSwing,
                    aggressiveBlock, assistingShot, bladeBrake, brutishShove, combatGrab, duelingParry1, lunge, reboundingToss, sleekReposition,
                    doubleShot, dualHandedAssault, partingShot, powerfulShove, quickReversal, shieldedStride, slamDown, twinParry,
                    advancedWeaponTraining, advantageousAssault, dazingBlow, disarmingStance, furiousFocus, guardiansDeflection, reflexiveShield, revealingStab, ricochetStance1, shatterDefenses, tripleShot,
                    blindFight, disorientingOpening, duelingRiposte, fellingStrike, incredibleAim, mobileShotStance, positioningAssault, resoundingBravery,
                    agileGrace, certainStrike, crashingSlam, cutFromTheAir, debilitatingShot, disarmingTwist, disruptiveStance, fearsomeBrute, flingingCharge, mirrorShield, tacticalReflexes, twinRiposte,
                    brutalFinish, dashingStrike, duelingDance, flingingShove, improvedDuelingRiposte, incredibleRicochet, lungingStance, paragonsGuard,
                    desperateFinisher, determination, guidingFinish, guidingRiposte, improvedTwinRiposte1, openingStance1, twoWeaponFlurry,
                    gracefulPoise, improvedReflexiveShield, masterOfManyStyles, multishotStance, overwhelmingBlow, twinnedDefense,
                    impossibleVolley, savageCritical, smashFromTheAir,
                    boundlessReprisals, ultimateFlexibility, weaponSupremacy,
                    spellbookProdigy,
                    energyAblation, nonlethalSpell,
                    bespellStrikes, callWizardlyTools, linkedFocus, spellProtectionArray,
                    convincingIllusion, explosiveArrival, irresistibleMagic, splitSlot,
                    advancedSchoolSpell, bondConservation, formRetention, knowledgeIsPower,
                    scrollAdept,
                    cleverCounterspell, forcibleEnergy, keenMagicalDetection, magicSense,
                    bondedFocus, secondaryDetonationArray, superiorBond,
                    scintillatingSpell, spellTinker,
                    infinitePossibilities, reprepareSpell, secondThoughts,
                    archwizardsMight, spellCombination, spellMastery, spellshapeMastery,
                    nimbleDodge, overextendingFeint, plantEvidence, tumbleBehind1, twinFeint, youreNext,
                    brutalBeating, cleverGambit, distractingFeint, mobility, strongArm, unbalancingBlow, underhandedAssault,
                    dreadStriker, headStomp, mug, poisonWeapon, predictable, reactivePursuit, sabotage, scoundrelsSurprise, theHarderTheyFall2, twinDistraction,
                    analyzeWeakness, anticipateAmbush, farThrow, gangUp, lightStep, shoveDown, slyDisarm, twistTheKnife, watchYourBack,
                    bullseye, delayTrap, improvedPoisonWeapon, inspiredStratagem, nimbleRoll, opportuneBackstab, predictivePurchase2, ricochetStance2, sidestep, slyStriker, swipeSouvenir, tacticalEntry,
                    methodicalDebilitations, nimbleStrike, preciseDebilitations, sneakAdept, tacticalDebilitations, viciousDebilitations,
                    bloodyDebilitation, criticalDebilitation, fantasticLeap, fellingShot, preparation, ricochetFeint, springFromTheShadows,
                    defensiveRoll, instantOpening, leaveAnOpening, stayDown,
                    blankSlate, cloudStep, cognitiveLoophole, dispellingSlice, perfectDistraction, swiftElusion,
                    implausibleInfiltration, implausiblePurchase2, powerfulSneak,
                    hiddenParagon, impossibleStriker, reactiveDistraction,
                    bardicLore, reachSpell, cantripExpansion, combatReading, steadySpellcasting, callAndResponse, annotateComposition, quickenedCasting, effortlessConcentration, allInMyHead, discordantVoice,
                    domainInitiate, deadlySimplicity, premonitionOfAvoidance, communalHealing, channelSmite, sacredGround,
                    leshyFamiliar, animalCompanion, widenSpell, enhancedFamiliar, snowdriftSpell, overwhelmingEnergy,
                    huntedShot, quickDraw, scoutsWarning, skirmishStrike, theHarderTheyFall1, improvedTwinRiposte2,
                    cackle, counterspell, concealSpell, reflectSpell,
                    armorRegimentTraining, combatAssessment, reactiveInterference,
                    bodyguard, openingStance2,
                    acuteVision, suddenCharge, intimidatingStrike, barrelingCharge, swipe, reactiveStrikeFeat,  suddenLeap, overpoweringCharge, whirlwindStrikes,
                    energizedSpark, lightningSwap,
                    ancestralMind,
                    ammunitionThaumaturgy, familiarFeat,
                    brilliantFlash, shieldWarden, quickShieldBlock,
                    eliminateRedHerrings, trapFinder, predictivePurchase1, senseTheUnseen, implausiblePurchase1, reconstructTheSenses,
                    tumbleBehind2,
                    adaptedCantrip, cooperativeNature, generalTraining, haughtyObstinancy, naturalAmbition, naturalSkill, unconventionalWeaponry,
                    adaptiveAdept, cleverImproviser, senseAllies,
                    cooperativeSoul, groupAid, hardyTraveler, incredibleImprovisation, multitalented,
                    advancedGeneralTraining, bounceBack, stubbornPersistence,
                    heroicPresence,
                    dwarvenDoughtiness, stonewall,
                    ancestralLongevity, elvenLore, elvenWeaponFamiliarity, forlorn, nimbleElf, otherworldlyMagic, unwaveringMien,
                    agelessPatience, ancestralSuspicion, martialExperience,
                    elfStep, expertLongevity, otherworldlyAcumen, treeClimber,
                    avengeAlly, universalLongevity,
                    magicRider,
                    earnedGlory, elfAtavism, inspireImitation, supernaturalCharm,
                    animalAccomplice, projectPersona, instinctiveObfuscation,
                    burnIt, distractingShadows, halflingLuck,
                    graspingReach, ritualReversion, cloakOfPoison,
                    beastTrainer, holdMark, ironFists, orcFerocity, orcLore, orcSuperstition, orcWeaponFamiliarity, tusksFeat,
                    athleticMight, bloodyBlows, defyDeath, scarThickSkin,
                    pervasiveSuperstition, undyingFerocity,
                    ferociousBeasts, incredibleFerocity, spellDevourer,
                    rampagingFerocity,
                    monstrousPeacemaker, orcSight,
                    brineMay, callowMay, changelingLore, dreamMay, hagClaws, hagsSight, slagMay,
                    called, mistChild,
                    accursedClaws, occultResistance,
                    hagMagic,
                    angelkin, divineWings));

            Background warrior = new Background("Warrior", "You served as a soldier or mercenary.", List.of(intimidation), "Warfare Lore", intimidatingGlare);
            Background scholar = new Background("Scholar", "You studied ancient texts and forgotten lore.", List.of(arcana, nature, occultism, religion), "Academia Lore", assurance);
            Background acolyte = new Background("Acolyte", "You spent your early days in a religious monastery or cloister.", List.of(religion), "Scribling Lore", studentOfTheCanon);

            backgroundRepo.saveAll(List.of(acolyte, warrior, scholar));

            ClassFeatureChoice emotionalAcceptance = new ClassFeatureChoice(psychic, "Subconscious Mind", "Emotional Acceptance");
            ClassFeatureChoice gatheredLore = new ClassFeatureChoice(psychic, "Subconscious Mind", "Gathered Lore");

            ClassFeatureChoice mastermind = new ClassFeatureChoice(rogue, "Racket", "Mastermind");
            FeatureGrantedProficiency mastermindSociety = new FeatureGrantedProficiency(mastermind, "Society", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
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

            ClassFeatureChoice ruffian = new ClassFeatureChoice(rogue, "Racket", "Ruffian");
            FeatureGrantedProficiency ruffianIntimidation = new FeatureGrantedProficiency(ruffian, "Intimidation", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            FeatureGrantedProficiency ruffianMediumArmor = new FeatureGrantedProficiency(ruffian, "Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED);
            ruffian.setGrantedProficiencies(List.of(
                    ruffianIntimidation,
                    ruffianMediumArmor
            ));

            ClassFeatureChoice scoundrel = new ClassFeatureChoice(rogue, "Racket", "Scoundrel");
            FeatureGrantedProficiency scoundrelDeception = new FeatureGrantedProficiency(scoundrel, "Deception", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            FeatureGrantedProficiency scoundrelDiplomacy = new FeatureGrantedProficiency(scoundrel, "Diplomacy", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            scoundrel.setGrantedProficiencies(List.of(
                    scoundrelDeception,
                    scoundrelDiplomacy
            ));

            ClassFeatureChoice thief = new ClassFeatureChoice(rogue, "Racket", "Thief");
            FeatureGrantedProficiency thiefThievery = new FeatureGrantedProficiency(thief, "Thievery", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            thief.setGrantedProficiencies(List.of(thiefThievery));

            ClassFeatureChoice cloisteredCleric = new ClassFeatureChoice(cleric, "Doctrine", "Cloistered Cleric");
            FeatureGrantedFeat cloisteredDomainInitiate = new FeatureGrantedFeat(cloisteredCleric, domainInitiate);
            cloisteredCleric.setGrantedFeats(List.of(cloisteredDomainInitiate));

            ClassFeatureChoice warpriest = new ClassFeatureChoice(cleric, "Doctrine", "Warpriest");

            warpriest.setGrantedProficiencies(List.of(
                    new FeatureGrantedProficiency(warpriest, "Light Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new FeatureGrantedProficiency(warpriest, "Medium Armor", ProficiencyCategory.DEFENSE, ProficiencyRank.TRAINED),
                    new FeatureGrantedProficiency(warpriest, "Fortitude", ProficiencyCategory.SAVE, ProficiencyRank.EXPERT)
            ));

            FeatureGrantedFeat warpriestShieldBlock = new FeatureGrantedFeat(warpriest, shieldBlock);
            FeatureGrantedFeat warpriestDeadlySimplicity = new FeatureGrantedFeat(warpriest, deadlySimplicity);
            warpriestDeadlySimplicity.setRequiresSimpleOrUnarmedDeityWeapon(true);
            warpriest.setGrantedFeats(List.of(warpriestShieldBlock, warpriestDeadlySimplicity));

            ClassFeatureChoice animalOrder = new ClassFeatureChoice(druid, "Druidic Order", "Animal");
            FeatureGrantedProficiency animalAthletics = new FeatureGrantedProficiency(animalOrder, "Athletics", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            animalOrder.setGrantedProficiencies(List.of(animalAthletics));
            FeatureGrantedFeat animalOrderFeat = new FeatureGrantedFeat(animalOrder, animalCompanion);
            animalOrder.setGrantedFeats(List.of(animalOrderFeat));

            ClassFeatureChoice leafOrder = new ClassFeatureChoice(druid, "Druidic Order", "Leaf");
            FeatureGrantedProficiency leafDiplomacy = new FeatureGrantedProficiency(leafOrder, "Diplomacy", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            leafOrder.setGrantedProficiencies(List.of(leafDiplomacy));
            FeatureGrantedFeat leafOrderFeat = new FeatureGrantedFeat(leafOrder, leshyFamiliar);
            leafOrder.setGrantedFeats(List.of(leafOrderFeat));

            ClassFeatureChoice faithsFlamekeeper = new ClassFeatureChoice(witch, "Patron Theme", "Faith's Flamekeeper");
            FeatureGrantedProficiency faithReligion = new FeatureGrantedProficiency(faithsFlamekeeper, "Religion", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            faithsFlamekeeper.setGrantedProficiencies(List.of(faithReligion));

            ClassFeatureChoice silenceInSnow = new ClassFeatureChoice(witch, "Patron Theme", "Silence in Snow");
            FeatureGrantedProficiency snowNature = new FeatureGrantedProficiency(silenceInSnow, "Nature", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            silenceInSnow.setGrantedProficiencies(List.of(snowNature));

            ClassFeatureChoice schoolOfArsGrammatica = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Ars Grammatica");
            ClassFeatureChoice schoolOfBattleMagic = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Battle Magic");
            ClassFeatureChoice schoolOfCivicWizardry = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Civic Wizardry");
            ClassFeatureChoice schoolOfMentalism = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Mentalism");
            ClassFeatureChoice schoolOfProtenForm = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Proten Form");
            ClassFeatureChoice schoolOfTheBoundary = new ClassFeatureChoice(wizard, "Arcane Schools", "School of the Boundary");
            ClassFeatureChoice schoolOfUnifiedMagicalTheory = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Unified Magical Theory");

            ClassFeatureChoice experimentalSpellshaping = new ClassFeatureChoice(wizard, "Arcane Thesis", "Experimental Spellshaping");
            ClassFeatureChoice improvedFamiliarAttunement = new ClassFeatureChoice(wizard, "Arcane Thesis", "Improved Familiar Attunement");
            FeatureGrantedFeat improvedFamiliarAttunementFeat = new FeatureGrantedFeat(improvedFamiliarAttunement, familiarFeat);
            improvedFamiliarAttunement.setGrantedFeats(List.of(improvedFamiliarAttunementFeat));
            ClassFeatureChoice spellBlending = new ClassFeatureChoice(wizard, "Arcane Thesis", "Spell Blending");
            ClassFeatureChoice spellSubstitution = new ClassFeatureChoice(wizard, "Arcane Thesis", "Spell Substitution");
            ClassFeatureChoice staffNexus = new ClassFeatureChoice(wizard, "Arcane Thesis", "Staff Nexus");

            ClassFeatureChoice alchemicalSciences = new ClassFeatureChoice(investigator, "Methodology", "Alchemical Sciences");
            FeatureGrantedProficiency alchemicalCrafting = new FeatureGrantedProficiency(alchemicalSciences, "Crafting", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            alchemicalSciences.setGrantedProficiencies(List.of(alchemicalCrafting));

            List<Skill> intelligenceSkills = List.of(
                    arcana,
                    crafting,
                    lore,
                    occultism,
                    society
            );

            ClassFeatureChoice empiricism = new ClassFeatureChoice(investigator, "Methodology", "Empiricism");

            FeatureSkillChoice empiricismSkillChoice = new FeatureSkillChoice();
            empiricismSkillChoice.setClassFeatureChoice(empiricism);
            empiricismSkillChoice.setSkillOptions(intelligenceSkills);
            empiricismSkillChoice.setNumberToChoose(1);
            empiricismSkillChoice.setRank(ProficiencyRank.TRAINED);

            empiricism.setSkillChoices(List.of(empiricismSkillChoice));

            classFeatureChoiceRepo.saveAll(List.of(
                    emotionalAcceptance,
                    gatheredLore,
                    mastermind, ruffian, scoundrel, thief,
                    cloisteredCleric,
                    warpriest,
                    animalOrder,
                    leafOrder,
                    faithsFlamekeeper,
                    silenceInSnow,
                    schoolOfArsGrammatica, schoolOfBattleMagic, schoolOfCivicWizardry, schoolOfMentalism, schoolOfProtenForm, schoolOfTheBoundary, schoolOfUnifiedMagicalTheory,
                    experimentalSpellshaping, improvedFamiliarAttunement, spellBlending, spellSubstitution, staffNexus,
                    alchemicalSciences,
                    empiricism
            ));

            List<AttributeName> allSix = List.of(AttributeName.STRENGTH, AttributeName.DEXTERITY, AttributeName.CONSTITUTION, AttributeName.INTELLIGENCE, AttributeName.WISDOM, AttributeName.CHARISMA);

            AttributeBoostRule humanBoosts = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 2);
            humanBoosts.setAncestry(human);

            AttributeBoostRule dwarfConBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CONSTITUTION), 1);
            dwarfConBoost.setAncestry(dwarf);
            AttributeBoostRule dwarfWisBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.WISDOM), 1);
            dwarfWisBoost.setAncestry(dwarf);
            AttributeBoostRule dwarfFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            dwarfFreeBoost.setAncestry(dwarf);

            AttributeBoostRule elfDexBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.DEXTERITY), 1);
            elfDexBoost.setAncestry(elf);
            AttributeBoostRule elfIntBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.INTELLIGENCE), 1);
            elfIntBoost.setAncestry(elf);
            AttributeBoostRule elfFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            elfFreeBoost.setAncestry(elf);

            AttributeBoostRule gnomeConBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CONSTITUTION), 1);
            gnomeConBoost.setAncestry(gnome);
            AttributeBoostRule gnomeChaBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CHARISMA), 1);
            gnomeChaBoost.setAncestry(gnome);
            AttributeBoostRule gnomeFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            gnomeFreeBoost.setAncestry(gnome);

            AttributeBoostRule goblinDexBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.DEXTERITY), 1);
            goblinDexBoost.setAncestry(goblin);
            AttributeBoostRule goblinChaBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CHARISMA), 1);
            goblinChaBoost.setAncestry(goblin);
            AttributeBoostRule goblinFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            goblinFreeBoost.setAncestry(goblin);

            AttributeBoostRule halflingDexBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.DEXTERITY), 1);
            halflingDexBoost.setAncestry(halfling);
            AttributeBoostRule halflingWisBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.WISDOM), 1);
            halflingWisBoost.setAncestry(halfling);
            AttributeBoostRule halflingFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            halflingFreeBoost.setAncestry(halfling);

            AttributeBoostRule leshyConBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CONSTITUTION), 1);
            leshyConBoost.setAncestry(leshy);
            AttributeBoostRule leshyWisBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.WISDOM), 1);
            leshyWisBoost.setAncestry(leshy);
            AttributeBoostRule leshyFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            leshyFreeBoost.setAncestry(leshy);

            AttributeBoostRule orcBoosts = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 2);
            orcBoosts.setAncestry(orc);

            AttributeBoostRule koboldDexBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.DEXTERITY), 1);
            koboldDexBoost.setAncestry(kobold);
            AttributeBoostRule koboldChaBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CHARISMA), 1);
            koboldChaBoost.setAncestry(kobold);
            AttributeBoostRule koboldFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            koboldFreeBoost.setAncestry(kobold);

            AttributeBoostRule samsaranConBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CONSTITUTION), 1);
            samsaranConBoost.setAncestry(samsaran);
            AttributeBoostRule samsaranWisBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.WISDOM), 1);
            samsaranWisBoost.setAncestry(samsaran);
            AttributeBoostRule samsaranFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            samsaranFreeBoost.setAncestry(samsaran);

            AttributeBoostRule kholoStrBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.STRENGTH), 1);
            kholoStrBoost.setAncestry(kholo);
            AttributeBoostRule kholoIntBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.INTELLIGENCE), 1);
            kholoIntBoost.setAncestry(kholo);
            AttributeBoostRule kholoFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            kholoFreeBoost.setAncestry(kholo);

            AttributeBoostRule wayangDexBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.DEXTERITY), 1);
            wayangDexBoost.setAncestry(wayang);
            AttributeBoostRule wayangChaBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CHARISMA), 1);
            wayangChaBoost.setAncestry(wayang);
            AttributeBoostRule wayangFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            wayangFreeBoost.setAncestry(wayang);

            AttributeBoostRule scholarMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.WISDOM), 1);
            scholarMentalBoost.setBackground(scholar);
            AttributeBoostRule scholarFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            scholarFreeBoost.setBackground(scholar);

            AttributeBoostRule warriorPhysBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.CONSTITUTION), 1);
            warriorPhysBoost.setBackground(warrior);
            AttributeBoostRule warriorFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            warriorFreeBoost.setBackground(warrior);

            AttributeBoostRule fighterBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.DEXTERITY), 1);
            fighterBoost.setCharacterClass(fighter);

            AttributeBoostRule wizardBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.INTELLIGENCE), 1);
            wizardBoost.setCharacterClass(wizard);

            AttributeBoostRule emotionalAcceptanceBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CHARISMA), 1);
            emotionalAcceptanceBoost.setClassFeatureChoice(emotionalAcceptance);
            AttributeBoostRule gatheredLoreBoost = new AttributeBoostRule(AttributeBoostType.FIXED,List.of(AttributeName.INTELLIGENCE), 1);
            gatheredLoreBoost.setClassFeatureChoice(gatheredLore);

            AttributeBoostRule rogueDexBoost = new AttributeBoostRule(AttributeBoostType.CHOICE,List.of(AttributeName.DEXTERITY),1);
            rogueDexBoost.setCharacterClass(rogue);
            AttributeBoostRule mastermindBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE), 1);
            mastermindBoost.setClassFeatureChoice(mastermind);
            AttributeBoostRule ruffianBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH), 1);
            ruffianBoost.setClassFeatureChoice(ruffian);
            AttributeBoostRule scoundrelBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.CHARISMA), 1);
            scoundrelBoost.setClassFeatureChoice(scoundrel);

            AttributeBoostRule thaumaturgeBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CHARISMA), 1);
            thaumaturgeBoost.setCharacterClass(thaumaturge);

            AttributeBoostRule bardBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.CHARISMA), 1);
            bardBoost.setCharacterClass(bard);

            AttributeBoostRule clericBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.WISDOM), 1);
            clericBoost.setCharacterClass(cleric);

            AttributeBoostRule druidBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.WISDOM), 1);
            druidBoost.setCharacterClass(druid);

            AttributeBoostRule rangerBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.DEXTERITY), 1);
            rangerBoost.setCharacterClass(ranger);

            AttributeBoostRule witchBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.INTELLIGENCE), 1);
            witchBoost.setCharacterClass(witch);

            AttributeBoostRule commanderBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.INTELLIGENCE), 1);
            commanderBoost.setCharacterClass(commander);

            AttributeBoostRule guardianBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.STRENGTH), 1);
            guardianBoost.setCharacterClass(guardian);

            AttributeBoostRule barbarianBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.STRENGTH), 1);
            barbarianBoost.setCharacterClass(barbarian);

            AttributeBoostRule exemplarBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.DEXTERITY), 1);
            exemplarBoost.setCharacterClass(exemplar);

            AttributeBoostRule championBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.DEXTERITY), 1);
            championBoost.setCharacterClass(champion);

            AttributeBoostRule investigatorBoost = new AttributeBoostRule(AttributeBoostType.FIXED, List.of(AttributeName.INTELLIGENCE), 1);
            investigatorBoost.setCharacterClass(investigator);

            attributeBoostRuleRepo.saveAll(List.of(
                    humanBoosts,
                    dwarfConBoost, dwarfWisBoost, dwarfFreeBoost,
                    elfDexBoost, elfIntBoost, elfFreeBoost,
                    gnomeConBoost, gnomeChaBoost, gnomeFreeBoost,
                    goblinDexBoost, goblinChaBoost, goblinFreeBoost,
                    halflingDexBoost, halflingWisBoost, halflingFreeBoost,
                    leshyConBoost, leshyWisBoost, leshyFreeBoost,
                    orcBoosts,
                    koboldDexBoost, koboldChaBoost, koboldFreeBoost,
                    samsaranConBoost, samsaranWisBoost, samsaranFreeBoost,
                    kholoStrBoost, kholoIntBoost, kholoFreeBoost,
                    wayangDexBoost, wayangChaBoost, warriorFreeBoost,
                    scholarMentalBoost, scholarFreeBoost,
                    warriorPhysBoost, warriorFreeBoost,
                    fighterBoost,
                    wizardBoost,
                    emotionalAcceptanceBoost, gatheredLoreBoost,
                    rogueDexBoost, mastermindBoost, ruffianBoost, scoundrelBoost,
                    thaumaturgeBoost,
                    bardBoost,
                    clericBoost,
                    druidBoost,
                    rangerBoost,
                    witchBoost,
                    commanderBoost,
                    guardianBoost,
                    barbarianBoost,
                    exemplarBoost,
                    championBoost
            ));

            AttributeFlawRule dwarfFlaw = new AttributeFlawRule(dwarf, List.of(AttributeName.CHARISMA), 1);
            AttributeFlawRule elfFlaw = new AttributeFlawRule(elf, List.of(AttributeName.CONSTITUTION), 1);
            AttributeFlawRule gnomeFlaw = new AttributeFlawRule(gnome, List.of(AttributeName.STRENGTH), 1);
            AttributeFlawRule goblinFlaw = new AttributeFlawRule(goblin, List.of(AttributeName.WISDOM), 1);
            AttributeFlawRule halflingFlaw = new AttributeFlawRule(halfling, List.of(AttributeName.STRENGTH), 1);
            AttributeFlawRule leshyFlaw = new AttributeFlawRule(leshy, List.of(AttributeName.INTELLIGENCE), 1);
            AttributeFlawRule koboldFlaw = new AttributeFlawRule(kobold, List.of(AttributeName.CONSTITUTION), 1);
            AttributeFlawRule samsaranFlaw = new AttributeFlawRule(samsaran, List.of(AttributeName.CHARISMA), 1);
            AttributeFlawRule kholoFlaw = new AttributeFlawRule(kholo, List.of(AttributeName.WISDOM), 1);
            AttributeFlawRule wayangFlaw = new AttributeFlawRule(wayang, List.of(AttributeName.CONSTITUTION), 1);

            attributeFlawRuleRepo.saveAll(List.of(
                    dwarfFlaw,
                    elfFlaw,
                    gnomeFlaw,
                    goblinFlaw,
                    halflingFlaw,
                    leshyFlaw,
                    koboldFlaw,
                    samsaranFlaw,
                    kholoFlaw,
                    wayangFlaw
            ));

            GameAction stride = new GameAction("Stride", ActionType.SINGLE_ACTION, "Move up to your Speed");
            stride.setSourceType(ActionSourceType.UNIVERSAL);

            GameAction strike = new GameAction("Strike", ActionType.SINGLE_ACTION, "Attack with a weapon or unarmed attack.");
            strike.setSourceType(ActionSourceType.UNIVERSAL);

            GameAction balance = new GameAction("Balance", ActionType.SINGLE_ACTION, "You move across a narrow surface or uneven ground, attempting an Acrobatics check against its Balance DC.");
            balance.setSourceType(ActionSourceType.SKILL);

            GameAction squeeze = new GameAction("Squeeze", ActionType.ACTIVITY, "You contort yourself to squeeze through a space so small you can barely fit through.");
            GameActionGrant squeezeGrant = new GameActionGrant(squeeze, ActionSourceType.SKILL);
            squeezeGrant.setSkill(acrobatics);
            squeezeGrant.setRequiredSkillRank(ProficiencyRank.TRAINED);
            squeeze.setGrants(List.of(squeezeGrant));

            GameAction recallKnowledge = new GameAction("Recall Knowledge", ActionType.SINGLE_ACTION, "You attempt a skill check to try to remember a bit of knowledge regarding a topic related to that skill.");
            recallKnowledge.setSourceType(ActionSourceType.SKILL);

            GameAction borrowAnArcaneSpell = new GameAction("Borrow an Arcane Spell", ActionType.ACTIVITY, "If you're an arcane spellcaster who prepares spells, you can attempt to prepare a spell from someone else's arcane spellbook, arcane witch familiar, or the like.");
            GameActionGrant borrowArcaneSpellGrant = new GameActionGrant(borrowAnArcaneSpell, ActionSourceType.SKILL);
            borrowArcaneSpellGrant.setSkill(arcana);
            borrowArcaneSpellGrant.setRequiredSkillRank(ProficiencyRank.TRAINED);
            borrowAnArcaneSpell.setGrants(List.of(borrowArcaneSpellGrant));

            GameAction climb = new GameAction("Climb", ActionType.SINGLE_ACTION, "You attempt an Athletics check to move a maximum distance of 5 feet up, down, or across an incline.");
            climb.setSourceType(ActionSourceType.SKILL);

            GameAction disarm = new GameAction("Disarm", ActionType.SINGLE_ACTION, "You try to knock an item out of a creature's grasp.");
            GameActionGrant disarmGrant = new GameActionGrant(disarm, ActionSourceType.SKILL);
            disarmGrant.setSkill(athletics);
            disarmGrant.setRequiredSkillRank(ProficiencyRank.TRAINED);
            disarm.setGrants(List.of(disarmGrant));

            GameAction repair = new GameAction("Repair", ActionType.ACTIVITY, "You spend 10 minutes attempting to fix a damaged item, placing the item on a stable surface and using the repair toolkit with both hands.");
            repair.setSourceType(ActionSourceType.SKILL);

            GameAction craft = new GameAction("Craft", ActionType.ACTIVITY, "You can make an item from raw materials.");
            GameActionGrant craftGrant = new GameActionGrant(craft, ActionSourceType.SKILL);
            craftGrant.setSkill(crafting);
            craftGrant.setRequiredSkillRank(ProficiencyRank.TRAINED);
            craft.setGrants(List.of(craftGrant));

            GameAction createADiversion = new GameAction("Create a Diversion", ActionType.SINGLE_ACTION, "With a gesture, a trick, or some distracting words, you can create a diversion that draws creatures' attention elsewhere.");
            createADiversion.setSourceType(ActionSourceType.SKILL);

            GameAction feint = new GameAction("Feint", ActionType.SINGLE_ACTION, "With a misleading flourish, you leave an opponent unprepared for your real attack.");
            GameActionGrant feintGrant = new GameActionGrant(feint, ActionSourceType.SKILL);
            feintGrant.setSkill(deception);
            feintGrant.setRequiredSkillRank(ProficiencyRank.TRAINED);
            feint.setGrants(List.of(feintGrant));

            GameAction gatherInformation = new GameAction("Gather Information", ActionType.ACTIVITY, "You canvass local markets, taverns, and gathering places in an attempt to learn about a specific individual or topic.");
            gatherInformation.setSourceType(ActionSourceType.SKILL);

            GameAction coerce = new GameAction("Coerce", ActionType.ACTIVITY, "With threats either veiled or overt, you attempt to bully a creature into doing what you want.");
            coerce.setSourceType(ActionSourceType.SKILL);

            GameAction administerFirstAid = new GameAction("Administer First Aid", ActionType.TWO_ACTIONS, "You perform first aid on an adjacent creature that is dying or bleeding.");
            administerFirstAid.setSourceType(ActionSourceType.SKILL);

            GameAction treatWounds = new GameAction("Treat Wounds", ActionType.ACTIVITY, "Use Medicine to heal a living creature.");
            GameActionGrant treatWoundsGrant = new GameActionGrant(treatWounds, ActionSourceType.SKILL);
            treatWoundsGrant.setSkill(medicine);
            treatWoundsGrant.setRequiredSkillRank(ProficiencyRank.TRAINED);
            treatWounds.setGrants(List.of(treatWoundsGrant));

            GameAction commandAnAnimal = new GameAction("Command an Animal", ActionType.SINGLE_ACTION, "You issue an order to an animal.");
            commandAnAnimal.setSourceType(ActionSourceType.SKILL);

            GameAction identifyMagic = new GameAction("Identify Magic", ActionType.ACTIVITY, "Once you discover that an item, location, or ongoing effect is magical, you can spend 10 minutes to try to identify the particulars of its magic.");
            GameActionGrant identifyArcaneMagic = new GameActionGrant(identifyMagic, ActionSourceType.SKILL);
            identifyArcaneMagic.setSkill(arcana);
            identifyArcaneMagic.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant identifyPrimalMagic = new GameActionGrant(identifyMagic, ActionSourceType.SKILL);
            identifyPrimalMagic.setSkill(nature);
            identifyPrimalMagic.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant identifyOccultMagic = new GameActionGrant(identifyMagic, ActionSourceType.SKILL);
            identifyOccultMagic.setSkill(occultism);
            identifyOccultMagic.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant identifyDivineMagic = new GameActionGrant(identifyMagic, ActionSourceType.SKILL);
            identifyDivineMagic.setSkill(religion);
            identifyDivineMagic.setRequiredSkillRank(ProficiencyRank.TRAINED);
            identifyMagic.setGrants(List.of(identifyArcaneMagic, identifyPrimalMagic, identifyOccultMagic, identifyDivineMagic));

            GameAction decipherWriting = new GameAction("Decipher Writing", ActionType.ACTIVITY, "You attempt to decipher complicated writing or literature on an obscure topic.");
            GameActionGrant decipherArcaneTheory = new GameActionGrant(decipherWriting, ActionSourceType.SKILL);
            decipherArcaneTheory.setSkill(arcana);
            decipherArcaneTheory.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant decipherOccultTopics = new GameActionGrant(decipherWriting, ActionSourceType.SKILL);
            decipherOccultTopics.setSkill(occultism);
            decipherOccultTopics.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant decipherReligiousText = new GameActionGrant(decipherWriting, ActionSourceType.SKILL);
            decipherReligiousText.setSkill(religion);
            decipherReligiousText.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant decipherCodedMessage = new GameActionGrant(decipherWriting, ActionSourceType.SKILL);
            decipherCodedMessage.setSkill(society);
            decipherCodedMessage.setRequiredSkillRank(ProficiencyRank.TRAINED);
            decipherWriting.setGrants(List.of(decipherArcaneTheory, decipherOccultTopics, decipherReligiousText, decipherCodedMessage));

            GameAction perform = new GameAction("Perform", ActionType.SINGLE_ACTION, "When making a brief performance—one song, a quick dance, or a few jokes—you use the Perform action.");
            perform.setSourceType(ActionSourceType.SKILL);

            GameAction earnIncome = new GameAction("Earn Income", ActionType.ACTIVITY, "You use one of your skills to make money during downtime.");
            GameActionGrant earnByCrafting = new GameActionGrant(earnIncome, ActionSourceType.SKILL);
            earnByCrafting.setSkill(crafting);
            earnByCrafting.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant earnByPerforming = new GameActionGrant(earnIncome, ActionSourceType.SKILL);
            earnByPerforming.setSkill(performance);
            earnByPerforming.setRequiredSkillRank(ProficiencyRank.TRAINED);
            earnIncome.setGrants(List.of(earnByCrafting, earnByPerforming));

            GameAction learnASpell = new GameAction("Learn A Spell", ActionType.ACTIVITY, "You can gain access to a new spell of your tradition from someone who knows that spell or from magical writing like a spellbook or scroll.");
            GameActionGrant learnArcaneSpell = new GameActionGrant(learnASpell, ActionSourceType.SKILL);
            learnArcaneSpell.setSkill(arcana);
            learnArcaneSpell.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant learnPrimalSpell = new GameActionGrant(learnASpell, ActionSourceType.SKILL);
            learnPrimalSpell.setSkill(nature);
            learnPrimalSpell.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant learnOccultSpell = new GameActionGrant(learnASpell, ActionSourceType.SKILL);
            learnOccultSpell.setSkill(occultism);
            learnOccultSpell.setRequiredSkillRank(ProficiencyRank.TRAINED);
            GameActionGrant learnDivineSpell = new GameActionGrant(learnASpell, ActionSourceType.SKILL);
            learnDivineSpell.setSkill(religion);
            learnDivineSpell.setRequiredSkillRank(ProficiencyRank.TRAINED);
            learnASpell.setGrants(List.of(learnArcaneSpell, learnPrimalSpell, learnOccultSpell, learnDivineSpell));

            GameAction subsist = new GameAction("Subsist", ActionType.ACTIVITY, "You try to provide food and shelter for yourself, and possibly others as well.");
            subsist.setSourceType(ActionSourceType.SKILL);

            GameAction createForgery = new GameAction("Create Forgery", ActionType.ACTIVITY, "You create a forged document, usually over the course of a day or a week.");
            GameActionGrant createForgeryGrant = new GameActionGrant(createForgery, ActionSourceType.SKILL);
            createForgeryGrant.setSkill(society);
            createForgeryGrant.setRequiredSkillRank(ProficiencyRank.TRAINED);
            createForgery.setGrants(List.of(createForgeryGrant));

            GameAction concealAnObject = new GameAction("Conceal an Object", ActionType.SINGLE_ACTION, "You hide a small object on your person (such as a weapon of light Bulk).");
            concealAnObject.setSourceType(ActionSourceType.SKILL);

            GameAction senseDirection = new GameAction("Sense Direction", ActionType.ACTIVITY, "Using the stars, the position of the sun, traits of the geography or flora, or the behavior of fauna, you can stay oriented in the wild.");
            senseDirection.setSourceType(ActionSourceType.SKILL);

            GameAction coverTracks = new GameAction("Cover Tracks", ActionType.ACTIVITY, "You cover your tracks, moving up to half your travel Speed.");
            GameActionGrant coverTracksGrant = new GameActionGrant(coverTracks, ActionSourceType.SKILL);
            coverTracksGrant.setSkill(survival);
            coverTracksGrant.setRequiredSkillRank(ProficiencyRank.TRAINED);
            coverTracks.setGrants(List.of(coverTracksGrant));

            GameAction palmAnObject = new GameAction("Palm an Object", ActionType.SINGLE_ACTION, "You pick up a small, unattended object and try not to be noticed.");
            palmAnObject.setSourceType(ActionSourceType.SKILL);

            GameAction disableADevice = new GameAction("Disable a Device", ActionType.TWO_ACTIONS, "This action allows you to disarm a trap or another complex device.");
            GameActionGrant disableDeviceGrant = new GameActionGrant(disableADevice, ActionSourceType.SKILL);
            disableDeviceGrant.setSkill(thievery);
            disableDeviceGrant.setRequiredSkillRank(ProficiencyRank.TRAINED);
            disableADevice.setGrants(List.of(disableDeviceGrant));

            GameAction shieldBlockAction = new GameAction("Shield Block", ActionType.REACTION, "Use your shield to reduce damage from a physical attack.");
            GameActionGrant shieldBlockGrant = new GameActionGrant(shieldBlockAction, ActionSourceType.FEAT);
            shieldBlockGrant.setFeat(shieldBlock);
            shieldBlockAction.setGrants(List.of(shieldBlockGrant));

            GameAction deviseAStratagem = new GameAction("Devise a Stratagem", ActionType.SINGLE_ACTION, "Assess a foe and plan your attack.");
            GameActionGrant investigatorGrant = new GameActionGrant(deviseAStratagem, ActionSourceType.CLASS);
            investigatorGrant.setCharacterClass(investigator);
            deviseAStratagem.setGrants(List.of(investigatorGrant));

            GameAction huntPrey = new GameAction("Hunt Prey", ActionType.SINGLE_ACTION, "You designate a single creature as your prey and focus your attacks against that creature.");
            GameActionGrant huntPreyGrant = new GameActionGrant(huntPrey, ActionSourceType.CLASS);
            huntPreyGrant.setCharacterClass(ranger);
            huntPrey.setGrants(List.of(huntPreyGrant));

            GameAction reactiveStrikeAction = new GameAction("Reactive Strike", ActionType.REACTION, "Make a melee Strike against a triggering creature.");
            GameActionGrant fighterReactiveStrike = new GameActionGrant(reactiveStrikeAction, ActionSourceType.CLASS);
            fighterReactiveStrike.setCharacterClass(fighter);
            GameActionGrant featReactiveStrike = new GameActionGrant(reactiveStrikeAction, ActionSourceType.FEAT);
            featReactiveStrike.setFeat(reactiveStrikeFeat);
            reactiveStrikeAction.setGrants(List.of(
                    fighterReactiveStrike,
                    featReactiveStrike
            ));

            GameAction drainBondedItem = new GameAction("Drain Bonded Item", ActionType.FREE_ACTION, "You expend the magical power stored in your bonded item.");
            GameActionGrant wizardDrainBondedItem = new GameActionGrant(drainBondedItem, ActionSourceType.CLASS);
            wizardDrainBondedItem.setCharacterClass(wizard);
            drainBondedItem.setGrants(List.of(wizardDrainBondedItem));

            GameAction callOnAncientBlood = new GameAction("Call on Ancient Blood", ActionType.REACTION, "Your ancestors' innate resistance to magic surges, before slowly ebbing down.");
            GameActionGrant ancientBloodGrant = new GameActionGrant(callOnAncientBlood, ActionSourceType.HERITAGE);
            ancientBloodGrant.setHeritage(ancientBlooded);
            callOnAncientBlood.setGrants(List.of(ancientBloodGrant));

            GameAction jinx = new GameAction("Jinx", ActionType.TWO_ACTIONS, "You can curse another creature with clumsiness.");
            GameActionGrant heritageJinxGrant = new GameActionGrant(jinx, ActionSourceType.HERITAGE);
            heritageJinxGrant.setHeritage(jinxedHalfling);
            jinx.setGrants(List.of(heritageJinxGrant));

            gameActionRepo.saveAll(List.of(
                    stride, strike,
                    recallKnowledge, identifyMagic, decipherWriting, earnIncome, learnASpell, subsist,
                    balance, squeeze,
                    borrowAnArcaneSpell,
                    climb, disarm,
                    repair, craft,
                    createADiversion, feint,
                    gatherInformation,
                    coerce,
                    administerFirstAid, treatWounds,
                    commandAnAnimal,
                    perform,
                    createForgery,
                    concealAnObject,
                    senseDirection, coverTracks,
                    palmAnObject, disableADevice,
                    shieldBlockAction,
                    deviseAStratagem, huntPrey, drainBondedItem,
                    reactiveStrikeAction,
                    callOnAncientBlood, jinx));

            System.out.println("===== PATHFINDER DATA SEEDED =====");

        };
    }
}
