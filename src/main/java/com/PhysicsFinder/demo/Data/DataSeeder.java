package com.PhysicsFinder.demo.Data;

import com.PhysicsFinder.demo.entities.*;
import com.PhysicsFinder.demo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
            GameActionRepo gameActionRepo){
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

            Weapon crossbow = new Weapon("Crossbow", WeaponCategory.SIMPLE, WeaponType.RANGED, WeaponGroup.CROSSBOW, 1, 8, DamageType.PIERCING);
            crossbow.setRangeFeet(120);
            crossbow.setReloadActions(1);
            crossbow.setAmmunition("Bolts");
            crossbow.setBulk(1.0);
            crossbow.setHandUsageType(HandUsageType.TWO_HAND);
            crossbow.setHandsRequiredToAttack(2);
            Weapon warhammer = new Weapon("Warhammer", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.HAMMER, 1, 8 ,DamageType.BLUDGEONING);
            warhammer.setTraits(Set.of(new WeaponTraitEntry(WeaponTrait.SHOVE, null, null, null)));
            warhammer.setBulk(1.0);
            warhammer.setHandUsageType(HandUsageType.ONE_HAND);
            warhammer.setHandsRequiredToAttack(1);
            Weapon sawtoothSaber = new Weapon("Sawtooth Saber", WeaponCategory.ADVANCED, WeaponType.MELEE, WeaponGroup.SWORD, 1, 6, DamageType.SLASHING);
            sawtoothSaber.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.AGILE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.TWIN, null, null, null)));
            sawtoothSaber.setBulk(0.1);
            sawtoothSaber.setHandUsageType(HandUsageType.ONE_HAND);
            sawtoothSaber.setHandsRequiredToAttack(1);
            Weapon clanDagger = new Weapon("Clan Dagger", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.KNIFE, 1, 4, DamageType.PIERCING);
            clanDagger.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.AGILE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.DWARF, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.PARRY, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.VERSATILE, DamageType.BLUDGEONING, null, null)));
            clanDagger.setBulk(0.1);
            clanDagger.setHandUsageType(HandUsageType.ONE_HAND);
            clanDagger.setHandsRequiredToAttack(1);
            Weapon jaws = new Weapon("Jaws", WeaponCategory.UNARMED, WeaponType.MELEE, WeaponGroup.BRAWLING, 1, 6, DamageType.PIERCING);
            jaws.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.UNARMED, null, null, null)));
            Weapon spine = new Weapon("Spine", WeaponCategory.UNARMED, WeaponType.MELEE, WeaponGroup.BRAWLING, 1, 6, DamageType.PIERCING);
            spine.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.UNARMED, null, null, null)));
            Weapon dagger = new Weapon("Dagger", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.KNIFE, 1, 4, DamageType.PIERCING);
            dagger.setBulk(0.1);
            dagger.setHandUsageType(HandUsageType.ONE_HAND);
            dagger.setHandsRequiredToAttack(1);
            dagger.setRangeFeet(10);
            dagger.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.AGILE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.THROWN, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.VERSATILE, DamageType.SLASHING, null, null)
            ));
            Weapon battleAxe = new Weapon("Battle Axe", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.AXE, 1, 8, DamageType.SLASHING);
            battleAxe.setBulk(1.0);
            battleAxe.setHandUsageType(HandUsageType.ONE_HAND);
            battleAxe.setHandsRequiredToAttack(1);
            battleAxe.setTraits(Set.of(new WeaponTraitEntry(WeaponTrait.SWEEP, null, null, null)));
            Weapon greatsword = new Weapon("Greatsword", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 12, DamageType.SLASHING);
            greatsword.setBulk(2.0);
            greatsword.setHandUsageType(HandUsageType.TWO_HAND);
            greatsword.setHandsRequiredToAttack(2);
            greatsword.setTraits(Set.of(new WeaponTraitEntry(WeaponTrait.VERSATILE, DamageType.PIERCING, null, null)));
            Weapon compositeLongbow = new Weapon("Composite Longbow", WeaponCategory.MARTIAL, WeaponType.RANGED, WeaponGroup.BOW, 1, 8, DamageType.PIERCING);
            compositeLongbow.setBulk(2.0);
            compositeLongbow.setHandUsageType(HandUsageType.ONE_PLUS_HAND);
            compositeLongbow.setHandsRequiredToAttack(2);
            compositeLongbow.setRangeFeet(100);
            compositeLongbow.setReloadActions(0);
            compositeLongbow.setAmmunition("Arrows");
            compositeLongbow.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.DEADLY, null, 10, null),
                    new WeaponTraitEntry(WeaponTrait.PROPULSIVE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.VOLLEY, null, null, 30)
            ));
            Weapon club = new Weapon("Club", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.CLUB, 1, 6, DamageType.BLUDGEONING);
            club.setBulk(1.0);
            club.setHandUsageType(HandUsageType.ONE_HAND);
            club.setHandsRequiredToAttack(1);
            club.setRangeFeet(10);
            club.setTraits(Set.of(new WeaponTraitEntry(WeaponTrait.THROWN, null, null, null)));
            Weapon greatpick = new Weapon("Greatpick", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.PICK, 1, 10, DamageType.PIERCING);
            greatpick.setBulk(2.0);
            greatpick.setHandUsageType(HandUsageType.TWO_HAND);
            greatpick.setHandsRequiredToAttack(2);
            greatpick.setTraits(Set.of(new WeaponTraitEntry(WeaponTrait.FATAL, null, 12, null)));
            Weapon mace = new Weapon("Mace", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.CLUB,1, 6, DamageType.BLUDGEONING);
            mace.setBulk(1.0);
            mace.setHandUsageType(HandUsageType.ONE_HAND);
            mace.setHandsRequiredToAttack(1);
            mace.setTraits(Set.of(new WeaponTraitEntry(WeaponTrait.SHOVE, null, null, null)));
            Weapon whip = new Weapon("Whip", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.FLAIL, 1, 4, DamageType.SLASHING);
            whip.setBulk(1.0);
            whip.setHandUsageType(HandUsageType.ONE_HAND);
            whip.setHandsRequiredToAttack(1);
            whip.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.DISARM, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.NONLETHAL, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.REACH, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.TRIP, null, null, null)
            ));
            Weapon rapier = new Weapon("Rapier", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 6, DamageType.PIERCING);
            rapier.setBulk(1.0);
            rapier.setHandUsageType(HandUsageType.ONE_HAND);
            rapier.setHandsRequiredToAttack(1);
            rapier.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.DISARM, null, 8, null),
                    new WeaponTraitEntry(WeaponTrait.DISARM, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null)
            ));
            Weapon starknife = new Weapon("Starknife", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.KNIFE, 1, 4, DamageType.PIERCING);
            starknife.setBulk(0.1);
            starknife.setHandUsageType(HandUsageType.ONE_HAND);
            starknife.setHandsRequiredToAttack(1);
            starknife.setRangeFeet(20);
            starknife.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.AGILE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.DEADLY, null, 6, null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.THROWN, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.VERSATILE, DamageType.SLASHING, null, null)
            ));
            Weapon longbow = new Weapon("Longbow", WeaponCategory.MARTIAL, WeaponType.RANGED, WeaponGroup.BOW, 1, 8, DamageType.PIERCING);
            longbow.setBulk(2.0);
            longbow.setHandUsageType(HandUsageType.ONE_PLUS_HAND);
            longbow.setHandsRequiredToAttack(2);
            longbow.setRangeFeet(100);
            longbow.setReloadActions(0);
            longbow.setAmmunition("Arrows");
            longbow.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.DEADLY, null, 10, null),
                    new WeaponTraitEntry(WeaponTrait.VOLLEY, null, null, 30)
            ));
            Weapon trident = new Weapon("Trident", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SPEAR, 1, 8, DamageType.PIERCING);
            trident.setBulk(1.0);
            trident.setHandUsageType(HandUsageType.ONE_HAND);
            trident.setHandsRequiredToAttack(1);
            trident.setRangeFeet(20);
            trident.setTraits(Set.of(new WeaponTraitEntry(WeaponTrait.THROWN, null, null, null)));
            Weapon sickle = new Weapon("Sickle", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.KNIFE, 1, 4, DamageType.SLASHING);
            sickle.setBulk(0.1);
            sickle.setHandUsageType(HandUsageType.ONE_HAND);
            sickle.setHandsRequiredToAttack(1);
            sickle.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.AGILE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.TRIP, null, null, null)
            ));
            Weapon longsword = new Weapon("Longsword", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 8, DamageType.SLASHING);
            longsword.setBulk(1.0);
            longsword.setHandUsageType(HandUsageType.ONE_HAND);
            longsword.setHandsRequiredToAttack(1);
            longsword.setTraits(Set.of(new WeaponTraitEntry(WeaponTrait.VERSATILE, DamageType.PIERCING, null, null)));
            Weapon fist = new Weapon("Fist", WeaponCategory.UNARMED, WeaponType.MELEE, WeaponGroup.BRAWLING, 1, 4, DamageType.BLUDGEONING);
            fist.setHandUsageType(HandUsageType.ONE_HAND);
            fist.setHandsRequiredToAttack(1);
            fist.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.AGILE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.NONLETHAL, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.UNARMED, null, null, null)
            ));
            Weapon falchion = new Weapon("Falchion", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 10, DamageType.SLASHING);
            falchion.setBulk(2.0);
            falchion.setHandUsageType(HandUsageType.TWO_HAND);
            falchion.setHandsRequiredToAttack(2);
            falchion.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.FORCEFUL, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.SWEEP, null, null, null)
            ));
            Weapon staff = new Weapon("Staff", WeaponCategory.SIMPLE, WeaponType.MELEE, WeaponGroup.CLUB, 1, 4, DamageType.BLUDGEONING);
            staff.setBulk(1.0);
            staff.setHandUsageType(HandUsageType.ONE_HAND);
            staff.setHandsRequiredToAttack(1);
            staff.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.MONK, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.TWO_HAND, null, 8, null)
            ));
            Weapon claw = new Weapon("Claw", WeaponCategory.UNARMED, WeaponType.MELEE, WeaponGroup.BRAWLING, 1, 4, DamageType.SLASHING);
            claw.setHandUsageType(HandUsageType.ONE_HAND);
            claw.setHandsRequiredToAttack(1);
            claw.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.AGILE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.NONLETHAL, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.UNARMED, null, null, null)
            ));
            Weapon shortsword = new Weapon("Shortsword", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 6, DamageType.PIERCING);
            shortsword.setBulk(1.0);
            shortsword.setHandUsageType(HandUsageType.ONE_HAND);
            shortsword.setHandsRequiredToAttack(1);
            shortsword.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.AGILE, null, null,null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.VERSATILE, DamageType.SLASHING, null, null)
            ));
            Weapon greataxe = new Weapon("Greataxe", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.AXE, 1, 12, DamageType.SLASHING);
            greataxe.setBulk(2.0);
            greataxe.setHandUsageType(HandUsageType.TWO_HAND);
            greataxe.setHandsRequiredToAttack(2);
            greataxe.setTraits(Set.of(new WeaponTraitEntry(WeaponTrait.SWEEP, null, null, null)));
            Weapon scimitar = new Weapon("Scimitar", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.SWORD, 1, 6, DamageType.SLASHING);
            scimitar.setBulk(1.0);
            scimitar.setHandUsageType(HandUsageType.ONE_HAND);
            scimitar.setHandsRequiredToAttack(1);
            scimitar.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.FORCEFUL, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.SWEEP, null, null, null)
            ));
            Weapon glaive = new Weapon("Glaive", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.POLEARM, 1, 8, DamageType.SLASHING);
            glaive.setBulk(2.0);
            glaive.setHandUsageType(HandUsageType.TWO_HAND);
            glaive.setHandsRequiredToAttack(2);
            glaive.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.DEADLY, null, 8, null),
                    new WeaponTraitEntry(WeaponTrait.FORCEFUL, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.REACH, null, null, null)
            ));
            Weapon scythe = new Weapon("Scythe", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.POLEARM, 1, 10, DamageType.SLASHING);
            scythe.setBulk(2.0);
            scythe.setHandUsageType(HandUsageType.TWO_HAND);
            scythe.setHandsRequiredToAttack(2);
            scythe.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.DEADLY, null, 10, null),
                    new WeaponTraitEntry(WeaponTrait.TRIP, null, null, null)
            ));
            Weapon spikedChain = new Weapon("Spiked Chain", WeaponCategory.MARTIAL, WeaponType.MELEE, WeaponGroup.FLAIL, 1, 8, DamageType.SLASHING);
            spikedChain.setBulk(1.0);
            spikedChain.setHandUsageType(HandUsageType.TWO_HAND);
            spikedChain.setHandsRequiredToAttack(2);
            spikedChain.setTraits(Set.of(
                    new WeaponTraitEntry(WeaponTrait.DISARM, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.FINESSE, null, null, null),
                    new WeaponTraitEntry(WeaponTrait.TRIP, null, null, null)
            ));

            weaponRepo.saveAll(List.of(
                    crossbow,
                    warhammer,
                    sawtoothSaber, greatsword, rapier, longsword, falchion, shortsword, scimitar,
                    clanDagger, dagger, starknife, sickle,
                    jaws, spine, fist, claw,
                    battleAxe, greataxe,
                    compositeLongbow, longbow,
                    club, mace, staff,
                    greatpick,
                    whip, spikedChain,
                    trident,
                    glaive, scythe));

            Armor explorersClothing = new Armor("Explorer's Clothing", ArmorCategory.UNARMORED, ArmorGroup.CLOTH, 0, 5, 0, 0, 0.1);
            explorersClothing.setTraits(Set.of(ArmorTrait.COMFORT));
            Armor paddedArmor = new Armor("Padded Armor", ArmorCategory.LIGHT, ArmorGroup.CLOTH, 1, 3, 0, 0, 0.1);
            paddedArmor.setStrengthRequirement(0);
            paddedArmor.setTraits(Set.of(ArmorTrait.COMFORT));
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
            coralArmor.setTraits(Set.of(ArmorTrait.AQUADYNAMIC));
            Armor leafWeave = new Armor("Leaf Weave", ArmorCategory.LIGHT, ArmorGroup.WOOD, 1, 4, -1, 0, 1.0);
            leafWeave.setStrengthRequirement(0);
            leafWeave.setTraits(Set.of(ArmorTrait.LAMINAR));

            armorRepo.saveAll(List.of(explorersClothing, paddedArmor, hideArmor, splintMail, chainShirt, breastplate, coralArmor, leafWeave));

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

            Ancestry human = new Ancestry("Human", 8, 25, "MEDIUM", Set.of(TraitType.HUMAN, TraitType.HUMANOID), List.of("Common"));

            Ancestry dwarf = new Ancestry("Dwarf", 10, 20, "MEDIUM", Set.of(TraitType.DWARF, TraitType.HUMANOID), List.of("Common", "Dwarven"));
            dwarf.setSenses(Set.of(SenseType.DARKVISION));
            AncestryFeature clanDaggerMechanic = new AncestryFeature(dwarf, "Clan Dagger", "You receive a clan dagger tied to your dwarven clan.");
            dwarf.setFeatures(List.of(clanDaggerMechanic));

            Ancestry elf = new Ancestry("Elf", 6, 30, "MEDIUM", Set.of(TraitType.ELF, TraitType.HUMANOID), List.of("Common", "Elven"));
            elf.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Ancestry gnome = new Ancestry("Gnome", 8, 25, "SMALL", Set.of(TraitType.GNOME, TraitType.HUMANOID), List.of("Common", "Fey", "Gnomish"));
            gnome.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Ancestry goblin = new Ancestry("Goblin", 6, 25, "SMALL", Set.of(TraitType.GOBLIN, TraitType.HUMANOID), List.of("Common", "Goblin"));
            goblin.setSenses(Set.of(SenseType.DARKVISION));

            Ancestry halfling = new Ancestry("Halfling", 6, 25, "SMALL", Set.of(TraitType.HALFLING, TraitType.HUMANOID), List.of("Common", "Halfling"));
            AncestryFeature keenEyes = new AncestryFeature(halfling, "Keen Eyes", "Your eyes are sharp, allowing you to make out small details about concealed or even invisible creatures that others might miss.");
            halfling.setFeatures(List.of(keenEyes));

            Ancestry leshy = new Ancestry("Leshy", 8, 25, "SMALL", Set.of(TraitType.LESHY, TraitType.PLANT), List.of("Common", "Fey"));
            leshy.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));
            AncestryFeature plantNourishment = new AncestryFeature(leshy, "Plant Nourishment", "You can sustain yourself through sunlight, water, and soil.");
            leshy.setFeatures(List.of(plantNourishment));

            Ancestry orc = new Ancestry("Orc", 10, 25, "MEDIUM", Set.of(TraitType.HUMANOID, TraitType.ORC), List.of("Common", "Orcish"));
            orc.setSenses(Set.of(SenseType.DARKVISION));

            ancestryRepo.saveAll(List.of(human, dwarf, elf, gnome, goblin, halfling, leshy, orc));

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
            feyTouchedGnome.setTraits(Set.of(TraitType.FEY));

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
            fungusLeshy.setTraitsToRemove(Set.of(TraitType.PLANT));
            fungusLeshy.setTraits(Set.of(TraitType.FUNGUS));

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
            aiuvarin.setTraits(Set.of(TraitType.ELF, TraitType.AIUVARIN));
            aiuvarin.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Heritage dromaar = new Heritage("Dromaar", "You have the blood of Orcs mixed into your ancestry.", HeritageType.VERSATILE, null);
            dromaar.setGrantedAncestryFeatAccess(List.of(orc));
            dromaar.setTraits(Set.of(TraitType.DROMAAR, TraitType.ORC));
            dromaar.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Heritage changeling = new Heritage("Changeling", "Your mother was a hag.", HeritageType.VERSATILE, null);
            changeling.setTraits(Set.of(TraitType.CHANGELING));
            changeling.setSenses(Set.of(SenseType.LOW_LIGHT_VISION));

            Heritage nephilim = new Heritage("Nephilim", "Your nature is influenced by celestials, fiends, or monitors.", HeritageType.VERSATILE, null);
            nephilim.setTraits(Set.of(TraitType.NEPHILIM));
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

            Feat intimidatingGlare = new Feat("Intimidating Glare", 1, FeatType.SKILL, "Demoralize a creature using only a look.");
            Feat terrainExpert = new Feat("Terrain Expertise", 1, FeatType.SKILL, "You are particularly skilled in rough terrain.");
            Feat assurance = new Feat("Assurance", 1, FeatType.SKILL, "Even in the worst circumstances, you can perform basic tasks.");
            Feat multilingual = new Feat("Multilingual", 1, FeatType.SKILL, "You easily pick up new languages.");
            Feat quickClimb = new Feat("Quick Climb", 7, FeatType.SKILL, "When Climbing, you move 5 more feet on a success and 10 more feet on a critical success, up to your Speed.");
            Feat combatClimber = new Feat("Combat Climber", 1, FeatType.SKILL, "Your techniques allow you to fight as you climb.");
            Feat adoptedAncestry = new Feat("Adopted Ancestry", 1, FeatType.GENERAL, "You’re fully immersed in another ancestry’s culture and traditions, whether born into them, earned through rite of passage, or bonded through a deep friendship or romance.");
            Feat shieldBlock = new Feat("Shield Block", 1, FeatType.GENERAL, "You snap your shield in place to ward off a blow.");
            Feat diehard = new Feat("Diehard", 1, FeatType.GENERAL, "It takes more to kill you than most.");
            Feat combatAssessment = new Feat("Combat Assessment", 1, FeatType.CLASS, "You make a telegraphed attack to learn about your foe.");
            combatAssessment.setAvailableToClasses(List.of(fighter, commander));
            Feat doubleSlice = new Feat("Double Slice", 1, FeatType.CLASS, "You lash out at your foe with both weapons.");
            doubleSlice.setAvailableToClasses(List.of(fighter));
            Feat exactingStrike = new Feat("Exacting Strike", 1, FeatType.CLASS, "You make a controlled follow-up attack, fully accounting for your momentum.");
            exactingStrike.setAvailableToClasses(List.of(fighter));
            Feat pointBlankStance = new Feat("Point Blank Stance", 1, FeatType.CLASS, "You take aim to pick off nearby enemies quickly.");
            pointBlankStance.setAvailableToClasses(List.of(fighter));
            Feat reactiveShield = new Feat("Reactive Shield", 1, FeatType.CLASS, "You can snap your shield into place just as you would take a blow, avoiding the hit at the last second.");
            reactiveShield.setAvailableToClasses(List.of(fighter, guardian));
            Feat snaggingStrike = new Feat("Snagging Strike", 1, FeatType.CLASS, "You combine an attack with quick grappling moves to throw an enemy off balance as long as it stays in your reach.");
            snaggingStrike.setAvailableToClasses(List.of(fighter));
            Feat suddenCharge = new Feat("Sudden Charge", 1, FeatType.CLASS, "With a quick sprint, you dash up to your foe and swing.");
            suddenCharge.setAvailableToClasses(List.of(fighter, barbarian));
            Feat viciousSwing = new Feat("Vicious Swing", 1, FeatType.CLASS, "You unleash a particularly powerful attack that clobbers your foe but leaves you a bit unsteady.");
            viciousSwing.setAvailableToClasses(List.of(fighter));
            Feat aggressiveBlock = new Feat("Aggressive Block", 2, FeatType.CLASS, "You push back as you block, knocking your foe away or off balance.");
            aggressiveBlock.setAvailableToClasses(List.of(fighter, guardian));
            Feat assistingShot = new Feat("Assisting Shot", 2, FeatType.CLASS, "Using your last shot to gauge your accuracy, you can fire off a quick shot to interfere with a foe in combat.");
            assistingShot.setAvailableToClasses(List.of(fighter));
            Feat bladeBrake = new Feat("Blade Brake", 2, FeatType.CLASS, "You plow your weapon into a floor, wall, or another sturdy surface, anchoring yourself in place.");
            bladeBrake.setAvailableToClasses(List.of(fighter));
            Feat brutishShove = new Feat("Brutish Shove", 2, FeatType.CLASS, "Using the momentum of your last attack to throw your weight into another, you make your opponent stumble back.");
            brutishShove.setAvailableToClasses(List.of(fighter));
            Feat combatGrab = new Feat("Combat Grab", 2, FeatType.CLASS, "Using your prior attack to shift your opponent’s guard, you take another swing and grab them.");
            combatGrab.setAvailableToClasses(List.of(fighter));
            Feat duelingParry1 = new Feat("Dueling Parry", 2, FeatType.CLASS, "You can parry attacks against you with your one-handed weapon.");
            duelingParry1.setAvailableToClasses(List.of(fighter));
            Feat intimidatingStrike = new Feat("Intimidating Strike", 2, FeatType.CLASS, "Your blow not only wounds creatures but also shatters their confidence.");
            intimidatingStrike.setAvailableToClasses(List.of(fighter, barbarian));
            Feat lightningSwap = new Feat("Lightning Swap", 2, FeatType.CLASS, "You have practiced quickly switching between combat styles and the equipment needed for them.");
            lightningSwap.setAvailableToClasses(List.of(fighter, exemplar));
            Feat lunge = new Feat("Lunge", 2, FeatType.CLASS, "You attack an enemy at the edge of your reach.");
            lunge.setAvailableToClasses(List.of(fighter));
            Feat reboundingToss = new Feat("Rebounding Toss", 2, FeatType.CLASS, "You bounce your weapon off one foe to strike another.");
            reboundingToss.setAvailableToClasses(List.of(fighter));
            Feat sleekReposition = new Feat("Sleek Reposition", 2, FeatType.CLASS, "While your opponent is still recovering from your prior attack, you snag its armor, clothing, or flesh to move it as you please.");
            sleekReposition.setAvailableToClasses(List.of(fighter));
            Feat barrelingCharge = new Feat("Barreling Charge", 4, FeatType.CLASS, "You rush forward, moving enemies aside to reach your foe.");
            barrelingCharge.setAvailableToClasses(List.of(fighter, barbarian));
            Feat doubleShot = new Feat("Double Shot", 4, FeatType.CLASS, "You shoot twice in blindingly fast succession.");
            doubleShot.setAvailableToClasses(List.of(fighter));
            Feat dualHandedAssault = new Feat("Dual-Handed Assault", 4, FeatType.CLASS, "You snap your free hand over to grip your weapon just long enough to add momentum and deliver a more powerful blow to your opponent.");
            dualHandedAssault.setAvailableToClasses(List.of(fighter));
            Feat partingShot = new Feat("Parting Shot", 4, FeatType.CLASS, "You jump back and make a quick shot that catches your opponent by surprise.");
            partingShot.setAvailableToClasses(List.of(fighter));
            Feat powerfulShove = new Feat("Powerful Shove", 4, FeatType.CLASS, "You can push larger foes around with your attack.");
            powerfulShove.setAvailableToClasses(List.of(fighter));
            Feat quickReversal = new Feat("Quick Reversal", 4, FeatType.CLASS, "You turn your foes’ flanking against them with a quick reverse.");
            quickReversal.setAvailableToClasses(List.of(fighter));
            Feat shieldedStride = new Feat("Shielded Stride", 4, FeatType.CLASS, "When your shield is up, your enemies’ blows can’t touch you.");
            shieldedStride.setAvailableToClasses(List.of(fighter));
            Feat slamDown = new Feat("Slam Down", 4, FeatType.CLASS, "You make an attack to knock a foe off balance, then follow up immediately with a sweep to topple them.");
            slamDown.setAvailableToClasses(List.of(fighter));
            Feat swipe = new Feat("Swipe", 4, FeatType.CLASS, "You make a wide, arcing swing.");
            swipe.setAvailableToClasses(List.of(fighter, barbarian));
            Feat twinParry = new Feat("Twin Parry", 4, FeatType.CLASS, "You use your two weapons to parry attacks.");
            twinParry.setAvailableToClasses(List.of(fighter, ranger));
            Feat advancedWeaponTraining = new Feat("Advanced Weapon Training", 6, FeatType.CLASS, "You’ve studied the art of wielding an advanced weapon.");
            advancedWeaponTraining.setAvailableToClasses(List.of(fighter));
            Feat advantageousAssault = new Feat("Advantageous Assault", 6, FeatType.CLASS, "After compromising your enemy’s movement, you deliver a more deadly blow.");
            advantageousAssault.setAvailableToClasses(List.of(fighter));
            Feat dazingBlow = new Feat("Dazing Blow", 6, FeatType.CLASS, "You pummel a held foe, hoping to stagger them.");
            dazingBlow.setAvailableToClasses(List.of(fighter));
            Feat disarmingStance = new Feat("Disarming Stance", 6, FeatType.CLASS, "You adopt a fencing stance that improves your control over your weapon.");
            disarmingStance.setAvailableToClasses(List.of(fighter));
            Feat furiousFocus = new Feat("Furious Focus", 6, FeatType.CLASS, "You’ve learned to maintain your balance even when swinging furiously.");
            furiousFocus.setAvailableToClasses(List.of(fighter));
            Feat guardiansDeflection = new Feat("Guardian's Deflection", 6, FeatType.CLASS, "You use your weapon to deflect the attack against your ally, granting a +2 circumstance bonus to their Armor Class against the triggering attack.");
            guardiansDeflection.setAvailableToClasses(List.of(fighter));
            Feat reflexiveShield = new Feat("Reflexive Shield", 6, FeatType.CLASS, "You can use your shield to fend off explosions and the like.");
            reflexiveShield.setAvailableToClasses(List.of(fighter, guardian));
            Feat revealingStab = new Feat("Revealing Stab", 6, FeatType.CLASS, "You drive your piercing weapon into an imperceptible foe, revealing its location to your allies.");
            revealingStab.setAvailableToClasses(List.of(fighter));
            Feat ricochetStance1 = new Feat("Ricochet Stance", 6, FeatType.CLASS, "You adopt a stance to rebound your thrown weapons toward you.");
            ricochetStance1.setAvailableToClasses(List.of(fighter));
            Feat shatterDefenses = new Feat("Shatter Defenses", 6, FeatType.CLASS, "Your offense exploits your enemy’s fear.");
            shatterDefenses.setAvailableToClasses(List.of(fighter));
            Feat shieldWarden = new Feat("Shield Warden", 6, FeatType.CLASS, "When you have a shield raised, you can use your Shield Block reaction when an attack is made against an ally adjacent to you.");
            shieldWarden.setAvailableToClasses(List.of(fighter, commander, champion));
            Feat tripleShot = new Feat("Triple Shot", 6, FeatType.CLASS, "You can quickly fire multiple shots with greater control.");
            tripleShot.setAvailableToClasses(List.of(fighter));
            Feat blindFight = new Feat("Blind-Fight", 8, FeatType.CLASS, "Your battle instincts make you more aware of concealed and invisible opponents.");
            blindFight.setAvailableToClasses(List.of(fighter, investigator, ranger, rogue));
            Feat disorientingOpening = new Feat("Disorienting Opening", 8, FeatType.CLASS, "You use your foes’ openings to expose even greater weaknesses.");
            disorientingOpening.setAvailableToClasses(List.of(fighter));
            Feat duelingRiposte = new Feat("Dueling Riposte", 8, FeatType.CLASS, "You elegantly counterattack against your flailing enemy.");
            duelingRiposte.setAvailableToClasses(List.of(fighter));
            Feat fellingStrike = new Feat("Felling Strike", 8, FeatType.CLASS, "Your attack can ground an airborne foe.");
            fellingStrike.setAvailableToClasses(List.of(fighter));
            Feat incredibleAim = new Feat("Incredible Aim", 8, FeatType.CLASS, "By spending a moment to focus, you can ensure your attack strikes true.");
            incredibleAim.setAvailableToClasses(List.of(fighter));
            Feat mobileShotStance = new Feat("Mobile Shot Stance", 8, FeatType.CLASS, "Your shots become nimble and deadly.");
            mobileShotStance.setAvailableToClasses(List.of(fighter));
            Feat positioningAssault = new Feat("Positioning Assault", 8, FeatType.CLASS, "With punishing blows, you force your opponent into position.");
            positioningAssault.setAvailableToClasses(List.of(fighter));
            Feat quickShieldBlock = new Feat("Quick Shield Block", 8, FeatType.CLASS, "You can bring your shield into place with hardly a thought.");
            quickShieldBlock.setAvailableToClasses(List.of(fighter, champion));
            Feat resoundingBravery = new Feat("Resounding Bravery", 8, FeatType.CLASS, "Even your fears serve as fuel for your fighting spirit.");
            resoundingBravery.setAvailableToClasses(List.of(fighter));
            Feat suddenLeap = new Feat("Sudden Leap", 8, FeatType.CLASS, "You make an impressive leap and swing while you soar.");
            suddenLeap.setAvailableToClasses(List.of(fighter, barbarian));
            Feat spellbookProdigy = new Feat("Spellbook Prodigy", 1, FeatType.CLASS, "You are particularly adept at learning spells to add to your spellbook.");
            spellbookProdigy.setAvailableToClasses(List.of(wizard));
            Feat ancestralMind = new Feat("Ancestral Mind", 1, FeatType.CLASS, "By unraveling memories and connections passed down from your progenitors and buried within your unconscious mind, you learn to convert your inherent magic into psychic power.");
            ancestralMind.setAvailableToClasses(List.of(psychic));
            Feat ammunitionThaumaturgy = new Feat("Ammunition Thaumaturgy", 1, FeatType.CLASS, "You're so used to handling your implement, weapon, and esoterica in the heat of combat that adding a few bullets or arrows to the mix is no extra burden.");
            ammunitionThaumaturgy.setAvailableToClasses(List.of(thaumaturge));
            Feat nimbleDodge = new Feat("Nimble Dodge", 1, FeatType.CLASS, "You deftly dodge out of the way, gaining a +2 circumstance bonus to AC against the triggering attack.");
            nimbleDodge.setAvailableToClasses(List.of(rogue));
            Feat ricochetStance2 = new Feat("Ricochet Stance", 8, FeatType.CLASS, "You adopt a stance to rebound your thrown weapons toward you.");
            ricochetStance2.setAvailableToClasses(List.of(rogue));
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
            Feat armorRegimentTraining = new Feat("Armor Regiment Training", 1, FeatType.CLASS, "You've trained for grueling marches in full battle kit.");
            armorRegimentTraining.setAvailableToClasses(List.of(commander));
            Feat bodyguard = new Feat("Bodyguard", 1, FeatType.CLASS, "You swear a vow to protect one of your allies at all costs, regardless of the risk this might pose to you.");
            bodyguard.setAvailableToClasses(List.of(guardian));
            Feat acuteVision = new Feat("Acute Vision", 1, FeatType.CLASS, "When you are raging, your visual senses improve, granting you darkvision.");
            acuteVision.setAvailableToClasses(List.of(barbarian));
            Feat reactiveStrikeFeat = new Feat("Reactive Strike", 6, FeatType.CLASS, "You lash out at a foe that leaves an opening.");
            reactiveStrikeFeat.setAvailableToClasses(List.of(
                    champion,
                    barbarian,
                    commander,
                    exemplar,
                    guardian
            ));
            Feat energizedSpark = new Feat("Energized Spark", 1, FeatType.CLASS, "The energy of your spirit manifests as crackling lightning, the chill of winter, or the power of an element.");
            energizedSpark.setAvailableToClasses(List.of(exemplar));
            Feat brilliantFlash = new Feat("Brilliant Flash", 1, FeatType.CLASS, "Your light cleanses souls of fear.");
            brilliantFlash.setAvailableToClasses(List.of(champion));
            Feat eliminateRedHerrings = new Feat("Eliminate Red Herrings", 1, FeatType.CLASS, "You have a keen sense for avoiding spurious lines of inquiry.");
            eliminateRedHerrings.setAvailableToClasses(List.of(investigator));
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
            Feat burnIt = new Feat("Burn It!", 1, FeatType.ANCESTRY, "Fire fascinates you.");
            burnIt.setAncestry(goblin);
            Feat distractingShadows = new Feat("Distracting Shadows", 1, FeatType.ANCESTRY, "You have learned to remain hidden by using larger folk as a distraction to avoid drawing attention to yourself.");
            distractingShadows.setAncestry(halfling);
            Feat halflingLuck = new Feat("Halfling Luck", 1, FeatType.ANCESTRY, "Your happy-go-lucky nature makes it seem like misfortune avoids you, and to an extent, that might even be true.");
            halflingLuck.setAncestry(halfling);
            Feat graspingReach = new Feat("Grasping Reach", 1, FeatType.ANCESTRY, "You can extend a tangle of vines or tendrils to support your arms and extend your reach.");
            graspingReach.setAncestry(leshy);
            Feat beastTrainer = new Feat("Beast Trainer", 1, FeatType.ANCESTRY, "You have an impressive innate ability to tame and command ferocious beasts.");
            beastTrainer.setAncestry(orc);
            Feat earnedGlory = new Feat("Earned Glory", 1, FeatType.ANCESTRY, "Elves often struggle with underestimating aiuvarins, and you are experienced at telling stories of your accomplishments to gain their respect.");
            earnedGlory.setHeritage(aiuvarin);
            Feat supernaturalCharm = new Feat("Supernatural Charm", 5, FeatType.ANCESTRY, "The elven magic in your blood manifests as a force you can use to become more appealing or alluring.");
            supernaturalCharm.setHeritage(aiuvarin);
            Feat monstrousPeacemaker = new Feat("Monstrous Peacemaker", 1, FeatType.ANCESTRY, "Your dual human and orc nature has given you a unique perspective, allowing you to bridge the gap between humans and the many intelligent creatures in the world that humans consider monsters.");
            monstrousPeacemaker.setHeritage(dromaar);
            featRepo.saveAll(List.of(
                    intimidatingGlare, terrainExpert, assurance, multilingual, quickClimb, combatClimber,
                    adoptedAncestry, shieldBlock, diehard,
                    combatAssessment, doubleSlice, exactingStrike, pointBlankStance, reactiveShield, snaggingStrike, suddenCharge, viciousSwing,
                    aggressiveBlock, assistingShot, bladeBrake, brutishShove, combatGrab, duelingParry1, intimidatingStrike, lightningSwap, lunge, reboundingToss, sleekReposition,
                    barrelingCharge, doubleShot, dualHandedAssault, partingShot, powerfulShove, quickReversal, shieldedStride, slamDown, swipe, twinParry,
                    advancedWeaponTraining, advantageousAssault, dazingBlow, disarmingStance, furiousFocus, guardiansDeflection, reflexiveShield, revealingStab, ricochetStance1, shatterDefenses, shieldWarden, tripleShot,
                    blindFight, disorientingOpening, duelingRiposte, fellingStrike, incredibleAim, mobileShotStance, positioningAssault, quickShieldBlock, resoundingBravery, suddenLeap,
                    spellbookProdigy,
                    nimbleDodge, ricochetStance2,
                    bardicLore, domainInitiate, deadlySimplicity, leshyFamiliar, animalCompanion, huntedShot, cackle, armorRegimentTraining, bodyguard, acuteVision, energizedSpark, ancestralMind, ammunitionThaumaturgy, brilliantFlash, eliminateRedHerrings,
                    adaptedCantrip, dwarvenDoughtiness, ancestralLongevity, nimbleElf, earnedGlory, supernaturalCharm, animalAccomplice, burnIt, distractingShadows, halflingLuck, graspingReach, beastTrainer, monstrousPeacemaker));

            Background warrior = new Background("Warrior", "You served as a soldier or mercenary.", List.of(intimidation), "Warfare Lore", intimidatingGlare);
            Background scholar = new Background("Scholar", "You studied ancient texts and forgotten lore.", List.of(arcana, nature, occultism, religion), "Academia Lore", assurance);

            backgroundRepo.saveAll(List.of(warrior, scholar));

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
                    mastermind,
                    ruffian,
                    cloisteredCleric,
                    warpriest,
                    animalOrder,
                    leafOrder,
                    faithsFlamekeeper,
                    silenceInSnow,
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
                    scholarMentalBoost, scholarFreeBoost,
                    warriorPhysBoost, warriorFreeBoost,
                    fighterBoost,
                    wizardBoost,
                    emotionalAcceptanceBoost, gatheredLoreBoost,
                    rogueDexBoost, mastermindBoost, ruffianBoost,
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

            attributeFlawRuleRepo.saveAll(List.of(
                    dwarfFlaw,
                    elfFlaw,
                    gnomeFlaw,
                    goblinFlaw,
                    halflingFlaw,
                    leshyFlaw
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
