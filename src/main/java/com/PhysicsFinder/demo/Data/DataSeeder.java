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
            GameActionRepo gameActionRepo,
            LanguageRepo languageRepo,
            TraitRepo traitRepo,
            SpellRepo spellRepo,
            DomainRepo domainRepo){
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
            Trait manipulateTrait = new Trait("Manipulate", TraitCategory.ACTION);
            Trait emotionTrait = new Trait("Emotion", TraitCategory.ACTION);
            Trait fearTrait = new Trait("Fear",  TraitCategory.ACTION);
            Trait mentalTrait = new Trait("Mental",  TraitCategory.ACTION);
            Trait exemplarTrait = new Trait("Exemplar", TraitCategory.CLASS);
            Trait rangerTrait = new Trait("Ranger",   TraitCategory.CLASS);
            Trait championTrait = new Trait("Champion",   TraitCategory.CLASS);
            Trait investigatorTrait = new Trait("Investigator",   TraitCategory.CLASS);
            Trait rogueTrait = new Trait("Rogue",    TraitCategory.CLASS);
            Trait concentrateTrait = new Trait("Concentrate",  TraitCategory.ACTION);
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
            Trait shadowTrait = new Trait("Shadow", TraitCategory.MAGIC);
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
            Trait nonlethalTrait = new Trait("Nonlethal", TraitCategory.ACTION);
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
            Trait healingTrait = new Trait("Healing", TraitCategory.ACTION);
            Trait illusionTrait = new Trait("Illusion", TraitCategory.MAGIC);
            Trait explorationTrait = new Trait("Exploration", TraitCategory.ACTION);
            Trait linguisticTrait = new Trait("Linguistic", TraitCategory.ACTION);
            Trait spellshapeTrait = new Trait("Spellshape", TraitCategory.MAGIC);
            Trait downtimeTrait = new Trait("Downtime", TraitCategory.ACTION);
            Trait auditoryTrait = new Trait("Auditory", TraitCategory.ACTION);
            Trait teleportationTrait = new Trait("Teleportation", TraitCategory.MAGIC);
            Trait divineTrait = new Trait("Divine", TraitCategory.MAGIC);
            Trait poisonTrait = new Trait("Poison", TraitCategory.MAGIC);
            Trait secretTrait = new Trait("Secret", TraitCategory.ACTION);
            Trait vitalityTrait = new Trait("Vitality", TraitCategory.MAGIC);
            Trait incapactitationTrait = new Trait("Incapacitation", TraitCategory.ACTION);
            Trait sonicTrait = new Trait("Sonic", TraitCategory.MAGIC);
            Trait morphTrait = new Trait("Morph", TraitCategory.MAGIC);
            Trait magicalTrait = new Trait("Magical", TraitCategory.ACTION);
            Trait moveTrait = new Trait("Move", TraitCategory.ACTION);
            Trait visualTrait = new Trait("Visual", TraitCategory.ACTION);
            Trait arcaneTrait = new Trait("Arcane", TraitCategory.MAGIC);
            Trait detectionTrait = new Trait("Detection", TraitCategory.MAGIC);
            Trait predictionTrait = new Trait("Prediction", TraitCategory.MAGIC);
            Trait primalTrait = new Trait("Primal", TraitCategory.MAGIC);
            Trait polymorphTrait = new Trait("Polymorph", TraitCategory.MAGIC);
            Trait consecrationTrait = new Trait("Consecration", TraitCategory.MAGIC);
            Trait lightTrait = new Trait("Light", TraitCategory.MAGIC);
            Trait coldTrait = new Trait("Cold", TraitCategory.MAGIC);
            Trait earthTrait = new Trait("Earth", TraitCategory.MAGIC);
            Trait sorcererTrait = new Trait("Sorcerer", TraitCategory.CLASS);
            Trait oracleTrait = new Trait("Oracle", TraitCategory.CLASS);
            Trait summonerTrait = new Trait("Summoner", TraitCategory.CLASS);
            Trait animistTrait = new Trait("Animist", TraitCategory.CLASS);
            Trait curseboundTrait = new Trait("Cursebound", TraitCategory.MAGIC);
            Trait gunslingerTrait = new Trait("Gunslinger", TraitCategory.CLASS);
            Trait rageTrait = new Trait("Rage", TraitCategory.ACTION);
            Trait alchemistTrait = new Trait("Alchemist", TraitCategory.CLASS);
            Trait misfortuneTrait = new Trait("Misfortune", TraitCategory.MAGIC);
            Trait wanderingTrait = new Trait("Wandering", TraitCategory.MAGIC);
            Trait tripkeeTrait = new Trait("Tripkee", TraitCategory.ANCESTRY);
            Trait acidTrait = new Trait("Acid", TraitCategory.MAGIC);
            Trait focusTrait = new Trait("Focus", TraitCategory.MAGIC);
            Trait airTrait = new Trait("Air", TraitCategory.MAGIC);
            Trait cantripTrait = new Trait("Cantrip", TraitCategory.MAGIC);
            Trait compositionTrait = new Trait("Composition", TraitCategory.MAGIC);
            Trait waterTrait = new Trait("Water", TraitCategory.MAGIC);
            Trait auraTrait = new Trait("Aura", TraitCategory.MAGIC);
            Trait attackTrait = new Trait("Attack", TraitCategory.ACTION);
            Trait fireTrait = new Trait("Fire", TraitCategory.MAGIC);
            Trait sanctifiedTrait = new Trait("Sanctified", TraitCategory.MAGIC);
            Trait forceTrait = new Trait("Force", TraitCategory.MAGIC);
            Trait curseTrait = new Trait("Curse", TraitCategory.MAGIC);
            Trait hexTrait = new Trait("Hex", TraitCategory.MAGIC);
            Trait electricityTrait = new Trait("Electricity", TraitCategory.MAGIC);
            Trait subtleTrait = new Trait("Subtle", TraitCategory.MAGIC);
            Trait darknessTrait = new Trait("Darkness", TraitCategory.MAGIC);
            Trait unholyTrait = new Trait("Unholy", TraitCategory.MAGIC);
            Trait scryingTrait = new Trait("Scrying", TraitCategory.MAGIC);
            Trait woodTrait = new Trait("Wood", TraitCategory.MAGIC);
            Trait deathTrait = new Trait("Death", TraitCategory.MAGIC);
            Trait voidTrait = new Trait("Void", TraitCategory.MAGIC);
            Trait spiritTrait = new Trait("Spirit", TraitCategory.MAGIC);
            Trait revelationTrait = new Trait("Revelation", TraitCategory.MAGIC);
            Trait diseaseTrait = new Trait("Disease",  TraitCategory.MAGIC);
            Trait holyTrait = new Trait("Holy", TraitCategory.MAGIC);
            Trait olfactoryTrait = new Trait("Olfactory", TraitCategory.MAGIC);
            Trait metalTrait = new Trait("Metal", TraitCategory.MAGIC);
            Trait extradimensionalTrait = new Trait("Extradimensional", TraitCategory.MAGIC);
            Trait summonTrait = new Trait("Summon", TraitCategory.MAGIC);
            Trait sleepTrait = new Trait("Sleep", TraitCategory.MAGIC);

            traitRepo.saveAll(List.of(dwarfTrait, elfTrait, gnomeTrait, goblinFeat, halflingTrait, humanTrait, kholoTrait, koboldTrait, leshyTrait, orcTrait, samsaranTrait, tripkeeTrait, wayangTrait,
                    aiuvarinTrait, changelingTrait, dromaarTrait, nephilimTrait,
                    bardTrait, clericTrait, druidTrait, fighterTrait, rangerTrait, rogueTrait, witchTrait, wizardTrait,
                    alchemistTrait, barbarianTrait, championTrait, investigatorTrait, monkTrait, oracleTrait, sorcererTrait, swashbucklerTrait,
                    animistTrait, commanderTrait, exemplarTrait, guardianTrait, gunslingerTrait, magusTrait, psychicTrait, summonerTrait, thaumaturgeTrait,
                    feyTrait, fungusTrait, humanoidTrait, lineageTrait, plantTrait,
                    auditoryTrait, concentrateTrait, downtimeTrait, emotionTrait, explorationTrait, fearTrait, flourishTrait, fortuneTrait, generalTrait, healingTrait, incapactitationTrait, linguisticTrait, magicalTrait, manipulateTrait, mentalTrait, moveTrait, nonlethalTrait, pressTrait, rageTrait, secretTrait, skillTrait, stanceTrait, visualTrait,
                    acidTrait, airTrait, arcaneTrait, auraTrait, cantripTrait, coldTrait, compositionTrait, consecrationTrait, curseTrait, curseboundTrait, darknessTrait, deathTrait, detectionTrait, diseaseTrait, divineTrait, earthTrait, electricityTrait, extradimensionalTrait, fireTrait, focusTrait, forceTrait, hexTrait, holyTrait, illusionTrait, lightTrait, metalTrait, misfortuneTrait, morphTrait, olfactoryTrait, poisonTrait, polymorphTrait, predictionTrait, primalTrait, revelationTrait, sanctifiedTrait, scryingTrait, shadowTrait, sleepTrait, sonicTrait, spellshapeTrait, spiritTrait, subtleTrait, summonTrait, teleportationTrait, unholyTrait, vitalityTrait, voidTrait, wanderingTrait, waterTrait, woodTrait,
                    aquadynamicTrait, bulwarkTrait, comfortTrait, flexibleTrait, laminarTrait, noisyTrait,
                    agileTrait, attachedToShieldTrait, attackTrait, backstabberTrait, backswingTrait, concealableTrait, deadlyTrait, disarmTrait, fatalTrait, finesseTrait, forcefulTrait, freeHandTrait, joustingTrait, parryTrait, propulsiveTrait, rangedTripTrait, reachTrait, shoveTrait, sweepTrait, thrownTrait, tripTrait, twinTrait, twoHandTrait, unarmedTrait, versatileTrait, volleyTrait));

            Spell acidGrip = new Spell("Acid Grip", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(acidTrait, concentrateTrait, manipulateTrait), "An ephemeral, taloned hand grips the target, burning it with magical acid.");
            acidGrip.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            acidGrip.setSpellRange(120);
            acidGrip.setSpellDefense("Reflex");
            acidGrip.setSpellTargets("1 creature");

            Spell agileFeet = new Spell("Agile Feet", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait), "The blessings of your god make your feet faster and your movements more fluid.");
            agileFeet.setSpellDuration("until the end of the current turn.");

            Spell airBubble = new Spell("Air Bubble", 1, SpellType.SPELL, ActionType.REACTION, Set.of(airTrait, concentrateTrait), "A bubble of pure air appears around the target's head, allowing it to breathe normally.");
            airBubble.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.PRIMAL));
            airBubble.setSpellTrigger("A creature within range enters an environment where it can't breathe.");
            airBubble.setSpellRange(60);
            airBubble.setSpellTargets("the triggering creature");
            airBubble.setSpellDuration("1 minute");

            Spell allegro = new Spell("Allegro", 7, SpellType.CANTRIP, ActionType.SINGLE_ACTION, Set.of(bardTrait, cantripTrait, compositionTrait, concentrateTrait, emotionTrait, mentalTrait), "You perform rapidly, speeding up your ally.");
            allegro.setSpellRange(30);
            allegro.setSpellTargets("1 ally");
            allegro.setSpellDuration("1 round");

            Spell animalForm = new Spell("Animal Form", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, polymorphTrait), "You call upon primal energy to transform yourself into a Medium animal battle form.");
            animalForm.setSpellTraditions(List.of(SpellTraditions.PRIMAL));
            animalForm.setSpellDuration("1 minute");

            Spell aqueousOrb = new Spell("Aqueous Orb", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, waterTrait), "A sphere of water 10 feet in diameter forms in an unoccupied space in range, either on the ground or on the surface of a liquid.");
            aqueousOrb.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            aqueousOrb.setSpellRange(60);
            aqueousOrb.setSpellDefense("Reflex");
            aqueousOrb.setSpellDuration("sustained up to 1 minute");

            Spell arcticRift = new Spell("Arctic Rift", 8, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(coldTrait, concentrateTrait, manipulateTrait), "A jagged crack opens in the air, dealing 12d8 cold damage as it draws away warmth. Each creature along the rift must attempt a Fortitude save.");
            arcticRift.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            arcticRift.setSpellArea(120);
            arcticRift.setSpellAreaType("line");
            arcticRift.setSpellDefense("Fortitude");

            Spell bane = new Spell("Bane", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(auraTrait, concentrateTrait, manipulateTrait, mentalTrait), "You fill the minds of your enemies with doubt.");
            bane.setSpellTraditions(List.of(SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            bane.setSpellArea(10);
            bane.setSpellAreaType("emanation");
            bane.setSpellDefense("Will");
            bane.setSpellDuration("1 minute");

            Spell banishment = new Spell("Banishment", 5, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, incapactitationTrait, manipulateTrait), "You send the target back to its home plane.");
            banishment.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            banishment.setSpellRange(30);
            banishment.setSpellTargets("1 creature that isn't on its home plane");
            banishment.setSpellDefense("Will");

            Spell bindUndead = new Spell("Bind Undead", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "With a word of power, you seize control of the target.");
            bindUndead.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            bindUndead.setSpellRange(30);
            bindUndead.setSpellTargets("1 mindless undead creature with a level no greater than bind undead’s spell rank");
            bindUndead.setSpellDuration("1 day");

            Spell blazingBolt = new Spell("Blazing Bolt", 2, SpellType.SPELL, ActionType.ONE_TO_THREE_ACTIONS, Set.of(attackTrait, concentrateTrait, fireTrait, manipulateTrait), "You fire a ray of heat and flame.");
            blazingBolt.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            blazingBolt.setSpellRange(60);
            blazingBolt.setSpellTargets("1 or more creatures");
            blazingBolt.setSpellDefense("AC");

            Spell blessedBoundary = new Spell("Blessed Boundary", 6, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, forceTrait, manipulateTrait, sanctifiedTrait), "Manifestations of divine force appear in the hundreds, swirling in a massive, protective sphere.");
            blessedBoundary.setSpellTraditions(List.of(SpellTraditions.DIVINE));
            blessedBoundary.setSpellRange(120);
            blessedBoundary.setSpellArea(60);
            blessedBoundary.setSpellAreaType("up to a 60-foot burst");
            blessedBoundary.setSpellDefense("Reflex");
            blessedBoundary.setSpellDuration("1 minute");

            Spell bloodVendetta = new Spell("Blood Vendetta", 2, SpellType.SPELL, ActionType.REACTION, Set.of(curseTrait), "You curse the target, punishing it for having the audacity to spill your blood.");
            bloodVendetta.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            bloodVendetta.setSpellTrigger("A creature deals piercing, slashing, or persistent bleed damage to you;");
            bloodVendetta.setSpellRequirement("You can bleed");
            bloodVendetta.setSpellRange(30);
            bloodVendetta.setSpellTargets("the triggering creature");
            bloodVendetta.setSpellDefense("Will");
            bloodVendetta.setSpellDuration("varies");

            Spell bloodWard = new Spell("Blood Ward", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(focusTrait, hexTrait, manipulateTrait, witchTrait), "Your patron's aegis descends to shield a target from harm.");
            bloodWard.setSpellRange(30);
            bloodWard.setSpellTargets("1 creature");
            bloodWard.setSpellDuration("sustained up to 1 minute");

            Spell breatheFire = new Spell("Breathe Fire", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, fireTrait, manipulateTrait), "A gout of flame sprays from your mouth.");
            breatheFire.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            breatheFire.setSpellArea(15);
            breatheFire.setSpellAreaType("cone");
            breatheFire.setSpellDefense("basic Reflex");

            Spell cataclysm = new Spell("Cataclysm", 10, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(acidTrait, airTrait, coldTrait, concentrateTrait, earthTrait, electricityTrait, fireTrait, manipulateTrait, waterTrait), "You call upon the unimaginable power of world-ending cataclysms, ripping a small piece of each cataclysm and combining them together into one horrifically powerful attack.");
            cataclysm.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            cataclysm.setSpellRange(1000);
            cataclysm.setSpellArea(60);
            cataclysm.setSpellAreaType("burst");
            cataclysm.setSpellDefense("basic Reflex");

            Spell chainLightning = new Spell("Chain Lightning", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, electricityTrait, manipulateTrait), "You discharge a powerful bolt of lightning at the target, dealing 8d12 electricity damage. The target must attempt a basic Reflex save. The electricity then arcs to another creature within 30 feet of the first target, jumps to another creature within 30 feet of that target, and so on. You can end the chain at any point. You can't target the same creature more than once, and you must have line of effect to all targets. Roll the damage only once and apply it to each target (halving or doubling as appropriate for its saving throw outcome). The chain ends if any one of the targets critically succeeds at its save.");
            chainLightning.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            chainLightning.setSpellRange(500);
            chainLightning.setSpellTargets("1 creature, plus any number of additional creatures");
            chainLightning.setSpellDefense("basic Reflex");

            Spell charm = new Spell("Charm", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, emotionTrait, incapactitationTrait, manipulateTrait, mentalTrait, subtleTrait), "To the target, your words are honey and your visage seems bathed in a dreamy haze.");
            charm.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            charm.setSpellRange(30);
            charm.setSpellTargets("1 creature");
            charm.setSpellDefense("Will");
            charm.setSpellDuration("1 hour");

            Spell charmingPush = new Spell("Charming Push", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(concentrateTrait, focusTrait, incapactitationTrait, mentalTrait, wizardTrait), "You push at the target's mind to deflect their ire.");
            charmingPush.setSpellRange(30);
            charmingPush.setSpellTargets("1 creature");
            charmingPush.setSpellDefense("Will");
            charmingPush.setSpellDuration("until the start of your next turn");

            Spell chillingDarkness = new Spell("Chilling Darkness", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(attackTrait, coldTrait, concentrateTrait, darknessTrait, manipulateTrait, unholyTrait), "You shoot an utterly cold ray of darkness tinged with unholy energy.");
            chillingDarkness.setSpellTraditions(List.of(SpellTraditions.DIVINE));
            chillingDarkness.setSpellRange(120);
            chillingDarkness.setSpellTargets("1 creature");
            chillingDarkness.setSpellDefense("AC");

            Spell clairaudience = new Spell("Clairaudience", 3, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait, scryingTrait), "You create an invisible floating ear at a location within range (even if it's outside your line of sight or line of effect). It can't move, but you can hear through the ear as if using your normal auditory senses.");
            clairaudience.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            clairaudience.setSpellCastAmount(1);
            clairaudience.setSpellCastUnits("minute");
            clairaudience.setSpellRange(500);
            clairaudience.setSpellDuration("10 minutes");

            Spell command = new Spell("Command", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(auditoryTrait, concentrateTrait, linguisticTrait, manipulateTrait, mentalTrait), "You shout a command that's hard to ignore.");
            command.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            command.setSpellRange(30);
            command.setSpellTargets("1 creature");
            command.setSpellDefense("Will");
            command.setSpellDuration("until the end of the target's next turn");

            Spell communityRestoration = new Spell("Community Restoration", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(concentrateTrait, focusTrait, healingTrait, wizardTrait), "When you use your magic to support your allies, shared strength bolsters you all.");
            communityRestoration.setSpellTrigger("You Cast a Spell from a wizard spell slot, and the spell affects one or more willing allies without damaging them");

            Spell contingency = new Spell("Contingency", 7, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait), "You prepare a spell that will trigger later.");
            contingency.setSpellTraditions(List.of(SpellTraditions.ARCANE));
            contingency.setSpellCastAmount(10);
            contingency.setSpellCastUnits("minute");
            contingency.setSpellDuration("until your next daily preparations");

            Spell controlWater = new Spell("Control Water", 5, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, waterTrait), "By imposing your will upon the water, you can raise or lower the level of water in the chosen area by 10 feet. Creatures that have the water trait and that are in the area when you Cast the Spell must attempt a Fortitude save, with the effects of the slow spell.");
            controlWater.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            controlWater.setSpellRange(500);
            controlWater.setSpellArea(50);
            controlWater.setSpellAreaType("square");
            controlWater.setSpellDefense("Fortitude");
            controlWater.setSpellDuration("1 hour");

            Spell cozyCabin = new Spell("Cozy Cabin", 3, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait, woodTrait), "You shape a cabin 20 feet on each side and 10 feet high.");
            cozyCabin.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            cozyCabin.setSpellCastUnits("minute");
            cozyCabin.setSpellCastAmount(1);
            cozyCabin.setSpellRange(30);
            cozyCabin.setSpellDuration("12 hours");

            Spell creation = new Spell("Creation", 4, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait), "You conjure a temporary object from magical energy.");
            creation.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            creation.setSpellCastUnits("minute");
            creation.setSpellCastAmount(1);
            creation.setSpellRange(0);
            creation.setSpellDuration("1 hour");

            Spell curseOfDeath = new Spell("Curse of Death", 5, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, curseTrait, deathTrait, focusTrait, hexTrait, manipulateTrait, voidTrait, witchTrait), "Your patron wraps a hand around your target's heart.");
            curseOfDeath.setSpellRange(30);
            curseOfDeath.setSpellTargets("1 creature");
            curseOfDeath.setSpellDefense("Fortitude");
            curseOfDeath.setSpellDuration("sustained up to 1 minute");

            Spell cursedMetamorphosis = new Spell("Cursed Metamorphosis", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, curseTrait, incapactitationTrait, manipulateTrait, polymorphTrait), "You transform the target creature into a harmless animal appropriate to the area, with effects based on its Fortitude save.");
            cursedMetamorphosis.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            cursedMetamorphosis.setSpellRange(30);
            cursedMetamorphosis.setSpellTargets("1 creature");
            cursedMetamorphosis.setSpellDefense("Fortitude");
            cursedMetamorphosis.setSpellDuration("varies");

            Spell darkness = new Spell("Darkness", 2, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, darknessTrait, manipulateTrait), "You create a shroud of darkness that prevents light from penetrating or emanating within the area.");
            darkness.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            darkness.setSpellRange(120);
            darkness.setSpellArea(20);
            darkness.setSpellAreaType("burst");
            darkness.setSpellDuration("1 minute");

            Spell daze = new Spell("Daze", 1, SpellType.CANTRIP, ActionType.TWO_ACTIONS, Set.of(cantripTrait, concentrateTrait, manipulateTrait, mentalTrait, nonlethalTrait), "You push into the target's mind and daze it with a mental jolt.");
            daze.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            daze.setSpellRange(60);
            daze.setSpellTargets("1 creature");
            daze.setSpellDefense("Will");
            daze.setSpellDuration("1 round");

            Spell desiccate = new Spell("Desiccate", 8, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, voidTrait), "You pull the moisture from the targets' bodies, dealing 10d10 void damage. Creatures made of water (such as water elementals) and plant creatures use the outcome for one degree of success worse than the result of their saving throw. Creatures whose bodies contain no significant moisture (such as earth elementals) are immune to desiccate.");
            desiccate.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            desiccate.setSpellRange(500);
            desiccate.setSpellTargets("any number of living creatures");
            desiccate.setSpellDefense("basic Fortitude");

            Spell detonateMagic = new Spell("Detonate Magic", 9, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You cause the magic within the target to dissipate in a destructive explosion.");
            detonateMagic.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            detonateMagic.setSpellRange(120);
            detonateMagic.setSpellTargets("1 magic item or spell effect");
            detonateMagic.setSpellDefense("basic Reflex");

            Spell disappearance = new Spell("Disappearance", 8, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(illusionTrait, manipulateTrait, subtleTrait), "You shroud a creature from others' senses.");
            disappearance.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            disappearance.setSpellRange(0);
            disappearance.setSpellTargets("1 target");
            disappearance.setSpellDuration("10 minutes");

            Spell disguiseMagic = new Spell("Disguise Magic", 1, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, illusionTrait, manipulateTrait), "You alter how an item's or spell's magical aura appears to effects like detect magic.You alter how an item's or spell's magical aura appears to effects like detect magic.");
            disguiseMagic.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            disguiseMagic.setSpellCastUnits("minute");
            disguiseMagic.setSpellCastAmount(1);
            disguiseMagic.setSpellRange(30);
            disguiseMagic.setSpellTargets("1 item or spell effect");
            disguiseMagic.setSpellDuration("until your next daily preparations");

            Spell disintegrate = new Spell("Disintegrate", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(attackTrait, concentrateTrait, manipulateTrait), "A black tracer bolt flies toward your target, and upon making contact intensifies into a powerful destructive beam.");
            disintegrate.setSpellTraditions(List.of(SpellTraditions.ARCANE));
            disintegrate.setSpellRange(120);
            disintegrate.setSpellTargets("1 creature, unattended object, or force construct");
            disintegrate.setSpellDefense("AC and basic Fortitude");

            Spell dispelMagic = new Spell("Dispel Magic", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You unravel the magic behind a spell or effect.");
            dispelMagic.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            dispelMagic.setSpellRange(120);
            dispelMagic.setSpellTargets("1 spell effect or unattended magic item");

            Spell dispellingGlobe = new Spell("Dispelling Globe", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You create an immobile globe around yourself.");
            dispellingGlobe.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            dispellingGlobe.setSpellArea(10);
            dispellingGlobe.setSpellAreaType("burst centered on one corner of your space");
            dispellingGlobe.setSpellDuration("10 minutes");

            Spell divineDecree = new Spell("Divine Decree", 7, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, sanctifiedTrait, spiritTrait), "You utter a potent litany from your faith, a mandate that harms those who oppose your ideals.");
            divineDecree.setSpellTraditions(List.of(SpellTraditions.DIVINE));
            divineDecree.setSpellArea(40);
            divineDecree.setSpellAreaType("emanation");
            divineDecree.setSpellDefense("Fortitude");
            divineDecree.setSpellDuration("varies");

            Spell dizzyingColors = new Spell("Dizzying Colors", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, illusionTrait, incapactitationTrait, manipulateTrait, visualTrait), "You unleash a swirling multitude of colors that overwhelms creatures based on their Will saves.");
            dizzyingColors.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            dizzyingColors.setSpellArea(15);
            dizzyingColors.setSpellAreaType("cone");
            dizzyingColors.setSpellDefense("Will");
            dizzyingColors.setSpellDuration("1 or more rounds");

            Spell dreamingPotential = new Spell("Dreaming Potential", 5, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait, mentalTrait), "You draw the target into a lucid dream where it can explore the endless possibilities of its own potential within the everchanging backdrop of its dreamscape.");
            dreamingPotential.setSpellTraditions(List.of(SpellTraditions.OCCULT));
            dreamingPotential.setSpellCastAmount(10);
            dreamingPotential.setSpellCastUnits("minute");
            dreamingPotential.setSpellRange(0);
            dreamingPotential.setSpellTargets("1 willing sleeping creature");
            dreamingPotential.setSpellDuration("8 hours");

            Spell dreamMessage = new Spell("Dream Message", 3, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait, mentalTrait), "You send a message to your target's dream.");
            dreamMessage.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            dreamMessage.setSpellCastAmount(10);
            dreamMessage.setSpellCastUnits("minute");
            dreamMessage.setSpellTargets("1 creature you know by name and have met in person");
            dreamMessage.setSpellDuration("until your next daily preparations");

            Spell duplicateFoe = new Spell("Duplicate Foe", 7, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You create a temporary duplicate of an enemy to fight on your behalf.");
            duplicateFoe.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            duplicateFoe.setSpellRange(30);
            duplicateFoe.setSpellTargets("1 enemy of level 15 or lower");
            duplicateFoe.setSpellDefense("Fortitude");
            duplicateFoe.setSpellDuration("sustained up to 1 minute");

            Spell earthbind = new Spell("Earthbind", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, earthTrait, manipulateTrait), "Using the weight of earth, you hamper a target's flight, with effects based on its Fortitude save.");
            earthbind.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            earthbind.setSpellRange(120);
            earthbind.setSpellTargets("1 flying creature");
            earthbind.setSpellDefense("Fortitude");
            earthbind.setSpellDuration("varies");

            Spell earthquake = new Spell("Earthquake", 8, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, earthTrait, manipulateTrait), "You shake the ground, topple creatures into fissures, and collapse structures.");
            earthquake.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            earthquake.setSpellRange(500);
            earthquake.setSpellArea(60);
            earthquake.setSpellAreaType("burst");
            earthquake.setSpellDuration("1 round");

            Spell earthworks = new Spell("Earthworks", 1, SpellType.FOCUS, ActionType.ONE_TO_THREE_ACTIONS, Set.of(concentrateTrait, earthTrait, focusTrait, manipulateTrait, wizardTrait), "With a ripple of earth, you raise small barriers from the ground.");
            earthworks.setSpellRange(60);
            earthworks.setSpellArea(5);
            earthworks.setSpellAreaType("burst or more");
            earthworks.setSpellDuration("1 minute");

            Spell eclipseBurst = new Spell("Eclipse Burst", 7, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(coldTrait, concentrateTrait, darknessTrait, manipulateTrait, voidTrait), "A globe of freezing darkness explodes in the area, dealing 8d10 cold damage to creatures in the area, plus an additional 8d4 void damage to living creatures. Each creature in the area must attempt a Reflex save.\n" +
                    "\n" +
                    "If the globe overlaps with an area of magical light or affects a creature affected by magical light, eclipse burst attempts to counteract the light effect.");
            eclipseBurst.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.PRIMAL));
            eclipseBurst.setSpellRange(500);
            eclipseBurst.setSpellArea(60);
            eclipseBurst.setSpellAreaType("burst");
            eclipseBurst.setSpellDefense("Reflex");

            Spell elementalForm = new Spell("Elemental Form", 5, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, polymorphTrait), "You call upon the power of the planes to transform into a Medium elemental battle form.");
            elementalForm.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            elementalForm.setSpellDuration("1 minute");

            Spell embedMessage = new Spell("Embed Message", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, illusionTrait, manipulateTrait), "You specify a trigger and a message up to 25 words long.");
            embedMessage.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            embedMessage.setSpellRange(0);
            embedMessage.setSpellTargets("1 object or willing creature");
            embedMessage.setSpellDuration("unlimited");

            Spell energyAbsorption = new Spell("Energy Absorption", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(focusTrait, wizardTrait), "You're used to mitigating the damage done by bombs, siege engines, and magical artillery.");
            energyAbsorption.setSpellTrigger("An effect would deal acid, cold, electricity, or fire damage to you");

            Spell energyAegis = new Spell("Energy Aegis", 7, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait), "You protect the target with a powerful, long-lasting energy barrier.");
            energyAegis.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            energyAegis.setSpellCastAmount(1);
            energyAegis.setSpellCastUnits("minute");
            energyAegis.setSpellRange(0);
            energyAegis.setSpellTargets("1 creature");
            energyAegis.setSpellDuration("until your next daily preparations");

            Spell enlarge = new Spell("Enlarge", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, polymorphTrait), "Bolstered by magical power, the target grows to size Large.");
            enlarge.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            enlarge.setSpellRange(30);
            enlarge.setSpellTargets("1 willing creature");
            enlarge.setSpellDuration("5 minutes");

            Spell enthrall = new Spell("Enthrall", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(auditoryTrait, concentrateTrait, emotionTrait, manipulateTrait), "Your words fascinate your targets.");
            enthrall.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            enthrall.setSpellRange(120);
            enthrall.setSpellTargets("all creatures in range");
            enthrall.setSpellDefense("Will");
            enthrall.setSpellDuration("sustained");

            Spell fallingStars = new Spell("Falling Stars", 9, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You reach into the skies and call down an array of falling stars that explode upon colliding with the ground.");
            fallingStars.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            fallingStars.setSpellRange(500);
            fallingStars.setSpellArea(40);
            fallingStars.setSpellAreaType("4 bursts");
            fallingStars.setSpellDefense("basic Reflex");

            Spell falseVitality = new Spell("False Vitality", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You augment your flesh with the energies typically used to manipulate the undead.");
            falseVitality.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            falseVitality.setSpellDuration("8 hours");

            Spell feetToFins = new Spell("Feet to Fins", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, morphTrait), "The target's feet transform into fins, improving mobility in the water but reducing it on land.");
            feetToFins.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            feetToFins.setSpellRange(0);
            feetToFins.setSpellTargets("1 willing creature");
            feetToFins.setSpellDuration("10 minutes");

            Spell fieryBody = new Spell("Fiery Body", 7, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, fireTrait, manipulateTrait, polymorphTrait), "You become living flame, giving you fire immunity, resistance 10 to precision damage, and weakness 5 to cold and to water. Any creature that touches you or damages you with an unarmed attack or non-reach melee weapon takes 3d6 fire damage.\n" +
                    "\n" +
                    "Your unarmed attacks deal an additional 1d4 fire damage, and your fire spells deal one additional die of fire damage (of the same damage die the spell uses). You can cast ignition as an innate spell; the casting is reduced from 2 actions to 1. In fire form, you have a fly Speed of 40 feet and don't need to breathe.");
            fieryBody.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            fieryBody.setSpellDuration("1 minute");

            Spell figment = new Spell("Figment", 1, SpellType.CANTRIP, ActionType.TWO_ACTIONS, Set.of(cantripTrait, concentrateTrait, illusionTrait, manipulateTrait, subtleTrait), "You create a simple illusory sound or vision.");
            figment.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            figment.setSpellRange(30);
            figment.setSpellDuration("sustained");

            Spell fireShield = new Spell("Fire Shield", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, fireTrait, manipulateTrait), "You create a hovering shield made of fire.");
            fireShield.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            fireShield.setSpellDuration("1 minute");

            Spell fireball = new Spell("Fireball", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, fireTrait, manipulateTrait), "A roaring blast of fire detonates at a spot you designate, dealing 6d6 fire damage.");
            fireball.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            fireball.setSpellRange(500);
            fireball.setSpellArea(20);
            fireball.setSpellAreaType("burst");
            fireball.setSpellDefense("basic Reflex");

            Spell fleetStep = new Spell("Fleet Step", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You gain a +30-foot status bonus to your Speed.");
            fleetStep.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            fleetStep.setSpellDuration("1 minute");

            Spell flicker = new Spell("Flicker", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, teleportationTrait), "You flicker quickly between your current plane and another.");
            flicker.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            flicker.setSpellDuration("1 minute");

            Spell forceBarrage = new Spell("Force Barrage", 1, SpellType.SPELL, ActionType.ONE_TO_THREE_ACTIONS, Set.of(concentrateTrait, forceTrait, manipulateTrait), "You fire a shard of solidified magic toward a creature that you can see.");
            forceBarrage.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            forceBarrage.setSpellRange(120);
            forceBarrage.setSpellTargets("1 creature");

            Spell forceBolt = new Spell("Force Bolt", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(focusTrait, forceTrait, manipulateTrait, wizardTrait), "You fire an arrow-shaped bolt of force, one of the most common and reliable forms of battle magic.");
            forceBolt.setSpellRange(30);
            forceBolt.setSpellTargets("1 creature");

            Spell foresight = new Spell("Foresight", 9, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, mentalTrait, predictionTrait), "You gain a sixth sense that warns you of danger that might befall the target of the spell.");
            foresight.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            foresight.setSpellRange(0);
            foresight.setSpellTargets("1 creature");
            foresight.setSpellDuration("1 hour");

            Spell fortifySummoning = new Spell("Fortify Summoning", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(concentrateTrait, focusTrait, wizardTrait), "As you call a creature to your side, your magic transforms its body, heightening its ferocity and fortifying its resilience.");
            fortifySummoning.setSpellRange(30);
            fortifySummoning.setSpellTargets("1 creature you summoned");

            Spell ghostlyWeapon = new Spell("Ghostly Weapon", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "The target weapon becomes translucent and ghostly, and it can affect material and incorporeal creatures and objects.");
            ghostlyWeapon.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            ghostlyWeapon.setSpellRange(0);
            ghostlyWeapon.setSpellTargets("1 weapon that is either unattended or wielded by you or a willing ally");
            ghostlyWeapon.setSpellDuration("5 minutes");

            Spell glimpseTheTruth = new Spell("Glimpse the Truth", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(auraTrait, clericTrait, focusTrait, manipulateTrait, revelationTrait), "Divine insight lets you see things as they are, unveiled by attempts to magically cloak the truth.");
            glimpseTheTruth.setSpellArea(30);
            glimpseTheTruth.setSpellAreaType("emanation");
            glimpseTheTruth.setSpellDuration("1 round");

            Spell goblinPox = new Spell("Goblin Pox", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, diseaseTrait, manipulateTrait), "Your touch afflicts the target with goblin pox, an irritating allergenic rash.");
            goblinPox.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            goblinPox.setSpellRange(0);
            goblinPox.setSpellTargets("1 creature");
            goblinPox.setSpellDefense("Fortitude");

            Spell gougingClaw = new Spell("Gouging Claw", 1, SpellType.CANTRIP, ActionType.TWO_ACTIONS, Set.of(attackTrait, cantripTrait, concentrateTrait, manipulateTrait, morphTrait), "You temporarily morph your limb into a clawed appendage.");
            gougingClaw.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            gougingClaw.setSpellRange(0);
            gougingClaw.setSpellTargets("1 creature");
            gougingClaw.setSpellDefense("AC");

            Spell grimTendrils = new Spell("Grim Tendrils", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, voidTrait), "Tendrils of darkness curl out from your fingertips and race through the air.");
            grimTendrils.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            grimTendrils.setSpellArea(30);
            grimTendrils.setSpellAreaType("line");
            grimTendrils.setSpellDefense("Fortitude");

            Spell gustOfWind = new Spell("Gust of Wind", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(airTrait, concentrateTrait, manipulateTrait), "A violent wind issues forth from your palm, blowing from the point where you are when you Cast the Spell to the line's opposite end.");
            gustOfWind.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            gustOfWind.setSpellArea(60);
            gustOfWind.setSpellAreaType("line");
            gustOfWind.setSpellDefense("Fortitude");
            gustOfWind.setSpellDuration("until the start of your next turn");

            Spell hallucination = new Spell("Hallucination", 5, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(illusionTrait, incapactitationTrait, manipulateTrait, mentalTrait, subtleTrait), "The target consistently detects one thing as another, can't detect something that's there, or detects something that's not there, though it doesn't alter their beliefs.");
            hallucination.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            hallucination.setSpellRange(30);
            hallucination.setSpellTargets("1 creature");
            hallucination.setSpellDuration("1 hour");

            Spell harm = new Spell("Harm", 1, SpellType.SPELL, ActionType.ONE_TO_THREE_ACTIONS, Set.of(manipulateTrait, voidTrait), "You channel void energy to harm the living or heal the undead.");
            harm.setSpellTraditions(List.of(SpellTraditions.DIVINE));
            harm.setSpellTargets("1 living creature or 1 willing undead creature");

            Spell haste = new Spell("Haste", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "Magic empowers the target to act faster.");
            haste.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            haste.setSpellRange(30);
            haste.setSpellTargets("1 creature");
            haste.setSpellDuration("1 minute");

            Spell heal = new Spell("Heal", 1, SpellType.SPELL, ActionType.ONE_TO_THREE_ACTIONS, Set.of(healingTrait, manipulateTrait, vitalityTrait), "You channel vital energy to heal the living or damage the undead.");
            heal.setSpellTraditions(List.of(SpellTraditions.DIVINE, SpellTraditions.PRIMAL));
            heal.setSpellTargets("1 willing living creature or 1 undead creature");

            Spell holyLight = new Spell("Holy Light", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(attackTrait, concentrateTrait, fireTrait, holyTrait, lightTrait, manipulateTrait), "You shine a blazing ray of light tinged with holy energy.");
            holyLight.setSpellTraditions(List.of(SpellTraditions.DIVINE, SpellTraditions.PRIMAL));
            holyLight.setSpellRange(120);
            holyLight.setSpellTargets("1 creature");
            holyLight.setSpellDefense("AC");

            Spell howlingBlizzard = new Spell("Howling Blizzard", 5, SpellType.SPELL, ActionType.TWO_TO_THREE_ACTIONS, Set.of(airTrait, coldTrait, concentrateTrait, manipulateTrait), "Freezing winds extend from your hands, pushing away from you with great force.");
            howlingBlizzard.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            howlingBlizzard.setSpellAreaType("varies");
            howlingBlizzard.setSpellDefense("basic Reflex");

            Spell humanoidForm = new Spell("Humanoid Form", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, polymorphTrait), "You transform your appearance to that of a Small or Medium humanoid, such as a dwarf, elf, goblin, halfling, human, or orc.");
            humanoidForm.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            humanoidForm.setSpellDuration("10 minutes");

            Spell hydraulicPush = new Spell("Hydraulic Push", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(attackTrait, concentrateTrait, manipulateTrait, waterTrait), "You call forth a powerful blast of pressurized water that bludgeons the target and knocks it back.");
            hydraulicPush.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            hydraulicPush.setSpellRange(60);
            hydraulicPush.setSpellTargets("1 creature or unattended object");
            hydraulicPush.setSpellDefense("AC");

            Spell illusoryCreature = new Spell("Illusory Creature", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(auditoryTrait, concentrateTrait, illusionTrait, manipulateTrait, olfactoryTrait, visualTrait), "You create an illusory image of a Large or smaller creature.");
            illusoryCreature.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            illusoryCreature.setSpellRange(500);
            illusoryCreature.setSpellDuration("sustained");

            Spell illusoryDisguise = new Spell("Illusory Disguise", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, illusionTrait, manipulateTrait, mentalTrait), "You create an illusion that causes the target to appear as another creature of the same body shape, and with roughly similar height (within 6 inches) and weight (within 50 pounds).");
            illusoryDisguise.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            illusoryDisguise.setSpellRange(30);
            illusoryDisguise.setSpellTargets("1 willing creature");
            illusoryDisguise.setSpellDuration("1 hour");

            Spell illusoryObject = new Spell("Illusory Object", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, illusionTrait, manipulateTrait, mentalTrait), "You create an illusory visual image of a stationary object.");
            illusoryObject.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            illusoryObject.setSpellRange(500);
            illusoryObject.setSpellArea(20);
            illusoryObject.setSpellAreaType("burst");
            illusoryObject.setSpellDuration("10 minutes");

            Spell illusoryScene = new Spell("Illusory Scene", 5, SpellType.SPELL, ActionType.ACTIVITY, Set.of(auditoryTrait, concentrateTrait, illusionTrait, manipulateTrait, olfactoryTrait, visualTrait), "You craft an imaginary scene that includes up to 10 discrete creatures or objects of various sizes, all of which must be within the spell's area. These elements generate appropriate sounds and smells, and they feel right to the touch. Elements of an illusory scene are incapable of speech. Unlike with the illusory creature spell, creatures in your scene lack combat abilities and statistics. Your scene doesn't include changes to the environment around it, though you can place your scene within the illusory environment of a mirage spell.\n" +
                    "\n" +
                    "When you create the scene, you can choose to have it be static or follow a program. Though a static scene is stationary, it includes basic natural movement. For example, wind blowing on an illusory piece of paper would rustle it. A program can be up to 1 minute long and repeats when finished. For instance, you could create a scene of two orcs fighting each other, and the fight would go the same way for each repetition. If you create a loop, the two fighters end up in the same place at the start of the scene and at the end of it, but you can smooth the program so it's hard to tell when the loop ends and begins. Anyone observing the scene for more than a few minutes almost always notices it looping. You're unable to alter the program after you create the illusion.\n" +
                    "\n" +
                    "Any creature that touches any part of the image or uses the Seek action to examine it can attempt to disbelieve your illusion. If they interact with a portion of the illusion, they disbelieve only that portion. They disbelieve the entire scene only on a critical success.");
            illusoryScene.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            illusoryScene.setSpellCastAmount(10);
            illusoryScene.setSpellCastUnits("minute");
            illusoryScene.setSpellRange(500);
            illusoryScene.setSpellRange(30);
            illusoryScene.setSpellAreaType("burst");
            illusoryScene.setSpellDuration("1 hour");

            Spell impalingSpike = new Spell("Impaling Spike", 5, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, metalTrait), "You conjure a spike that thrusts up from the earth beneath a target creature, potentially impaling it.");
            impalingSpike.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            impalingSpike.setSpellRange(30);
            impalingSpike.setSpellTargets("1 creature");
            impalingSpike.setSpellDefense("Reflex");
            impalingSpike.setSpellDuration("1 minute");

            Spell interplanarTeleport = new Spell("Interplanar Teleport", 7, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait, teleportationTrait), "You and your allies traverse the barriers between planes of existence.");
            interplanarTeleport.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            interplanarTeleport.setSpellCastAmount(10);
            interplanarTeleport.setSpellCastUnits("minute");
            interplanarTeleport.setSpellRequirement("You have a planar key for the destination plane, used as a locus");
            interplanarTeleport.setSpellRange(5);
            interplanarTeleport.setSpellTargets("up to 8 willing creatures");

            Spell invisibility = new Spell("Invisibility", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(illusionTrait, manipulateTrait, subtleTrait), "Illusions bend light around the target, rendering it invisible.");
            invisibility.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            invisibility.setSpellRange(0);
            invisibility.setSpellTargets("1 creature");
            invisibility.setSpellDuration("10 minutes");

            Spell invisibilityCloak = new Spell("Invisibility Cloak", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(focusTrait, illusionTrait, manipulateTrait, wizardTrait), "You become invisible, with the same restrictions as the 2nd-rank invisibility spell.");
            invisibilityCloak.setSpellDuration("1 minute");

            Spell invokeSpirits = new Spell("Invoke Spirits", 5, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, emotionTrait, fearTrait, manipulateTrait, mentalTrait, voidTrait), "Ragged apparitions of the dead rise to stalk the living.");
            invokeSpirits.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            invokeSpirits.setSpellRange(120);
            invokeSpirits.setSpellArea(10);
            invokeSpirits.setSpellAreaType("burst");
            invokeSpirits.setSpellDefense("Will");
            invokeSpirits.setSpellDuration("sustained up to 1 minute");

            Spell jump = new Spell("Jump", 1, SpellType.SPELL, ActionType.SINGLE_ACTION, Set.of(manipulateTrait, moveTrait), "Your legs surge with strength, ready to leap high and far.");
            jump.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));

            Spell levitate = new Spell("Levitate", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You defy gravity and levitate the target 5 feet off the ground.");
            levitate.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            levitate.setSpellRange(0);
            levitate.setSpellTargets("1 unattended object or willing creature");
            levitate.setSpellDuration("5 minutes");

            Spell lightningBolt = new Spell("Lightning Bolt", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, electricityTrait, manipulateTrait), "A bolt of lightning strikes outward from your hand, dealing 4d12 electricity damage with a basic Reflex save.");
            lightningBolt.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            lightningBolt.setSpellArea(120);
            lightningBolt.setSpellAreaType("line");
            lightningBolt.setSpellDefense("basic Reflex");

            Spell liminalDoorway = new Spell("Liminal Doorway", 4, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, extradimensionalTrait, manipulateTrait), "You draw a chalk doorway on an unbroken surface, which opens into an extradimensional space.");
            liminalDoorway.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            liminalDoorway.setSpellCastAmount(10);
            liminalDoorway.setSpellCastUnits("minute");
            liminalDoorway.setSpellRange(0);
            liminalDoorway.setSpellDuration("8 hours");

            Spell maskOfTerror = new Spell("Mask of Terror", 7, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, emotionTrait, fearTrait, illusionTrait, manipulateTrait, mentalTrait, visualTrait), "The target appears to be a gruesome and terrifying creature.");
            maskOfTerror.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            maskOfTerror.setSpellRange(30);
            maskOfTerror.setSpellTargets("1 creature");
            maskOfTerror.setSpellDuration("1 minute");

            Spell massacre = new Spell("Massacre", 9, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, deathTrait, manipulateTrait, voidTrait), "You unleash a wave of death to snuff out the life force of those in its path.");
            massacre.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.PRIMAL));
            massacre.setSpellArea(60);
            massacre.setSpellAreaType("line");
            massacre.setSpellDefense("Fortitude");

            Spell message = new Spell("Message", 1, SpellType.CANTRIP, ActionType.SINGLE_ACTION, Set.of(auditoryTrait, cantripTrait, concentrateTrait, illusionTrait, linguisticTrait, mentalTrait, subtleTrait), "You mouth words quietly, but instead of coming out of your mouth, they're transferred directly to the ears of the target.");
            message.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            message.setSpellRange(120);
            message.setSpellTargets("1 creature");

            Spell metamorphosis = new Spell("Metamorphosis", 9, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, polymorphTrait), "Harnessing your mastery of transformative magic, you hide forms within forms.");
            metamorphosis.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            metamorphosis.setSpellDuration("1 minute");

            Spell mindlink = new Spell("Mindlink", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, mentalTrait), "You link your mind to the target's mind and mentally impart to that target an amount of information in an instant that could otherwise be communicated in 10 minutes.");
            mindlink.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            mindlink.setSpellRange(0);
            mindlink.setSpellTargets("1 willing creature");

            Spell mindReading = new Spell("Mind Reading", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, detectionTrait, manipulateTrait, mentalTrait), "With a cursory mental touch, you attempt to read the target's mind.");
            mindReading.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            mindReading.setSpellRange(30);
            mindReading.setSpellTargets("1 creature");
            mindReading.setSpellDefense("Will");
            mindReading.setSpellDuration("1 round or sustained up to 1 minute");

            Spell mislead = new Spell("Mislead", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, illusionTrait, manipulateTrait), "You turn yourself invisible and create an illusory duplicate of yourself.");
            mislead.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            mislead.setSpellDuration("sustained up to 1 minute");

            Spell mist = new Spell("Mist", 2, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, manipulateTrait, waterTrait), "You call forth a cloud of mist.");
            mist.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            mist.setSpellRange(120);
            mist.setSpellArea(20);
            mist.setSpellAreaType("burst");
            mist.setSpellDuration("1 minute");

            Spell monstrosityForm = new Spell("Monstrosity Form", 8, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, polymorphTrait), "You transform into the shape of a legendary monster, assuming a Huge battle form.");
            monstrosityForm.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            monstrosityForm.setSpellDuration("1 minute");

            Spell mountainResilience = new Spell("Mountain Resilience", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, earthTrait, manipulateTrait), "The target's skin hardens like the stone of a mountain face.");
            mountainResilience.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            mountainResilience.setSpellRange(0);
            mountainResilience.setSpellTargets("1 creature");
            mountainResilience.setSpellDuration("20 minutes");

            Spell mysticArmor = new Spell("Mystic Armor", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You ward yourself with shimmering magical energy, gaining a +1 item bonus to AC and a maximum Dexterity modifier of +5. While wearing mystic armor, you use your unarmored proficiency to calculate your AC.");
            mysticArmor.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            mysticArmor.setSpellDuration("until your next daily preparations");

            Spell naturesPathway = new Spell("Nature's Pathway", 5, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait, mentalTrait, plantTrait, teleportationTrait), "You step into a living tree with a trunk big enough for you to fit inside it and instantly teleport to any tree within 5 miles that also has a sufficiently large trunk.");
            naturesPathway.setSpellTraditions(List.of(SpellTraditions.PRIMAL));
            naturesPathway.setSpellCastAmount(1);
            naturesPathway.setSpellCastUnits("minute");

            Spell neverMind = new Spell("Never Mind", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, curseTrait, incapactitationTrait, manipulateTrait, mentalTrait), "You drastically reduce the target's mental faculties.");
            neverMind.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            neverMind.setSpellRange(30);
            neverMind.setSpellTargets("1 creature");
            neverMind.setSpellDefense("Will");
            neverMind.setSpellDuration("varies");

            Spell nightmare = new Spell("Nightmare", 4, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, illusionTrait, manipulateTrait, mentalTrait), "You send disturbing nightmares to your target.");
            nightmare.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            nightmare.setSpellCastAmount(10);
            nightmare.setSpellCastUnits("minute");
            nightmare.setSpellRange(2147483647);
            nightmare.setSpellTargets("1 creature you know by name");
            nightmare.setSpellDefense("Will");
            nightmare.setSpellDuration("1 day");

            Spell pestForm = new Spell("Pest Form", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, polymorphTrait), "You transform into the battle form of a Tiny animal, such as a cat, insect, lizard, or rat. You can decide the specific type of animal (such as a rat or praying mantis), but this has no effect on your Size or statistics. While in this form, you gain the animal trait, and you can't make Strikes. You can Dismiss the spell.\n" +
                    "\n" +
                    "You gain the following statistics and abilities:\n" +
                    "AC = 15 + your level. Ignore your armor's check penalty and Speed reduction.\n" +
                    "Speed 20 feet.\n" +
                    "Weakness 5 to physical damage. (If you take physical damage in this form, you take 5 additional damage.)\n" +
                    "Low-light vision and imprecise scent 30 feet.\n" +
                    "Acrobatics and Stealth modifiers of +10, unless your own is higher; Athletics modifier –4.");
            pestForm.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            pestForm.setSpellDuration("10 minutes");

            Spell petrify = new Spell("Petrify", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, earthTrait, manipulateTrait), "The target's body slowly turns into a stone statue.");
            petrify.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            petrify.setSpellRange(120);
            petrify.setSpellTargets("1 creature made of organic material");
            petrify.setSpellDefense("Fortitude");
            petrify.setSpellDuration("varies");

            Spell phantasmagoria = new Spell("Phantasmagoria", 9, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, deathTrait, illusionTrait, manipulateTrait, mentalTrait), "You fill the targets' minds with endless images, like countless dreams and lives colliding with each other.");
            phantasmagoria.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            phantasmagoria.setSpellRange(120);
            phantasmagoria.setSpellTargets("any number of creatures");
            phantasmagoria.setSpellDefense("Will");

            Spell phantasmalCalamity = new Spell("Phantasmal Calamity", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, illusionTrait, manipulateTrait, mentalTrait), "A vision of apocalyptic destruction fills the mind of each creature in the area.");
            phantasmalCalamity.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            phantasmalCalamity.setSpellRange(500);
            phantasmalCalamity.setSpellArea(30);
            phantasmalCalamity.setSpellAreaType("burst");
            phantasmalCalamity.setSpellDefense("Will");

            Spell phantasmalMinionSpell = new Spell("Phantasmal Minion", 1, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, manipulateTrait, summonTrait), "You summon a phantasmal minion.");
            phantasmalMinionSpell.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            phantasmalMinionSpell.setSpellRange(60);
            phantasmalMinionSpell.setSpellDuration("sustained");

            Spell phantomPain = new Spell("Phantom Pain", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, illusionTrait, manipulateTrait, mentalTrait, nonlethalTrait), "Illusory pain wracks the target, dealing 2d4 mental damage and 1d4 persistent mental damage with a Will save.");
            phantomPain.setSpellTraditions(List.of(SpellTraditions.OCCULT));
            phantomPain.setSpellRange(30);
            phantomPain.setSpellTargets("1 creature");
            phantomPain.setSpellDefense("Will");
            phantomPain.setSpellDuration("1 minute");

            Spell pinpoint = new Spell("Pinpoint", 8, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, detectionTrait, manipulateTrait), "You learn the name of the target's exact location (including the building, community, and country) and plane of existence. You can target a creature only if you've seen it in person, have one of its significant belongings, or have a piece of its body, such as a lock of hair. To target an object, you must have touched it or have a fragment of it. Pinpoint automatically overcomes protections against detection effects of lower rank than this spell, even if they would normally have a chance to block it.");
            pinpoint.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            pinpoint.setSpellCastAmount(10);
            pinpoint.setSpellCastUnits("minute");
            pinpoint.setSpellTargets("1 creature or object");

            Spell planarPalace = new Spell("Planar Palace", 7, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, extradimensionalTrait, manipulateTrait), "You grow an extradimensional demiplane consisting of a spacious dwelling with a single entrance.");
            planarPalace.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            planarPalace.setSpellCastAmount(1);
            planarPalace.setSpellCastUnits("minute");
            planarPalace.setSpellRange(30);
            planarPalace.setSpellDuration("until your next daily preparations");

            Spell planarSeal = new Spell("Planar Seal", 7, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You create a visible magical barrier that attempts to counteract teleportation effects and planar travel into or out of the area, including items that allow access to extradimensional spaces. Planar seal tries to counteract any attempt to summon a creature into the area but doesn't stop the creature from departing when the summoning ends.");
            planarSeal.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            planarSeal.setSpellRange(120);
            planarSeal.setSpellArea(60);
            planarSeal.setSpellAreaType("burst");
            planarSeal.setSpellDuration("until your next daily preparations");

            Spell prestidigitation = new Spell("Prestidigitation", 1, SpellType.CANTRIP, ActionType.TWO_ACTIONS, Set.of(cantripTrait, concentrateTrait, manipulateTrait), "The simplest magic does your bidding.");
            prestidigitation.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            prestidigitation.setSpellRange(10);
            prestidigitation.setSpellTargets("1 object (cook, lift, or tidy only)");
            prestidigitation.setSpellDuration("sustained");

            Spell projectImage = new Spell("Project Image", 7, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, illusionTrait, manipulateTrait, mentalTrait), "You project an illusory image of yourself.");
            projectImage.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            projectImage.setSpellRange(30);
            projectImage.setSpellDuration("sustained up to 1 minute");

            Spell protectiveWards = new Spell("Protective Wards", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(auraTrait, focusTrait, manipulateTrait, wizardTrait), "You expand a ring of glyphs that shields your allies.");
            protectiveWards.setSpellArea(5);
            protectiveWards.setSpellAreaType("emanation centered on you");
            protectiveWards.setSpellDuration("sustained up to 1 minute");

            Spell pummelingRubble = new Spell("Pummeling Rubble", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, earthTrait, manipulateTrait), "A spray of heavy rocks flies through the air in front of you.");
            pummelingRubble.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            pummelingRubble.setSpellArea(15);
            pummelingRubble.setSpellAreaType("cone");
            pummelingRubble.setSpellDefense("Reflex");

            Spell quandary = new Spell("Quandary", 8 ,SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, extradimensionalTrait, manipulateTrait, teleportationTrait), "You transport the target into an extraplanar puzzle room of mysterious origin, locking them there.");
            quandary.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            quandary.setSpellRange(30);
            quandary.setSpellTargets("1 creature");
            quandary.setSpellDuration("sustained");

            Spell readAura = new Spell("Read Aura", 1, SpellType.CANTRIP, ActionType.ACTIVITY, Set.of(cantripTrait, concentrateTrait, detectionTrait, manipulateTrait), "You focus on the target object, opening your mind to perceive magical auras.");
            readAura.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            readAura.setSpellCastAmount(1);
            readAura.setSpellCastUnits("minute");
            readAura.setSpellRange(30);
            readAura.setSpellTargets("1 object");

            Spell repulsion = new Spell("Repulsion", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(auraTrait, concentrateTrait, manipulateTrait, mentalTrait), "You manifest an aura that prevents creatures from approaching you.");
            repulsion.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            repulsion.setSpellArea(40);
            repulsion.setSpellAreaType("emanation up to");
            repulsion.setSpellDefense("Will");
            repulsion.setSpellDuration("1 minute");

            Spell resistEnergy = new Spell("Resist Energy", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "A shield of elemental energy protects a creature against one type of energy damage.");
            resistEnergy.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            resistEnergy.setSpellRange(0);
            resistEnergy.setSpellTargets("1 creature");
            resistEnergy.setSpellDuration("10 minutes");

            Spell retrocognition = new Spell("Retrocognition", 7, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait), "Opening your mind to mental echoes, you gain impressions from past events that occurred in your current location.");
            retrocognition.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            retrocognition.setSpellCastAmount(1);
            retrocognition.setSpellCastUnits("minute");
            retrocognition.setSpellDuration("sustained");

            Spell revealingLight = new Spell("Revealing Light", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, lightTrait, manipulateTrait), "A wave of magical light washes over the area.");
            revealingLight.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            revealingLight.setSpellRange(120);
            revealingLight.setSpellArea(10);
            revealingLight.setSpellAreaType("burst");
            revealingLight.setSpellDefense("Reflex");
            revealingLight.setSpellDuration("varies");

            Spell runeOfObservation = new Spell("Rune of Observation", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(concentrateTrait, focusTrait, wizardTrait), "You inscribe an invisible eye-shaped rune in the air, creating a sensor as clairvoyance.");
            runeOfObservation.setSpellDuration("1 hour");

            Spell runicBody = new Spell("Runic Body", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "Glowing runes appear on the target's body.");
            runicBody.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            runicBody.setSpellRange(0);
            runicBody.setSpellTargets("1 creature");
            runicBody.setSpellDuration("1 minute");

            Spell runicWeapon = new Spell("Runic Weapon", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "The weapon glimmers with magic as temporary runes carve down its length.");
            runicWeapon.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            runicWeapon.setSpellRange(0);
            runicWeapon.setSpellTargets("1 weapon that is unattended or wielded by a willing creature");
            runicWeapon.setSpellDuration("1 minute");

            Spell safePassage = new Spell("Safe Passage", 3, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You make passage through the area safe for a brief amount of time.");
            safePassage.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.PRIMAL));
            safePassage.setSpellRange(0);
            safePassage.setSpellArea(10);
            safePassage.setSpellAreaType("10-foot-wide, 10-foot-tall 60-foot-long section of terrain");
            safePassage.setSpellDuration("sustained up to 1 minute");

            Spell scrambleBody = new Spell("Scramble Body", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, focusTrait, manipulateTrait, wizardTrait), "Your magic throws the creature's biology into disarray, inducing nausea, fever, and other unpleasant conditions.");
            scrambleBody.setSpellRange(30);
            scrambleBody.setSpellTargets("1 living creature");
            scrambleBody.setSpellDefense("Fortitude");

            Spell seeTheUnseen = new Spell("See the Unseen", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, revelationTrait), "Your gaze pierces through illusions and finds invisible creatures and spirits.");
            seeTheUnseen.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            seeTheUnseen.setSpellDuration("10 minutes");

            Spell sending = new Spell("Sending", 5, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, manipulateTrait, mentalTrait), "You send the creature a mental message of 25 words or fewer, and it can respond immediately with its own message of 25 words or fewer.");
            sending.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            sending.setSpellTargets("1 creature you know well");

            Spell shieldSpell = new Spell("Shield", 1, SpellType.CANTRIP, ActionType.SINGLE_ACTION, Set.of(cantripTrait, concentrateTrait, forceTrait), "You raise a magical shield of force.");
            shieldSpell.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            shieldSpell.setSpellDuration("until the start of your next turn");

            Spell shiftingForm = new Spell("Shifting Form", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(concentrateTrait, focusTrait, morphTrait, wizardTrait), "You change your body to better suit the moment.");
            shiftingForm.setSpellDuration("1 minute");

            Spell sigil = new Spell("Sigil", 1, SpellType.CANTRIP, ActionType.TWO_ACTIONS, Set.of(cantripTrait, concentrateTrait, manipulateTrait), "You harmlessly place your unique magical sigil, which is about 1 square inch in size, on the targeted creature or object.");
            sigil.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            sigil.setSpellRange(0);
            sigil.setSpellTargets("1 creature or object");
            sigil.setSpellDuration("unlimited");

            Spell sleep = new Spell("Sleep", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, incapactitationTrait, manipulateTrait, mentalTrait, sleepTrait), "Each creature in the area becomes drowsy, possibly nodding off.");
            sleep.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            sleep.setSpellRange(30);
            sleep.setSpellArea(5);
            sleep.setSpellAreaType("burst");
            sleep.setSpellDefense("Will");

            Spell speakWithAnimals = new Spell("Speak with Animals", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You can ask questions of, receive answers from, and use the Diplomacy skill with animals. The spell doesn't make them more friendly than normal. Cunning animals are likely to be terse and evasive, while less intelligent ones often make inane comments.");
            speakWithAnimals.setSpellTraditions(List.of(SpellTraditions.PRIMAL));
            speakWithAnimals.setSpellDuration("1 hour");

            Spell spellwrack = new Spell("Spellwrack", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, curseTrait, forceTrait, manipulateTrait), "You cause any spells cast on the target to spill out their energy in harmful surges.");
            spellwrack.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            spellwrack.setSpellRange(30);
            spellwrack.setSpellTargets("1 creature");
            spellwrack.setSpellDefense("Will");

            Spell spiderSting = new Spell("Spider Sting", 1, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, poisonTrait), "You magically duplicate a spider's venomous sting.");
            spiderSting.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            spiderSting.setSpellRange(0);
            spiderSting.setSpellTargets("1 creature");
            spiderSting.setSpellDefense("Fortitude");

            Spell spiralOfHorrors = new Spell("Spiral of Horrors", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(auraTrait, concentrateTrait, emotionTrait, fearTrait, focusTrait, manipulateTrait, mentalTrait, wizardTrait), "Shades and spirits howl and whirl around you in a display that strikes fear into the hearts of all who witness it.");
            spiralOfHorrors.setSpellArea(5);
            spiralOfHorrors.setSpellAreaType("emanation");
            spiralOfHorrors.setSpellDuration("sustained up to 1 minute");

            Spell stupefy = new Spell("Stupefy", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, mentalTrait), "You dull the target's mind, depending on its Will save.");
            stupefy.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            stupefy.setSpellRange(30);
            stupefy.setSpellTargets("1 creature");
            stupefy.setSpellDefense("Will");
            stupefy.setSpellDuration("varies");

            Spell suggestion = new Spell("Suggestion", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, incapactitationTrait, linguisticTrait, manipulateTrait, mentalTrait, subtleTrait), "Your honeyed words are difficult for creatures to resist.");
            suggestion.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            suggestion.setSpellRange(30);
            suggestion.setSpellTargets("1 creature");
            suggestion.setSpellDefense("Will");
            suggestion.setSpellDuration("varies");

            Spell summonAnimal = new Spell("Summon Animal", 1, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, manipulateTrait, summonTrait), "You summon a creature that has the animal trait and whose level is –1 to fight for you.");
            summonAnimal.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            summonAnimal.setSpellRange(30);
            summonAnimal.setSpellDuration("sustained up to 1 minute");

            Spell summonConstruct = new Spell("Summon Construct", 1, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, manipulateTrait, summonTrait), "You summon a creature that has the construct trait and whose level is –1 to fight for you.");
            summonConstruct.setSpellTraditions(List.of(SpellTraditions.ARCANE));
            summonConstruct.setSpellRange(30);
            summonConstruct.setSpellDuration("sustained up to 1 minute");

            Spell summonUndead = new Spell("Summon Undead", 1, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, manipulateTrait, summonTrait), "You summon a creature that has the undead trait and whose level is –1 to fight for you.");
            summonUndead.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            summonUndead.setSpellRange(30);
            summonUndead.setSpellDuration("sustained up to 1 minute");

            Spell sureStrike = new Spell("Sure Strike", 1, SpellType.SPELL, ActionType.SINGLE_ACTION, Set.of(concentrateTrait, fortuneTrait), "The next time you make an attack roll before the end of your turn, roll it twice and use the better result. The attack ignores circumstance penalties to the attack roll and any flat check required due to the target being concealed or hidden. You are then temporarily immune to sure strike for 10 minutes.");
            sureStrike.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            sureStrike.setSpellDuration("until the end of your turn");

            Spell tangleVine = new Spell("Tangle Vine", 1, SpellType.CANTRIP, ActionType.TWO_ACTIONS, Set.of(attackTrait, cantripTrait, concentrateTrait, manipulateTrait, plantTrait, woodTrait), "A vine appears from thin air, flicking from your hand and lashing itself to the target.");
            tangleVine.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            tangleVine.setSpellRange(30);
            tangleVine.setSpellTargets("1 creature");
            tangleVine.setSpellDefense("AC");

            Spell telekineticHand = new Spell("Telekinetic Hand", 1, SpellType.CANTRIP, ActionType.TWO_ACTIONS, Set.of(cantripTrait, concentrateTrait, manipulateTrait), "You create a floating, magical hand, either invisible or ghostlike, that grasps the target object and levitates it slowly up to 20 feet in any direction. When you Sustain the spell, you can move the object an additional 20 feet. If the object is in the air when the spell ends, the object falls.");
            telekineticHand.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            telekineticHand.setSpellRange(30);
            telekineticHand.setSpellTargets("1 unattended object of Light bulk or less");
            telekineticHand.setSpellDuration("sustained");

            Spell telekineticHaul = new Spell("Telekinetic Haul", 5, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You move the target up to 20 feet, potentially suspending it in midair. When you Sustain the spell, you can do so again, or you can shift your telekinetic focus to a different eligible target within range, moving it instead.");
            telekineticHaul.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            telekineticHaul.setSpellRange(120);
            telekineticHaul.setSpellTargets("1 unattended object of up to 80 Bulk with no dimension longer than 20 feet");
            telekineticHaul.setSpellDuration("sustained up to 1 minute");

            Spell telekineticProjectile = new Spell("Telekinetic Projectile", 1, SpellType.CANTRIP, ActionType.TWO_ACTIONS, Set.of(attackTrait, cantripTrait, concentrateTrait, manipulateTrait), "You hurl a loose, unattended object that is within range and that has 1 Bulk or less at the target. Make a spell attack roll against the target's AC. If you hit, you deal 2d6 bludgeoning, piercing, or slashing damage—as appropriate for the object you hurled. No specific traits or magic properties of the hurled item affect the attack or the damage.");
            telekineticProjectile.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            telekineticProjectile.setSpellRange(30);
            telekineticProjectile.setSpellTargets("1 creature");
            telekineticProjectile.setSpellDefense("AC");

            Spell teleport = new Spell("Teleport", 6, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait, teleportationTrait), "You and the targets are instantly transported to any location within range, as long as you can identify the location precisely both by its position relative to your starting position and by its appearance (or other identifying features). Incorrect knowledge of the location's appearance usually causes the spell to fail, but it could instead lead to teleporting to an unwanted location or some other unusual mishap determined by the GM. Teleport is not precise over great distances. The targets appear at a distance from the intended destination equal to roughly 1 percent of the total distance traveled, in a direction determined by the GM. For short journeys, this lack of precision is irrelevant, but for long distances this could be up to 1 mile.");
            teleport.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            teleport.setSpellCastAmount(10);
            teleport.setSpellCastUnits("minute");
            teleport.setSpellRange(528000);
            teleport.setSpellTargets("you and up to 4 targets touched, either willing creatures or objects roughly the size of a creature");

            Spell toxicCloud = new Spell("Toxic Cloud", 5, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, deathTrait, manipulateTrait, poisonTrait), "You conjure a poisonous fog.");
            toxicCloud.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            toxicCloud.setSpellRange(120);
            toxicCloud.setSpellArea(20);
            toxicCloud.setSpellAreaType("burst");
            toxicCloud.setSpellDefense("basic Fortitude");
            toxicCloud.setSpellDuration("1 minute");

            Spell translate = new Spell("Translate", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "The target can understand the meaning of a single language it is hearing or reading when you Cast the Spell. This doesn't let it understand codes, language couched in metaphor, and the like (subject to GM discretion). If the target can hear multiple languages and knows that, it can choose which language to understand; otherwise, choose one of the languages randomly.");
            translate.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            translate.setSpellRange(30);
            translate.setSpellTargets("1 creature");
            translate.setSpellDuration("1 hour");

            Spell translocate = new Spell("Translocate", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, teleportationTrait), "You instantly transport yourself and any items you're wearing and holding from your current space to an unoccupied space within range you can see. If this would bring another creature with you—even if you're carrying it in an extradimensional container—the spell is lost.");
            translocate.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            translocate.setSpellRange(120);

            Spell truespeech = new Spell("Truespeech", 5, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "The target can understand all words regardless of language and also speak the languages of other creatures. When in a mixed group of creatures, each time the target speaks, it can choose a creature and speak in a language that creature understands, even if the target doesn't know what language that is.");
            truespeech.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            truespeech.setSpellRange(0);
            truespeech.setSpellTargets("1 creature");
            truespeech.setSpellDuration("1 hour");

            Spell trueTarget = new Spell("True Target", 7, SpellType.SPELL, ActionType.SINGLE_ACTION, Set.of(concentrateTrait, fortuneTrait, predictionTrait), "You delve into the possible futures of the next few seconds to understand all the ways your foe might avoid harm, then cast out that vision to those around you.");
            trueTarget.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            trueTarget.setSpellRange(60);
            trueTarget.setSpellTargets("4 creatures");
            trueTarget.setSpellDuration("until the start of your next turn");

            Spell umbralJourney = new Spell("Umbral Journey", 5, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait, shadowTrait, teleportationTrait), "You move partially into the Netherworld, using its warped nature to speed your travels.");
            umbralJourney.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            umbralJourney.setSpellCastAmount(1);
            umbralJourney.setSpellCastUnits("minute");
            umbralJourney.setSpellRange(0);
            umbralJourney.setSpellTargets("you and up to 10 willing creatures touched");
            umbralJourney.setSpellDuration("8 hours");

            Spell uncontrollableDance = new Spell("Uncontrollable Dance", 8, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, incapactitationTrait, manipulateTrait, mentalTrait), "The target is overcome with an all-consuming urge to dance.");
            uncontrollableDance.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            uncontrollableDance.setSpellRange(0);
            uncontrollableDance.setSpellTargets("1 creature");
            uncontrollableDance.setSpellDefense("Will");
            uncontrollableDance.setSpellDuration("varies");

            Spell unfetteredMovement = new Spell("Unfettered Movement", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You repel hindrances that would affect a creature.");
            unfetteredMovement.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.PRIMAL));
            unfetteredMovement.setSpellRange(0);
            unfetteredMovement.setSpellTargets("1 creature touched");
            unfetteredMovement.setSpellDuration("10 minutes");

            Spell unrelentingObservation = new Spell("Unrelenting Observation", 8, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, scryingTrait), "This spell grants perfect sight based on scrying, allowing several willing targets to track the exact movements or position of one creature or object. Choose one target creature or object in the area to be tracked. It becomes the sensor for the spell. Up to five willing creatures of your choice in the area can see a ghostly image of this creature or object when it's out of their sight. They can perceive the creature or object perfectly, allowing them to ignore the concealed or invisible condition, though physical barriers still provide cover.\n" +
                    "\n" +
                    "The tracking creatures can see the tracked creature or object through all barriers other than lead or running water, which block their vision. Distance doesn't matter, though the creature or object might move so far away it becomes too small to perceive. The tracking creatures don't see any of the environment around the target, though they do see any gear a creature is wearing or holding, and they can tell if it removes objects from its person.\n" +
                    "\n" +
                    "If the target to be tracked is willing, the duration is 1 hour. If they're unwilling, the target must attempt a Will save.");
            unrelentingObservation.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            unrelentingObservation.setSpellRange(100);
            unrelentingObservation.setSpellArea(20);
            unrelentingObservation.setSpellAreaType("burst");
            unrelentingObservation.setSpellTargets("1 creature of object tracked and up to 5 other willing creatures");
            unrelentingObservation.setSpellDuration("varies");

            Spell vampiricExsanguination = new Spell("Vampiric Exsanguination", 6, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, deathTrait, manipulateTrait, voidTrait), "You draw in the blood and life force of other creatures through your outstretched arms.");
            vampiricExsanguination.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            vampiricExsanguination.setSpellArea(30);
            vampiricExsanguination.setSpellAreaType("cone");
            vampiricExsanguination.setSpellDefense("basic Fortitude");


            Spell vampiricFeast = new Spell("Vampiric Feast", 3, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, deathTrait, manipulateTrait, voidTrait), "Your touch leeches the lifeblood out of a target to empower yourself.");
            vampiricFeast.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            vampiricFeast.setSpellRange(0);
            vampiricFeast.setSpellTargets("1 living creature");
            vampiricFeast.setSpellDefense("basic Fortitude");

            Spell vaporForm = new Spell("Vapor Form", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(airTrait, concentrateTrait, manipulateTrait, polymorphTrait), "The target transforms into a vaporous state.");
            vaporForm.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            vaporForm.setSpellRange(0);
            vaporForm.setSpellTargets("1 willing creature");
            vaporForm.setSpellDuration("5 minutes");

            Spell veilOfPrivacy = new Spell("Veil of Privacy", 3, SpellType.SPELL, ActionType.ACTIVITY, Set.of(concentrateTrait, manipulateTrait), "You erect protective wards that make the target difficult to detect via magic.");
            veilOfPrivacy.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT, SpellTraditions.PRIMAL));
            veilOfPrivacy.setSpellCastAmount(10);
            veilOfPrivacy.setSpellCastUnits("minute");
            veilOfPrivacy.setSpellRange(0);
            veilOfPrivacy.setSpellTargets("1 creature or object");
            veilOfPrivacy.setSpellDuration("8 hours");

            Spell visionOfDeath = new Spell("Vision of Death", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, deathTrait, emotionTrait, fearTrait, manipulateTrait, mentalTrait), "You force the target to see a vision of its own death.");
            visionOfDeath.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            visionOfDeath.setSpellRange(120);
            visionOfDeath.setSpellTargets("1 living creature");
            visionOfDeath.setSpellDefense("Will");

            Spell voidWarp = new Spell("Void Warp", 1, SpellType.CANTRIP, ActionType.TWO_ACTIONS, Set.of(cantripTrait, concentrateTrait, manipulateTrait, voidTrait), "You call upon the Void to harm life force.");
            voidWarp.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.OCCULT));
            voidWarp.setSpellRange(30);
            voidWarp.setSpellTargets("1 living creature");
            voidWarp.setSpellDefense("basic Fortitude");

            Spell wallOfFire = new Spell("Wall of Fire", 4, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, fireTrait, manipulateTrait), "You raise a blazing wall that burns creatures passing through it.");
            wallOfFire.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            wallOfFire.setSpellRange(120);
            wallOfFire.setSpellDuration("1 minute");

            Spell wallOfForce = new Spell("Wall of Force", 6, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, forceTrait, manipulateTrait), "You form an invisible wall of pure magical force up to 50 feet long and up to 20 feet high.");
            wallOfForce.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            wallOfForce.setSpellRange(30);
            wallOfForce.setSpellDuration("1 minute");

            Spell wallOfStone = new Spell("Wall of Stone", 5, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, earthTrait, manipulateTrait), "You shape a wall of solid stone.");
            wallOfStone.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            wallOfStone.setSpellRange(120);

            Spell wallOfThorns = new Spell("Wall of Thorns", 3, SpellType.SPELL, ActionType.THREE_ACTIONS, Set.of(concentrateTrait, manipulateTrait, plantTrait, woodTrait), "You grow a wall of thorny brambles from the ground.");
            wallOfThorns.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            wallOfThorns.setSpellRange(60);
            wallOfThorns.setSpellDuration("1 minute");

            Spell warpMind = new Spell("Warp Mind", 7, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, emotionTrait, incapactitationTrait, manipulateTrait, mentalTrait), "You scramble a creature's mental faculties and sensory input.");
            warpMind.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.OCCULT));
            warpMind.setSpellRange(120);
            warpMind.setSpellTargets("1 creature");
            warpMind.setSpellDefense("Will");

            Spell waterWalk = new Spell("Water Walk", 2, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait, waterTrait), "The target can walk on the surface of water and other liquids without falling through. It can go underwater if it wishes, but in that case it must Swim normally. This spell doesn't grant the ability to breathe underwater.");
            waterWalk.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.DIVINE, SpellTraditions.PRIMAL));
            waterWalk.setSpellRange(0);
            waterWalk.setSpellTargets("1 creature");
            waterWalk.setSpellDuration("10 minutes");

            Spell weaponStorm = new Spell("Weapon Storm", 4, SpellType.SPELL, ActionType.TWO_ACTIONS, Set.of(concentrateTrait, manipulateTrait), "You swing a weapon you're holding, and the weapon magically multiplies into duplicates that swipe at all creatures in either a cone or an emanation.");
            weaponStorm.setSpellTraditions(List.of(SpellTraditions.ARCANE, SpellTraditions.PRIMAL));
            weaponStorm.setSpellArea(30);
            weaponStorm.setSpellAreaType("cone");
            weaponStorm.setSpellDefense("Reflex");

            spellRepo.saveAll(List.of(
                    acidGrip, airBubble, allegro, aqueousOrb, arcticRift, bane, banishment, bindUndead, blazingBolt,
                    blessedBoundary, bloodVendetta, bloodWard, cataclysm, chainLightning, charmingPush, chillingDarkness,
                    command, communityRestoration, contingency, cozyCabin, curseOfDeath, cursedMetamorphosis, darkness,
                    daze, desiccate, disappearance, disguiseMagic, dispelMagic, dispellingGlobe, divineDecree,
                    dreamMessage, duplicateFoe, earthquake, earthworks, eclipseBurst, elementalForm, energyAbsorption,
                    energyAegis, fallingStars, feetToFins, fieryBody, figment, forceBolt, foresight, fortifySummoning,
                    gougingClaw, grimTendrils, harm, heal, holyLight, howlingBlizzard, humanoidForm, hydraulicPush,
                    illusoryCreature, illusoryScene, impalingSpike, interplanarTeleport, invisibilityCloak,
                    invokeSpirits, liminalDoorway, massacre, message, metamorphosis, mindReading, mist, monstrosityForm,
                    mysticArmor, neverMind, pestForm, petrify, phantasmagoria, phantasmalCalamity, phantasmalMinionSpell,
                    pinpoint, planarSeal, prestidigitation, projectImage, protectiveWards, pummelingRubble, readAura,
                    repulsion, resistEnergy, retrocognition, revealingLight, runeOfObservation, runicBody, runicWeapon,
                    safePassage, scrambleBody, seeTheUnseen, sending, shieldSpell, shiftingForm, sigil, spellwrack,
                    spiralOfHorrors, summonConstruct, summonUndead, tangleVine, telekineticHand, telekineticProjectile,
                    teleport, toxicCloud, translate, truespeech, trueTarget, uncontrollableDance, unfetteredMovement,
                    unrelentingObservation, vampiricExsanguination, vampiricFeast, vaporForm, veilOfPrivacy, voidWarp,
                    wallOfStone, waterWalk));

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
                    new WeaponTraitEntry(nonlethalTrait, null, null, null),
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
                    new WeaponTraitEntry(nonlethalTrait, null, null, null),
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
                    new WeaponTraitEntry(nonlethalTrait, null, null, null),
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
                    new WeaponTraitEntry(nonlethalTrait, null, null, null),
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

            List<AttributeName> allSix = List.of(AttributeName.STRENGTH, AttributeName.DEXTERITY, AttributeName.CONSTITUTION, AttributeName.INTELLIGENCE, AttributeName.WISDOM, AttributeName.CHARISMA);

            Deity abadar = new Deity("Abadar", List.of(crossbow), List.of(society), List.of(AttributeName.CONSTITUTION, AttributeName.INTELLIGENCE), Set.of(harm, heal), SanctificationType.CAN_CHOOSE);
            abadar.setSanctificationTraits(Set.of(holyTrait, unholyTrait));
            abadar.setClericSpells(List.of(illusoryObject, creation, planarPalace));
            illusoryObject.setDeities(List.of(abadar));
            planarPalace.setDeities(List.of(abadar));
            Deity asmodeus = new Deity("Asmodeus", List.of(mace), List.of(deception), allSix, Set.of(harm), SanctificationType.MUST_CHOOSE);
            asmodeus.setSanctificationTraits(Set.of(unholyTrait));
            asmodeus.setClericSpells(List.of(charm, suggestion, mislead));
            suggestion.setDeities(List.of(asmodeus));
            Deity calistria = new Deity("Calistria", List.of(whip), List.of(deception), List.of(AttributeName.DEXTERITY, AttributeName.CHARISMA), Set.of(harm, heal), SanctificationType.CAN_CHOOSE);
            calistria.setSanctificationTraits(Set.of(holyTrait, unholyTrait));
            calistria.setClericSpells(List.of(charm, enthrall, mislead));
            charm.setDeities(List.of(asmodeus, calistria));
            mislead.setDeities(List.of(asmodeus, calistria));
            Deity caydenCailean = new Deity("Cayden Cailean", List.of(rapier), List.of(athletics), List.of(AttributeName.CONSTITUTION, AttributeName.CHARISMA), Set.of(heal), SanctificationType.CAN_CHOOSE);
            caydenCailean.setSanctificationTraits(Set.of(holyTrait));
            caydenCailean.setClericSpells(List.of(fleetStep, stupefy, hallucination));
            fleetStep.setDeities(List.of(caydenCailean));
            stupefy.setDeities(List.of(caydenCailean));
            hallucination.setDeities(List.of(caydenCailean));
            Deity desna = new Deity("Desna", List.of(starknife), List.of(acrobatics), List.of(AttributeName.DEXTERITY, AttributeName.CHARISMA), Set.of(heal), SanctificationType.CAN_CHOOSE);
            desna.setSanctificationTraits(Set.of(holyTrait));
            desna.setClericSpells(List.of(sleep, translocate, dreamingPotential));
            sleep.setDeities(List.of(desna));
            translocate.setDeities(List.of(desna));
            dreamingPotential.setDeities(List.of(desna));
            Deity erastil = new Deity("Erastil", List.of(longbow), List.of(survival), List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), Set.of(heal), SanctificationType.CAN_CHOOSE);
            erastil.setSanctificationTraits(Set.of(holyTrait));
            erastil.setClericSpells(List.of(sureStrike, wallOfThorns, naturesPathway));
            naturesPathway.setDeities(List.of(erastil));
            Deity gorum = new Deity("Gorum", List.of(greatsword), List.of(athletics), List.of(AttributeName.STRENGTH, AttributeName.CONSTITUTION), Set.of(harm, heal), SanctificationType.CAN_CHOOSE);
            gorum.setSanctificationTraits(Set.of(holyTrait, unholyTrait));
            gorum.setClericSpells(List.of(sureStrike, enlarge, weaponStorm));
            weaponStorm.setDeities(List.of(gorum));
            Deity gozreh = new Deity("Gozreh", List.of(trident), List.of(survival), List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), Set.of(heal), SanctificationType.NONE);
            gozreh.setClericSpells(List.of(gustOfWind, lightningBolt, controlWater));
            gustOfWind.setDeities(List.of(gozreh));
            lightningBolt.setDeities(List.of(gozreh));
            controlWater.setDeities(List.of(gozreh));
            Deity greenFaith = new Deity("Green Faith", List.of(sickle, claw), List.of(nature), List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), Set.of(heal), SanctificationType.CAN_CHOOSE);
            greenFaith.setSanctificationTraits(Set.of(holyTrait));
            greenFaith.setClericSpells(List.of(summonAnimal, speakWithAnimals, wallOfThorns));
            summonAnimal.setDeities(List.of(greenFaith));
            speakWithAnimals.setDeities(List.of(greenFaith));
            Deity iomedae = new Deity("Iomedae", List.of(longsword), List.of(intimidation), List.of(AttributeName.STRENGTH, AttributeName.CONSTITUTION), Set.of(heal), SanctificationType.MUST_CHOOSE);
            iomedae.setSanctificationTraits(Set.of(holyTrait));
            iomedae.setClericSpells(List.of(sureStrike, enlarge, fireShield));
            sureStrike.setDeities(List.of(erastil, gorum, iomedae));
            fireShield.setDeities(List.of(iomedae));
            Deity irori = new Deity("Irori", List.of(fist), List.of(athletics), List.of(AttributeName.INTELLIGENCE, AttributeName.WISDOM), Set.of(harm, heal), SanctificationType.CAN_CHOOSE);
            irori.setSanctificationTraits(Set.of(holyTrait, unholyTrait));
            irori.setClericSpells(List.of(jump, haste, mountainResilience));
            jump.setDeities(List.of(irori));
            haste.setDeities(List.of(irori));
            mountainResilience.setDeities(List.of(irori));
            Deity lamashtu = new Deity("Lamashtu", List.of(falchion), List.of(survival), List.of(AttributeName.STRENGTH, AttributeName.CONSTITUTION), Set.of(harm, heal), SanctificationType.CAN_CHOOSE);
            lamashtu.setSanctificationTraits(Set.of(unholyTrait));
            lamashtu.setClericSpells(List.of(spiderSting, animalForm, nightmare));
            spiderSting.setDeities(List.of(lamashtu));
            animalForm.setDeities(List.of(lamashtu));
            nightmare.setDeities(List.of(lamashtu));
            Deity nethys = new Deity("Nethys", List.of(staff), List.of(arcana), List.of(AttributeName.INTELLIGENCE, AttributeName.WISDOM), Set.of(harm, heal), SanctificationType.CAN_CHOOSE);
            nethys.setSanctificationTraits(Set.of(holyTrait, unholyTrait));
            nethys.setClericSpells(List.of(forceBarrage, embedMessage, levitate, flicker, telekineticHaul, wallOfForce, warpMind, quandary, detonateMagic));
            forceBarrage.setDeities(List.of(nethys));
            embedMessage.setDeities(List.of(nethys));
            levitate.setDeities(List.of(nethys));
            flicker.setDeities(List.of(nethys));
            telekineticHaul.setDeities(List.of(nethys));
            wallOfForce.setDeities(List.of(nethys));
            warpMind.setDeities(List.of(nethys));
            quandary.setDeities(List.of(nethys));
            detonateMagic.setDeities(List.of(nethys));
            Deity norgorber = new Deity("Norgorber", List.of(shortsword), List.of(stealth), List.of(AttributeName.DEXTERITY, AttributeName.INTELLIGENCE), Set.of(harm), SanctificationType.CAN_CHOOSE);
            norgorber.setSanctificationTraits(Set.of(unholyTrait));
            norgorber.setClericSpells(List.of(illusoryDisguise, invisibility, visionOfDeath));
            illusoryDisguise.setDeities(List.of(norgorber));
            invisibility.setDeities(List.of(norgorber));
            Deity pharasma = new Deity("Pharasma", List.of(dagger), List.of(medicine), List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), Set.of(heal), SanctificationType.NONE);
            pharasma.setClericSpells(List.of(mindlink, ghostlyWeapon, visionOfDeath));
            ghostlyWeapon.setDeities(List.of(pharasma));
            visionOfDeath.setDeities(List.of(norgorber, pharasma));
            Deity rovagug = new Deity("Rovagug", List.of(greataxe), List.of(athletics), List.of(AttributeName.STRENGTH, AttributeName.CONSTITUTION), Set.of(harm), SanctificationType.MUST_CHOOSE);
            rovagug.setSanctificationTraits(Set.of(unholyTrait));
            rovagug.setClericSpells(List.of(breatheFire, enlarge, disintegrate));
            enlarge.setDeities(List.of(gorum, iomedae, rovagug));
            disintegrate.setDeities(List.of(rovagug));
            Deity sarenrae = new Deity("Sarenrae", List.of(scimitar), List.of(medicine), List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), Set.of(heal), SanctificationType.CAN_CHOOSE);
            sarenrae.setSanctificationTraits(Set.of(holyTrait));
            sarenrae.setClericSpells(List.of(breatheFire, fireball, wallOfFire));
            breatheFire.setDeities(List.of(rovagug, sarenrae));
            fireball.setDeities(List.of(sarenrae));
            wallOfFire.setDeities(List.of(sarenrae));
            Deity shelyn = new Deity("Shelyn", List.of(glaive), List.of(crafting, performance), List.of(AttributeName.WISDOM, AttributeName.CHARISMA), Set.of(heal), SanctificationType.CAN_CHOOSE);
            shelyn.setSanctificationTraits(Set.of(holyTrait));
            shelyn.setClericSpells(List.of(dizzyingColors, enthrall, creation));
            dizzyingColors.setDeities(List.of(shelyn));
            enthrall.setDeities(List.of(calistria, shelyn));
            Deity torag = new Deity("Torag", List.of(warhammer), List.of(crafting), List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), Set.of(heal), SanctificationType.CAN_CHOOSE);
            torag.setSanctificationTraits(Set.of(holyTrait));
            torag.setClericSpells(List.of(mindlink, earthbind, creation));
            mindlink.setDeities(List.of(pharasma, torag));
            earthbind.setDeities(List.of(torag));
            creation.setDeities(List.of(abadar, shelyn, torag));
            Deity urgathoa = new Deity("Urgathoa", List.of(scythe), List.of(intimidation), List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), Set.of(harm), SanctificationType.MUST_CHOOSE);
            urgathoa.setSanctificationTraits(Set.of(unholyTrait));
            urgathoa.setClericSpells(List.of(goblinPox, falseVitality, maskOfTerror));
            goblinPox.setDeities(List.of(urgathoa));
            falseVitality.setDeities(List.of(urgathoa));
            maskOfTerror.setDeities(List.of(urgathoa));
            Deity zonKuthon = new Deity("Zon-Kuthon", List.of(spikedChain), List.of(intimidation), List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), Set.of(harm), SanctificationType.CAN_CHOOSE);
            zonKuthon.setSanctificationTraits(Set.of(unholyTrait));
            zonKuthon.setClericSpells(List.of(phantomPain, wallOfThorns, umbralJourney));
            phantomPain.setDeities(List.of(zonKuthon));
            wallOfThorns.setDeities(List.of(erastil, greenFaith, zonKuthon));
            umbralJourney.setDeities(List.of(zonKuthon));

            Spell pushingGust = new Spell("Pushing Gust", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(airTrait, clericTrait, concentrateTrait, focusTrait, manipulateTrait), "Giving the air a push, you buffet the target with a powerful gust of wind; it must attempt a Fortitude save.");
            pushingGust.setSpellRange(500);
            pushingGust.setSpellTargets("1 creature");
            pushingGust.setSpellDefense("Fortitude");

            Spell disperseIntoAir = new Spell("Disperse into Air", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(airTrait, clericTrait, focusTrait, manipulateTrait, polymorphTrait), "After taking the triggering damage, you transform into air.");
            disperseIntoAir.setSpellTrigger("You take damage from an enemy or a hazard");

            Spell igniteAmbition = new Spell("Ignite Ambition", 1, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, concentrateTrait, emotionTrait, focusTrait, mentalTrait, subtleTrait), "You strengthen the target's ambition, increase its resentment of its allies, and make its allegiances more susceptible to change.");
            igniteAmbition.setSpellTrigger("You or an ally in range attempt to use a mental effect to convince a creature to do something (such as a Coerce, Request, or a suggestion spell)");
            igniteAmbition.setSpellRange(60);
            igniteAmbition.setSpellTargets("one creature being influenced");
            igniteAmbition.setSpellDefense("Will");

            Spell competitiveEdge = new Spell("Competitive Edge", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, concentrateTrait, emotionTrait, focusTrait, mentalTrait), "Your competitiveness drives you to prove yourself against the opposition.");
            competitiveEdge.setSpellDuration("sustained up to 1 minute");

            Spell faceInTheCrowd = new Spell("Face in the Crowd", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait, visualTrait), "While in a crowd of roughly similar creatures, your appearance becomes bland and nondescript.");
            faceInTheCrowd.setSpellDuration("1 minute");

            Spell pulseOfCivilization = new Spell("Pulse of Civilization", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait, scryingTrait), "You tap into the zeitgeist of any settlements in range.");
            pulseOfCivilization.setSpellRange(132000);
            pulseOfCivilization.setSpellDuration("8 hours");

            Spell veilOfConfidence = new Spell("Veil of Confidence", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, concentrateTrait, focusTrait, mentalTrait), "You surround yourself in confidence.");
            veilOfConfidence.setSpellDuration("1 minute");

            Spell delusionalPride = new Spell("Delusional Pride", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, emotionTrait, focusTrait, manipulateTrait, mentalTrait), "You make the target overconfident, leading it to ascribe failure to external factors.");
            delusionalPride.setSpellRange(30);
            delusionalPride.setSpellTargets("1 creature");
            delusionalPride.setSpellDefense("Will");
            delusionalPride.setSpellDuration("varies");

            Spell creativeSplash = new Spell("Creative Splash", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, illusionTrait, manipulateTrait, visualTrait), "A deluge of paint or colorful illusions descend on the area, reflecting your personal creative specialty.");
            creativeSplash.setSpellRange(30);
            creativeSplash.setSpellArea(5);
            creativeSplash.setSpellAreaType("burst");
            creativeSplash.setSpellDefense("Will");
            creativeSplash.setSpellDuration("varies");

            Spell artisticFlourish = new Spell("Artistic Flourish", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait), "You transform the target into a form that more closes matches your creative vision.");
            artisticFlourish.setSpellRange(15);
            artisticFlourish.setSpellTargets("1 item or work of art that fits entirely within the range");
            artisticFlourish.setSpellDuration("10 minutes");

            Spell cloakOfShadow = new Spell("Cloak of Shadow", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(auraTrait, clericTrait, darknessTrait, focusTrait, manipulateTrait, shadowTrait), "You drape the target in a mantle of swirling shadows that make it harder to see.");
            cloakOfShadow.setSpellRange(0);
            cloakOfShadow.setSpellTargets("1 willing creature");
            cloakOfShadow.setSpellDuration("1 minute");

            Spell darkenedSight = new Spell("Darkened Sight", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, darknessTrait, focusTrait, manipulateTrait), "You infuse a creature's vision with darkness.");
            darkenedSight.setSpellRange(60);
            darkenedSight.setSpellTargets("1 creature");
            darkenedSight.setSpellDuration("1 minute");

            Spell deathsCall = new Spell("Death's Call", 1, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, concentrateTrait, focusTrait), "Seeing another pass from this world invigorates you.");
            deathsCall.setSpellTrigger("A living creature within 20 feet of you dies, or an undead creature within 20 feet of you is destroyed");
            deathsCall.setSpellDuration("1 minute");

            Spell eradicateUndeath = new Spell("Eradicate Undeath", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait, vitalityTrait), "A massive deluge of life energy causes the undead to fall apart.");
            eradicateUndeath.setSpellArea(30);
            eradicateUndeath.setSpellAreaType("cone");
            eradicateUndeath.setSpellDefense("basic Fortitude");

            Spell cryOfDestruction = new Spell("Cry of Destruction", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait, sonicTrait), "Your voice booms, smashing what's in front of you.");
            cryOfDestruction.setSpellArea(15);
            cryOfDestruction.setSpellAreaType("cone");
            cryOfDestruction.setSpellDefense("basic Fortitude");

            Spell destructiveAura = new Spell("Destructive Aure", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(auraTrait, clericTrait, concentrateTrait, focusTrait, manipulateTrait), "Swirling sands of divine devastation surround you, weakening the defenses of all they touch.");
            destructiveAura.setSpellArea(15);
            destructiveAura.setSpellAreaType("emanation");
            destructiveAura.setSpellDuration("1 minute");

            Spell sweetDream = new Spell("Sweet Dream", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(auditoryTrait, clericTrait, concentrateTrait, focusTrait, linguisticTrait, manipulateTrait, mentalTrait, sleepTrait), "With soothing words, you lull the target into an enchanting dream.");
            sweetDream.setSpellRange(30);
            sweetDream.setSpellTargets("1 willing creature");
            sweetDream.setSpellDuration("1 hour");

            Spell dreamersCall = new Spell("Dreamer's Call", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, illusionTrait, incapactitationTrait, manipulateTrait, mentalTrait), "You create a vivid, illusory daydream drawn from the images of the target's dreams.");
            dreamersCall.setSpellRange(30);
            dreamersCall.setSpellTargets("1 creature");
            dreamersCall.setSpellDefense("Will");
            dreamersCall.setSpellDuration("until the end of the target's next turn");

            Spell hurtlingStone = new Spell("Hurtling Stone", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(attackTrait, clericTrait, earthTrait, focusTrait, manipulateTrait), "You evoke a magical stone and throw it, with divine guide to your aim.");
            hurtlingStone.setSpellRange(60);
            hurtlingStone.setSpellTargets("1 creature");
            hurtlingStone.setSpellDefense("AC");

            Spell localizedQuake = new Spell("Localized Quake", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, earthTrait, focusTrait, manipulateTrait), "You shake the earth, toppling nearby creatures.");
            localizedQuake.setSpellArea(15);
            localizedQuake.setSpellAreaType("emanation or cone");
            localizedQuake.setSpellDefense("basic Reflex");

            Spell soothingWords = new Spell("Soothing Words", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, concentrateTrait, emotionTrait, focusTrait, mentalTrait), "You attempt to calm the target by uttering soothing words in a calm and even tone.");
            soothingWords.setSpellRange(30);
            soothingWords.setSpellTargets("1 ally");
            soothingWords.setSpellDuration("1 minute");

            Spell unity = new Spell("Unity", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, concentrateTrait, focusTrait, fortuneTrait), "You put up a united defense.");
            unity.setSpellTrigger("You and 1 or more allies within range are targeted by a spell or ability that allows a saving throw");
            unity.setSpellRange(30);
            unity.setSpellTargets("each ally targeted by the triggering spell");

            Spell readFate = new Spell("Read Fate", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait, predictionTrait), "You attempt to learn more about the target's fate in the short term, usually within the next day for most prosaic creatures, or the next hour or less for someone likely to have multiple rapid experiences, such as someone actively adventuring.");
            readFate.setSpellRange(30);
            readFate.setSpellTargets("1 creature other than you");

            Spell temptFate = new Spell("Tempt Fate", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, focusTrait, fortuneTrait, manipulateTrait), "You twist the forces of fate to make a moment dire or uneventful, with no in-between.");
            temptFate.setSpellTrigger("You or an ally within range attempts a saving throw");
            temptFate.setSpellRange(120);
            temptFate.setSpellTargets("the triggering creature");

            Spell fireRay = new Spell("Fire Ray", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(attackTrait, clericTrait, concentrateTrait, fireTrait, focusTrait, manipulateTrait), "A blazing band of fire arcs through the air, lighting your opponent and the ground they stand upon on fire.");
            fireRay.setSpellRange(60);
            fireRay.setSpellTargets("1 creature");
            fireRay.setSpellDefense("AC");
            fireRay.setSpellDuration("until the end of the target's next turn");

            Spell flameBarrier = new Spell("Flame Barrier", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, concentrateTrait, focusTrait), "You swiftly deflect incoming flames.");
            flameBarrier.setSpellTrigger("An effect would deal fire damage to you or an ally within range");
            flameBarrier.setSpellRange(60);
            flameBarrier.setSpellTargets("one creature that would take fire damage from the triggering effect");

            Spell unimpededStride = new Spell("Unimpeded Stride", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait), "Divine grace ensure that nothing can keep you prisoner or hold you back.");

            Spell wordOfFreedom = new Spell("Word of Freedom", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, concentrateTrait, focusTrait, mentalTrait), "You utter a liberating word of power that frees a creature.");
            wordOfFreedom.setSpellRange(30);
            wordOfFreedom.setSpellTargets("1 creature");
            wordOfFreedom.setSpellDuration("1 round");

            Spell healersBlessing = new Spell("Healer's Blessing", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, concentrateTrait, focusTrait), "Your words bless a creature with an enhanced connection to vital energy.");
            healersBlessing.setSpellRange(30);
            healersBlessing.setSpellTargets("1 willing living creature");
            healersBlessing.setSpellDuration("1 minute");

            Spell rebukeDeath = new Spell("Rebuke Death", 4, SpellType.FOCUS, ActionType.ONE_TO_THREE_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, healingTrait, manipulateTrait, vitalityTrait), "You snatch creatures from the jaws of death, restoring them without the strain of a typical close call.");
            rebukeDeath.setSpellArea(20);
            rebukeDeath.setSpellAreaType("emanation");
            rebukeDeath.setSpellTargets("1 living creature per action spent to Cast this spell");

            Spell overstuff = new Spell("Overstuff", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait), "Huge amounts of food and drink fill the target.");
            overstuff.setSpellRange(30);
            overstuff.setSpellTargets("1 living creature");
            overstuff.setSpellDefense("Fortitude");

            Spell takeItsCourse = new Spell("Take its Course", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, fortuneTrait), "When someone has overindulged, you can hasten them past the worst of their affliction or intensify their misery.");
            takeItsCourse.setSpellRange(0);
            takeItsCourse.setSpellTargets("1 creature");
            takeItsCourse.setSpellDefense("Will");

            Spell scholarlyRecollection = new Spell("Scholarly Recollection", 1, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, focusTrait, fortuneTrait), "Speaking a short prayer as you gather your thoughts, you're blessed to find yourself pointed in the right direction.");
            scholarlyRecollection.setSpellTrigger("You attempt a Perception check to Seek, or you attempt a skill check to Recall Knowledge with a skill you’re trained in");

            Spell knowTheEnemy = new Spell("Know the Enemy", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, focusTrait, fortuneTrait, manipulateTrait), "You quickly remind yourself of useful information.");
            knowTheEnemy.setSpellTrigger("You roll initiative and can see a creature, you succeed at an attack roll against a creature, or a creature fails a saving throw against one of your spells");

            Spell bitOfLuck = new Spell("Bit of Luck", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, fortuneTrait, manipulateTrait), "You tilt the scales of luck slightly to protect a creature from disaster.");
            bitOfLuck.setSpellRange(30);
            bitOfLuck.setSpellTargets("1 willing creature");
            bitOfLuck.setSpellDuration("1 minute");

            Spell luckyBreak = new Spell("Lucky Break", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, concentrateTrait, focusTrait, fortuneTrait), "Reroll the saving throw and use the better result. You then become temporarily immune for 10 minutes.");
            luckyBreak.setSpellTrigger("You fail, but don’t critically fail, a saving throw");

            Spell magicsVessel = new Spell("Magic's Vessel", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait), "A creature becomes a divine receptacle for pure magical energy.");
            magicsVessel.setSpellRange(0);
            magicsVessel.setSpellTargets("1 creature");
            magicsVessel.setSpellDuration("sustained up to 1 minute");

            Spell mysticBeacon = new Spell("Mystic Beacon", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait), "The next damaging or healing spell the target casts before the start of your next turn deals damage or restores Hit Points as if the spell were heightened 1 rank higher than its actual rank. This applies only to initial healing or damage when the spell is cast, not any ongoing effects. The spell otherwise functions at its actual rank. Once the target casts the spell, mystic beacon ends.");
            mysticBeacon.setSpellRange(30);
            mysticBeacon.setSpellTargets("1 willing creature");
            mysticBeacon.setSpellDuration("until the start of your next turn");

            Spell athleticRush = new Spell("Athletic Rush", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait), "Your body fills with physical power and skill.");
            athleticRush.setSpellDuration("1 round");

            Spell enduringMight = new Spell("Enduring Might", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, focusTrait, manipulateTrait), "Your own might mingles with divine power to protect you from harm.");
            enduringMight.setSpellTrigger("An attack or effect would deal damage to you");

            Spell moonbeam = new Spell("Moonbeam", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(attackTrait, clericTrait, concentrateTrait, fireTrait, focusTrait, lightTrait, manipulateTrait), "You shine a ray of moonlight.");
            moonbeam.setSpellRange(120);
            moonbeam.setSpellTargets("1 creature");
            moonbeam.setSpellDefense("AC");

            Spell touchOfTheMoon = new Spell("Touch of the Moon", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, lightTrait, manipulateTrait), "When you touch the target, a symbol of the moon appears on its forehead, glowing with soft moonlight.");
            touchOfTheMoon.setSpellRange(0);
            touchOfTheMoon.setSpellTargets("1 creature");
            touchOfTheMoon.setSpellDuration("1 minute");

            Spell vibrantThorns = new Spell("Vibrant Thorns", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait, morphTrait, plantTrait, woodTrait), "Your body sprouts brambly thorns that thrive on life magic.");
            vibrantThorns.setSpellDuration("1 minute");

            Spell naturesBounty = new Spell("Nature's Bounty", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait, plantTrait, vitalityTrait), "A palm-sized raw fruit or vegetable of your choice appears in your open hand.");
            naturesBounty.setSpellRequirement("You have a free hand");

            Spell wakingNightmare = new Spell("Waking Nightmare", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, emotionTrait, fearTrait, focusTrait, manipulateTrait, mentalTrait), "You fill the creature's mind with a terrifying vision.");
            wakingNightmare.setSpellRange(30);
            wakingNightmare.setSpellTargets("1 creature");
            wakingNightmare.setSpellDefense("Will");
            wakingNightmare.setSpellDuration("varies");

            Spell sharedNightmare = new Spell("Shared Nightmare", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, emotionTrait, focusTrait, incapactitationTrait, manipulateTrait, mentalTrait), "Merging minds with the target, you swap distressing visions.");
            sharedNightmare.setSpellRange(30);
            sharedNightmare.setSpellTargets("1 creature");
            sharedNightmare.setSpellDefense("Will");
            sharedNightmare.setSpellDuration("varies");

            Spell savorTheSting = new Spell("Savor the Sting", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait, mentalTrait, nonlethalTrait), "You inflict pain upon the target and revel in their anguish.");
            savorTheSting.setSpellRange(0);
            savorTheSting.setSpellTargets("1 creature");
            savorTheSting.setSpellDefense("Will");

            Spell retributivePain = new Spell("Retributive Pain", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, focusTrait, manipulateTrait, mentalTrait, nonlethalTrait), "You vengefully reflect your pain upon your tormentor.");
            retributivePain.setSpellTrigger("A creature in range damages you");
            retributivePain.setSpellRange(30);
            retributivePain.setSpellTargets("the triggering creature");
            retributivePain.setSpellDefense("basic Fortitude");

            Spell charmingTouch = new Spell("Charming Touch", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, emotionTrait, focusTrait, incapactitationTrait, manipulateTrait, mentalTrait, subtleTrait), "You infuse your target with attraction, causing it to act friendlier toward you.");
            charmingTouch.setSpellRange(0);
            charmingTouch.setSpellTargets("1 creature that could find you attractive");
            charmingTouch.setSpellDefense("Will");
            charmingTouch.setSpellDuration("10 minutes");

            Spell captivatingAdoration = new Spell("Captivating Adoration", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(auraTrait, clericTrait, concentrateTrait, emotionTrait, focusTrait, manipulateTrait, mentalTrait, visualTrait), "You become intensely entrancing, and creatures are distracted by you as long as they remain within the area.");
            captivatingAdoration.setSpellArea(15);
            captivatingAdoration.setSpellAreaType("emanation");
            captivatingAdoration.setSpellDefense("Will");
            captivatingAdoration.setSpellDuration("1 minute");

            Spell perfectedMind = new Spell("Perfected Mind", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, concentrateTrait, focusTrait), "You meditate upon perfection to remove all distractions from your mind.");

            Spell perfectedBody = new Spell("Perfected Body", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, concentrateTrait, focusTrait), "Your body's perfection keeps you just a little bit healthier than most.");
            perfectedBody.setSpellTrigger("You fail or critically fail a saving throw against an effect that has the morph, poison, or polymorph trait, or that would make you clumsy, doomed, enfeebled, petrified, or sickened");

            Spell protectorsSacrifice = new Spell("Protector's Sacrifice", 1, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, focusTrait, manipulateTrait), "You protect your ally by suffering in their stead.");
            protectorsSacrifice.setSpellTrigger("An ally within 30 feet takes damage");
            protectorsSacrifice.setSpellRange(30);

            Spell protectorsSphere = new Spell("Protector's Sphere", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(auraTrait, clericTrait, concentrateTrait, focusTrait, manipulateTrait), "A protective aura emanates out from you, safeguarding you and your allies.");
            protectorsSphere.setSpellArea(15);
            protectorsSphere.setSpellAreaType("emanation");
            protectorsSphere.setSpellDuration("sustained up to 1 minute");

            Spell whisperingQuiet= new Spell("Whispering Quiet", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, focusTrait, manipulateTrait, sonicTrait), "You suppress sound in an area, preventing anyone from giving away valuable secrets.");
            whisperingQuiet.setSpellRange(60);
            whisperingQuiet.setSpellArea(15);
            whisperingQuiet.setSpellAreaType("burst");
            whisperingQuiet.setSpellDuration("1 minute");

            Spell safeguardSecret = new Spell("Safeguard Secret", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait, mentalTrait), "You ensure a secret remains safe from prying spies.");
            safeguardSecret.setSpellRange(30);
            safeguardSecret.setSpellTargets("you and any number of willing allies");
            safeguardSecret.setSpellDuration("1 hour");

            Spell dazzlingFlash = new Spell("Dazzling Flash", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, lightTrait, manipulateTrait, visualTrait), "You raise your religious symbol and create a blinding flash of light.");
            dazzlingFlash.setSpellArea(15);
            dazzlingFlash.setSpellAreaType("cone");
            dazzlingFlash.setSpellDefense("Fortitude");

            Spell vitalLuminance = new Spell("Vital Luminance", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(auraTrait, clericTrait, focusTrait, lightTrait, manipulateTrait, vitalityTrait), "Drawing life force into yourself, you become a beacon of vitality.");
            vitalLuminance.setSpellDuration("1 minute");

            Spell travelersTransit = new Spell("Traveler's Transit", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait), "You add power to your muscles, allowing you to swim or climb walls with ease.");
            travelersTransit.setSpellDuration("5 minutes");

            Spell suddenShift = new Spell("Sudden Shift", 1, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, focusTrait, manipulateTrait), "You swiftly move from a dangerous spot and veil yourself.");
            suddenShift.setSpellTrigger("An enemy misses you with a melee attack");
            suddenShift.setSpellDuration("until the end of your next turn");

            Spell trickstersTwin = new Spell("Trickster's Twin", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, illusionTrait, manipulateTrait, visualTrait), "You rarely settle for being in just one place.");
            trickstersTwin.setSpellRange(30);
            trickstersTwin.setSpellTargets("1 creature");
            trickstersTwin.setSpellDefense("Will");
            trickstersTwin.setSpellDuration("1 minute");

            Spell wordOfTruth = new Spell("Word of Truth", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, concentrateTrait, focusTrait), "You speak a statement that you believe to be true and that is free of any attempt to deceive through twisting words, omission, and so on.");
            wordOfTruth.setSpellDuration("sustained up to 1 minute");

            Spell touchOfObedience = new Spell("Touch of Obedience", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait, mentalTrait), "Your imperious touch erodes the target's willpower, making it easier to control.");
            touchOfObedience.setSpellRange(0);
            touchOfObedience.setSpellTargets("1 living creature");
            touchOfObedience.setSpellDefense("Will");
            touchOfObedience.setSpellDuration("varies");

            Spell commandingLash = new Spell("Commanding Lash", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, concentrateTrait, focusTrait, linguisticTrait, manipulateTrait, mentalTrait), "With the threat of more pain, you compel a creature you've recently harmed.");
            commandingLash.setSpellRequirement("Your most recent action dealt damage to a target");
            commandingLash.setSpellRange(100);
            commandingLash.setSpellTargets("a creature you dealt damage to on your most recent action");
            commandingLash.setSpellDefense("Will");
            commandingLash.setSpellDuration("until the end of the target's next turn");

            Spell touchOfUndeath = new Spell("Touch of Undeath", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait, voidTrait), "You attack the target's life force with undeath, dealing 1d6 void damage. The target must attempt a Fortitude save.");
            touchOfUndeath.setSpellRange(0);
            touchOfUndeath.setSpellTargets("1 living creature");
            touchOfUndeath.setSpellDefense("Fortitude");
            touchOfUndeath.setSpellDuration("varies");

            Spell malignantSustenance = new Spell("Malignant Sustenance", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait, voidTrait), "You embed a seed of void energy in an undead creature, restoring its unnatural vigor over time.");
            malignantSustenance.setSpellRange(0);
            malignantSustenance.setSpellTargets("1 willing undead creature");
            malignantSustenance.setSpellDuration("1 minute");

            Spell tidalSurge = new Spell("Tidal Surge", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait, waterTrait), "You call forth a tremendous wave to move the target either in a body of water or on the ground.");
            tidalSurge.setSpellRange(60);
            tidalSurge.setSpellTargets("1 creature");

            Spell downpour = new Spell("Downpour", 4, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, manipulateTrait, waterTrait), "You call forth a torrential downpour, which extinguishes non-magical flames.");
            downpour.setSpellRange(120);
            downpour.setSpellArea(30);
            downpour.setSpellAreaType("burst");
            downpour.setSpellDuration("1 minute");

            Spell appearanceOfWealth = new Spell("Appearance of Wealth", 1, SpellType.FOCUS, ActionType.TWO_ACTIONS, Set.of(clericTrait, concentrateTrait, focusTrait, illusionTrait, manipulateTrait), "You create a brief vision of immense wealth filling the spell's area.");
            appearanceOfWealth.setSpellRange(30);
            appearanceOfWealth.setSpellArea(5);
            appearanceOfWealth.setSpellAreaType("burst");
            appearanceOfWealth.setSpellDefense("Will");
            appearanceOfWealth.setSpellDuration("sustained up to 1 minute");

            Spell preciousMetals = new Spell("Precious Metals", 4, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait, metalTrait), "Your deity blesses base metals to transform them into precious materials.");
            preciousMetals.setSpellRange(0);
            preciousMetals.setSpellTargets("1 metal shield or weapon, 1 suit of metal armor, or up to 1 Bulk of metal material (such as coins or metal-tipped ammunition)");
            preciousMetals.setSpellDuration("1 minute");

            Spell weaponSurge = new Spell("Weapon Surge", 1, SpellType.FOCUS, ActionType.SINGLE_ACTION, Set.of(clericTrait, focusTrait, manipulateTrait, sanctifiedTrait), "Holding your weapon aloft, you fill it with divine energy.");
            weaponSurge.setSpellRange(0);
            weaponSurge.setSpellTargets("1 weapon you're wielding");
            weaponSurge.setSpellDuration("until the start of your next turn");

            Spell zealForBattle = new Spell("Zeal for Battle", 4, SpellType.FOCUS, ActionType.REACTION, Set.of(clericTrait, concentrateTrait, emotionTrait, focusTrait, fortuneTrait, mentalTrait), "You stoke the righteous anger within yourself and an ally.");
            zealForBattle.setSpellTrigger("You and at least 1 ally are about to roll initiative");
            zealForBattle.setSpellRange(10);
            zealForBattle.setSpellTargets("you and the triggering ally");

            Domain airDomain = new Domain("Air", "You can control winds and the weather.", pushingGust, disperseIntoAir);
            pushingGust.setSpellDomain(airDomain);
            disperseIntoAir.setSpellDomain(airDomain);
            airDomain.setDeities(Set.of(gozreh, greenFaith, rovagug));

            Domain ambitionDomain = new Domain("Ambition", "You strive to keep up with and outpace the competition.", igniteAmbition, competitiveEdge);
            igniteAmbition.setSpellDomain(ambitionDomain);
            competitiveEdge.setSpellDomain(ambitionDomain);
            ambitionDomain.setDeities(Set.of(zonKuthon));

            Domain citiesDomain = new Domain("Cities", "You have powers over urban environments and denizens.", faceInTheCrowd, pulseOfCivilization);
            citiesDomain.setDeities(Set.of(abadar, caydenCailean));
            faceInTheCrowd.setSpellDomain(citiesDomain);
            pulseOfCivilization.setSpellDomain(citiesDomain);

            Domain confidenceDomain = new Domain("Confidence", "You overcome your fear and project pride.", veilOfConfidence, delusionalPride);
            confidenceDomain.setDeities(Set.of(asmodeus, gorum, iomedae));
            veilOfConfidence.setSpellDomain(confidenceDomain);
            delusionalPride.setSpellDomain(confidenceDomain);

            Domain creationDomain = new Domain("Creation", "You have divine abilities related to crafting and art.", creativeSplash, artisticFlourish);
            creationDomain.setDeities(Set.of(shelyn, torag));
            creativeSplash.setSpellDomain(creationDomain);
            artisticFlourish.setSpellDomain(creationDomain);

            Domain darknessDomain = new Domain("Darkness", "You operate in the darkness and take away the light.", cloakOfShadow, darkenedSight);
            darknessDomain.setDeities(Set.of(zonKuthon));
            cloakOfShadow.setSpellDomain(darknessDomain);
            darkenedSight.setSpellDomain(darknessDomain);

            Domain deathDomain = new Domain("Death", "You have the power to end lives and destroy undead.", deathsCall, eradicateUndeath);
            deathDomain.setDeities(Set.of(norgorber, pharasma));
            deathsCall.setSpellDomain(deathDomain);
            eradicateUndeath.setSpellDomain(deathDomain);

            Domain destructionDomain = new Domain("Destruction", "You are a conduit for divine devastation.", cryOfDestruction, destructiveAura);
            destructionDomain.setDeities(Set.of(gorum, nethys, rovagug, zonKuthon));
            cryOfDestruction.setSpellDomain(destructionDomain);
            destructiveAura.setSpellDomain(destructionDomain);

            Domain dreamsDomain = new Domain("Dreams", "You have the power to enter and manipulate dreams.", sweetDream, dreamersCall);
            dreamsDomain.setDeities(Set.of(desna));
            sweetDream.setSpellDomain(dreamsDomain);
            dreamersCall.setSpellDomain(dreamsDomain);

            Domain earthDomain = new Domain("Earth", "You control soil and stone.", hurtlingStone, localizedQuake);
            earthDomain.setDeities(Set.of(abadar, erastil, greenFaith, rovagug, torag));
            hurtlingStone.setSpellDomain(earthDomain);
            localizedQuake.setSpellDomain(earthDomain);

            Domain familyDomain = new Domain("Family", "You aid and protect your family and community more effectively.", soothingWords, unity);
            familyDomain.setDeities(Set.of(erastil, lamashtu, shelyn, torag));
            soothingWords.setSpellDomain(familyDomain);
            unity.setSpellDomain(familyDomain);

            Domain fateDomain = new Domain("Fate", "You see and understand hidden inevitabilities.", readFate, temptFate);
            fateDomain.setDeities(Set.of(pharasma));
            readFate.setSpellDomain(fateDomain);
            temptFate.setSpellDomain(fateDomain);

            Domain fireDomain = new Domain("Fire", "You control flame.", fireRay, flameBarrier);
            fireDomain.setDeities(Set.of(asmodeus, greenFaith, sarenrae));
            fireRay.setSpellDomain(fireDomain);
            flameBarrier.setSpellDomain(fireDomain);

            Domain freedomDomain = new Domain("Freedom", "You liberate yourself and others from shackles and constraints.", unimpededStride, wordOfFreedom);
            freedomDomain.setDeities(Set.of(caydenCailean));
            unimpededStride.setSpellDomain(freedomDomain);
            wordOfFreedom.setSpellDomain(freedomDomain);

            Domain healingDomain = new Domain("Healing", "Your healing magic is particularly potent.", healersBlessing, rebukeDeath);
            healingDomain.setDeities(Set.of(pharasma, sarenrae));
            healersBlessing.setSpellDomain(healingDomain);
            rebukeDeath.setSpellDomain(healingDomain);

            Domain indulgenceDomain = new Domain("Indulgence", "You feast mightily and can shake off the effects of overindulging.", overstuff, takeItsCourse);
            indulgenceDomain.setDeities(Set.of(caydenCailean, urgathoa));
            overstuff.setSpellDomain(indulgenceDomain);
            takeItsCourse.setSpellDomain(indulgenceDomain);

            Domain knowledgeDomain = new Domain("Knowledge", "You receive divine insights.", scholarlyRecollection, knowTheEnemy);
            knowledgeDomain.setDeities(Set.of(irori, nethys, pharasma));
            scholarlyRecollection.setSpellDomain(knowledgeDomain);
            knowTheEnemy.setSpellDomain(knowledgeDomain);

            Domain luckDomain = new Domain("Luck", "You’re unnaturally lucky and keep out of harm’s way.", bitOfLuck, luckyBreak);
            luckDomain.setDeities(Set.of(desna));
            bitOfLuck.setSpellDomain(luckDomain);
            luckyBreak.setSpellDomain(luckDomain);

            Domain magicDomain = new Domain("Magic", "You perform the unexpected and inexplicable.", magicsVessel, mysticBeacon);
            magicDomain.setDeities(Set.of(nethys, urgathoa));
            magicsVessel.setSpellDomain(magicDomain);
            mysticBeacon.setSpellDomain(magicDomain);

            Domain mightDomain = new Domain("Might", "Your physical power is bolstered by divine strength.", athleticRush, enduringMight);
            mightDomain.setDeities(Set.of(caydenCailean, gorum, iomedae, irori, lamashtu, urgathoa));
            athleticRush.setSpellDomain(mightDomain);
            enduringMight.setSpellDomain(mightDomain);

            Domain moonDomain = new Domain("Moon", "You command powers associated with the moon.", moonbeam, touchOfTheMoon);
            moonDomain.setDeities(Set.of(desna, greenFaith));
            moonbeam.setSpellDomain(moonDomain);
            touchOfTheMoon.setSpellDomain(moonDomain);

            Domain natureDomain = new Domain("Nature", "You hold power over animals and plants.", vibrantThorns, naturesBounty);
            natureDomain.setDeities(Set.of(erastil, gozreh, greenFaith));
            vibrantThorns.setSpellDomain(natureDomain);
            naturesBounty.setSpellDomain(natureDomain);

            Domain nightmaresDomain = new Domain("Nightmares", "You fill minds with horror and dread.", wakingNightmare, sharedNightmare);
            nightmaresDomain.setDeities(Set.of(lamashtu));
            wakingNightmare.setSpellDomain(nightmaresDomain);
            sharedNightmare.setSpellDomain(nightmaresDomain);

            Domain painDomain = new Domain("Pain", "You punish those who displease you with the sharp sting of pain.", savorTheSting, retributivePain);
            painDomain.setDeities(Set.of(calistria, zonKuthon));
            savorTheSting.setSpellDomain(painDomain);
            retributivePain.setSpellDomain(painDomain);

            Domain passionDomain = new Domain("Passion", "You evoke passion, whether as love or lust.", charmingTouch, captivatingAdoration);
            passionDomain.setDeities(Set.of(calistria, shelyn));
            charmingTouch.setSpellDomain(passionDomain);
            captivatingAdoration.setSpellDomain(passionDomain);

            Domain perfectionDomain = new Domain("Perfection", "You strive to perfect your mind, body, and spirit.", perfectedMind, perfectedBody);
            perfectionDomain.setDeities(Set.of(irori));
            perfectedMind.setSpellDomain(perfectionDomain);
            perfectedBody.setSpellDomain(perfectionDomain);

            Domain protectionDomain = new Domain("Protection", "You ward yourself and others.", protectorsSacrifice, protectorsSphere);
            protectionDomain.setDeities(Set.of(nethys, shelyn, torag));
            protectorsSacrifice.setSpellDomain(protectionDomain);
            protectorsSphere.setSpellDomain(protectionDomain);

            Domain secrecyDomain = new Domain("Secrecy", "You protect secrets and keep them hidden.", whisperingQuiet, safeguardSecret);
            secrecyDomain.setDeities(Set.of(calistria, norgorber));
            whisperingQuiet.setSpellDomain(secrecyDomain);
            safeguardSecret.setSpellDomain(secrecyDomain);

            Domain sunDomain = new Domain("Sun", "You harness the power of the sun and other light sources, and punish undead.", dazzlingFlash, vitalLuminance);
            sunDomain.setDeities(Set.of(greenFaith, sarenrae));
            dazzlingFlash.setSpellDomain(sunDomain);
            vitalLuminance.setSpellDomain(sunDomain);

            Domain travelDomain = new Domain("Travel", "You have power over movement and journeys.", agileFeet, travelersTransit);
            travelDomain.setDeities(Set.of(abadar, desna, gozreh));
            agileFeet.setSpellDomain(travelDomain);
            travelersTransit.setSpellDomain(travelDomain);

            Domain trickeryDomain = new Domain("Trickery", "You deceive others and cause mischief.", suddenShift, trickstersTwin);
            trickeryDomain.setDeities(Set.of(asmodeus, calistria, lamashtu, norgorber));
            suddenShift.setSpellDomain(trickeryDomain);
            trickstersTwin.setSpellDomain(trickeryDomain);

            Domain truthDomain = new Domain("Truth", "You pierce lies and discover the truth.", wordOfTruth, glimpseTheTruth);
            truthDomain.setDeities(Set.of(iomedae, irori, sarenrae));
            wordOfTruth.setSpellDomain(truthDomain);
            glimpseTheTruth.setSpellDomain(truthDomain);

            Domain tyrannyDomain = new Domain("Tyranny", "You wield power to rule and enslave others.", touchOfObedience, commandingLash);
            tyrannyDomain.setDeities(Set.of(asmodeus));
            touchOfObedience.setSpellDomain(tyrannyDomain);
            commandingLash.setSpellDomain(tyrannyDomain);

            Domain undeathDomain = new Domain("Undeath", "Your magic carries close ties to the undead.", touchOfUndeath, malignantSustenance);
            undeathDomain.setDeities(Set.of(urgathoa));
            touchOfUndeath.setSpellDomain(undeathDomain);
            malignantSustenance.setSpellDomain(undeathDomain);

            Domain waterDomain = new Domain("Water", "You control water and bodies of water.", tidalSurge, downpour);
            waterDomain.setDeities(Set.of(gozreh, greenFaith));
            tidalSurge.setSpellDomain(waterDomain);
            downpour.setSpellDomain(waterDomain);

            Domain wealthDomain = new Domain("Wealth", "You hold power over wealth, trade, and treasure.", appearanceOfWealth, preciousMetals);
            wealthDomain.setDeities(Set.of(abadar, erastil, norgorber));
            appearanceOfWealth.setSpellDomain(wealthDomain);
            preciousMetals.setSpellDomain(wealthDomain);

            Domain zealDomain = new Domain("Zeal", "Your inner fire increases your combat prowess.", weaponSurge, zealForBattle);
            zealDomain.setDeities(Set.of(gorum, iomedae, rovagug));
            weaponSurge.setSpellDomain(zealDomain);
            zealForBattle.setSpellDomain(zealDomain);

            abadar.setMainDomains(Set.of(citiesDomain, earthDomain, travelDomain, wealthDomain));
            asmodeus.setMainDomains(Set.of(confidenceDomain, fireDomain, trickeryDomain, tyrannyDomain));
            calistria.setMainDomains(Set.of(painDomain, passionDomain, secrecyDomain, trickeryDomain));
            caydenCailean.setMainDomains(Set.of(citiesDomain, freedomDomain, indulgenceDomain, mightDomain));
            desna.setMainDomains(Set.of(dreamsDomain, luckDomain, moonDomain, travelDomain));
            erastil.setMainDomains(Set.of(earthDomain, familyDomain, natureDomain, wealthDomain));
            gorum.setMainDomains(Set.of(confidenceDomain, destructionDomain, mightDomain, zealDomain));
            gozreh.setMainDomains(Set.of(airDomain, natureDomain, travelDomain, waterDomain));
            greenFaith.setMainDomains(Set.of(airDomain, earthDomain, fireDomain, moonDomain, natureDomain, sunDomain, waterDomain));
            iomedae.setMainDomains(Set.of(confidenceDomain, mightDomain, truthDomain, zealDomain));
            irori.setMainDomains(Set.of(knowledgeDomain, mightDomain, perfectionDomain, truthDomain));
            lamashtu.setMainDomains(Set.of(familyDomain, mightDomain, nightmaresDomain, trickeryDomain));
            nethys.setMainDomains(Set.of(destructionDomain, knowledgeDomain, magicDomain, protectionDomain));
            norgorber.setMainDomains(Set.of(deathDomain, secrecyDomain, trickeryDomain, wealthDomain));
            pharasma.setMainDomains(Set.of(deathDomain, fateDomain, healingDomain, knowledgeDomain));
            rovagug.setMainDomains(Set.of(airDomain, destructionDomain, earthDomain, zealDomain));
            sarenrae.setMainDomains(Set.of(fireDomain, healingDomain, sunDomain, truthDomain));
            shelyn.setMainDomains(Set.of(creationDomain, familyDomain, passionDomain, protectionDomain));
            torag.setMainDomains(Set.of(creationDomain, earthDomain, familyDomain, protectionDomain));
            urgathoa.setMainDomains(Set.of(indulgenceDomain, magicDomain, mightDomain, undeathDomain));
            zonKuthon.setMainDomains(Set.of(ambitionDomain, darknessDomain, destructionDomain, painDomain));

            domainRepo.saveAll(List.of(
                    airDomain, ambitionDomain, citiesDomain, confidenceDomain, creationDomain, darknessDomain,
                    deathDomain, destructionDomain, dreamsDomain, earthDomain, familyDomain, fateDomain, fireDomain,
                    freedomDomain, healingDomain, indulgenceDomain, knowledgeDomain, luckDomain, magicDomain,
                    mightDomain, moonDomain, natureDomain, nightmaresDomain, painDomain, passionDomain, perfectionDomain,
                    protectionDomain, secrecyDomain, sunDomain, travelDomain, trickeryDomain, tyrannyDomain,
                    undeathDomain, waterDomain, wealthDomain, zealDomain));
            spellRepo.saveAll(List.of(
                    pushingGust, disperseIntoAir, igniteAmbition, competitiveEdge, faceInTheCrowd, pulseOfCivilization,
                    veilOfConfidence, delusionalPride, creativeSplash, artisticFlourish, cloakOfShadow, darkenedSight,
                    deathsCall, eradicateUndeath, cryOfDestruction, destructiveAura, sweetDream, dreamersCall,
                    hurtlingStone, localizedQuake, soothingWords, unity, readFate, temptFate, fireRay, flameBarrier,
                    unimpededStride, wordOfFreedom, healersBlessing, rebukeDeath, overstuff, takeItsCourse,
                    scholarlyRecollection, knowTheEnemy, bitOfLuck, luckyBreak, magicsVessel, mysticBeacon, athleticRush,
                    enduringMight, moonbeam, touchOfTheMoon, vibrantThorns, naturesBounty, wakingNightmare,
                    sharedNightmare, savorTheSting, retributivePain, charmingTouch, captivatingAdoration, perfectedMind,
                    perfectedBody, protectorsSacrifice, protectorsSphere, whisperingQuiet, safeguardSecret,
                    dazzlingFlash, vitalLuminance, agileFeet, travelersTransit, suddenShift, trickstersTwin, wordOfTruth,
                    glimpseTheTruth, touchOfObedience, commandingLash, touchOfUndeath, malignantSustenance, tidalSurge,
                    downpour, appearanceOfWealth, preciousMetals, weaponSurge, zealForBattle));
            deityRepo.saveAll(List.of(abadar, asmodeus, calistria, caydenCailean, desna, erastil, gorum, gozreh, greenFaith, iomedae, irori, lamashtu, nethys, norgorber, pharasma, rovagug, sarenrae, shelyn, torag, urgathoa, zonKuthon));
            spellRepo.saveAll(List.of(
                    animalForm, breatheFire, charm, controlWater, creation, detonateMagic, disintegrate,
                    dizzyingColors, dreamingPotential, earthbind, embedMessage, enlarge, enthrall, falseVitality,
                    fireball, fireShield, fleetStep, flicker, forceBarrage, ghostlyWeapon, goblinPox, gustOfWind,
                    hallucination, haste, illusoryDisguise, illusoryObject, invisibility, jump, levitate, lightningBolt,
                    maskOfTerror, mindlink, mislead, mountainResilience, naturesPathway, nightmare, phantomPain,
                    planarPalace, quandary, sleep, speakWithAnimals, spiderSting, stupefy, suggestion, summonAnimal,
                    sureStrike, telekineticHaul, translocate, umbralJourney, visionOfDeath, wallOfFire, wallOfForce,
                    wallOfThorns, warpMind, weaponStorm));

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
            Feat dubiousKnowledge = new Feat("Dubious Knowledge", 1, Set.of(generalTrait, skillTrait), "You’re a treasure trove of information, but not all of it comes from reputable sources.");
            Feat skillTraining = new Feat("Skill Training", 1, Set.of(generalTrait, skillTrait), "You become trained in the skill of your choice.");
            Feat automaticKnowledge = new Feat("Automatic Knowledge", 2, Set.of(generalTrait, skillTrait), "You know basic facts off the top of your head.");

            Feat catFall = new Feat("Cat Fall", 1, Set.of(generalTrait, skillTrait), "Your catlike aerial acrobatics allow you to cushion your falls.");
            Feat quickSqueeze = new Feat("Quick Squeeze", 1, Set.of(generalTrait, skillTrait), "You Squeeze 5 feet per round (10 feet on a critical success). If you’re legendary in Acrobatics, you Squeeze at full Speed.");
            Feat steadyBalance = new Feat("Steady Balance", 1, Set.of(generalTrait, skillTrait), "You can keep your balance easily, even in adverse conditions.");
            Feat nimbleCrawl = new Feat("Nimble Crawl", 2, Set.of(generalTrait, skillTrait), "You can Crawl incredibly swiftly—up to half your Speed, rather than 5 feet. If you’re a master in Acrobatics, you can Crawl at full Speed, and if you’re legendary, you aren’t offguard while prone.");
            Feat rollingLanding = new Feat("Rolling Landing", 2, Set.of(generalTrait, skillTrait), "You land with quick rolls that help you keep your momentum.");
            Feat kipUp = new Feat("Kip Up", 7, Set.of(generalTrait, skillTrait), "You stand up. This movement doesn’t trigger reactions.");

            Feat arcaneSense = new Feat("Arcane Sense", 1, Set.of(generalTrait, skillTrait), "Your study of magic allows you to instinctively sense its presence.");
            Feat quickIdentification = new Feat("Quick Identification", 1, Set.of(generalTrait, skillTrait), "You can Identify Magic swiftly.");
            Feat recognizeSpell = new Feat("Recognize Spell", 1, Set.of(generalTrait, secretTrait, skillTrait), "If you are trained in the appropriate skill for the spell’s tradition and it’s a common spell of 2nd rank or lower, you automatically identify it (you still roll to attempt to get a critical success, but can’t get a worse result than success). The highest rank of spell you automatically identify increases to 4 if you’re an expert, 6 if you’re a master, and 10 if you’re legendary. The GM rolls a secret Arcana, Nature, Occultism, or Religion check, whichever corresponds to the tradition of the spell being cast. If you’re not trained in the skill, you can’t get a result better than failure.\n" +
                    "\n" +
                    "Critical Success You correctly recognize the spell and gain a +1 circumstance bonus to your saving throw or your AC against it.\n" +
                    "Success You correctly recognize the spell.\n" +
                    "Failure You fail to recognize the spell.\n" +
                    "Critical Failure You misidentify the spell as another spell entirely, of the GM’s choice.");
            Feat trickMagicItem = new Feat("Trick Magic Item", 1, Set.of(generalTrait, manipulateTrait, skillTrait), "You examine a magic item you normally couldn’t use in an effort to fool it and activate it temporarily.");
            Feat magicalShorthand = new Feat("Magical Shorthand", 2, Set.of(generalTrait, skillTrait), "Learning spells comes easily to you.");
            Feat quickRecognition = new Feat("Quick Recognition", 7, Set.of(generalTrait, skillTrait), "You Recognize Spells swiftly.");
            Feat unifiedTheory = new Feat("Unified Theory", 15, Set.of(generalTrait, skillTrait), "You understand the common underpinnings of the four traditions of magic and magical essences, allowing you to understand them all through an arcane lens.");

            Feat combatClimber = new Feat("Combat Climber", 1, Set.of(generalTrait, skillTrait), "Your techniques allow you to fight as you climb.");
            Feat heftyHauler = new Feat("Hefty Hauler", 1, Set.of(generalTrait, skillTrait), "You can carry more than your frame implies.");
            Feat quickJump = new Feat("Quick Jump", 1, Set.of(generalTrait, skillTrait), "You can use High Jump and Long Jump as a single action instead of 2 actions. If you do, you don’t perform the initial Stride (nor do you fail if you don’t Stride 10 feet).");
            Feat titanWrestler = new Feat("Titan Wrestler", 1, Set.of(generalTrait, skillTrait), "You can attempt to Disarm, Grapple, Reposition, Shove, or Trip creatures up to two sizes larger than you, or up to three sizes larger than you if you’re legendary in Athletics.");
            Feat underwaterMarauder = new Feat("Underwater Marauder", 1, Set.of(generalTrait, skillTrait), "You’ve learned to fight underwater.");
            Feat powerfulLeap = new Feat("Powerful Leap", 2, Set.of(generalTrait, skillTrait), "You can jump 5 feet up with a vertical Leap without making a High Jump. You also increase the horizontal distance when you Leap, including as part of a High Jump or Long Jump, by 5 feet.");
            Feat rapidMantel = new Feat("Rapid Mantel", 2, Set.of(generalTrait, skillTrait), "You easily pull yourself onto ledges.");
            Feat quickClimb = new Feat("Quick Climb", 7, Set.of(generalTrait, skillTrait), "When Climbing, you move 5 more feet on a success and 10 more feet on a critical success, up to your Speed.");
            Feat quickSwim = new Feat("Quick Swim", 7, Set.of(generalTrait, skillTrait), "You Swim 5 feet farther on a success and 10 feet farther on a critical success, to a maximum of your Speed. If you’re legendary in Athletics, you gain a swim Speed equal to your Speed.");
            Feat wallJump = new Feat("Wall Jump", 7, Set.of(generalTrait, skillTrait), "You can use your momentum from a jump to propel yourself off a wall.");
            Feat cloudJump = new Feat("Cloud Jump", 15, Set.of(generalTrait, skillTrait), "Your unparalleled athletic skill allows you to jump impossible distances.");

            Feat alchemicalCrafting = new Feat("Alchemical Crafting", 1, Set.of(generalTrait, skillTrait), "You can use the Craft activity to create alchemical items.");
            Feat quickRepair = new Feat("Quick Repair", 1, Set.of(generalTrait, skillTrait), "For you, the Repair activity loses the exploration trait and takes 1 minute instead of 10 minutes. If you’re a master in Crafting, it takes 3 actions. If you’re legendary, it takes 1 action.");
            Feat seasoned = new Feat("Seasoned", 1, Set.of(generalTrait, skillTrait), "You’ve mastered the preparation of many types of food and drink.");
            Feat specialtyCrafting = new Feat("Specialty Crafting", 1, Set.of(generalTrait, skillTrait), "Your training focused on Crafting one particular kind of item.");
            Feat communalCrafting = new Feat("Communal Crafting", 2, Set.of(generalTrait, skillTrait), "You can have other PCs help you Craft an item, under your direction. A helper PC rolls a check with a skill in which they’re trained. The skill must be Crafting or another skill relevant to the item, as determined by the GM. For example, a PC might use Religion to help you Craft an item with the divine trait or Warfare Lore to help you Craft a weapon. Your roll still determines whether you successfully create the item. Any helper’s roll contributes toward reducing the cost of raw materials using the numbers from the Earn Income table on page 229; this uses the ally PC’s proficiency rank in the skill and their level – 1 for their level.\n" +
                    "\n" +
                    "Helping PCs must accompany you throughout the Craft activity (preventing them from pursuing other downtime activities) or the benefit is lost. The GM might determine that only a certain number of PCs can help depending on the circumstances.\n" +
                    "\n" +
                    "Communal Crafting also allows you to take the role of a helper when someone else is crafting, provided they accept your help.");
            Feat inventor = new Feat("Inventor", 2, Set.of(downtimeTrait, generalTrait, skillTrait), "You are a genius at Crafting, easily able to determine how things are made and create new inventions.");
            Feat magicalCrafting = new Feat("Magical Crafting", 2, Set.of(generalTrait, skillTrait), "You can Craft magic items, though some have other requirements, as listed in GM Core. When you select this feat, you gain formulas for four common magic items of 2nd level or lower.");
            Feat adventurousOutfitter = new Feat("Adventurous Outfitter", 7, Set.of(generalTrait, skillTrait), "You tinker, create, and repair gear as you adventure.");
            Feat impeccableCrafting = new Feat("Impeccable Crafting", 7, Set.of(generalTrait, skillTrait), "You craft flawless creations with great efficiency.");
            Feat signatureCrafting = new Feat("Signature Crafting ", 7, Set.of(generalTrait, skillTrait), "Magic items you create bear a stamp specific to your handiwork.");
            Feat craftAnything = new Feat("Craft Anything", 15, Set.of(generalTrait, skillTrait), "You can find ways to craft just about anything, despite restrictions.");

            Feat charmingLiar = new Feat("Charming Liar", 1, Set.of(generalTrait, skillTrait), "Your charm allows you to win over those you lie to.");
            Feat lengthyDiversion = new Feat("Lengthy Diversion", 1, Set.of(generalTrait, skillTrait), "When you critically succeed to Create a Diversion, you continue to remain hidden after the end of your turn. This effect lasts for an amount of time that depends on the diversion and situation, as determined by the GM (minimum 1 additional round).");
            Feat lieToMe = new Feat("Lie to Me", 1, Set.of(generalTrait, skillTrait), "You can use Deception to weave traps to trip up anyone trying to deceive you.");
            Feat confabulator = new Feat("Confabulator", 2, Set.of(generalTrait, skillTrait), "Even when caught in falsehoods, you pile lie upon lie.");
            Feat quickDisguise = new Feat("Quick Disguise", 2, Set.of(generalTrait, skillTrait), "You can set up a disguise in one-tenth the usual time (generally 1 minute).");
            Feat slipperySecrets = new Feat("Slippery Secrets", 7, Set.of(generalTrait, skillTrait), "You elude and evade attempts to uncover your true nature or intentions.");

            Feat bargainHunter = new Feat("Bargain Hunter", 1, Set.of(generalTrait, skillTrait), "You can Earn Income using Diplomacy, spending your days hunting for bargains and reselling at a profit. You can also spend time specifically sniffing out a great bargain on an item; this works as if you were using Earn Income with Diplomacy, except instead of gaining money, you purchase the item at a discount equal to the money you would have gained, gaining the item for free if your earned income equals or exceeds its cost. Finally, if you select Bargain Hunter during character creation at 1st level, you start play with an additional 2 gp.");
            Feat groupImpression = new Feat("Group Impression", 1, Set.of(generalTrait, skillTrait), "When you Make an Impression, you can compare your Diplomacy check result to the Will DCs of up to 10 targets you conversed with, with no penalty. The number of targets increases to 20 if you’re an expert, 50 if you’re a master, and 100 if you’re legendary.");
            Feat hobnobber = new Feat("Hobnobber", 1, Set.of(generalTrait, skillTrait), "You are skilled at learning information through conversation.");
            Feat noCauseForAlarm = new Feat("No Cause for Alarm", 1, Set.of(auditoryTrait, concentrateTrait, emotionTrait, generalTrait, linguisticTrait, mentalTrait, skillTrait), "You attempt to reduce panic.");
            Feat gladHand = new Feat("Glad-Hand", 2, Set.of(generalTrait, skillTrait), "First impressions are your strong suit.");
            Feat shamelessRequest = new Feat("Shameless Request", 7, Set.of(generalTrait, skillTrait), "You can downplay the consequences or outrageousness of your requests using sheer brazenness and charm.");
            Feat legendaryNegotiation = new Feat("Legendary Negotiation", 15, Set.of(generalTrait, skillTrait), "You can negotiate incredibly quickly in adverse situations.");

            Feat groupCoercion = new Feat("Group Coercion", 1, Set.of(generalTrait, skillTrait), "You can strong-arm people effectively, even when you don’t have them isolated.");
            Feat intimidatingGlare = new Feat("Intimidating Glare", 1, Set.of(generalTrait, skillTrait), "Demoralize a creature using only a look.");
            Feat quickCoercion = new Feat("Quick Coercion", 1, Set.of(generalTrait, skillTrait), "You can bully others with just a few choice implications.");
            Feat intimidatingProwess = new Feat("Intimidating Prowess", 2, Set.of(generalTrait, skillTrait), "In situations where you can physically menace the target when you Coerce or Demoralize, you gain a +1 circumstance bonus to your Intimidation check and you ignore the penalty for not sharing a language. If your Strength modifier is +5 or higher and you are a master in Intimidation, this bonus increases to +2.");
            Feat lastingCoercion = new Feat("Lasting Coercion", 2, Set.of(generalTrait, skillTrait), "When you successfully Coerce someone, the maximum time they comply increases to a week, still determined by the GM. If you’re legendary, the maximum increases to a month.");
            Feat battleCry = new Feat("Battle Cry", 7, Set.of(generalTrait, skillTrait), "When you roll initiative, you can yell a mighty battle cry and Demoralize an observed foe as a free action. If you’re legendary in Intimidation, you can use a reaction to Demoralize your foe when you critically succeed at an attack roll.");
            Feat terrifiedRetreat = new Feat("Terrified Retreat", 7, Set.of(generalTrait, skillTrait), "When you critically succeed at the Demoralize action, if the target's level is lower than yours, the target is fleeing for 1 round.");
            Feat scareToDeath = new Feat("Scare to Death", 15, Set.of(emotionTrait, fearTrait, generalTrait, incapactitationTrait, skillTrait), "You can frighten foes so much, they might die.");

            Feat additionalLore = new Feat("Additional Lore", 1, Set.of(generalTrait, skillTrait), "Your knowledge has expanded to encompass a new field.");
            Feat experiencedProfessional = new Feat("Experienced Professional", 1, Set.of(generalTrait, skillTrait), "You carefully safeguard your professional endeavors to prevent disaster.");
            Feat unmistakableLore = new Feat("Unmistakable Lore", 2, Set.of(generalTrait, skillTrait), "You never get information about your areas of expertise wrong.");
            Feat legendaryProfessional = new Feat("Legendary Professional", 15, Set.of(generalTrait, skillTrait), "Your fame has spread throughout the lands (for instance, if you have Warfare Lore, you might be a legendary general or tactician).");

            Feat battleMedicine = new Feat("Battle Medicine", 1, Set.of(generalTrait, healingTrait, manipulateTrait, skillTrait), "You can patch up wounds, even in combat.");
            Feat continualRecovery = new Feat("Continual Recovery", 2, Set.of(generalTrait, skillTrait), "You zealously monitor a patient’s progress to administer treatment faster.");
            Feat godlessHealing = new Feat("Godless Healing", 2, Set.of(generalTrait, skillTrait), "You recover an additional 5 Hit Points from a successful attempt to Treat your Wounds or use Battle Medicine on you.");
            Feat mortalHealing = new Feat("Mortal Healing", 2, Set.of(generalTrait, skillTrait), "You grant greater healing when the gods don't interfere.");
            Feat robustRecovery = new Feat("Robust Recovery", 2, Set.of(generalTrait, skillTrait), "You learned folk medicine to help recover from diseases and poison, and using it diligently has made you especially resilient.");
            Feat unusualTreatment = new Feat("Unusual Treatment", 2, Set.of(generalTrait, skillTrait), "Your medical training extends to less obvious conditions.");
            Feat wardMedic = new Feat("Ward Medic", 2, Set.of(generalTrait, skillTrait), "You’ve studied in large medical wards, treating several patients at once and tending to all their needs.");
            Feat advancedFirstAid = new Feat("Advanced First Aid", 7, Set.of(generalTrait, healingTrait, manipulateTrait, skillTrait), "You use your medical training to ameliorate sickness or assuage fears");
            Feat paragonBattleMedicine = new Feat("Paragon Battle Medicine", 7, Set.of(generalTrait, skillTrait), "You've learned the modern uses of Battle Medicine originated by Kassi Aziril.");
            Feat legendaryMedic = new Feat("Legendary Medic", 15, Set.of(generalTrait, skillTrait), "You’ve discovered medical breakthroughs or techniques that achieve miraculous results.");

            Feat naturalMedicine = new Feat("Natural Medicine", 1, Set.of(generalTrait, skillTrait), "You can apply natural cures to heal your allies.");
            Feat trainAnimal = new Feat("Train Animal", 1, Set.of(downtimeTrait, generalTrait, manipulateTrait, skillTrait), "You spend time teaching an animal to do a certain action.");
            Feat bondedAnimal = new Feat("Bonded Animal", 2, Set.of(downtimeTrait, generalTrait, skillTrait), "You forge strong connections with animals.");

            Feat oddityIdentification = new Feat("Oddity Identification", 1, Set.of(generalTrait, skillTrait), "When you become aware of a magical effect or see a spell being cast, you can immediately determine if it twists minds (with the mental trait), fights against fortune (with the fortune or misfortune trait), or reveals secrets (with the detection, prediction, revelation, or scrying traits). At the GM’s discretion, similar effects can also fall into these categories. When you Identify Magic or Recall Knowledge to learn more about these effects, you can always use Occultism without penalty and gain a +2 circumstance bonus.");
            Feat schooledInSecrets = new Feat("Schooled In Secrets", 1, Set.of(generalTrait, skillTrait), "You notice the signs and symbols that members of mystery cults and other secret societies use to declare their affiliation to fellow members.");
            Feat bizarreMagic = new Feat("Bizarre Magic", 7, Set.of(generalTrait, skillTrait), "You can draw upon strange variations in your spellcasting, whether or not you can cast occult spells.");
            Feat breakCurse = new Feat("Break Curse", 7, Set.of(concentrateTrait, explorationTrait, generalTrait, healingTrait, skillTrait), "You spend 8 hours praying or performing occult rites over the target, weakening a curse's power over them. Attempt to counteract the curse, using Occultism or Religion for your counteract check and half your level rounded up for the counteract rank. Break Curse only takes 10 minutes of prayer and rites if you are legendary in Occultism or Religion.");

            Feat fascinatingPerformance = new Feat("Fascinating Performance", 1, Set.of(generalTrait, skillTrait), "When you Perform, compare your result to the Will DC of one observer.");
            Feat impressivePerformance = new Feat("Impressive Performance", 1, Set.of(generalTrait, skillTrait), "Your performances inspire admiration and win you fans.");
            Feat virtuosicPerformer = new Feat("Virtuosic Performer", 1, Set.of(generalTrait, skillTrait), "You have exceptional talent with one type of performance.");
            Feat inflameCrowd = new Feat("Inflame Crowd", 7, Set.of(generalTrait, skillTrait), "Your performances are a call to action for the crowds who listen to you.");
            Feat talentEnvy = new Feat("Talent Envy", 7, Set.of(generalTrait, skillTrait), "You give off a bedazzling glow with every performance, sparking feelings of severe envy and inadequacy in those who compare their talent to yours.");
            Feat legendaryPerformer = new Feat("Legendary Performer", 15, Set.of(generalTrait, skillTrait), "Your fame has spread throughout the lands.");

            Feat studentOfTheCanon = new Feat("Student of the Canon", 1, Set.of(generalTrait, skillTrait), "You’ve researched many faiths enough to recognize notions about them that are unlikely to be true.");
            Feat divineGuidance = new Feat("Divine Guidance", 15, Set.of(generalTrait, skillTrait), "You’re so immersed in divine scripture that you find meaning and guidance for any situation in your texts.");

            Feat courtlyGraces = new Feat("Courtly Graces", 1, Set.of(generalTrait, skillTrait), "You were raised among the nobility or have learned proper etiquette and bearing, allowing you to present yourself as a noble and play games of influence and politics.");
            Feat multilingual = new Feat("Multilingual", 1, Set.of(generalTrait, skillTrait), "You easily pick up new languages.");
            Feat readLips = new Feat("Read Lips", 1, Set.of(generalTrait, skillTrait), "You can read lips of others nearby who you can clearly see.");
            Feat signLanguage = new Feat("Sign Language", 1, Set.of(generalTrait, skillTrait), "You learn the sign languages associated with the languages you know, allowing you to sign and understand signs.");
            Feat streetwise = new Feat("Streetwise", 1, Set.of(generalTrait, skillTrait), "You know about life on the streets and feel the pulse of your local settlement.");
            Feat leverageConnections = new Feat("Leverage Connections", 2, Set.of(generalTrait, skillTrait), "You know the right people who can get things done for you in certain circles.");
            Feat undergroundNetwork = new Feat("Underground Network", 2, Set.of(generalTrait, skillTrait), "You're connected to groups that know what's going on in the streets, and you can get information out of them quickly.");
            Feat legendaryCodebreaker = new Feat("Legendary Codebreaker", 15, Set.of(generalTrait, skillTrait), "Your skill with languages and codes is so great that you can decipher information with little more than a quick read through a text.");
            Feat legendaryLinguist = new Feat("Legendary Linguist", 15, Set.of(generalTrait, skillTrait), "You’re so skilled with languages you can create a pidgin instantly.");

            Feat experiencedSmuggler = new Feat("Experienced Smuggler", 1, Set.of(generalTrait, skillTrait), "You often smuggle things past the authorities.");
            Feat quietAllies = new Feat("Quiet Allies", 2, Set.of(generalTrait, skillTrait), "You’re skilled at moving with a group.");
            Feat foilSenses = new Feat("Foil Senses", 7, Set.of(generalTrait, skillTrait), "You are adept at foiling creatures’ special senses and cautious enough to safeguard against them at all times.");
            Feat swiftSneak = new Feat("Swift Sneak", 7, Set.of(generalTrait, skillTrait), "You can move your full Speed when you Sneak. You can use Swift Sneak while Burrowing, Climbing, Flying, or Swimming instead of Striding if you have the corresponding movement type.");
            Feat legendarySneak = new Feat("Legendary Sneak", 15, Set.of(generalTrait, skillTrait), "You’re always sneaking unless you choose to be seen, even when there’s nowhere to hide.");

            Feat experiencedTracker = new Feat("Experienced Tracker", 1, Set.of(generalTrait, skillTrait), "Tracking is second nature to you, and when necessary you can follow a trail without pause.");
            Feat forager = new Feat("Forager", 1, Set.of(generalTrait, skillTrait), "While using Survival to Subsist, if you roll any result worse than a success, you get a success. On a success, you can provide subsistence living for yourself and four additional creatures, and on a critical success, you can take care of twice as many additional creatures. You can choose to support half the number of creatures with a comfortable living.\n" +
                    "\n" +
                    "Increase the number of additional creatures you feed on a success to eight if you’re an expert in Survival, 16 if you’re a master, and 32 if you’re legendary.");
            Feat surveyWildlife = new Feat("Survey Wildlife", 1, Set.of(generalTrait, skillTrait), "You can study details in the wilderness to determine the presence of nearby creatures.");
            Feat terrainExpert = new Feat("Terrain Expertise", 1, Set.of(generalTrait, skillTrait), "You are particularly skilled in rough terrain.");
            Feat terrainStalker = new Feat("Terrain Stalker", 1, Set.of(generalTrait, skillTrait), "Select one type of difficult terrain from the following list: rubble, snow, or underbrush. While undetected by all non-allies in that type of terrain, you can Sneak without attempting a Stealth check as long as you move no more than 5 feet and do not pass within 10 feet of an enemy during your movement.\n" +
                    "\n" +
                    "During exploration, this also allows you to automatically approach within 15 feet of other creatures while Avoiding their Notice, as long as they aren’t actively Searching or on guard.");
            Feat monsterCrafting = new Feat("Monster Crafting", 7, Set.of(generalTrait, skillTrait), "You can use the parts of monsters to aid in crafting.");
            Feat planarSurvival = new Feat("Planar Survival", 7, Set.of(generalTrait, skillTrait), "You can Subsist using Survival on different planes, even those without resources or natural phenomena you normally need. For instance, you can forage for food without penalty even if the plane lacks food that could normally sustain you. A success on your check to Subsist also prevents damage done by the plane to you and anyone else you support with Subsist. This applies only to damage dealt by the general conditions of the plane, not smaller hazards.");
            Feat vanishIntoTheLand = new Feat("Vanish into the Land", 7, Set.of(generalTrait, skillTrait), "You’re adept at using the land’s natural features to find places to hide.");
            Feat legendarySurvivalist = new Feat("Legendary Survivalist", 15, Set.of(generalTrait, skillTrait), "You can survive indefinitely without food or water and can endure severe, extreme, and incredible cold and heat without taking damage from doing so.");

            Feat pickpocket = new Feat("Pickpocket", 1, Set.of(generalTrait, skillTrait), "You can Steal or Palm an Object that’s closely guarded, such as in a pocket, without taking the –5 penalty. You can’t steal objects that would be extremely noticeable or time consuming to remove (like worn shoes or armor or actively wielded objects). If you’re a master in Thievery, you can attempt to Steal from a creature in combat or otherwise on guard. When doing so, Stealing requires 2 actions instead of 1, and you take a –5 penalty.");
            Feat subtleTheft = new Feat("Subtle Theft", 1, Set.of(generalTrait, skillTrait), "When you successfully Steal something, observers (creatures other than the creature you stole from) take a –2 circumstance penalty to their Perception DCs to detect your theft. Additionally, if you first Create a Diversion using Deception, taking a single Palm an Object or Steal action doesn’t end your undetected condition.");
            Feat waryDisarmament = new Feat("Wary Disarmament", 2, Set.of(generalTrait, skillTrait), "If you trigger a device or set off a trap while disarming it, you gain a +2 circumstance bonus to your AC or saving throw against the device or trap. This applies only to attacks or effects triggered by your failed attempt, not to any later ones, such as additional attacks from a complex trap.");
            Feat quickUnlock = new Feat("Quick Unlock", 7, Set.of(generalTrait, skillTrait), "You can Pick a Lock using 1 action instead of 2.");
            Feat legendaryThief = new Feat("Legendary Thief", 15, Set.of(generalTrait, skillTrait), "Your ability to Steal defies belief.");

            Feat adoptedAncestry = new Feat("Adopted Ancestry", 1, Set.of(generalTrait), "You’re fully immersed in another ancestry’s culture and traditions, whether born into them, earned through rite of passage, or bonded through a deep friendship or romance.");
            Feat armorProficiency = new Feat("Armor Proficiency", 1, Set.of(generalTrait), "You become trained in light armor. If you already were trained in light armor, you gain training in medium armor. If you were trained in both, you become trained in heavy armor. If you are at least 13th level, you become an expert in this armor type.");
            Feat breathControl = new Feat("Breath Control", 1, Set.of(generalTrait), "You can breathe even in hazardous or sparse air.");
            Feat cannyAcumen = new Feat("Canny Acumen", 1, Set.of(generalTrait), "Your avoidance or observation is beyond the ken of most in your profession.");
            Feat diehard = new Feat("Diehard", 1, Set.of(generalTrait), "It takes more to kill you than most.");
            Feat fastRecovery = new Feat("Fast Recovery", 1, Set.of(generalTrait), "Your body quickly bounces back from afflictions.");
            Feat featherStep = new Feat("Feather Step", 1, Set.of(generalTrait), "You step carefully and quickly.");
            Feat fleet = new Feat("Fleet", 1, Set.of(generalTrait), "You move more quickly on foot.");
            Feat incredibleInitiative = new Feat("Incredible Initiative", 1, Set.of(generalTrait), "You react more quickly than others can.");
            Feat pet = new Feat("Pet", 1, Set.of(generalTrait),  "You have a pet-a Tiny animal of a type you choose, such as a cat, bird, or rodent. It has the minion trait, meaning it gains 2 actions during your turn if you use the Command an Animal action to command it; this replaces the usual effects of Command an Animal, and you don't need to attempt a Nature check. A pet can't take attack actions except to Escape or Force Open.\n" +
                    "\n" +
                    "Level Your pet's level is equal to yours.\n" +
                    "\n" +
                    "Modifiers and AC Your pet's save modifiers and AC are equal to yours before applying circumstance or status bonuses or penalties. It uses 3 + your level as its modifier for Perception, Acrobatics, and Stealth, and just your level as its modifier for other skill checks. It doesn't have or use its own attribute modifiers and can never benefit from item bonuses.\n" +
                    "\n" +
                    "Hit Points Your pet has 5 Hit Points per level.\n" +
                    "\n" +
                    "Senses Your pet has low-light vision and can gain additional senses from pet abilities.\n" +
                    "\n" +
                    "Speed Your pet has a Speed of 25 feet. You can choose to instead have an aquatic pet, which breathes in water instead of air and has the aquatic trait, no land Speed, and a swim Speed of 25 feet.\n" +
                    "\n" +
                    "Pet Abilities When you gain your pet, choose two of the following abilities. If your pet is an animal that naturally has one of these abilities (for instance, an owl has a fly Speed), you must select that ability. Your pet can't be an animal that naturally has more pet abilities than the maximum. In some cases, the GM might add some familiar abilities described on pages 212–213 to the pet abilities you can choose.\n" +
                    "Amphibious It gains the amphibious trait, allowing it to breathe in both air and water, and has both a land Speed and a swim Speed, each equal to its highest land Speed or swim Speed.\n" +
                    "Burrower It gains a burrow Speed of 5 feet, allowing it to dig Tiny holes.\n" +
                    "Climber It gains a climb Speed of 25 feet.\n" +
                    "Darkvision It gains darkvision.\n" +
                    "Echolocation Your pet can use hearing as a precise sense within 20 feet.\n" +
                    "Fast Movement Increase one of the pet's Speeds from 25 feet to 40 feet.\n" +
                    "Flier It gains a fly Speed of 25 feet.\n" +
                    "Manual Dexterity It can use up to two of its limbs as if they were hands to perform manipulate actions.\n" +
                    "Scent Your pet can use scent as an imprecise sense within 30 feet\n" +
                    "Tough Your pet's max HP increase by 2 per level.");
            Feat ride = new Feat("Ride", 1, Set.of(generalTrait), "When you Command an Animal you’re mounted on to take a move action (such as Stride), you automatically succeed instead of needing to attempt a check. Any animal you’re mounted on acts on your turn, like a minion. If you Mount an animal in the middle of an encounter, it skips its next turn and then acts on your next turn.");
            Feat shieldBlock = new Feat("Shield Block", 1, Set.of(generalTrait), "You snap your shield in place to ward off a blow.");
            Feat toughness = new Feat("Toughness", 1, Set.of(generalTrait), "Your body can withstand more punishment than most before succumbing.");
            Feat weaponProficiency = new Feat("Weapon Proficiency", 1, Set.of(generalTrait), "You become trained in all martial weapons. If you were already trained in all martial weapons, you become trained in one advanced weapon of your choice. If you are at least 11th level, you also become an expert in these weapons.");
            Feat ancestralParagon = new Feat("Ancestral Paragon", 3, Set.of(generalTrait), "Whether through instinct, study, or magic, you feel a deeper connection to your ancestry.");
            Feat prescientPlanner = new Feat("Prescient Planner", 3, Set.of(generalTrait), "You regularly create convoluted plans and contingencies, using your resources to enact them.");
            Feat untrainedImprovisation = new Feat("Untrained Improvisation", 3, Set.of(generalTrait), "You’ve learned how to handle situations when you’re out of your depth.");
            Feat expeditiousSearch = new Feat("Expeditious Search", 7, Set.of(generalTrait), "You have a system that lets you search at great speed, finding details and secrets twice as quickly as others can.");
            Feat numbToDeath = new Feat("Numb To Death", 7, Set.of(generalTrait), "Your past has left you numb to death's call.");
            Feat prescientConsumable = new Feat("Prescient Consumable", 7, Set.of(generalTrait), "You can predict which consumables you might need in advance.");
            Feat incredibleInvestiture = new Feat("Incredible Investiture", 11, Set.of(generalTrait), "You have an incredible ability to invest more magic items.");

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
            Feat scrollAdept = new Feat("Scroll Adept", 10, Set.of(wizardTrait), "During your daily preparations, you can create two temporary scrolls containing arcane spells from your spellbook.");
            Feat cleverCounterspell = new Feat("Clever Counterspell", 12, Set.of(wizardTrait), "You creatively apply your prepared spells to Counterspell a much wider variety of your opponents’ magic.");
            Feat forcibleEnergy = new Feat("Forcible Energy", 12, Set.of(manipulateTrait, spellshapeTrait, wizardTrait), "You perform complex manipulations to make the energy from your spells so powerful that your enemies remain vulnerable to it afterward.");
            Feat keenMagicalDetection = new Feat("Keen Magical Detection", 12, Set.of(fortuneTrait, wizardTrait), "You sense magical dangers.");
            Feat bondedFocus = new Feat("Bonded Focus", 14, Set.of(wizardTrait), "Your connection to your bonded item increases your focus pool.");
            Feat secondaryDetonationArray = new Feat("Secondary Detonation Array", 14, Set.of(manipulateTrait, spellshapeTrait, wizardTrait), "You divert some of your spell’s energy into an unstable runic array.");
            Feat superiorBond = new Feat("Superior Bond", 14, Set.of(wizardTrait), "When you draw upon your bonded item, you can leave a bit of energy within it for later use.");
            Feat spellTinker = new Feat("Spell Tinker", 16, Set.of(concentrateTrait, wizardTrait), "You’ve learned to alter choices you make when casting spells on yourself.");
            Feat infinitePossibilities = new Feat("Infinite Possibilities", 18, Set.of(wizardTrait), "You can prepare a spell slot that exists in your mind as many different possibilities at once.");
            Feat reprepareSpell = new Feat("Reprepare Spell", 18, Set.of(wizardTrait), "You’ve discovered how to reuse some of your spell slots over and over.");
            Feat secondThoughts = new Feat("Second Thoughts", 18, Set.of(concentrateTrait, mentalTrait, wizardTrait), "When your target proves resilient to your magical deceptions, you can try them again on someone else.");
            Feat archwizardsMight = new Feat("Archwizard's Might", 20, Set.of(wizardTrait), "You have mastered the greatest secrets of arcane magic.");
            Feat spellCombination = new Feat("Spell Combination", 20, Set.of(wizardTrait), "You can merge spells, producing multiple effects with a single casting.");
            Feat spellMastery = new Feat("Spell Mastery", 20, Set.of(wizardTrait), "You have mastered a handful of spells to such a degree that you can cast them even if you haven’t prepared them in advance.");

            Feat bespellStrikes = new Feat("Bespell Strikes", 4, Set.of(oracleTrait, sorcererTrait, wizardTrait), "You siphon spell energy into one weapon you’re wielding, or into one of your unarmed attacks, such as a fist.");
            Feat knowledgeOfShapes = new Feat("Knowledge of Shapes", 4, Set.of(curseboundTrait, oracleTrait, spellshapeTrait), "Inspiration lets you surpass your preconceptions of your spells' limits.");

            Feat scintillatingSpell = new Feat("Scintillating Spell", 16, Set.of(concentrateTrait, lightTrait, sorcererTrait, spellshapeTrait, wizardTrait), "Your spells become a radiant display of light and color.");
            Feat spellshapeMastery = new Feat("Spellshape Mastery", 20, Set.of(sorcererTrait, wizardTrait), "Your mastery of magic ensures that you can alter your spells just as easily as you can cast them normally.");

            Feat ancestralMind = new Feat("Ancestral Mind", 1, Set.of(psychicTrait), "By unraveling memories and connections passed down from your progenitors and buried within your unconscious mind, you learn to convert your inherent magic into psychic power.");
            ancestralMind.setAvailableToClasses(List.of(psychic));

            Feat ammunitionThaumaturgy = new Feat("Ammunition Thaumaturgy", 1, Set.of(thaumaturgeTrait), "You're so used to handling your implement, weapon, and esoterica in the heat of combat that adding a few bullets or arrows to the mix is no extra burden.");
            ammunitionThaumaturgy.setAvailableToClasses(List.of(thaumaturge));

            Feat familiarFeat = new Feat("Familiar", 1, Set.of(magusTrait, sorcererTrait, thaumaturgeTrait, wizardTrait), "You make a pact with a creature that serves you and assists your spellcasting.");
            Feat knowledgeIsPower = new Feat("Knowledge is Power", 8, Set.of(magusTrait, wizardTrait), "Your academic knowledge about a creature allows you to subtly alter your magic to defeat them.");
            Feat magicSense = new Feat("Magic Sense", 12, Set.of(arcaneTrait, detectionTrait, magusTrait, oracleTrait, sorcererTrait, wizardTrait), "You have a literal sixth sense for ambient magic in your vicinity.");

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
            Feat theHarderTheyFall = new Feat("The Harder They Fall", 4, Set.of(rogueTrait), "You make your foes fall painfully when you trip them.");
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
            Feat hymnOfHealing = new Feat("Hymn of Healing", 1, Set.of(bardTrait), "You learn the hymn of healing composition spell, which imbues your music with rich melodies that help your allies recover from harm.");
            Feat lingeringComposition = new Feat("Lingering Composition",1, Set.of(bardTrait), "By adding a flourish, you make your compositions last longer.");
            Feat martialPerformance = new Feat("Martial Performance", 1, Set.of(bardTrait), "Your muse has taught you how to handle a wider variety of weapons than most bards, empowering you to effortlessly blend your performance into combat tools.");
            Feat reachSpell = new Feat("Reach Spell", 1, Set.of(bardTrait, clericTrait, concentrateTrait, druidTrait, oracleTrait, sorcererTrait, spellshapeTrait, witchTrait, wizardTrait), "You can extend your spells’ range.");
            Feat versatilePerformance = new Feat("Versatile Performance", 1, Set.of(bardTrait), "You can rely on the grandeur of your performances rather than ordinary social skills.");
            Feat wellVersed = new Feat("Well-Versed", 1, Set.of(bardTrait), "You’re resilient to performative influences that aren’t your own.");
            Feat cantripExpansion = new Feat("Cantrip Expansion", 2, Set.of(bardTrait, clericTrait, magusTrait, oracleTrait, psychicTrait, sorcererTrait, witchTrait, wizardTrait), "Study broadens your range of simple spells.");
            Feat directedAudience = new Feat("Directed Audience", 2, Set.of(bardTrait), "You can shape the area of your composition spells.");
            Feat emotionalPush = new Feat("Emotional Push", 2, Set.of(bardTrait, concentrateTrait), "You prepare to take advantage of your enemy’s sudden change in emotions.");
            Feat esotericPolymath = new Feat("Esoteric Polymath", 2, Set.of(bardTrait), "You keep a book of occult spells, similar to a wizard’s spellbook, and can use its spells to supplement your spell repertoire.");
            Feat loremastersEtude = new Feat("Loremaster's Etude", 2, Set.of(bardTrait, fortuneTrait), "You magically unlock memories, making them easier to recall.");
            Feat multifariousMuse = new Feat("Multifarious Muse", 2, Set.of(bardTrait), "Your muse doesn’t fall into a single label.");
            Feat songOfStrength = new Feat("Song of Strength", 2, Set.of(bardTrait), "Your performances inspire strength in your allies to aid them at physical tasks.");
            Feat upliftingOverture = new Feat("Uplifting Overture", 2, Set.of(bardTrait), "You learn the uplifting overture composition cantrip, which aids your allies’ skills with the inspiring nature of your performance.");
            Feat combatReading = new Feat("Combat Reading", 4, Set.of(bardTrait, secretTrait), "You use a performer’s cold reading techniques, aura reading, and other tricks to discover your foe’s strengths and weaknesses.");
            Feat courageousAdvance = new Feat("Courageous Advance", 4, Set.of(auditoryTrait, bardTrait, concentrateTrait, spellshapeTrait), "With a rousing call, you exhort an ally to advance.");
            Feat inTune = new Feat("In Tune", 4, Set.of(bardTrait, concentrateTrait, spellshapeTrait), "You attune your great skill in performing to another, granting them a small measure of your skill as though anyone could do it.");
            Feat melodiousSpell = new Feat("Melodious Spell", 4, Set.of(bardTrait, concentrateTrait, spellshapeTrait), "You subtly weave your spellcasting into a performance.");
            Feat rallyingAnthemFeat = new Feat("Rallying Anthem", 4, Set.of(bardTrait), "You learn the rallying anthem composition cantrip, which protects you and allies.");
            Feat ritualResearcher = new Feat("Ritual Researcher", 4, Set.of(bardTrait), "Careful research into the art of rituals has made you better at performing them.");
            Feat tripleTimeFeat = new Feat("Triple Time", 4, Set.of(bardTrait), "You learn the triple time composition cantrip, which speeds up you and your allies for a round.");
            Feat versatileSignature = new Feat("Versatile Signature", 4, Set.of(bardTrait), "While most bards are known for certain signature performances and spells, you’re always tweaking your available repertoire.");
            Feat assuredLKnowledge = new Feat("Assured Knowledge", 6, Set.of(bardTrait, fortuneTrait), "You can procure information with confidence.");
            Feat defensiveCoordination = new Feat("Defensive Coordination", 6, Set.of(auditoryTrait, bardTrait, concentrateTrait, spellshapeTrait), "Like the storied heroes who persist in the face of overwhelming odds, you and your allies will hold the line.");
            Feat dirgeOfDoomFeat = new Feat("Dirge of Doom", 6, Set.of(bardTrait), "You learn the dirge of doom composition cantrip, which frightens your enemies and keeps them from fully recovering from their fear.");
            Feat educateAllies = new Feat("Educate Allies", 6, Set.of(bardTrait, concentrateTrait), "You tweak the properties of your composition spell to convey a bit of your defensive knowledge.");
            Feat harmonize = new Feat("Harmonize", 6, Set.of(bardTrait, concentrateTrait, manipulateTrait, spellshapeTrait), "You can perform multiple compositions simultaneously, typically by performing in multiple ways at the same time, using special vocal techniques to double your voice, or creating occult magic that replicates your song or speech.");
            Feat songOfMarchingFeat = new Feat("Song of Marching", 6, Set.of(bardTrait), "You learn the song of marching composition cantrip, which enables you and your allies to cross vast distances without strain.");
            Feat steadySpellcasting = new Feat("Steady Spellcasting", 6, Set.of(bardTrait, clericTrait, druidTrait, oracleTrait, psychicTrait, sorcererTrait, witchTrait, wizardTrait), "You don’t lose spells easily.");
            Feat accompany = new Feat("Accompany", 8, Set.of(bardTrait, concentrateTrait, manipulateTrait), "You use your performance to supplement an ally’s spellcasting, providing magical energy for their spell in their stead.");
            Feat callAndResponse = new Feat("Call and Response", 8, Set.of(auditoryTrait, bardTrait, concentrateTrait, spellshapeTrait), "Your composition takes the form of a call-and-response chant that lets your allies continue the effect without you.");
            Feat eclecticSkill = new Feat("Eclectic Skill", 8, Set.of(bardTrait), "Your broad experiences translate to a range of skills.");
            Feat fortissimoCompositionFeat = new Feat("Fortissimo Composition", 8, Set.of(bardTrait), "Your anthems grow louder and more potent, bolstered by your muse’s power.");
            Feat knowItAll = new Feat("Know-It-All", 8, Set.of(bardTrait, thaumaturgeTrait), "When you succeed at a check to Recall Knowledge, you gain additional information or context.");
            Feat reflexiveCourage = new Feat("Reflexive Courage", 8, Set.of(auditoryTrait, bardTrait, concentrateTrait), "You bellow a ferocious call to arms, inspiring yourself to lash out at a foe.");
            Feat soulsight = new Feat("Soulsight", 8, Set.of(bardTrait, sorcererTrait), "Your muse has opened your senses to the world beyond.");
            Feat annotateComposition = new Feat("Annotate Composition", 10, Set.of(bardTrait, explorationTrait, linguisticTrait), "By putting composition to paper, you can create a source of stirring words or song that others can read and understand.");
            Feat courageousAssault = new Feat("Courageous Assault", 10, Set.of(auditoryTrait, bardTrait, concentrateTrait, spellshapeTrait), "With a mighty shout, you can stir an ally to attack.");
            Feat houseOfImaginaryWallsFeat = new Feat("House of Imaginary Walls", 10, Set.of(bardTrait), "You erect an imaginary barrier others believe to be real.");
            Feat odeToOuroborosFeat = new Feat("Ode to Ouroboros", 10, Set.of(bardTrait), "You learn the ode to ouroboros composition spell, which enables you to temporarily spare your allies from death.");
            Feat quickenedCasting = new Feat("Quickened Casting", 10, Set.of(bardTrait, concentrateTrait, oracleTrait, sorcererTrait, spellshapeTrait, witchTrait, wizardTrait), "If your next action is to cast a cantrip or a spell that is at least 2 ranks lower than the highest-rank spell slot you have, reduce the number of actions to cast it by 1 (minimum 1 action).");
            Feat symphonyOfTheUnfetteredHeartFeat = new Feat("Symphony of the Unfettered Heart", 10, Set.of(bardTrait), "You learn the symphony of the unfettered heart composition spell, which enables you to protect an ally against incapacitating conditions.");
            Feat unusualComposition = new Feat("Unusual Composition", 10, Set.of(bardTrait, concentrateTrait, manipulateTrait, spellshapeTrait), "You can translate the emotion and power of a composition to other mediums.");
            Feat eclecticPolymath = new Feat("Eclectic Polymath", 12, Set.of(bardTrait), "Your flexible mind can quickly shift from one spell to another.");
            Feat enigmasKnowledge = new Feat("Enigma's Knowledge", 12, Set.of(bardTrait), "Your muse whispers knowledge to you at all the right times.");
            Feat inspirationalFocus = new Feat("Inspirational Focus", 12, Set.of(bardTrait), "Your connection to your muse has granted you unusual focus.");
            Feat reverberate = new Feat("Reverberate", 12, Set.of(bardTrait), "You can manipulate the acoustics around you to deflect sonic damage back at its source.");
            Feat sharedAssault = new Feat("Shared Assault", 12, Set.of(bardTrait), "In the triumph of battle, you can share the glory with another ally.");
            Feat allegroFeat = new Feat("Allegro", 14, Set.of(bardTrait), "You can quicken your allies with a fast-paced performance.");
            Feat earworm = new Feat("Earworm", 14, Set.of(bardTrait, explorationTrait), "By endlessly repeating a motif, you implant a memorable song that repeats over and over again in your allies’ heads, preparing them to respond to it later.");
            Feat soothingBalladFeat = new Feat("Soothing Ballad", 14, Set.of(bardTrait), "You soothe your allies’ wounds with the power of performance.");
            Feat triumphantInspiration = new Feat("Triumphant Inspiration", 14, Set.of(bardTrait), "With a triumphant shout, you inspire your allies.");
            Feat trueHypercognition = new Feat("True Hypercognition", 14, Set.of(bardTrait), "Your mind works at an incredible pace.");
            Feat vigorousAnthem = new Feat("Vigorous Anthem", 14, Set.of(auditoryTrait, bardTrait, concentrateTrait, spellshapeTrait), "You instill magical vigor in your allies when you inspire them to attack.");
            Feat courageousOnslaught = new Feat("Courageous Onslaught", 16, Set.of(auditoryTrait, bardTrait, concentrateTrait, spellshapeTrait), "You use your performance to orchestrate an onslaught against your enemies.");
            Feat effortlessConcentration = new Feat("Effortless Concentration", 16, Set.of(bardTrait, druidTrait, sorcererTrait, summonerTrait, witchTrait, wizardTrait), "You can maintain a spell with hardly a thought.");
            Feat resoundingFinale = new Feat("Resounding Finale", 16, Set.of(bardTrait, concentrateTrait), "You bring your performance to a sudden, dramatic finish, drowning out other sounds.");
            Feat studiousCapacity = new Feat("Studious Capacity", 16, Set.of(bardTrait), "Your continued study of occult magic has increased your magical capacity, allowing you to cast spells even when it seems impossible.");
            Feat allInMyHead = new Feat("All In My Head", 18, Set.of(bardTrait, illusionTrait, mentalTrait), "Using your occult connections and incredible powers of persuasion, you convince yourself that the triggering damage is a figment of your imagination.");
            Feat deepLore = new Feat("Deep Lore", 18, Set.of(bardTrait), "Your repertoire is vast, containing far more spells than usual.");
            Feat discordantVoice = new Feat("Discordant Voice", 18, Set.of(bardTrait, sonicTrait), "Your courageous anthem lets loose a discordant shriek that imbues your allies’ attacks with powerful sonic reverberations.");
            Feat eternalComposition = new Feat("Eternal Composition", 18, Set.of(bardTrait), "The world is a stage upon which you are always playing.");
            Feat impossiblePolymath = new Feat("Impossible Polymath", 18, Set.of(bardTrait), "Your esoteric formulas are so unusual that they allow you to dabble in magic from diverse traditions that other bards don’t understand.");
            Feat fatalAriaFeat = new Feat("Fatal Aria", 20, Set.of(bardTrait), "Your songs overwhelm the target with unbearable emotion, potentially striking them dead on the spot.");
            Feat perfectEncore = new Feat("Perfect Encore", 20, Set.of(bardTrait), "You develop another incredible creation.");
            Feat piedPipingFeat = new Feat("Pied Piping", 20, Set.of(bardTrait), "You learn the pied piping composition spell, which enables you to control the actions of weak-minded individuals.");
            Feat symphonyOfTheMuse = new Feat("Symphony of the Muse", 20, Set.of(bardTrait), "You have learned how to weave countless performances together into a solo symphony with multitudinous effects.");
            Feat ultimatePolymath = new Feat("Ultimate Polymath", 20, Set.of(bardTrait), "You can flexibly cast all of your spells, granting a dizzying array of possible options.");

            Feat deadlySimplicity = new Feat("Deadly Simplicity", 1, Set.of(clericTrait), "When you are wielding your deity’s favored weapon, increase the damage die size of that weapon by one step.");
            deadlySimplicity.setAvailableToClasses(List.of(cleric));
            Feat divineCastigation = new Feat("Divine Castigation", 1, Set.of(clericTrait), "Your deity’s grace doesn’t extend to your sworn enemies.");
            Feat domainInitiate = new Feat("Domain Initiate", 1, Set.of(clericTrait),  "Your deity bestows a special spell related to their powers.");
            domainInitiate.setAvailableToClasses(List.of(cleric));
            Feat harmingHands = new Feat("Harming Hands", 1, Set.of(clericTrait), "The mordant power of your void energy grows.");
            Feat healingHands = new Feat("Healing Hands", 1, Set.of(clericTrait), "Your vitality is even more vibrant and restorative.");
            Feat premonitionOfAvoidance = new Feat("Premonition of Avoidance", 1, Set.of(clericTrait, divineTrait, predictionTrait), "Your deity grants you a moment’s foresight.");
            Feat communalHealing = new Feat("Communal Healing", 2, Set.of(clericTrait, healingTrait, vitalityTrait), "You’re an exceptional conduit for vitality and, as you channel it through you, you can divert some to heal yourself or another creature.");
            Feat emblazonArmament = new Feat("Emblazon Armament", 2, Set.of(clericTrait, explorationTrait), "Carefully etching a sacred image into a physical object, you steel yourself for battle.");
            Feat panicTheDead = new Feat("Panic the Dead", 2, Set.of(clericTrait, emotionTrait, fearTrait, mentalTrait), "Vitality strikes terror in the undead.");
            Feat rapidResponse = new Feat("Rapid Response", 2, Set.of(clericTrait), "You work quickly in emergencies.");
            Feat sapLife = new Feat("Sap Life", 2, Set.of(clericTrait, healingTrait), "You draw the life force out of your enemies.");
            Feat versatileFont = new Feat("Versatile Font", 2, Set.of(clericTrait), "As you explore your deity’s aspects, you move beyond restrictions on healing or harming.");
            Feat warpriestsArmor = new Feat("Warpriest's Armor", 2, Set.of(clericTrait), "Your training has helped you adapt to ever-heavier armor.");
            Feat channelSmite = new Feat("Channel Smite", 4, Set.of(clericTrait, divineTrait), "You siphon the energies of life and death through a melee attack and into your foe.");
            Feat directedChannel = new Feat("Directed Channel", 4, Set.of(clericTrait), "You can shape the energy you channel in a single direction.");
            Feat divineInfusion = new Feat("Divine Infusion", 4, Set.of(clericTrait, concentrateTrait, spellshapeTrait), "You pour energy into the subject of your healing to empower its attacks.");
            Feat raiseSymbol = new Feat("Raise Symbol", 4, Set.of(clericTrait), "You present your religious symbol emphatically.");
            Feat restorativeStrike = new Feat("RestorativeStrike", 4, Set.of(clericTrait), "You balance both sides of the scales, restoring yourself while striking a foe.");
            Feat sacredGround = new Feat("Sacred Ground", 4, Set.of(clericTrait, consecrationTrait, divineTrait, explorationTrait), "You pray continuously for 1 minute to call a subtle shadow of your deity’s realm over a 30-foot burst centered on you.");
            Feat castDown = new Feat("Cast Down", 6, Set.of(clericTrait, concentrateTrait, spellshapeTrait), "The sheer force of your faith can bring a foe crashing down.");
            Feat divineRebuttal = new Feat("Divine Rebuttal", 6, Set.of(clericTrait, divineTrait), "You strive against magical threats physically and spiritually.");
            Feat divineWeapon = new Feat("Divine Weapon", 6, Set.of(clericTrait), "You siphon residual spell energy into a weapon you’re wielding.");
            Feat magicHands = new Feat("Magic Hands", 6, Set.of(clericTrait), "The blessing of your deity heightens your healing ability, integrating magical healing with the mundane.");
            Feat selectiveEnergy = new Feat("Selective Energy", 6, Set.of(clericTrait), "As you call down divine power, you can prevent some enemies from benefiting or some allies from being hurt.");
            Feat advancedDomain = new Feat("Advanced Domain", 8, Set.of(clericTrait), "Your prayers have unlocked deeper secrets of your deity’s domain.");
            Feat cremateUndead = new Feat("Cremate Undead", 8, Set.of(clericTrait), "Your overwhelming vitality sets undead alight.");
            Feat emblazonEnergy = new Feat("Emblazon Energy", 8, Set.of(clericTrait), "With elemental forces, you make your emblazoned symbols more potent.");
            Feat martyr = new Feat("Martyr", 8, Set.of(clericTrait, spellshapeTrait), "You go to extreme lengths to support your allies, even when it means bringing harm to yourself.");
            Feat restorativeChannel = new Feat("Restorative Channel", 8, Set.of(clericTrait), "You can remove conditions with divine grace.");
            Feat sanctifyArmament = new Feat("Sanctify Armament", 8, Set.of(clericTrait, divineTrait), "You touch a weapon and bring it into concordance with your deity.");
            Feat surgingFocus = new Feat("Surging Focus", 8, Set.of(clericTrait), "When an ally you can see falls in battle, your surge of righteous indignation allows you to draw upon untapped reserves of divine power.");
            Feat voidSiphon = new Feat("Void Siphon", 8, Set.of(clericTrait), "The raw energy of the Void saps the essence of the living.");
            Feat zealousRush = new Feat("Zealous Rush", 8, Set.of(clericTrait), "You bless yourself on the move.");
            Feat castigatingWeapon = new Feat("Castigating Weapon", 10, Set.of(clericTrait), "The force of your deity’s castigation strengthens your body so you can strike down the enemy and its allies.");
            Feat heroicRecovery = new Feat("Heroic Recovery", 10, Set.of(clericTrait, concentrateTrait, spellshapeTrait), "The restorative power of your healing invigorates the recipient.");
            Feat replenishmentOfWar = new Feat("Replenishment of War", 10, Set.of(clericTrait), "Striking out against your enemies draws praise and protection from your deity.");
            Feat sharedAvoidance = new Feat("Shared Avoidance", 10, Set.of(clericTrait), "You can project your premonitions of danger to your allies.");
            Feat shieldOfFaith = new Feat("Shield of Faith", 10, Set.of(clericTrait), "Residual energy from your domain spells bolsters your defenses.");
            Feat defensiveRecovery = new Feat("Defensive Recovery", 12, Set.of(clericTrait, concentrateTrait, spellshapeTrait), "Your faith provides temporary protection in addition to healing.");
            Feat domainFocus = new Feat("Domain Focus", 12, Set.of(clericTrait), "Your devotion to your deity’s domains grows greater, and so does the power granted to you.");
            Feat emblazonAntimagic = new Feat("Emblazon Antimagic", 12, Set.of(clericTrait), "Your deity’s symbol protects against offensive magic.");
            Feat fortunateRelief = new Feat("Fortunate Relief", 12, Set.of(clericTrait, fortuneTrait), "Your god favors your attempts to remove afflictions and conditions.");
            Feat sappingSymbol = new Feat("Sapping Symbol", 12, Set.of(clericTrait, divineTrait), "Your religious symbol glows with sacred energy, turning the attacker’s strength to weakness.");
            Feat sharedReplenishment = new Feat("Shared Replenishment", 12, Set.of(clericTrait), "When your deity blesses your warlike acts, you can extend that favor to your allies.");
            Feat channelingBlock = new Feat("Channeling Block", 14, Set.of(clericTrait), "You pour divine energy into a desperate block.");
            Feat deitysProtection = new Feat("Deity's Protection", 14, Set.of(clericTrait), "When you call upon your deity’s power to fulfill the promise of their domain, you gain divine protection.");
            Feat ebbAndFlow = new Feat("Ebb and Flow", 14, Set.of(clericTrait, concentrateTrait, spellshapeTrait), "You can pull forth both vitality and the void simultaneously to harm your enemies and heal your allies.");
            Feat fastChannel = new Feat("Fast Channel", 14, Set.of(clericTrait), "Divine power is always at your fingertips, swiftly responding to your call.");
            Feat lastingArmament = new Feat("Lasting Armament", 14, Set.of(clericTrait), "When you sanctify a weapon, it remains sanctified for an extended period.");
            Feat premonitionOfClarity = new Feat("Premonition of Clarity", 14, Set.of(clericTrait, fortuneTrait), "Your deity sends you a vision of faith to steel you against mental attacks.");
            Feat swiftBanishment = new Feat("Swift Banishment", 14, Set.of(clericTrait), "The force of your blow sends your victim back to its home plane.");
            Feat eternalBane = new Feat("Eternal Bane", 16, Set.of(clericTrait), "Your life has made you a nexus for your deity’s vile power.");
            Feat eternalBlessing = new Feat("Eternal Blessing", 16, Set.of(clericTrait), "Your deeds have brought your deity’s grace to you for all of eternity.");
            Feat reboundingSmite = new Feat("Rebounding Smite", 16, Set.of(clericTrait), "The energy from your smite persists for a moment, allowing you to pass it to a new target.");
            Feat remediate = new Feat("Remediate", 16, Set.of(clericTrait, concentrateTrait, spellshapeTrait), "If your next action is to use your divine font to cast a 3-action heal or harm spell, you can harness the residual energy to counterbalance opposing forces.");
            Feat resurrectionist = new Feat("Resurrectionist", 16, Set.of(clericTrait), "You can cause a creature you bring back from the brink of death to thrive and continue healing.");
            Feat divineApex = new Feat("Divine Apex", 18, Set.of(clericTrait), "You can pour divine power into an item, letting the wearer exceed their limits.");
            Feat improvedSwiftBanishment = new Feat("Improved Swift Banishment", 18, Set.of(clericTrait), "You easily banish creatures with your weapon.");
            Feat inviolable = new Feat("Inviolable", 18, Set.of(clericTrait), "Your deity punishes creatures that harm you.");
            Feat miraculousPossibility = new Feat("Miraculous Possibility", 18, Set.of(clericTrait), "Your deity empowers you to perform minor miracles, allowing you to readily adapt to the fluctuating needs of your duties.");
            Feat sharedClarity = new Feat("Shared Clarity", 18, Set.of(clericTrait), "You can project your premonitions of clarity to your allies.");
            Feat avatarsAudience = new Feat("Avatar's Audience", 20, Set.of(clericTrait), "Your extensive service affords you certain divine privileges.");
            Feat avatarsProtection = new Feat("Avatar's Protection", 20, Set.of(clericTrait), "In moments of danger, you can call upon your god’s form in an instant.");
            Feat makerOfMiracles = new Feat("Maker of Miracles", 20, Set.of(clericTrait), "You are a conduit for truly deific power.");
            Feat spellshapeChannel = new Feat("Spellshape Channel", 20, Set.of(clericTrait, concentrateTrait), "Deep understanding of divine revelations into the nature of vital essence allows you to freely manipulate the energy of life and death.");

            Feat spiritFamiliar1 = new Feat("Spirit Familiar", 1, Set.of(animistTrait), "When you attune to your apparitions during your daily preparations, you can choose to dedicate a small amount of your life force to allow one of them to physically manifest as a familiar, which gains the spirit trait. If your familiar is slain or destroyed, you lose all other benefits from the apparition until you remanifest the familiar during your next daily preparations. If you disperse the apparition you have manifested as a familiar, the familiar is destroyed.");
            Feat concealSpell = new Feat("Conceal Spell", 2, Set.of(animistTrait, concentrateTrait, spellshapeTrait, witchTrait, wizardTrait), "Through sheer mental effort, you can simplify the incantations and gestures needed to spellcast, leaving them barely noticeable.");
            Feat embodimentOfTheBalance = new Feat("Embodiment of the Balance", 2, Set.of(animistTrait), "Your place in the balance between the forces of life and entropy expands the spells you can pull from the spirit realms.");
            Feat enhancedFamiliar = new Feat("Enhanced Familiar", 2, Set.of(animistTrait, druidTrait, magusTrait, sorcererTrait, thaumaturgeTrait, witchTrait, wizardTrait), "You infuse your familiar with additional primal energy, increasing its abilities.");
            Feat incredibleFamiliar = new Feat("Incredible Familiar", 8, Set.of(animistTrait, thaumaturgeTrait, witchTrait), "Your familiar is imbued with even more magic than other familiars.");
            Feat apparitionCloud = new Feat("Apparition Cloud", 12, Set.of(animistTrait, misfortuneTrait, wanderingTrait), "With a mere thought, you discorporate your familiar into a thousand shards of spiritual magic, protecting both it and yourself from physical harm while making it difficult for enemies to move near you.");
            Feat echoingChannel = new Feat("Echoing Channel", 18, Set.of(animistTrait, clericTrait, concentrateTrait, spellshapeTrait), "When you pull forth vitality or void energy, you also create a smaller pocket of that energy.");

            Feat animalCompanion = new Feat("Animal Companion", 1, Set.of(druidTrait, rangerTrait), "You gain the service of a young animal companion that travels with you on your adventures and obeys any simple commands you give it to the best of its abilities.");
            animalCompanion.setAvailableToClasses(List.of(druid, ranger));
            Feat animalEmpathy1 = new Feat("Animal Empathy", 1, Set.of(druidTrait), "You have a connection to the creatures of the natural world that allows you to communicate with them on a rudimentary level.");
            Feat leshyFamiliar = new Feat("Leshy Familiar", 1, Set.of(druidTrait), "You call a minor spirit of nature into a plant body, creating a leshy companion to aid you in your spellcasting.");
            leshyFamiliar.setAvailableToClasses(List.of(druid));
            Feat plantEmpathy = new Feat("Plant Empathy", 1, Set.of(druidTrait), "You have a connection to flora that allows you to communicate with them on a rudimentary level.");
            Feat stormBorn = new Feat("Storm Born", 1, Set.of(druidTrait), "You are at home out in the elements, reveling in the power of nature unleashed.");
            Feat untamedFormFeat = new Feat("Untamed Form", 1, Set.of(druidTrait), "You are one with the wild, always changing and adapting to meet any challenge.");
            Feat verdantWeapon = new Feat("Verdant Weapon", 1, Set.of(druidTrait, explorationTrait), "You cultivate a seed that can sprout into a wooden staff, vine whip, or another weapon.");
            Feat widenSpell = new Feat("Widen Spell", 1, Set.of(druidTrait, manipulateTrait, oracleTrait, sorcererTrait, spellshapeTrait, witchTrait, wizardTrait), "You manipulate the energy of your spell, causing it to spread out and affect a wider area.");
            Feat callOfTheWild = new Feat("Call of the Wild", 2, Set.of(druidTrait), "You call upon the creatures of nature to come to your aid.");
            Feat orderExplorer = new Feat("Order Explorer", 2, Set.of(druidTrait), "You have learned the secrets of another druidic order, passing whatever rites of initiation that order requires and gaining access to its secrets.");
            Feat anthropomorphicShape = new Feat("Anthropomorphic Shape", 4, Set.of(druidTrait), "Humanoids' supposed place apart from animals is folly—taking on their forms just requires some extra practice.");
            Feat elementalSummons = new Feat("Elemental Summons", 4, Set.of(druidTrait), "You can call the elements to you.");
            Feat forestPassage = new Feat("Forest Passage", 4, Set.of(druidTrait), "You can always find a path, almost as if foliage parted before you.");
            Feat formControl = new Feat("Form Control", 4, Set.of(druidTrait, manipulateTrait, spellshapeTrait), "With additional care and effort, you can take on an alternate shape for a longer period of time.");
            Feat leshyFamiliarSecrets = new Feat("Leshy Familiar Secrets", 4, Set.of(druidTrait), "The leaf order’s secrets allow your familiar to take advantage of its leshy form.");
            Feat matureAnimalCompanion1 = new Feat("Mature Animal Companion", 4, Set.of(druidTrait), "Your animal companion has grown up over the course of your adventures, becoming a mature animal companion and gaining additional capabilities.");
            Feat orderMagic = new Feat("Order Magic", 4, Set.of(druidTrait), "You have delved deeper into the teaching of a new order, gaining access to a coveted order spell.");
            Feat snowdriftSpell = new Feat("Snowdrift Spell", 4, Set.of(coldTrait, druidTrait, manipulateTrait, spellshapeTrait), "The howling wind and precipitation of your magic turn to thick snow.");
            Feat currentSpell = new Feat("Current Spell", 6, Set.of(concentrateTrait, druidTrait, spellshapeTrait), "As you use your magic to manipulate air or water, you spin off some of its currents to form a barrier around you.");
            Feat grownOfOak = new Feat("Grown of Oak", 6, Set.of(druidTrait), "You can make your skin take on the woody endurance of an ancient tree and have your familiar follow suit.");
            Feat insectShape = new Feat("Insect Shape", 6, Set.of(druidTrait), "Your understanding of life expands, allowing you to mimic a wider range of creatures.");
            Feat instinctiveSupport = new Feat("Instinctive Support", 6, Set.of(druidTrait), "When you support your animal companion, your companion supports you in turn.");
            Feat stormRetribution = new Feat("Storm Retribution", 6, Set.of(druidTrait), "You lash out, directing a burst of storming fury toward a creature that has harmed you.");
            Feat deimaticDisplay = new Feat("Deimatic Display", 8, Set.of(druidTrait), "Imitating animal threat displays, you make yourself appear larger and more imposing.");
            Feat ferociousShape = new Feat("Ferocious Shape", 8, Set.of(druidTrait), "You've mastered the shape of dinosaurs.");
            Feat feyCaller = new Feat("Fey Caller", 8, Set.of(druidTrait), "You have learned some of the tricks the fey use to bend primal magic toward illusions and trickery.");
            Feat floralRestoration = new Feat("Floral Restoration", 8, Set.of(druidTrait, healingTrait, vitalityTrait), "You request that nearby plants share their vitality with you to replenish your body and magic.");
            Feat incredibleCompanion1 = new Feat("Incredible Companion", 8, Set.of(druidTrait), "Your animal companion continues to grow and develop.");
            Feat raiseMenhir = new Feat("Raise Menhir", 8, Set.of(druidTrait), "You raise a druidic monument, such as a standing stone or warding tree, from the ground, creating a powerful primal ward that blocks other types of magic.");
            Feat soaringShape = new Feat("Soaring Shape", 8, Set.of(druidTrait), "Wings free you from the shackles of the ground below.");
            Feat windCaller = new Feat("Wind Caller", 8, Set.of(druidTrait), "You bid the winds to aid you, carrying you through the air and allowing you passage through the strongest headwinds.");
            Feat elementalShape = new Feat("Elemental Shape", 10, Set.of(druidTrait), "You understand the fundamental elements of nature such that you can imbue them into your body and manifest as a living embodiment of those elements.");
            Feat healingTransformation = new Feat("Healing Transformation", 10, Set.of(druidTrait, spellshapeTrait), "You can take advantage of shapechanging magic to close wounds and patch injuries.");
            Feat overwhelmingEnergy = new Feat("Overwhelming Energy", 10, Set.of(druidTrait, manipulateTrait, sorcererTrait, spellshapeTrait, wizardTrait), "With a complex gesture, you call upon the primal power of your spell to overcome enemies’ resistances.");
            Feat plantShape = new Feat("Plant Shape", 10, Set.of(druidTrait), "You can take the shape of a plant creature.");
            Feat primalHowl = new Feat("Primal Howl", 10, Set.of(druidTrait), "Your companion can let out a howl laced with your primal magic.");
            Feat pristineWeapon = new Feat("Pristine Weapon", 10, Set.of(druidTrait), "Your verdant weapon can cut through the resistances of magical creatures.");
            Feat sideBySide1 = new Feat("Side By Side", 10, Set.of(druidTrait), "You and your animal companion fight in tandem, distracting your foes and keeping them off balance.");
            Feat thunderclapSpell = new Feat("Thunderclap Spell", 10, Set.of(druidTrait, sonicTrait, spellshapeTrait), "Your lightning splits the air, generating a booming shock wave.");
            Feat dragonShape = new Feat("Dragon Shape", 12, Set.of(druidTrait), "You can take on the shape of some of the world's most fearsome creatures.");
            Feat garlandSpell = new Feat("Garland Spell", 12, Set.of(druidTrait, manipulateTrait, spellshapeTrait), "If your next action is to Cast a Spell with the fungus or plant trait, a garland of plants grows in a 10-foot burst in the spell’s range. The plants are difficult terrain and hazardous terrain, covered in your choice of thorns or poisonous vines. Any creature that moves into one of these squares or ends its turn in one takes 2d6 damage (piercing damage for thorns or poison for vines). A creature can take this damage only once per turn. You and your familiar are immune to this damage.\n" +
                    "\n" +
                    "The plants last for 1 minute or until you cast another Garland Spell, whichever comes first.\n" +
                    "\n" +
                    "The damage increases to 3d6 at 16th level and 4d6 at 20th level.\n");
            Feat primalFocus = new Feat("Primal Focus", 12, Set.of(druidTrait), "Your connection to nature is particularly strong, and the spirits of nature flock around you, helping you replenish your focus.");
            Feat primalSummonsFeat = new Feat("Primal Summons", 12, Set.of(druidTrait), "Whenever you summon an ally, you can empower it with the elemental power of air, earth, fire, or water.");
            Feat wanderingOasis = new Feat("Wandering Oasis", 12, Set.of(druidTrait), "You’re surrounded by soothing energy.");
            Feat bizarreTransformation = new Feat("Bizarre Transformation", 14, Set.of(druidTrait, manipulateTrait, spellshapeTrait), "The forms you take on defy belief—chimerical sights of twisted antlers or acidic drool.");
            Feat cleansingTransformation = new Feat("Cleansing Transformation", 14, Set.of(druidTrait), "You learn to cleanse bodily toxins alongside the transformations of your shape-changing magic.");
            Feat reactiveTransformation = new Feat("Reactive Transformation", 14, Set.of(druidTrait), "You transform reflexively when in danger.");
            Feat sowSpell = new Feat("Sow Spell", 14, Set.of(concentrateTrait, druidTrait, spellshapeTrait), "You fold your spell into a seed.");
            Feat specializedCompanion1 = new Feat("Specialized Companion", 14, Set.of(druidTrait), "Your animal companion continues to grow in power and ability.");
            Feat timelessNature = new Feat("Timeless Nature", 14, Set.of(druidTrait), "With primal magic sustaining you, you cease aging.");
            Feat verdantMetamorphosis = new Feat("Verdant Metamorphosis", 14, Set.of(druidTrait), "You have turned into a plant version of yourself, gaining the plant trait and losing traits inappropriate for your new form (typically humanoid). You also gain the Verdant Rest action.");
            Feat impalingBriarsFeat = new Feat("Impaling Briars", 16, Set.of(druidTrait), "You can fill an area with devastating briars.");
            Feat monstrosityShape = new Feat("Monstrosity Shape", 16, Set.of(druidTrait), "You can transform into a powerful magical creature.");
            Feat tooMuchToSwallow = new Feat("Too Much to Swallow", 16, Set.of(druidTrait), "While you might be small enough to grab normally, you can change that at a moment's notice.");
            Feat upliftingWinds = new Feat("Uplifting Winds", 16, Set.of(druidTrait), "The winds are eager to keep you aloft.");
            Feat invokeDisaster = new Feat("Invoke Disaster", 18, Set.of(druidTrait), "You can invoke nature’s fury upon your foes.");
            Feat perfectFormControl = new Feat("Perfect Form Control", 18, Set.of(druidTrait), "Thanks to magic and muscle memory, you can stay in your alternate shapes indefinitely.");
            Feat primalAegis = new Feat("Primal Aegis", 18, Set.of(druidTrait), "You surround yourself with a thick field of protective primal energy.");
            Feat hierophantsPower = new Feat("Hierophant's Power", 20, Set.of(druidTrait), "You have entwined yourself with the natural world, and its full power flows through you.");
            Feat leyLineConduit = new Feat("Ley Line Conduit", 20, Set.of(concentrateTrait, druidTrait, manipulateTrait, spellshapeTrait), "You can draw magic from the ley lines of the world.");
            Feat trueShapeshifter = new Feat("True Shapeshifter", 20, Set.of(concentrateTrait, druidTrait), "You transcend the limitations of form.");

            Feat poisonResistance = new Feat("Poison Resistance", 2, Set.of(alchemistTrait, druidTrait), "Your affinity for the natural world grants you protection against some of its dangers.");

            Feat crossbowAce = new Feat("Crossbow Ace", 1, Set.of(rangerTrait), "Your deep understanding of the crossbow allows you to reload efficiently while moving yourself out of the line of return fire.");
            Feat huntedShot = new Feat("Hunted Shot", 1, Set.of(flourishTrait, rangerTrait), "You take two quick shots against the one you hunt.");
            huntedShot.setAvailableToClasses(List.of(ranger));
            Feat initiateWarden = new Feat("Initiate Warden", 1, Set.of(rangerTrait), "You’ve trained with one of the ranger sects known as wardens, who practice a specialized type of primal magic.");
            Feat monsterHunter = new Feat("Monster Hunter", 1, Set.of(rangerTrait), "You quickly assess your prey and apply what you know.");
            Feat twinTakedown = new Feat("Twin Takedown", 1, Set.of(flourishTrait, rangerTrait), "You swiftly attack your hunted prey with each of your weapons, potentially combining their damage into a single devastating attack.");
            Feat animalEmpathy2 = new Feat("Animal Empathy", 2, Set.of(rangerTrait), "You have a connection to the creatures of the natural world that allows you to communicate with them on a rudimentary level.");
            Feat favoredTerrain = new Feat("Favored Terrain", 2, Set.of(rangerTrait), "You have studied a specific terrain to overcome its challenges.");
            Feat huntersAim = new Feat("Hunter's Aim", 2, Set.of(concentrateTrait, rangerTrait), "When you focus on aiming, your attack becomes particularly accurate.");
            Feat monsterWarden = new Feat("Monster Warden", 2, Set.of(rangerTrait), "You understand how to defend against your prey.");
            Feat advancedWarden = new Feat("Advanced Warden", 4, Set.of(rangerTrait), "You unlock more powerful primal spells.");
            Feat companionsCry = new Feat("Companion's Cry", 4, Set.of(rangerTrait), "You can urge your companion to do its utmost.");
            Feat disruptPrey = new Feat("Disrupt Prey", 4, Set.of(rangerTrait), "Make a melee Strike against your prey. If the attack is a critical hit, you disrupt the triggering action.");
            Feat farShot = new Feat("Far Shot", 4, Set.of(rangerTrait), "Your experience in the field has taught you how to focus your aim at a distance, increasing your accuracy.");
            Feat favoredPrey = new Feat("Favored Prey", 4, Set.of(rangerTrait), "You have studied a specific type of wild creature and can hunt it more easily.");
            Feat scoutsWarning = new Feat("Scout's Warning", 4, Set.of(rangerTrait, rogueTrait), "You visually or audibly warn your allies of danger, granting them each a +1 circumstance bonus to their initiative rolls, or a +2 circumstance bonus if you're using the Scout exploration activity.");
            Feat additionalRecollection = new Feat("Additional Recollection", 6, Set.of(rangerTrait), "You scan the battlefield quickly, remembering critical details about multiple opponents you face.");
            Feat masterfulWarden = new Feat("Masterful Warden", 6, Set.of(rangerTrait), "Your mastery of warden magic increases.");
            Feat matureAnimalCompanion2 = new Feat("Mature Animal Companion", 6, Set.of(rangerTrait), "Your animal companion becomes a mature animal companion and gains additional capabilities.");
            Feat skirmishStrike = new Feat("Skirmish Strike", 6, Set.of(flourishTrait, rangerTrait, rogueTrait), "Your feet and weapon move in tandem.");
            Feat snapShot = new Feat("Snap Shot", 6, Set.of(rangerTrait), "You can react with ranged weapons when a creature is in close quarters.");
            Feat swiftTracker = new Feat("Swift Tracker", 6, Set.of(rangerTrait), "Your keen eyes catch signs of passage even when you’re moving.");
            Feat deadlyAim = new Feat("Deadly Aim", 8, Set.of(flourishTrait, rangerTrait), "You aim for your prey’s weak spots, making your shot more challenging but dealing more damage if you hit.");
            Feat hazardFinder = new Feat("Hazard Finder", 8, Set.of(rangerTrait), "You have an intuitive ability to sense hazards.");
            Feat terrainMaster = new Feat("Terrain Master", 8, Set.of(rangerTrait), "You are able to adapt to your surroundings in any natural terrain.");
            Feat wardensBoon = new Feat("Warden's Boon", 8, Set.of(rangerTrait), "You point out vulnerabilities present in your hunted prey, granting the benefits listed in Hunt Prey and your hunter’s edge to an ally until the end of their next turn.");
            Feat camouflage = new Feat("Camouflage", 10, Set.of(rangerTrait), "You alter your appearance to blend in to the wilderness.");
            Feat incredibleCompanion2 = new Feat("Incredible Companion", 10, Set.of(rangerTrait), "Your animal companion continues to grow and develop.");
            Feat masterMonsterHunter = new Feat("Master Monster Hunter", 10, Set.of(rangerTrait), "You have a nearly encyclopedic knowledge of all creatures of the world.");
            Feat peerlessWarden = new Feat("Peerless Warden", 10, Set.of(rangerTrait), "Your mastery of primal magic has given you access to the greatest secrets of warden magic.");
            Feat penetratingShot = new Feat("Penetrating Shot", 10, Set.of(rangerTrait), "You shoot clear through an intervening creature to hit your prey.");
            Feat wardensStep = new Feat("Warden's Step", 10, Set.of(rangerTrait), "You can guide your allies to move quietly through the wilderness.");
            Feat distractingShot = new Feat("Distracting Shot", 12, Set.of(rangerTrait), "The sheer power of your attacks, or the overwhelming number of them, leaves an enemy flustered.");
            Feat doublePrey = new Feat("Double Prey", 12, Set.of(rangerTrait), "You can focus on two foes at once, hunting both of them down.");
            Feat secondSting = new Feat("Second Sting", 12, Set.of(pressTrait, rangerTrait), "You read your prey’s movements and transform them into openings, so failures with one weapon set up glancing blows with the other.");
            Feat sideBySide2 = new Feat("Side By Side", 12, Set.of(rangerTrait), "You and your animal companion fight in tandem.");
            Feat wardensFocus = new Feat("Warden's Focus", 12, Set.of(rangerTrait), "Your connection with your surroundings deepens and expands, allowing you to draw in more of nature’s primal power as you focus.");
            Feat sharedPrey = new Feat("Shared Prey", 14, Set.of(rangerTrait), "Hunting as a duo, you and your ally both single out your prey.");
            Feat stealthyCompanion = new Feat("Stealthy Companion", 14, Set.of(rangerTrait), "You’ve trained your animal companion to blend in to its surroundings.");
            Feat wardensGuidance = new Feat("Warden's Guidance", 14, Set.of(rangerTrait), "You convey your prey’s location to your allies with a series of careful words or gestures.");
            Feat greaterDistractingShot = new Feat("Greater Distracting Shot", 16, Set.of(rangerTrait), "Even a single missile can throw off your enemy’s balance, and more powerful attacks leave it flustered for longer.");
            Feat improvedTwinRiposte2 = new Feat("Improved Twin Riposte", 16, Set.of(rangerTrait), "At the start of each of your turns, you gain an additional reaction that you can use only to perform a Twin Riposte.");
            Feat legendaryMonsterHunter = new Feat("Legendary Monster Hunter", 16, Set.of(rangerTrait), "Your knowledge of monsters is so incredible that it reveals glaring flaws in your prey.");
            Feat specializedCompanion2 = new Feat("Specialized Companion", 16, Set.of(rangerTrait), "Your animal companion continues to grow in power and ability, and it is now cunning enough to become specialized.");
            Feat wardensReload = new Feat("Warden's Reload", 16, Set.of(rangerTrait), "Your mastery of magic and weapons like the crossbow allow you to wield both with equal ease.");
            Feat impossibleFlurry = new Feat("Impossible Flurry", 18, Set.of(flourishTrait, rangerTrait), "You forgo precision to attack at an impossible speed.");
            Feat manifoldEdge = new Feat("Manifold Edge", 18, Set.of(rangerTrait), "You’ve learned to leverage every possible edge.");
            Feat masterfulCompanion = new Feat("Masterful Companion", 18, Set.of(rangerTrait), "Your animal companion shares your incredible hunting skills, allowing it to take down your shared prey with ease.");
            Feat perfectShot = new Feat("Perfect Shot", 18, Set.of(flourishTrait, rangerTrait), "After watching the motions of combat with incredible intensity and precision, you fire at your prey at the perfect moment to deliver maximum pain.");
            Feat shadowHunter = new Feat("Shadow Hunter", 18, Set.of(rangerTrait), "You blend in to your surroundings so well that others have trouble telling you apart from the terrain.");
            Feat legendaryShot = new Feat("Legendary Shot", 20, Set.of(rangerTrait), "You focus on your hunted prey, perceiving angles, air resistance, and every variable that would affect your ranged attack.");
            Feat toTheEndsOfTheEarth = new Feat("To the Ends of the Earth", 20, Set.of(rangerTrait), "Your ability to track your prey has surpassed explanation, allowing you to trace your prey’s movements and predict its location with ease.");
            Feat tripleThreat = new Feat("Triple Threat", 20, Set.of(rangerTrait), "You can divide your attention three ways when hunting.");
            Feat ultimateSkirmisher = new Feat("Ultimate Skirmisher", 20, Set.of(rangerTrait), "You are so skilled at navigating the wild, your movement is completely unaffected by terrain.");

            Feat quickDraw = new Feat("Quick Draw", 2, Set.of(gunslingerTrait, rangerTrait, rogueTrait), "You draw your weapon and attack with the same motion.");
            Feat runningReload = new Feat("Running Reload", 4, Set.of(gunslingerTrait, rangerTrait), "You can reload your weapon on the move.");

            Feat cackle = new Feat("Cackle", 1, Set.of(witchTrait), "Your patron’s power fills you with confidence, letting you sustain a magical working even as a quick burst of laughter leaves your lips.");
            cackle.setAvailableToClasses(List.of(witch));
            Feat cauldron = new Feat("Cauldron", 1, Set.of(witchTrait), "You can brew magic in your cauldron, creating useful magical concoctions.");
            Feat counterspell = new Feat("Counterspell", 1, Set.of(witchTrait, wizardTrait), "When a foe Casts a Spell and you can see its manifestations, you can use your magic to disrupt it.");
            Feat witchsArmaments = new Feat("Witch's Armaments", 1, Set.of(witchTrait), "Your patron’s power changes your body to ensure you are never defenseless.");
            Feat basicLesson = new Feat("Basic Lesson", 2, Set.of(witchTrait), "Your patron grants you a special lesson, revealing a hidden facet of its nature.");
            Feat familiarsLanguage = new Feat("Familiar's Language", 2, Set.of(witchTrait), "You’ve learned to speak with your familiar and other creatures like it.");
            Feat ritesOfConvocation = new Feat("Rites of Convocation", 4, Set.of(witchTrait), "Your patron grants you the power to summon other creatures to aid you.");
            Feat sympatheticStrike = new Feat("Sympathetic Strike", 4, Set.of(witchTrait), "You collect your patron’s magic into one of your witch armaments, causing them to shine with runes, light, or another signifier of your patron.");
            Feat ceremonialKnife = new Feat("Ceremonial Knife", 6, Set.of(witchTrait), "You have prepared a special knife to direct energies when spellcasting.");
            Feat greaterLesson = new Feat("Greater Lesson", 6, Set.of(witchTrait), "Your patron grants you greater knowledge.");
            Feat wildWitchsArmaments = new Feat("Wild Witch's Armaments", 6, Set.of(witchTrait), "Your patron's power continues to enhance your natural offensive capabilities.");
            Feat witchsCharge = new Feat("Witch's Charge", 6, Set.of(detectionTrait, witchTrait), "You forge a magical link with another creature, granting you awareness of that creature’s condition and creating a conduit for spellcasting.");
            Feat murksight = new Feat("Murksight", 8, Set.of(witchTrait), "Your vision pierces through non-magical fog, mist, rain, and snow.");
            Feat spiritFamiliar2 = new Feat("Spirit Familiar", 8, Set.of(witchTrait), "Your familiar can subsume its body to become pure spirit.");
            Feat stitchedFamiliar = new Feat("Stitched Familiar", 8, Set.of(witchTrait), "Your familiar can shed its material form, becoming a mass of animated magic.");
            Feat witchsBottle = new Feat("Witch's Bottle", 8, Set.of(witchTrait), "You spend 10 minutes and 1 Focus Point brewing a special potion containing the power of one of your hexes that targets a creature.");
            Feat doubleDouble = new Feat("Double, Double", 10, Set.of(witchTrait), "For each temporary oil or potion you brew during your daily preparations, you brew two copies of it.");
            Feat majorLesson = new Feat("Major Lesson", 10, Set.of(witchTrait), "Your patron grants you even greater secrets.");
            Feat witchsCommunion = new Feat("Witch's Communion", 10, Set.of(witchTrait), "You can keep watch over multiple charges.");
            Feat covenSpell = new Feat("Coven Spell", 12, Set.of(spellshapeTrait, witchTrait), "You rhyme with your ally’s incantations or echo their movements, linking your magic to empower their spell in one of two ways:\n" +
                    "If their spell deals damage and doesn’t have a duration, you grant that spell a status bonus to damage equal to its rank.\n" +
                    "If their spell doesn’t have a spellshape effect applied to it, apply the effects of any one spellshape feat you know to the spell. The spellshape feat must be one that can be applied to the triggering spell, and you must be able to use it (for instance, if the spellshape feat is usable only a limited number of times per day).");
            Feat hexFocus = new Feat("Hex Focus", 12, Set.of(witchTrait), "Your patron’s teachings have allowed you to achieve a deeper focus.");
            Feat witchsBroom = new Feat("Witch's Broom", 12, Set.of(witchTrait), "A broom is the only steed you need to fly through the night sky.");
            Feat patronsPresence = new Feat("Patron's Presence", 14, Set.of(witchTrait), "Your patron can direct its attention through your familiar, and its mere presence becomes an ominous weight on the minds of other beings to distract them and blot out their magic.");
            Feat reflectSpell = new Feat("Reflect Spell", 14, Set.of(witchTrait, wizardTrait), "When you successfully use Counterspell to counteract a spell that affects targeted creatures or an area, you can turn that spell’s effect back on its caster.");
            Feat ritesOfTransfiguration = new Feat("Rites of Transfiguration", 14, Set.of(witchTrait), "You can adapt your patron’s power to transform other creatures into forms more befitting their behavior or your whims.");
            Feat siphonPower = new Feat("Siphon Power", 16, Set.of(witchTrait), "You draw upon the reservoir of your patron’s magic that resides within your familiar.");
            Feat patronsClaim = new Feat("Patron's Claim", 18, Set.of(witchTrait), "Your patron partially manifests itself through your familiar to claim a foe’s power for its own.");
            Feat splitHex = new Feat("Split Hex", 18, Set.of(concentrateTrait, spellshapeTrait, witchTrait), "You siphon some of the power from an offensive hex you cast to direct it at a second target as well.");
            Feat hexMaster = new Feat("Hex Master", 20, Set.of(witchTrait), "You embody the link to your patron so completely that you can cast your hexes in rapid succession.");
            Feat patronsTruth = new Feat("Patron's Truth", 20, Set.of(witchTrait), "You have mastered the greatest secrets of your patron’s magic and learned a fundamental truth about your patron, even if their identity still remains a mystery.");
            Feat witchsHut = new Feat("Witch's Hut", 20, Set.of(witchTrait), "Your home is an animated structure that obeys your commands.");

            Feat armorRegimentTraining = new Feat("Armor Regiment Training", 1, Set.of(commanderTrait), "You've trained for grueling marches in full battle kit.");
            armorRegimentTraining.setAvailableToClasses(List.of(commander));
            Feat combatAssessment = new Feat("Combat Assessment", 1, Set.of(commanderTrait, fighterTrait), "You make a telegraphed attack to learn about your foe.");
            combatAssessment.setAvailableToClasses(List.of(fighter, commander));
            Feat observationalAnalysis = new Feat("Observational Analysis", 4, Set.of(commanderTrait), "You are able to rapidly discern relevant details about your opponents in the heat of combat.");
            Feat reactiveInterference = new Feat("Reactive Interference", 12, Set.of(commanderTrait, rogueTrait), "Grabbing a sleeve, swiping with your weapon, or creating another obstruction, you reflexively foil an enemy’s response.");

            Feat bodyguard = new Feat("Bodyguard", 1, Set.of(guardianTrait), "You swear a vow to protect one of your allies at all costs, regardless of the risk this might pose to you.");
            bodyguard.setAvailableToClasses(List.of(guardian));
            Feat repositioningBlock = new Feat("Repositioning Block", 8, Set.of(guardianTrait), "As you absorb a blow from an enemy, you can use their attack's momentum against them.");
            Feat openingStance2 = new Feat("Opening Stance", 14, Set.of(guardianTrait), "At the first sign of trouble, often before you consciously realize the danger, you drop into a stance with a mere thought.");

            Feat acuteVision = new Feat("Acute Vision", 1, Set.of(barbarianTrait), "When you are raging, your visual senses improve, granting you darkvision.");
            acuteVision.setAvailableToClasses(List.of(barbarian));
            Feat suddenCharge = new Feat("Sudden Charge", 1, Set.of(barbarianTrait, fighterTrait, flourishTrait), "With a quick sprint, you dash up to your foe and swing.");
            suddenCharge.setAvailableToClasses(List.of(fighter, barbarian));
            Feat acuteScent = new Feat("Acute Scent", 2, Set.of(barbarianTrait), "When your anger is heightened, your sense of smell improves.");
            Feat intimidatingStrike = new Feat("Intimidating Strike", 2, Set.of(barbarianTrait, emotionTrait, fearTrait, fighterTrait, mentalTrait), "Your blow not only wounds creatures but also shatters their confidence.");
            intimidatingStrike.setAvailableToClasses(List.of(fighter, barbarian));
            Feat barrelingCharge = new Feat("Barreling Charge", 4, Set.of(barbarianTrait, fighterTrait, flourishTrait), "You rush forward, moving enemies aside to reach your foe.");
            barrelingCharge.setAvailableToClasses(List.of(fighter, barbarian));
            Feat supernaturalSenses = new Feat("Supernatural Senses", 4, Set.of(barbarianTrait, rageTrait), "Your scent is preternaturally sharp, and you can always rely on your sense of smell to help guide you when your vision is compromised.");
            Feat swipe = new Feat("Swipe", 4, Set.of(barbarianTrait, fighterTrait, flourishTrait), "You make a wide, arcing swing.");
            swipe.setAvailableToClasses(List.of(fighter, barbarian));
            Feat nocturnalSenses = new Feat("Nocturnal Senses", 6, Set.of(barbarianTrait, rageTrait), "Your senses gain even greater clarity.");
            Feat reactiveStrikeFeat = new Feat("Reactive Strike", 6, Set.of(barbarianTrait, championTrait, commanderTrait, exemplarTrait, guardianTrait, magusTrait, swashbucklerTrait), "You lash out at a foe that leaves an opening.");
            reactiveStrikeFeat.setAvailableToClasses(List.of(
                    champion,
                    barbarian,
                    commander,
                    exemplar,
                    guardian
            ));
            Feat instinctiveStrike = new Feat("Instinctive Strike", 8, Set.of(barbarianTrait), "You trust your instincts and your sense of smell, using all your senses to pinpoint your opponent's location.");
            Feat suddenLeap = new Feat("Sudden Leap", 8, Set.of(barbarianTrait, fighterTrait), "You make an impressive leap and swing while you soar.");
            suddenLeap.setAvailableToClasses(List.of(fighter, barbarian));
            Feat overpoweringCharge = new Feat("Overpowering Charge", 10, Set.of(barbarianTrait, fighterTrait), "You trample foes as you charge past.");
            Feat terrifyingHowl = new Feat("Terrifying Howl", 10, Set.of(auditoryTrait, barbarianTrait, rageTrait), "You unleash a terrifying howl.");
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
            Feat shieldOfReckoning = new Feat("Shield of Reckoning", 10, Set.of(championTrait), "When you shield your ally against an attack, you call upon your power to protect your ally further.");
            Feat shieldOfGrace = new Feat("Shield of Grace", 16, Set.of(championTrait), "You protect an ally with both your shield and your body.");

            Feat eliminateRedHerrings = new Feat("Eliminate Red Herrings", 1, Set.of(investigatorTrait), "You have a keen sense for avoiding spurious lines of inquiry.");
            eliminateRedHerrings.setAvailableToClasses(List.of(investigator));
            Feat trapFinder = new Feat("Trap finder", 1, Set.of(investigatorTrait, rogueTrait), "You have an intuitive sense that alerts you to the presence of traps.");
            Feat predictivePurchase1 = new Feat("Predictive Purchase", 6, Set.of(investigatorTrait), "You have just the thing for the situation.");
            Feat senseTheUnseen = new Feat("Sense the Unseen", 14, Set.of(investigatorTrait, rangerTrait, rogueTrait), "When you look for foes, you can catch even the slightest cues, such as their minute movements or the shifting of air currents on your skin.");
            Feat implausiblePurchase1 = new Feat("Implausible Purchase", 16, Set.of(investigatorTrait), "It seems impossible, but you've analyzed every angle and are able to just keep pulling out exactly the item you need, even in far-flung locations.");
            Feat reconstructTheScene = new Feat("Reconstruct the Scene", 16, Set.of(concentrateTrait, investigatorTrait, rogueTrait), "You spend 1 minute surveying a small location (such as a single room) to get an impression of events that occurred there in the last day.");

            Feat focusedFascination = new Feat("Focused Fascination", 1, Set.of(swashbucklerTrait), "When you use Fascinating Performance in a combat encounter, you need only a success, rather than a critical success, to fascinate your target.");
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
            Feat dwarvenLore = new Feat("Dwarven Lore", 1, Set.of(dwarfTrait), "You eagerly absorbed the old stories and traditions of your ancestors, your gods, and your people, studying subjects and techniques passed down for generation upon generation.");
            Feat dwarvenWeaponFamiliarity = new Feat("Dwarven Weapon Familiarity", 1, Set.of(dwarfTrait), "Your kin have instilled in you an affinity for hard-hitting weapons, and you prefer these to more elegant arms.");
            Feat mountainStrategy = new Feat("Mountain Strategy", 1, Set.of(dwarfTrait), "Dwarves have a long history fighting common foes, and you've mastered the ancient tactics to better face these enemies.");
            Feat rockRunner = new Feat("Rock Runner", 1, Set.of(dwarfTrait), "Your innate connection to stone makes you adept at moving across uneven surfaces.");
            Feat stonemasonsEye = new Feat("Stonemason's Eye", 1, Set.of(dwarfTrait), "You understand the intricacies of stonework.");
            Feat unburdenedIron = new Feat("Unburdened Iron", 1, Set.of(dwarfTrait), "You've learned techniques first devised by your ancestors during their ancient wars, allowing you to comfortably wear massive suits of armor.");
            Feat boulderRoll = new Feat("Boulder Roll", 5, Set.of(dwarfTrait), "Your dwarven build allows you to push foes around, just like a mighty boulder tumbles through a subterranean cavern.");
            Feat defyTheDarkness = new Feat("Defy the Darkness", 5, Set.of(dwarfTrait), "Using ancient dwarven methods developed to fight enemies wielding magical darkness, you've honed your darkvision and sworn not to use such magic yourself.");
            Feat dwarvenReinforcement = new Feat("Dwarven Reinforcement", 5, Set.of(dwarfTrait), "You can use your knowledge of engineering and metalwork to temporarily strengthen thick objects and structures.");
            Feat echoesInStone = new Feat("Echoes in Stone", 9, Set.of(concentrateTrait, dwarfTrait), "You pause a moment to attune your senses to the stone around you.");
            Feat mountainsStoutness = new Feat("Mountain's Stoutness", 9, Set.of(dwarfTrait), "Your hardiness lets you withstand more punishment than most.");
            Feat stoneBones = new Feat("Stone Bones", 9, Set.of(dwarfTrait), "Your intractable nature can help you shrug off even the most grievous injuries.");
            Feat stonewalker = new Feat("Stonewalker", 9, Set.of(dwarfTrait), "You have a deep reverence for and connection to stone.");
            Feat marchTheMines = new Feat("March the Mines", 13, Set.of(dwarfTrait), "You march through the earth and lead an ally along.");
            Feat telluricPower = new Feat("Telluric Power", 13, Set.of(dwarfTrait), "You channel strength from the earth beneath your feet to pummel your enemies.");
            Feat stonegate = new Feat("Stonegate", 17, Set.of(dwarfTrait), "Earthen barriers no longer impede your progress.");
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
            Feat animalElocutionist = new Feat("Animal Elocutionist", 1, Set.of(gnomeTrait), "You hear animal sounds as conversations instead of unintelligent noise, and you can respond in turn.");
            Feat feyFellowship = new Feat("Fey Fellowship", 1, Set.of(gnomeTrait), "Your enhanced fey connection (either through your blood or via prolonged contact with their kind) affords you a warmer reception from creatures of the First World as well as tools to foil their tricks or withstand their magic.");
            Feat firstWorldMagic = new Feat("First World Magic", 1, Set.of(gnomeTrait), "Your connection to the First World grants you a primal innate spell, much like those of the fey.");
            Feat gnomeObsession = new Feat("Gnome Obsession", 1, Set.of(gnomeTrait), "You might have a flighty nature, but when a topic captures your attention, you dive into it headfirst.");
            Feat gnomeWeaponFamiliarity = new Feat("Gnome Weapon Familiarity", 1, Set.of(gnomeTrait), "You favor unusual weapons tied to your people, such as blades with curved and peculiar shapes.");
            Feat illusionSense = new Feat("Illusion Sense", 1, Set.of(gnomeTrait), "Your ancestors spent their days cloaked and cradled in illusions, and as a result, sensing illusion magic is second nature to you.");
            Feat razzleDazzle = new Feat("Razzle-Dazzle", 1, Set.of(gnomeTrait), "You've spent considerable time practicing the manipulation of light, weaponizing your blade's reflection or bolstering the luminosity of magical displays to unconventional heights.");
            Feat energizedFont = new Feat("Energized Font", 5, Set.of(gnomeTrait), "You can focus your mind more quickly thanks to the magic that flows within you.");
            Feat projectPersona = new Feat("Project Persona", 5, Set.of(concentrateTrait, gnomeTrait, illusionTrait, primalTrait, visualTrait), "Where others etch their armor to serve as a conduit for their imaginations, your vivid mind and bold personality allow you to project a more fitting persona over your lackluster armor.");
            Feat cautiousCuriosity = new Feat("Cautious Curiosity", 9, Set.of(gnomeTrait), "You've learned a few magical techniques for getting yourself both into and out of trouble unnoticed.");
            Feat firstWorldAdept = new Feat("First World Adept", 9, Set.of(gnomeTrait), "Over time your fey magic has grown stronger.");
            Feat lifeLeap = new Feat("Life Leap", 9, Set.of(gnomeTrait, moveTrait, teleportationTrait), "You phase through a space that a living creature occupies in a flash, spontaneously appearing on the opposite side of it in a vibrant display of colorful light.");
            Feat vivaciousConduit = new Feat("Vivacious Conduit", 9, Set.of(gnomeTrait), "Your connection to the First World has grown, and its vital energy flows into you rapidly.");
            Feat instinctiveObfuscation = new Feat("Instinctive Obfuscation", 13, Set.of(gnomeTrait, illusionTrait, visualTrait), "The magic within you manifests as a natural reaction to threats.");
            Feat homewardBound = new Feat("Homeward Bound", 17, Set.of(gnomeTrait), "The connection between you and the First World resonates within your body stronger than it does for most gnomes, allowing you to cross the threshold between the Universe and the First World.");

            Feat burnIt = new Feat("Burn It!", 1, Set.of(goblinFeat), "Fire fascinates you.");
            burnIt.setAncestry(goblin);
            Feat cityScavenger = new Feat("City Scavenger", 1, Set.of(goblinFeat), "You know that the greatest treasures often look like refuse.");
            Feat goblinLore = new Feat("Goblin Lore", 1, Set.of(goblinFeat), "You've picked up skills and tales from your goblin community.");
            Feat goblinScuttle = new Feat("Goblin Scuttle", 1, Set.of(goblinFeat), "You take advantage of your ally's movement to adjust your position. You step.");
            Feat goblinSong = new Feat("Goblin Song", 1, Set.of(goblinFeat), "You sing annoying goblin songs, distracting your foes with silly and repetitive lyrics.");
            Feat goblinWeaponFamiliarity = new Feat("Goblin Weapon Familiarity", 1, Set.of(goblinFeat), "Others might look upon them with disdain, but you know that the weapons of your people are as effective as they are sharp.");
            Feat junkTinker = new Feat("Junk Tinker", 1, Set.of(goblinFeat), "You can make useful tools out of even twisted or rusted scraps.");
            Feat roughRider = new Feat("Rough Rider", 1, Set.of(goblinFeat), "You are especially good at riding traditional goblin mounts.");
            Feat verySneaky = new Feat("Very Sneaky", 1, Set.of(goblinFeat), "Taller folk rarely pay attention to the shadows at their feet, and you take full advantage of this.");
            Feat kneecap = new Feat("Kneecap", 5, Set.of(goblinFeat), "You deliver a punishing blow to an enemy's knee, shin, or other vulnerable anatomy within your reach.");
            Feat loudSinger = new Feat("Loud Singer", 5, Set.of(goblinFeat), "Staying on pitch, proper breath control, and remembering the words are all less important than the real measure of a good singer: volume!");
            Feat vandal = new Feat("Vandal", 5, Set.of(goblinFeat), "You have a knack for breaking and dismantling things.");
            Feat caveClimber = new Feat("Cave Climber", 9, Set.of(goblinFeat), "After years of clambering through caverns, you can climb easily anywhere you go.");
            Feat cling = new Feat("Cling", 9, Set.of(goblinFeat), "You hang onto a foe to harry them into submission.");
            Feat skitteringScuttle = new Feat("Skittering Scuttle", 9, Set.of(goblinFeat), "You can scuttle farther and faster when maneuvering alongside allies.");
            Feat veryVerySneaky = new Feat("Very, Very Sneaky", 13, Set.of(goblinFeat), "You can move up to your Speed when you use the Sneak action, and you no longer need to have cover or greater cover or be concealed to Hide or Sneak.");
            Feat recklessAbandon = new Feat("Reckless Abandon", 17, Set.of(fortuneTrait, goblinFeat), "Despite a lifetime filled with questionable decisions, you've managed to survive, as though you have uncanny luck that lets you avoid the consequences of your own actions.");

            Feat distractingShadows = new Feat("Distracting Shadows", 1, Set.of(halflingTrait), "You have learned to remain hidden by using larger folk as a distraction to avoid drawing attention to yourself.");
            distractingShadows.setAncestry(halfling);
            Feat folksyPatter = new Feat("Folksy Patter", 1, Set.of(halflingTrait), "You are adept at disguising coded messages as folksy idioms.");
            Feat halflingLore = new Feat("Halfling Lore", 1, Set.of(halflingTrait), "You've dutifully learned how to keep your balance and how to stick to the shadows where it's safe, important skills passed down through generations of halfling tradition.");
            Feat halflingLuck = new Feat("Halfling Luck", 1, Set.of(fortuneTrait, halflingTrait), "Your happy-go-lucky nature makes it seem like misfortune avoids you, and to an extent, that might even be true.");
            halflingLuck.setAncestry(halfling);
            Feat halflingWeaponFamiliarity = new Feat("Halfling Weapon Familiarity", 1, Set.of(halflingTrait), "You favor traditional halfling weapons, so you've learned how to use them more effectively.");
            Feat prairieRider = new Feat("Prairie Rider", 1, Set.of(halflingTrait), "You grew up riding your clan's shaggy ponies and riding dogs.");
            Feat sureFeet = new Feat("Sure Feet", 1, Set.of(halflingTrait), "Whether keeping your balance or climbing, your feet easily find purchase.");
            Feat titanSlinger = new Feat("Titan Slinger", 1, Set.of(halflingTrait), "You have learned how to use your sling to fell enormous creatures.");
            Feat unfetteredHalfling = new Feat("Unfettered Halfling", 1, Set.of(halflingTrait), "You were either pressed into indentured servitude or shackled in a prison, but you've since escaped and have trained to ensure you'll never be caught again.");
            Feat watchfulHalfling = new Feat("Watchful Halfling", 1, Set.of(halflingTrait), "You pay close attention to the people around you, allowing you to more easily notice when they act out of character.");
            Feat culturalAdaptability = new Feat("Cultural Adaptability", 5, Set.of(halflingTrait), "During your adventures, you've honed your ability to adapt to the culture of the predominant ancestry around you.");
            Feat stepLively = new Feat("Step Lively", 5, Set.of(halflingTrait), "You are an expert at avoiding the lumbering footsteps of larger creatures.");
            Feat danceUnderfoot = new Feat("Dance Undefoot", 9, Set.of(halflingTrait), "You dart under the legs of your enemies in combat.");
            Feat guidingLuck = new Feat("Guiding Luck", 9, Set.of(halflingTrait), "Your luck guides you to look the right way and aim your blows unerringly.");
            Feat irrepressible = new Feat("Irrepressible", 9, Set.of(halflingTrait), "You are easily able to ward off attempts to play on your fears and emotions.");
            Feat unhamperedPassage = new Feat("Unhampered Passage", 9, Set.of(halflingTrait), "You won't allow others to restrain you.");
            Feat ceaselessShadows = new Feat("Ceaseless Shadows", 13, Set.of(halflingTrait), "You excel at going unnoticed, especially among a crowd.");
            Feat topplingDance = new Feat("Toppling Dance", 13, Set.of(halflingTrait), "While sharing a creature's space using Dance Underfoot, your melee weapons and unarmed attacks gain the trip trait, but only against the creature whose space you share. You can be in the same space as a Large or larger prone creature, even if it's not your ally.");
            Feat shadowSelf = new Feat("Shadow Self", 17, Set.of(halflingTrait), "You slip from your adversaries' notice and appear to be somewhere else.");

            Feat graspingReach = new Feat("Grasping Reach", 1, Set.of(leshyTrait), "You can extend a tangle of vines or tendrils to support your arms and extend your reach.");
            graspingReach.setAncestry(leshy);
            Feat harmlesslyCute = new Feat("Harmlessly Cute", 1, Set.of(leshyTrait), "Your size and demeanor make it easy for you to convince others that you mean no harm.");
            Feat leshyLore = new Feat("Leshy Lore", 1, Set.of(leshyTrait), "You deeply understand your people’s cultural traditions and innate strengths.");
            Feat leshySuperstition = new Feat("Leshy Superstition", 1, Set.of(leshyTrait), "You notice spirits that inhabit objects, learning which bring good fortune and which are unlucky.");
            Feat seedpod = new Feat("Seedpod", 1, Set.of(leshyTrait), "Your body produces a nearly endless supply of hard seedpods.");
            Feat shadowOfTheWilds = new Feat("Shadow of the Wilds", 1, Set.of(leshyTrait), "It’s difficult to notice your passage through wild areas.");
            Feat undaunted = new Feat("Undaunted", 1, Set.of(leshyTrait), "Your spirit has endured many challenges over its long existence.");
            Feat anchoringRoots = new Feat("Anchoring Roots", 5, Set.of(leshyTrait), "Small roots sprout from your feet, steadying you as you move.");
            Feat leshyGlide = new Feat("Leshy Glide", 5, Set.of(leshyTrait), "Using your own leaves, you can control your descent.");
            Feat ritualReversion = new Feat("Ritual Reversion", 5, Set.of(leshyTrait, polymorphTrait, primalTrait), "You can temporarily revert to a less conspicuous form without diminishing your senses.");
            Feat speakWithKindred = new Feat("Speak with Kindred", 5, Set.of(leshyTrait), "You have a connection with creatures that share your physiology.");
            Feat barkAndTendril = new Feat("Bark and Tendril", 9, Set.of(leshyTrait), "You wield primal magic.");
            Feat luckyKeepsake = new Feat("Lucky Keepsake", 9, Set.of(leshyTrait), "You have a keepsake that grants you luck.");
            Feat solarRejuvenation = new Feat("Solar Rejuvenation", 9, Set.of(leshyTrait), "If you rest outdoors for 10 minutes during the day, you regain Hit Points equal to your Constitution modifier × half your level. You gain this benefit in addition to any healing from Treat Wounds. Leshies whose plant nourishment does not rely on photosynthesis require a similarly suitable environment. For example, fungus leshies need dark, damp environments and a pile of decaying plant matter.");
            Feat thornedSeedpod = new Feat("Thorned Seedpod", 9, Set.of(leshyTrait), "When your seedpods strike a felling blow, they burst into viciously thorny vines.");
            Feat callOfTheGreenMan = new Feat("Call of the Green Man", 13, Set.of(leshyTrait), "You can call forth nearby nature spirits to augment your body.");
            Feat cloakOfPoison = new Feat("Cloak of Poison", 13, Set.of(leshyTrait, poisonTrait), "You secrete a cloak of concentrated poison that harms any who dare attack you.");
            Feat flourishAndRuin = new Feat("Flourish and Ruin", 17, Set.of(leshyTrait), "You can call upon the vital essence of your spirit to restore life to your allies and call forth vines to ensnare and bludgeon your foes.");
            Feat regrowth = new Feat("Regrowth", 17, Set.of(leshyTrait), "Your command over your vital essence allows you or an ally to recover from grievous wounds.");

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

            Feat ricochetingLeap = new Feat("Ricocheting Leap", 9, Set.of(tripkeeTrait), "You quickly use your momentum to topple and spring off of foes.");

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
            Feat bestialManifestation = new Feat("Bestial Manifestation", 1, Set.of(nephilimTrait), "Part of your body has an animalistic influence from a planar creature.");
            Feat grimspawn = new Feat("Grimspawn", 1, Set.of(lineageTrait, nephilimTrait), "Your lineage traces back to a daemon, one of the manifestations of horrific forms of death that devour souls within their foul home of Abaddon.");
            Feat halo = new Feat("Halo", 1, Set.of(nephilimTrait), "You have a halo of light and goodness that sheds light with the effects of a divine light cantrip.");
            Feat hellspawn = new Feat("Hellspawn", 1, Set.of(lineageTrait, nephilimTrait), "Your lineage descends from devils, conniving schemers of Hell.");
            Feat lawbringer = new Feat("Lawbringer", 1, Set.of(lineageTrait, nephilimTrait), "You trace your lineage to archons, guardians of the seventiered mountain of Heaven and nurturers of law and virtue within mortals.");
            Feat musetouched = new Feat("Musetouched", 1, Set.of(lineageTrait, nephilimTrait), "Your blood sings with the liberating power of the azatas, living embodiments of freedom from the wild realm of Elysium.");
            Feat nephilimEyes = new Feat("Nephilim Eyes", 1, Set.of(nephilimTrait), "Your eyes can see through darkness with visual acuity akin to that possessed by most extraplanar beings.");
            Feat nephilimLore = new Feat("Nephilim Lore", 1, Set.of(nephilimTrait), "You know the secrets of the Multiverse.");
            Feat nimbleHooves = new Feat("Nimble Hooves", 1, Set.of(nephilimTrait), "You possess hooves, ankle wings, or some other feature that hastens your movement.");
            Feat pitborn = new Feat("Pitborn", 1, Set.of(lineageTrait, nephilimTrait), "Your blood bears the mark of a demon, a living embodiment of sin from the fetid depths of the Outer Rifts.");
            Feat blessedBlood = new Feat("Blessed Blood", 5, Set.of(nephilimTrait), "Your spilled blood is sanctified, with effects similar to those of holy water.");
            Feat extraplanarSupplication = new Feat("Extraplanar Supplication", 5, Set.of(nephilimTrait),  "You call upon divine power to place a benediction upon your allies or a malediction upon your foes.");
            Feat nephilimResistance = new Feat("Nephilim Resistance", 5, Set.of(nephilimTrait), "You resist energy like your extraplanar predecessors.");
            Feat scionOfManyPlanes = new Feat("Scion of Many Planes", 5, Set.of(nephilimTrait), "The long and complicated history of your bloodline manifests in your ability to draw power from more planar sources than most other nephilim.");
            Feat skillfulTail = new Feat("Skillful Tail", 5, Set.of(nephilimTrait), "You’ve always had a tail, but with practice, you’ve learned to use it for more than signaling your mood.");
            Feat celestialMagic = new Feat("Celestial Magic", 9, Set.of(nephilimTrait), "You possess celestial magic.");
            Feat divineCountermeasures = new Feat("Divine Countermeasures", 9, Set.of(nephilimTrait), "You’ve studied your extraplanar heritage with the intent of better defending yourself, whether against creatures aligned with or opposed to your extraplanar lineage, and you’ve found that your techniques are equally powerful against celestials, fiends, and other divine entities.");
            Feat divineWings = new Feat("Divine Wings", 9, Set.of(divineTrait, morphTrait, nephilimTrait), "With effort, you can call forth magical wings from your back, similar in appearance to those of your extraplanar forebear, whether they be elegantly feathered wings or ominous bat wings.");
            Feat fiendishMagic = new Feat("Fiendish Magic", 9, Set.of(nephilimTrait), "You possess fiendish magic.");
            Feat celestialMercy = new Feat("Celestial Mercy", 13, Set.of(nephilimTrait), "Your celestial powers allow you to remove lesser afflictions with ease.");
            Feat slipSideways = new Feat("Slip Sideways", 13, Set.of(nephilimTrait), "Like many fiends, you have the supernatural ability to teleport yourself to safety.");
            Feat summonNephilimKin = new Feat("Summon Nephilim Kin", 13, Set.of(nephilimTrait), "You have a connection to the Outer Planes, allowing you to summon a divine ally.");
            Feat divineDeclaration = new Feat("Divine Declaration", 17, Set.of(nephilimTrait), "You can call forth a holy or unholy word from the realms beyond to punish your foes.");
            Feat eternalWings = new Feat("Eternal Wings", 17, Set.of(nephilimTrait), "Your wings are now a permanent part of your body.");

            featRepo.saveAll(List.of(
                    assurance, dubiousKnowledge, skillTraining, automaticKnowledge,
                    catFall, quickSqueeze, steadyBalance, nimbleCrawl, rollingLanding, kipUp,
                    arcaneSense, quickIdentification, recognizeSpell, trickMagicItem, magicalShorthand, quickRecognition, unifiedTheory,
                    combatClimber, heftyHauler, quickJump, titanWrestler, underwaterMarauder, powerfulLeap, rapidMantel, quickClimb, quickSwim, wallJump, cloudJump,
                    alchemicalCrafting, quickRepair, seasoned, specialtyCrafting, communalCrafting, inventor, magicalCrafting, adventurousOutfitter, impeccableCrafting, signatureCrafting, craftAnything,
                    charmingLiar, lengthyDiversion, lieToMe, confabulator, quickDisguise, slipperySecrets,
                    bargainHunter, groupImpression, hobnobber, noCauseForAlarm, gladHand, shamelessRequest, legendaryNegotiation,
                    groupCoercion, intimidatingGlare, quickCoercion, intimidatingProwess, lastingCoercion, battleCry, terrifiedRetreat, scareToDeath,
                    additionalLore, experiencedProfessional, unmistakableLore, legendaryProfessional,
                    battleMedicine, continualRecovery, godlessHealing, mortalHealing, robustRecovery, unusualTreatment, wardMedic, advancedFirstAid, paragonBattleMedicine, legendaryMedic,
                    naturalMedicine, trainAnimal, bondedAnimal,
                    oddityIdentification, schooledInSecrets, bizarreMagic, breakCurse,
                    fascinatingPerformance, impressivePerformance, virtuosicPerformer, inflameCrowd, talentEnvy, legendaryPerformer,
                    studentOfTheCanon, divineGuidance,
                    courtlyGraces, multilingual, readLips, signLanguage, streetwise, leverageConnections, undergroundNetwork, legendaryCodebreaker, legendaryLinguist,
                    experiencedSmuggler, quietAllies, foilSenses, swiftSneak, legendarySneak,
                    experiencedTracker, forager, surveyWildlife, terrainExpert, terrainStalker, monsterCrafting, planarSurvival, vanishIntoTheLand, legendarySurvivalist,
                    pickpocket, subtleTheft, waryDisarmament, quickUnlock, legendaryThief,
                    adoptedAncestry, armorProficiency, breathControl, cannyAcumen, diehard, fastRecovery, featherStep, fleet, incredibleInitiative, pet, ride, shieldBlock, toughness, weaponProficiency,
                    ancestralParagon, prescientPlanner, untrainedImprovisation, expeditiousSearch, numbToDeath, prescientConsumable, incredibleInvestiture,
                    doubleSlice, exactingStrike, pointBlankStance, reactiveShield, snaggingStrike, viciousSwing,
                    aggressiveBlock, assistingShot, bladeBrake, brutishShove, combatGrab, duelingParry1, lunge, reboundingToss, sleekReposition,
                    doubleShot, dualHandedAssault, partingShot, powerfulShove, quickReversal, shieldedStride, slamDown, twinParry,
                    advancedWeaponTraining, advantageousAssault, dazingBlow, disarmingStance, furiousFocus, guardiansDeflection, reflexiveShield, revealingStab, ricochetStance1, shatterDefenses, tripleShot,
                    blindFight, disorientingOpening, duelingRiposte, fellingStrike, incredibleAim, mobileShotStance, positioningAssault, resoundingBravery,
                    agileGrace, certainStrike, crashingSlam, cutFromTheAir, debilitatingShot, disarmingTwist, disruptiveStance, fearsomeBrute, flingingCharge, mirrorShield, tacticalReflexes, twinRiposte,
                    brutalFinish, dashingStrike, duelingDance, flingingShove, improvedDuelingRiposte, incredibleRicochet, lungingStance, paragonsGuard,
                    desperateFinisher, determination, guidingFinish, guidingRiposte, improvedTwinRiposte1, openingStance1, twoWeaponFlurry,
                    gracefulPoise, improvedReflexiveShield, masterOfManyStyles, multishotStance, overwhelmingBlow, twinnedDefense,
                    impossibleVolley, savageCritical, smashFromTheAir, boundlessReprisals, ultimateFlexibility, weaponSupremacy,
                    spellbookProdigy, energyAblation, nonlethalSpell, callWizardlyTools, linkedFocus, spellProtectionArray,
                    convincingIllusion, explosiveArrival, irresistibleMagic, splitSlot,
                    advancedSchoolSpell, bondConservation, formRetention, scrollAdept,
                    cleverCounterspell, forcibleEnergy, keenMagicalDetection, bondedFocus, secondaryDetonationArray, superiorBond,
                    spellTinker, infinitePossibilities, reprepareSpell, secondThoughts,
                    archwizardsMight, spellCombination, spellMastery,
                    bespellStrikes, knowledgeOfShapes,
                    scintillatingSpell, spellshapeMastery,
                    nimbleDodge, overextendingFeint, plantEvidence, tumbleBehind1, twinFeint, youreNext,
                    brutalBeating, cleverGambit, distractingFeint, mobility, strongArm, unbalancingBlow, underhandedAssault,
                    dreadStriker, headStomp, mug, poisonWeapon, predictable, reactivePursuit, sabotage, scoundrelsSurprise, theHarderTheyFall, twinDistraction,
                    analyzeWeakness, anticipateAmbush, farThrow, gangUp, lightStep, shoveDown, slyDisarm, twistTheKnife, watchYourBack,
                    bullseye, delayTrap, improvedPoisonWeapon, inspiredStratagem, nimbleRoll, opportuneBackstab, predictivePurchase2, ricochetStance2, sidestep, slyStriker, swipeSouvenir, tacticalEntry,
                    methodicalDebilitations, nimbleStrike, preciseDebilitations, sneakAdept, tacticalDebilitations, viciousDebilitations,
                    bloodyDebilitation, criticalDebilitation, fantasticLeap, fellingShot, preparation, ricochetFeint, springFromTheShadows,
                    defensiveRoll, instantOpening, leaveAnOpening, stayDown,
                    blankSlate, cloudStep, cognitiveLoophole, dispellingSlice, perfectDistraction, swiftElusion,
                    implausibleInfiltration, implausiblePurchase2, powerfulSneak, hiddenParagon, impossibleStriker, reactiveDistraction,
                    bardicLore, hymnOfHealing, lingeringComposition, martialPerformance, reachSpell, versatilePerformance, wellVersed,
                    cantripExpansion, directedAudience, emotionalPush, esotericPolymath, loremastersEtude, multifariousMuse, songOfStrength, upliftingOverture,
                    combatReading, courageousAdvance, inTune, melodiousSpell, rallyingAnthemFeat, ritualResearcher, tripleTimeFeat, versatileSignature,
                    assuredLKnowledge, defensiveCoordination, dirgeOfDoomFeat, educateAllies, harmonize, songOfMarchingFeat, steadySpellcasting,
                    accompany, callAndResponse, eclecticSkill, fortissimoCompositionFeat, knowItAll, reflexiveCourage, soulsight,
                    annotateComposition, courageousAssault, houseOfImaginaryWallsFeat, odeToOuroborosFeat, quickenedCasting, symphonyOfTheUnfetteredHeartFeat, unusualComposition,
                    eclecticPolymath, enigmasKnowledge, inspirationalFocus, reverberate, sharedAssault,
                    allegroFeat, earworm, soothingBalladFeat, triumphantInspiration, trueHypercognition, vigorousAnthem,
                    courageousOnslaught, effortlessConcentration, resoundingFinale, studiousCapacity,
                    allInMyHead, deepLore, discordantVoice, eternalComposition, impossiblePolymath,
                    fatalAriaFeat, perfectEncore, piedPipingFeat, symphonyOfTheMuse, ultimatePolymath,
                    deadlySimplicity, divineCastigation, domainInitiate, harmingHands, healingHands, premonitionOfAvoidance,
                    communalHealing, emblazonArmament, panicTheDead, rapidResponse, sapLife, versatileFont, warpriestsArmor,
                    channelSmite, directedChannel, divineInfusion, raiseSymbol, restorativeStrike, sacredGround,
                    castDown, divineRebuttal, divineWeapon, magicHands, selectiveEnergy,
                    advancedDomain, cremateUndead, emblazonEnergy, martyr, restorativeChannel, sanctifyArmament, surgingFocus, voidSiphon, zealousRush,
                    castigatingWeapon, heroicRecovery, replenishmentOfWar, sharedAvoidance, shieldOfFaith,
                    defensiveRecovery, domainFocus, emblazonAntimagic, fortunateRelief, sappingSymbol, sharedReplenishment,
                    channelingBlock, deitysProtection, ebbAndFlow, fastChannel, lastingArmament, premonitionOfClarity,  swiftBanishment,
                    eternalBane, eternalBlessing, reboundingSmite, remediate, resurrectionist,
                    divineApex, improvedSwiftBanishment, inviolable, miraculousPossibility, sharedClarity,
                    avatarsAudience, avatarsProtection, makerOfMiracles, spellshapeChannel,
                    spiritFamiliar1, concealSpell, embodimentOfTheBalance, enhancedFamiliar, incredibleFamiliar, apparitionCloud, echoingChannel,
                    animalCompanion, animalEmpathy1, leshyFamiliar, plantEmpathy, stormBorn, untamedFormFeat, verdantWeapon, widenSpell,
                    callOfTheWild, orderExplorer,
                    anthropomorphicShape, elementalSummons, forestPassage, formControl, leshyFamiliarSecrets, matureAnimalCompanion1, orderMagic, snowdriftSpell,
                    currentSpell, grownOfOak, insectShape, instinctiveSupport, stormRetribution,
                    deimaticDisplay, ferociousShape, feyCaller, floralRestoration, incredibleCompanion1, raiseMenhir, soaringShape, windCaller,
                    elementalShape, healingTransformation, overwhelmingEnergy, plantShape, primalHowl, pristineWeapon, sideBySide1, thunderclapSpell,
                    dragonShape, garlandSpell, primalFocus, primalSummonsFeat, wanderingOasis,
                    bizarreTransformation, cleansingTransformation, reactiveTransformation, sowSpell, specializedCompanion1, timelessNature, verdantMetamorphosis,
                    impalingBriarsFeat, monstrosityShape, tooMuchToSwallow, upliftingWinds,
                    invokeDisaster, perfectFormControl, primalAegis, hierophantsPower, leyLineConduit, trueShapeshifter,
                    poisonResistance,
                    crossbowAce, huntedShot, initiateWarden, monsterHunter, twinTakedown,
                    animalEmpathy2, favoredTerrain, huntersAim, monsterWarden,
                    advancedWarden, companionsCry, disruptPrey, farShot, favoredPrey, scoutsWarning,
                    additionalRecollection, masterfulWarden, matureAnimalCompanion2, skirmishStrike, snapShot, swiftTracker,
                    deadlyAim, hazardFinder, terrainMaster, wardensBoon,
                    camouflage, incredibleCompanion2, masterMonsterHunter, peerlessWarden, penetratingShot, wardensStep,
                    distractingShot, doublePrey, secondSting, sideBySide2, wardensFocus,
                    sharedPrey, stealthyCompanion, wardensGuidance,
                    greaterDistractingShot, improvedTwinRiposte2, legendaryMonsterHunter, specializedCompanion2, wardensReload,
                    impossibleFlurry, manifoldEdge, masterfulCompanion, perfectShot, shadowHunter,
                    legendaryShot, toTheEndsOfTheEarth, tripleThreat, ultimateSkirmisher,
                    quickDraw, runningReload,
                    cackle, cauldron, counterspell, witchsArmaments, basicLesson, familiarsLanguage,
                    ritesOfConvocation, sympatheticStrike, ceremonialKnife, greaterLesson, wildWitchsArmaments, witchsCharge,
                    murksight, spiritFamiliar2, stitchedFamiliar, witchsBottle, doubleDouble, majorLesson, witchsCommunion,
                    covenSpell, hexFocus, witchsBroom, patronsPresence, reflectSpell, ritesOfTransfiguration, siphonPower,
                    patronsClaim, splitHex, hexMaster, patronsTruth, witchsHut,
                    armorRegimentTraining, combatAssessment, observationalAnalysis, reactiveInterference,
                    bodyguard, repositioningBlock, openingStance2,
                    acuteVision, suddenCharge, acuteScent, intimidatingStrike, barrelingCharge, supernaturalSenses, swipe, nocturnalSenses, reactiveStrikeFeat, instinctiveStrike,  suddenLeap, overpoweringCharge, terrifyingHowl, whirlwindStrikes,
                    energizedSpark, lightningSwap,
                    ancestralMind,
                    ammunitionThaumaturgy,
                    familiarFeat, knowledgeIsPower, magicSense,
                    brilliantFlash, shieldWarden, quickShieldBlock, shieldOfReckoning, shieldOfGrace,
                    eliminateRedHerrings, trapFinder, predictivePurchase1, senseTheUnseen, implausiblePurchase1, reconstructTheScene,
                    focusedFascination, tumbleBehind2,
                    adaptedCantrip, cooperativeNature, generalTraining, haughtyObstinancy, naturalAmbition, naturalSkill, unconventionalWeaponry,
                    adaptiveAdept, cleverImproviser, senseAllies,
                    cooperativeSoul, groupAid, hardyTraveler, incredibleImprovisation, multitalented,
                    advancedGeneralTraining, bounceBack, stubbornPersistence, heroicPresence,
                    dwarvenDoughtiness, dwarvenLore, dwarvenWeaponFamiliarity, mountainStrategy, rockRunner, stonemasonsEye, unburdenedIron,
                    boulderRoll, defyTheDarkness, dwarvenReinforcement, echoesInStone, mountainsStoutness, stoneBones, stonewalker,
                    marchTheMines, telluricPower, stonegate, stonewall,
                    ancestralLongevity, elvenLore, elvenWeaponFamiliarity, forlorn, nimbleElf, otherworldlyMagic, unwaveringMien,
                    agelessPatience, ancestralSuspicion, martialExperience,
                    elfStep, expertLongevity, otherworldlyAcumen, treeClimber, avengeAlly, universalLongevity, magicRider,
                    earnedGlory, elfAtavism, inspireImitation, supernaturalCharm,
                    animalAccomplice, animalElocutionist, feyFellowship, firstWorldMagic, gnomeObsession, gnomeWeaponFamiliarity, illusionSense, razzleDazzle,
                    energizedFont, projectPersona, cautiousCuriosity, firstWorldAdept, lifeLeap, vivaciousConduit,
                    instinctiveObfuscation, homewardBound,
                    burnIt, cityScavenger, goblinLore, goblinScuttle, goblinSong, goblinWeaponFamiliarity, junkTinker, roughRider, verySneaky,
                    kneecap, loudSinger, vandal, caveClimber, cling, skitteringScuttle, veryVerySneaky, recklessAbandon,
                    distractingShadows, folksyPatter, halflingLore, halflingLuck, halflingWeaponFamiliarity, prairieRider, sureFeet, titanSlinger, unfetteredHalfling, watchfulHalfling,
                    culturalAdaptability, stepLively, danceUnderfoot, guidingLuck, irrepressible, unhamperedPassage,
                    ceaselessShadows, topplingDance, shadowSelf,
                    graspingReach, harmlesslyCute, leshyLore, leshySuperstition, seedpod, shadowOfTheWilds, undaunted,
                    anchoringRoots, leshyGlide, ritualReversion, speakWithKindred,
                    barkAndTendril, luckyKeepsake, solarRejuvenation, thornedSeedpod,
                    callOfTheGreenMan, cloakOfPoison, flourishAndRuin, regrowth,
                    beastTrainer, holdMark, ironFists, orcFerocity, orcLore, orcSuperstition, orcWeaponFamiliarity, tusksFeat,
                    athleticMight, bloodyBlows, defyDeath, scarThickSkin, pervasiveSuperstition, undyingFerocity,
                    ferociousBeasts, incredibleFerocity, spellDevourer, rampagingFerocity,
                    ricochetingLeap,
                    monstrousPeacemaker, orcSight,
                    brineMay, callowMay, changelingLore, dreamMay, hagClaws, hagsSight, slagMay,
                    called, mistChild, accursedClaws, occultResistance, hagMagic,
                    angelkin, bestialManifestation, grimspawn, halo, hellspawn, lawbringer, musetouched, nephilimEyes, nephilimLore, nimbleHooves, pitborn,
                    blessedBlood, extraplanarSupplication, nephilimResistance, scionOfManyPlanes, skillfulTail,
                    celestialMagic, divineCountermeasures, divineWings, fiendishMagic,
                    celestialMercy, slipSideways, summonNephilimKin, divineDeclaration, eternalWings));

            Background warriorBackground = new Background("Warrior", "You served as a soldier or mercenary.", List.of(intimidation), "Warfare Lore", intimidatingGlare);
            Background scholar = new Background("Scholar", "You studied ancient texts and forgotten lore.", List.of(arcana, nature, occultism, religion), "Academia Lore", assurance);
            Background acolyte = new Background("Acolyte", "You spent your early days in a religious monastery or cloister.", List.of(religion), "Scribling Lore", studentOfTheCanon);
            Background acrobat = new Background("Acrobat", "In a circus or on the streets, you earned your pay by performing as an acrobat.", List.of(acrobatics), "Circus Lore", steadyBalance);
            Background animalWhisperer = new Background("Animal Whisperer", "You have always felt a connection to animals, and it was only a small leap to learn to train them.", List.of(nature), "Terrain Lore", trainAnimal);
            Background artisan = new Background("Artisan", "As an apprentice, you practiced a particular form of building or crafting, developing specialized skill.", List.of(crafting), "Guild Lore", specialtyCrafting);
            Background artist = new Background("Artist", "Your art is your greatest passion, whatever form it takes.", List.of(crafting), "Art Lore", specialtyCrafting);
            Background bandit = new Background("Bandit", "Your past includes no small amount of rural banditry, robbing travelers on the road and scraping by.", List.of(intimidation), "Terrain Lore", groupCoercion);
            Background barkeep = new Background("Barkeep", "You have five specialties: hefting barrels, drinking, polishing steins, drinking, and drinking.", List.of(diplomacy), "Alcohol Lore", hobnobber);
            Background barrister = new Background("Barrister", "Piles of legal manuals, stern teachers, and experience in the courtroom have instructed you in legal matters.", List.of(diplomacy), "Legal Lore", groupImpression);
            Background bountyHunter = new Background("Bounty Hunter", "Bringing in lawbreakers lined your pockets.", List.of(survival), "Legal Lore", experiencedTracker);
            Background charlatan = new Background("Charlatan", "You traveled from place to place, peddling false fortunes and snake oil in one town, pretending to be royalty in exile to seduce a wealthy heir in the next.", List.of(deception), "Underworld Lore", charmingLiar);
            Background cook = new Background("Cook", " You grew up in the kitchens of a tavern or other dining establishment and excelled there, becoming an exceptional cook.", List.of(survival), "Cooking Lore", seasoned);
            Background criminal = new Background("Criminal", "As an unscrupulous independent or as a member of an underworld organization, you lived a life of crime.", List.of(stealth), "Underworld Lore", experiencedSmuggler);
            Background cultist = new Background("Cultist", "You were (or still are) a member of a cult whose rites may involve sacred dances to ensure a strong harvest or dire rituals that call upon dark powers.", List.of(occultism), "Cult Lore", schooledInSecrets);
            Background detective = new Background("Detective", "You solved crimes as a police inspector or took jobs for wealthy clients as a private investigator.", List.of(society), "Underworld Lore", streetwise);
            Background emissary = new Background("Emissary", "As a diplomat or messenger, you traveled to lands far and wide.", List.of(society), "City Lore", multilingual);
            Background entertainer = new Background("Entertainer", "Through an education in the arts or sheer dogged practice, you learned to entertain crowds.", List.of(performance), "Theatre Lore", fascinatingPerformance);
            Background farmhand = new Background("Farmhand", "With a strong back and an understanding of seasonal cycles, you tilled the land and tended crops.", List.of(athletics), "Farming Lore", assurance);
            Background fieldMedic = new Background("Field Medic", "In the chaotic rush of battle, you learned to adapt to rapidly changing conditions as you administered to battle casualties.", List.of(medicine), "Warfare Lore", battleMedicine);
            Background fortuneTeller = new Background("Fortune Teller", "The strands of fate are clear to you, as you have learned many traditional forms by which laypeople can divine the future.", List.of(occultism), "Fortune-Telling Lore", oddityIdentification);
            Background gambler = new Background("Gambler", "The thrill of the win drew you into games of chance.", List.of(deception), "Games Lore", lieToMe);
            Background gladiator = new Background("Gladiator", "The bloody games of the arena taught you the art of combat. Before you attained true fame, you departed—or escaped—the arena to explore the world.", List.of(performance), "Gladiatorial Lore", impressivePerformance);
            Background guard = new Background("Guard", "You served in the guard, out of either patriotism or the need for coin.", List.of(intimidation), "Legal Lore", quickCoercion);
            Background herbalist = new Background("Herbalist", "As a formally trained apothecary or a rural practitioner of folk medicine, you learned the healing properties of various herbs.", List.of(nature), "Herbalism Lore", naturalMedicine);
            Background hermit = new Background("Hermit", "In an isolated place—like a cave, remote oasis, or secluded mansion—you lived a life of solitude.", List.of(nature, occultism), "Terrain Lore", dubiousKnowledge);
            Background hunter = new Background("Hunter", "You stalked and took down animals and other creatures of the wild.", List.of(survival), "Tanning Lore", surveyWildlife);
            Background laborer = new Background("Laborer", "You’ve spent years performing arduous physical labor.", List.of(athletics), "Labor Lore", heftyHauler);
            Background martialDisciple = new Background("Martial Disciple", "You dedicated yourself to intense training and rigorous study to become a great warrior.", List.of(acrobatics, athletics), "Warfare Lore", null);
            BackgroundConditionalFeat martialDiscipleAcrobatics = new BackgroundConditionalFeat(martialDisciple, acrobatics, catFall);
            BackgroundConditionalFeat martialDiscipleAthletics = new BackgroundConditionalFeat(martialDisciple, athletics, quickJump);
            martialDisciple.setConditionalGrantedFeats(List.of(martialDiscipleAcrobatics, martialDiscipleAthletics));
            Background merchant = new Background("Merchant", "In a dusty shop, market stall, or merchant caravan, you bartered wares for coin and trade goods.", List.of(diplomacy), "Mercantile Lore", bargainHunter);
            Background miner = new Background("Miner", "You earned a living wrenching precious minerals from the lightless depths of the earth.", List.of(survival), "Mining Lore", terrainExpert);
            Background noble = new Background("Noble", "To the common folk, the life of a noble seems one of idyllic luxury, but growing up as a noble or member of the aspiring gentry, you know the reality: a noble’s lot is obligation and intrigue.", List.of(society), "Genealogy Lore", courtlyGraces);
            Background nomad = new Background("Nomad", "Traveling far and wide, you picked up basic tactics for surviving on the road and in unknown lands, getting by with few supplies and even fewer comforts.", List.of(survival), "Terrain Lore", assurance);
            Background prisoner = new Background("Prisoner", "You might have been imprisoned for crimes (whether you were guilty or not), or enslaved for some part of your upbringing.", List.of(stealth), "Underworld Lore", experiencedSmuggler);
            Background raisedByBelief = new Background("Raised By Belief", "You were raised in a community devoted to a particular deity, and that deity's faith and divine attributes shaped who you are.", List.of(), null, assurance);
            raisedByBelief.setDeityDependent(true);
            Background sailor = new Background("Sailor", "You heard the call of the sea from a young age.", List.of(athletics), "Sailing Lore", underwaterMarauder);
            Background scout = new Background("Scout", "You called the wilderness home as you found trails and guided travelers.", List.of(survival), "Terrain Lore", forager);
            Background streetUrchin = new Background("Street Urchin", "You eked out a living by picking pockets on the streets of a major city, never knowing where you’d find your next meal.", List.of(thievery), "City Lore", pickpocket);
            Background teacher = new Background("Teacher", "You are incredibly knowledgeable, skilled, and perhaps even trained to teach children and adults about the world and its wonders.", List.of(performance, society), "Academia Lore", experiencedProfessional);
            Background tinker = new Background("Tinker", "Creating all sorts of minor inventions scratches your itch for problem-solving.", List.of(crafting), "Engineering Lore", specialtyCrafting);

            backgroundRepo.saveAll(List.of(
                    acolyte, acrobat, animalWhisperer, artisan, artist, bandit, barkeep, barrister, bountyHunter,
                    charlatan, cook, criminal, cultist, detective, emissary, entertainer, farmhand, fieldMedic,
                    fortuneTeller, gambler, gladiator, guard, herbalist, hermit, hunter, laborer, martialDisciple,
                    merchant, miner, noble, nomad, prisoner, raisedByBelief, sailor, scholar, scout, streetUrchin,
                    teacher, tinker, warriorBackground));

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

            ClassFeatureChoice stormOrder = new ClassFeatureChoice(druid, "Druidic Order", "Storm");
            FeatureGrantedProficiency stormAcrobatics = new FeatureGrantedProficiency(stormOrder, "Acrobatics", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            stormOrder.setGrantedProficiencies(List.of(stormAcrobatics));
            FeatureGrantedFeat stormOrderFeat = new FeatureGrantedFeat(stormOrder, stormBorn);
            stormOrder.setGrantedFeats(List.of(stormOrderFeat));

            ClassFeatureChoice untamedOrder = new ClassFeatureChoice(druid, "Druidic Order", "Untamed");
            FeatureGrantedProficiency untamedIntimidation = new FeatureGrantedProficiency(untamedOrder, "Intimidation", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            untamedOrder.setGrantedProficiencies(List.of(untamedIntimidation));
            FeatureGrantedFeat untamedOrderFeat = new FeatureGrantedFeat(untamedOrder, untamedFormFeat);
            untamedOrder.setGrantedFeats(List.of(untamedOrderFeat));

            ClassFeatureChoice faithsFlamekeeper = new ClassFeatureChoice(witch, "Patron Theme", "Faith's Flamekeeper");
            FeatureGrantedProficiency faithReligion = new FeatureGrantedProficiency(faithsFlamekeeper, "Religion", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            faithsFlamekeeper.setGrantedProficiencies(List.of(faithReligion));

            ClassFeatureChoice silenceInSnow = new ClassFeatureChoice(witch, "Patron Theme", "Silence in Snow");
            FeatureGrantedProficiency snowNature = new FeatureGrantedProficiency(silenceInSnow, "Nature", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            silenceInSnow.setGrantedProficiencies(List.of(snowNature));

            ClassFeatureChoice starlessShadow = new ClassFeatureChoice(witch, "Patron Theme", "Starless Shadow");
            FeatureGrantedProficiency starlessOccultism = new FeatureGrantedProficiency(starlessShadow, "Occultism", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            starlessShadow.setGrantedProficiencies(List.of(starlessOccultism));

            ClassFeatureChoice theInscribedOne = new ClassFeatureChoice(witch, "Patron Theme", "The Inscribed One");
            FeatureGrantedProficiency inscribedArcana = new FeatureGrantedProficiency(theInscribedOne, "Arcana", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            theInscribedOne.setGrantedProficiencies(List.of(inscribedArcana));

            ClassFeatureChoice theResentment = new ClassFeatureChoice(witch, "Patron Theme", "The Resentment");
            FeatureGrantedProficiency resentmentOccultism = new FeatureGrantedProficiency(theResentment, "Occultism", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            theResentment.setGrantedProficiencies(List.of(resentmentOccultism));

            ClassFeatureChoice wildingSteward = new ClassFeatureChoice(witch, "Patron Theme", "Wilding Steward");
            FeatureGrantedProficiency wildingNature = new FeatureGrantedProficiency(wildingSteward, "Nature", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            wildingSteward.setGrantedProficiencies(List.of(wildingNature));

            ClassFeatureChoice lessonOfDreams = new ClassFeatureChoice(witch, "Basic Lesson", "Lesson of Dreams");
            ClassFeatureChoice lessonOfLife = new ClassFeatureChoice(witch, "Basic Lesson", "Lesson of Life");

            ClassFeatureChoice lessonOfProtection = new ClassFeatureChoice(witch, "Basic Lesson", "Lesson of Protection");
            FeatureGrantedSpells protectionHex = new FeatureGrantedSpells(lessonOfProtection, bloodWard);
            lessonOfProtection.setGrantedSpells(List.of(protectionHex));

            ClassFeatureChoice lessonOfTheElements = new ClassFeatureChoice(witch, "Basic Lesson", "Lesson of the Elements");
            ClassFeatureChoice lessonOfVengeance = new ClassFeatureChoice(witch, "Basic Lesson", "Lesson of Vengeance");

            ClassFeatureChoice lessonOfMischief = new ClassFeatureChoice(witch, "Greater Lesson", "Lesson of Mischief");
            ClassFeatureChoice lessonOfShadow = new ClassFeatureChoice(witch, "Greater Lesson", "Lesson of Shadow");
            ClassFeatureChoice lessonOfSnow = new ClassFeatureChoice(witch, "Greater Lesson", "Lesson of Snow");

            ClassFeatureChoice lessonOfDeath = new ClassFeatureChoice(witch, "Major Lesson", "Lesson of Death");
            FeatureGrantedSpells deathHex = new FeatureGrantedSpells(lessonOfDeath, curseOfDeath);
            lessonOfDeath.setGrantedSpells(List.of(deathHex));

            ClassFeatureChoice lessonOfRenewal = new ClassFeatureChoice(witch, "Major Lesson", "Lesson of Renewal");

            ClassFeatureChoice schoolOfArsGrammatica = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Ars Grammatica");
            FeatureGrantedSpells arsGrammaticaCantrip01 = new FeatureGrantedSpells(schoolOfArsGrammatica, message);
            arsGrammaticaCantrip01.setCharacterLevelGranted(1);
            FeatureGrantedSpells arsGrammaticaCantrip02 = new FeatureGrantedSpells(schoolOfArsGrammatica, sigil);
            arsGrammaticaCantrip02.setCharacterLevelGranted(1);
            FeatureGrantedSpells arsGrammaticaSpell01 = new FeatureGrantedSpells(schoolOfArsGrammatica, command);
            arsGrammaticaSpell01.setCharacterLevelGranted(1);
            FeatureGrantedSpells arsGrammaticaSpell02 = new FeatureGrantedSpells(schoolOfArsGrammatica, disguiseMagic);
            arsGrammaticaSpell02.setCharacterLevelGranted(1);
            FeatureGrantedSpells arsGrammaticaSpell03 = new FeatureGrantedSpells(schoolOfArsGrammatica, runicBody);
            arsGrammaticaSpell03.setCharacterLevelGranted(1);
            FeatureGrantedSpells arsGrammaticaSpell04 = new FeatureGrantedSpells(schoolOfArsGrammatica, runicWeapon);
            arsGrammaticaSpell04.setCharacterLevelGranted(1);
            FeatureGrantedSpells arsGrammaticaSpell05 = new FeatureGrantedSpells(schoolOfArsGrammatica, dispelMagic);
            arsGrammaticaSpell05.setCharacterLevelGranted(3);
            FeatureGrantedSpells arsGrammaticaSpell06 = new FeatureGrantedSpells(schoolOfArsGrammatica, translate);
            arsGrammaticaSpell06.setCharacterLevelGranted(3);
            FeatureGrantedSpells arsGrammaticaSpell07 = new FeatureGrantedSpells(schoolOfArsGrammatica, enthrall);
            arsGrammaticaSpell07.setCharacterLevelGranted(5);
            FeatureGrantedSpells arsGrammaticaSpell08  = new FeatureGrantedSpells(schoolOfArsGrammatica, veilOfPrivacy);
            arsGrammaticaSpell08.setCharacterLevelGranted(5);
            FeatureGrantedSpells arsGrammaticaSpell09 = new FeatureGrantedSpells(schoolOfArsGrammatica, dispellingGlobe);
            arsGrammaticaSpell09.setCharacterLevelGranted(7);
            FeatureGrantedSpells arsGrammaticaSpell10 = new FeatureGrantedSpells(schoolOfArsGrammatica, suggestion);
            arsGrammaticaSpell10.setCharacterLevelGranted(7);
            FeatureGrantedSpells arsGrammaticaSpell11 = new FeatureGrantedSpells(schoolOfArsGrammatica, sending);
            arsGrammaticaSpell11.setCharacterLevelGranted(9);
            FeatureGrantedSpells arsGrammaticaSpell12 = new FeatureGrantedSpells(schoolOfArsGrammatica, truespeech);
            arsGrammaticaSpell12.setCharacterLevelGranted(9);
            FeatureGrantedSpells arsGrammaticaSpell13 = new FeatureGrantedSpells(schoolOfArsGrammatica, repulsion);
            arsGrammaticaSpell13.setCharacterLevelGranted(11);
            FeatureGrantedSpells arsGrammaticaSpell14 = new FeatureGrantedSpells(schoolOfArsGrammatica, spellwrack);
            arsGrammaticaSpell14.setCharacterLevelGranted(11);
            FeatureGrantedSpells arsGrammaticaSpell15 = new FeatureGrantedSpells(schoolOfArsGrammatica, contingency);
            arsGrammaticaSpell15.setCharacterLevelGranted(13);
            FeatureGrantedSpells arsGrammaticaSpell16 = new FeatureGrantedSpells(schoolOfArsGrammatica, planarSeal);
            arsGrammaticaSpell16.setCharacterLevelGranted(13);
            FeatureGrantedSpells arsGrammaticaSpell17 = new FeatureGrantedSpells(schoolOfArsGrammatica, quandary);
            arsGrammaticaSpell17.setCharacterLevelGranted(15);
            FeatureGrantedSpells arsGrammaticaSpell18 = new FeatureGrantedSpells(schoolOfArsGrammatica, unrelentingObservation);
            arsGrammaticaSpell18.setCharacterLevelGranted(15);
            FeatureGrantedSpells arsGrammaticaSpell19 = new FeatureGrantedSpells(schoolOfArsGrammatica, detonateMagic);
            arsGrammaticaSpell19.setCharacterLevelGranted(17);
            FeatureGrantedSpells arsGrammaticaInitialSchoolSpell = new FeatureGrantedSpells(schoolOfArsGrammatica, protectiveWards);
            arsGrammaticaInitialSchoolSpell.setCharacterLevelGranted(1);
            FeatureGrantedSpells arsGrammaticaAdvancedSchoolSpell = new FeatureGrantedSpells(schoolOfArsGrammatica, runeOfObservation);
            schoolOfArsGrammatica.setGrantedSpells(List.of(
                    arsGrammaticaCantrip01, arsGrammaticaCantrip02, arsGrammaticaSpell01, arsGrammaticaSpell02,arsGrammaticaSpell03, arsGrammaticaSpell04, arsGrammaticaSpell05, arsGrammaticaSpell06, arsGrammaticaSpell07, arsGrammaticaSpell08,
                    arsGrammaticaSpell09, arsGrammaticaSpell10, arsGrammaticaSpell11, arsGrammaticaSpell12, arsGrammaticaSpell13, arsGrammaticaSpell14, arsGrammaticaSpell15, arsGrammaticaSpell16, arsGrammaticaSpell17, arsGrammaticaSpell18,
                    arsGrammaticaSpell19, arsGrammaticaInitialSchoolSpell, arsGrammaticaAdvancedSchoolSpell));

            ClassFeatureChoice schoolOfBattleMagic = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Battle Magic");
            FeatureGrantedSpells battleMagicCantrip1 = new FeatureGrantedSpells(schoolOfBattleMagic, shieldSpell);
            battleMagicCantrip1.setCharacterLevelGranted(1);
            FeatureGrantedSpells battleMagicCantrip2 = new FeatureGrantedSpells(schoolOfBattleMagic, telekineticProjectile);
            battleMagicCantrip2.setCharacterLevelGranted(1);
            FeatureGrantedSpells battleMagicSpell01 = new FeatureGrantedSpells(schoolOfBattleMagic, breatheFire);
            battleMagicSpell01.setCharacterLevelGranted(1);
            FeatureGrantedSpells battleMagicSpell02 = new FeatureGrantedSpells(schoolOfBattleMagic, forceBarrage);
            battleMagicSpell02.setCharacterLevelGranted(1);
            FeatureGrantedSpells battleMagicSpell03 = new FeatureGrantedSpells(schoolOfBattleMagic, mysticArmor);
            battleMagicSpell03.setCharacterLevelGranted(1);
            FeatureGrantedSpells battleMagicSpell04 = new FeatureGrantedSpells(schoolOfBattleMagic, mist);
            battleMagicSpell04.setCharacterLevelGranted(3);
            FeatureGrantedSpells battleMagicSpell05 = new FeatureGrantedSpells(schoolOfBattleMagic, resistEnergy);
            battleMagicSpell05.setCharacterLevelGranted(3);
            FeatureGrantedSpells battleMagicSpell06 = new FeatureGrantedSpells(schoolOfBattleMagic, earthbind);
            battleMagicSpell06.setCharacterLevelGranted(5);
            FeatureGrantedSpells battleMagicSpell07 = new FeatureGrantedSpells(schoolOfBattleMagic, fireball);
            battleMagicSpell07.setCharacterLevelGranted(5);
            FeatureGrantedSpells battleMagicSpell08 = new FeatureGrantedSpells(schoolOfBattleMagic, wallOfFire);
            battleMagicSpell08.setCharacterLevelGranted(7);
            FeatureGrantedSpells battleMagicSpell09 = new FeatureGrantedSpells(schoolOfBattleMagic, weaponStorm);
            battleMagicSpell09.setCharacterLevelGranted(7);
            FeatureGrantedSpells battleMagicSpell10 = new FeatureGrantedSpells(schoolOfBattleMagic, howlingBlizzard);
            battleMagicSpell10.setCharacterLevelGranted(9);
            FeatureGrantedSpells battleMagicSpell11 = new FeatureGrantedSpells(schoolOfBattleMagic, impalingSpike);
            battleMagicSpell11.setCharacterLevelGranted(9);
            FeatureGrantedSpells battleMagicSpell12 = new FeatureGrantedSpells(schoolOfBattleMagic, chainLightning);
            battleMagicSpell12.setCharacterLevelGranted(11);
            FeatureGrantedSpells battleMagicSpell13 = new FeatureGrantedSpells(schoolOfBattleMagic, disintegrate);
            battleMagicSpell13.setCharacterLevelGranted(11);
            FeatureGrantedSpells battleMagicSpell14 = new FeatureGrantedSpells(schoolOfBattleMagic, energyAegis);
            battleMagicSpell14.setCharacterLevelGranted(13);
            FeatureGrantedSpells battleMagicSpell15 = new FeatureGrantedSpells(schoolOfBattleMagic, trueTarget);
            battleMagicSpell15.setCharacterLevelGranted(13);
            FeatureGrantedSpells battleMagicSpell16 = new FeatureGrantedSpells(schoolOfBattleMagic, arcticRift);
            battleMagicSpell16.setCharacterLevelGranted(15);
            FeatureGrantedSpells battleMagicSpell17 = new FeatureGrantedSpells(schoolOfBattleMagic, desiccate);
            battleMagicSpell17.setCharacterLevelGranted(15);
            FeatureGrantedSpells battleMagicSpell18 = new FeatureGrantedSpells(schoolOfBattleMagic, fallingStars);
            battleMagicSpell18.setCharacterLevelGranted(17);
            FeatureGrantedSpells battleMagicInitialSchoolSpell = new FeatureGrantedSpells(schoolOfBattleMagic, forceBolt);
            battleMagicInitialSchoolSpell.setCharacterLevelGranted(1);
            FeatureGrantedSpells battleMagicAdvancedSchoolSpell = new FeatureGrantedSpells(schoolOfBattleMagic, energyAbsorption);
            schoolOfBattleMagic.setGrantedSpells(List.of(
                    battleMagicCantrip1, battleMagicCantrip2, battleMagicSpell01, battleMagicSpell02, battleMagicSpell03, battleMagicSpell04, battleMagicSpell05, battleMagicSpell06, battleMagicSpell07, battleMagicSpell08, battleMagicSpell09,
                    battleMagicSpell10, battleMagicSpell11, battleMagicSpell12, battleMagicSpell13, battleMagicSpell14, battleMagicSpell15, battleMagicSpell16, battleMagicSpell17, battleMagicSpell18, battleMagicInitialSchoolSpell,
                    battleMagicAdvancedSchoolSpell));

            ClassFeatureChoice schoolOfCivicWizardry = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Civic Wizardry");
            FeatureGrantedSpells civicWizardryCantrip1 = new FeatureGrantedSpells(schoolOfCivicWizardry, prestidigitation);
            civicWizardryCantrip1.setCharacterLevelGranted(1);
            FeatureGrantedSpells civicWizardryCantrip2 = new FeatureGrantedSpells(schoolOfCivicWizardry, readAura);
            civicWizardryCantrip2.setCharacterLevelGranted(1);
            FeatureGrantedSpells civicWizardrySpell01 = new FeatureGrantedSpells(schoolOfCivicWizardry, hydraulicPush);
            civicWizardrySpell01.setCharacterLevelGranted(1);
            FeatureGrantedSpells civicWizardrySpell02 = new FeatureGrantedSpells(schoolOfCivicWizardry, pummelingRubble);
            civicWizardrySpell02.setCharacterLevelGranted(1);
            FeatureGrantedSpells civicWizardrySpell03 = new FeatureGrantedSpells(schoolOfCivicWizardry, summonConstruct);
            civicWizardrySpell03.setCharacterLevelGranted(1);
            FeatureGrantedSpells civicWizardrySpell04 = new FeatureGrantedSpells(schoolOfCivicWizardry, revealingLight);
            civicWizardrySpell04.setCharacterLevelGranted(3);
            FeatureGrantedSpells civicWizardrySpell05 = new FeatureGrantedSpells(schoolOfCivicWizardry, waterWalk);
            civicWizardrySpell05.setCharacterLevelGranted(3);
            FeatureGrantedSpells civicWizardrySpell06 = new FeatureGrantedSpells(schoolOfCivicWizardry, cozyCabin);
            civicWizardrySpell06.setCharacterLevelGranted(5);
            FeatureGrantedSpells civicWizardrySpell07 = new FeatureGrantedSpells(schoolOfCivicWizardry, safePassage);
            civicWizardrySpell07.setCharacterLevelGranted(5);
            FeatureGrantedSpells civicWizardrySpell08 = new FeatureGrantedSpells(schoolOfCivicWizardry, creation);
            civicWizardrySpell08.setCharacterLevelGranted(7);
            FeatureGrantedSpells civicWizardrySpell09 = new FeatureGrantedSpells(schoolOfCivicWizardry, unfetteredMovement);
            civicWizardrySpell09.setCharacterLevelGranted(7);
            FeatureGrantedSpells civicWizardrySpell10 = new FeatureGrantedSpells(schoolOfCivicWizardry, controlWater);
            civicWizardrySpell10.setCharacterLevelGranted(9);
            FeatureGrantedSpells civicWizardrySpell11 = new FeatureGrantedSpells(schoolOfCivicWizardry, wallOfStone);
            civicWizardrySpell11.setCharacterLevelGranted(9);
            FeatureGrantedSpells civicWizardrySpell12 = new FeatureGrantedSpells(schoolOfCivicWizardry, disintegrate);
            civicWizardrySpell12.setCharacterLevelGranted(11);
            FeatureGrantedSpells civicWizardrySpell13 = new FeatureGrantedSpells(schoolOfCivicWizardry, wallOfForce);
            civicWizardrySpell13.setCharacterLevelGranted(11);
            FeatureGrantedSpells civicWizardrySpell14 = new FeatureGrantedSpells(schoolOfCivicWizardry, planarPalace);
            civicWizardrySpell14.setCharacterLevelGranted(13);
            FeatureGrantedSpells civicWizardrySpell15 = new FeatureGrantedSpells(schoolOfCivicWizardry, retrocognition);
            civicWizardrySpell15.setCharacterLevelGranted(13);
            FeatureGrantedSpells civicWizardrySpell16 = new FeatureGrantedSpells(schoolOfCivicWizardry, earthquake);
            civicWizardrySpell16.setCharacterLevelGranted(15);
            FeatureGrantedSpells civicWizardrySpell17 = new FeatureGrantedSpells(schoolOfCivicWizardry, pinpoint);
            civicWizardrySpell17.setCharacterLevelGranted(15);
            FeatureGrantedSpells civicWizardrySpell18 = new FeatureGrantedSpells(schoolOfCivicWizardry, foresight);
            civicWizardrySpell18.setCharacterLevelGranted(17);
            FeatureGrantedSpells civicWizardryInitialSchoolSpell = new FeatureGrantedSpells(schoolOfCivicWizardry, earthworks);
            civicWizardryInitialSchoolSpell.setCharacterLevelGranted(1);
            FeatureGrantedSpells civicWizardryAdvancedSchoolSpell = new FeatureGrantedSpells(schoolOfCivicWizardry, communityRestoration);
            schoolOfCivicWizardry.setGrantedSpells(List.of(
                    civicWizardryCantrip1, civicWizardryCantrip2, civicWizardrySpell01, civicWizardrySpell02, civicWizardrySpell03, civicWizardrySpell04, civicWizardrySpell05, civicWizardrySpell06, civicWizardrySpell07, civicWizardrySpell08,
                    civicWizardrySpell09, civicWizardrySpell10, civicWizardrySpell11, civicWizardrySpell12, civicWizardrySpell13, civicWizardrySpell14, civicWizardrySpell15, civicWizardrySpell16, civicWizardrySpell17, civicWizardrySpell18,
                    civicWizardryInitialSchoolSpell, civicWizardryAdvancedSchoolSpell));

            ClassFeatureChoice schoolOfMentalism = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Mentalism");
            FeatureGrantedSpells mentalismCantrip1 = new FeatureGrantedSpells(schoolOfMentalism, daze);
            mentalismCantrip1.setCharacterLevelGranted(1);
            FeatureGrantedSpells mentalismCantrip2 = new FeatureGrantedSpells(schoolOfMentalism, figment);
            mentalismCantrip2.setCharacterLevelGranted(1);
            FeatureGrantedSpells mentalismSpell01 = new FeatureGrantedSpells(schoolOfMentalism, dizzyingColors);
            mentalismSpell01.setCharacterLevelGranted(1);
            FeatureGrantedSpells mentalismSpell02 = new FeatureGrantedSpells(schoolOfMentalism, sleep);
            mentalismSpell02.setCharacterLevelGranted(1);
            FeatureGrantedSpells mentalismSpell03 = new FeatureGrantedSpells(schoolOfMentalism, sureStrike);
            mentalismSpell03.setCharacterLevelGranted(1);
            FeatureGrantedSpells mentalismSpell04 = new FeatureGrantedSpells(schoolOfMentalism, illusoryCreature);
            mentalismSpell04.setCharacterLevelGranted(3);
            FeatureGrantedSpells mentalismSpell05 = new FeatureGrantedSpells(schoolOfMentalism, stupefy);
            mentalismSpell05.setCharacterLevelGranted(3);
            FeatureGrantedSpells mentalismSpell06 = new FeatureGrantedSpells(schoolOfMentalism, dreamMessage);
            mentalismSpell06.setCharacterLevelGranted(5);
            FeatureGrantedSpells mentalismSpell07 = new FeatureGrantedSpells(schoolOfMentalism, mindReading);
            mentalismSpell07.setCharacterLevelGranted(5);
            FeatureGrantedSpells mentalismSpell08 = new FeatureGrantedSpells(schoolOfMentalism, nightmare);
            mentalismSpell08.setCharacterLevelGranted(7);
            FeatureGrantedSpells mentalismSpell09 = new FeatureGrantedSpells(schoolOfMentalism, visionOfDeath);
            mentalismSpell09.setCharacterLevelGranted(7);
            FeatureGrantedSpells mentalismSpell10 = new FeatureGrantedSpells(schoolOfMentalism, hallucination);
            mentalismSpell10.setCharacterLevelGranted(9);
            FeatureGrantedSpells mentalismSpell11 = new FeatureGrantedSpells(schoolOfMentalism, illusoryScene);
            mentalismSpell11.setCharacterLevelGranted(9);
            FeatureGrantedSpells mentalismSpell12 = new FeatureGrantedSpells(schoolOfMentalism, neverMind);
            mentalismSpell12.setCharacterLevelGranted(11);
            FeatureGrantedSpells mentalismSpell13 = new FeatureGrantedSpells(schoolOfMentalism, phantasmalCalamity);
            mentalismSpell13.setCharacterLevelGranted(11);
            FeatureGrantedSpells mentalismSpell14 = new FeatureGrantedSpells(schoolOfMentalism, projectImage);
            mentalismSpell14.setCharacterLevelGranted(13);
            FeatureGrantedSpells mentalismSpell15 = new FeatureGrantedSpells(schoolOfMentalism, warpMind);
            mentalismSpell15.setCharacterLevelGranted(13);
            FeatureGrantedSpells mentalismSpell16 = new FeatureGrantedSpells(schoolOfMentalism, disappearance);
            mentalismSpell16.setCharacterLevelGranted(15);
            FeatureGrantedSpells mentalismSpell17 = new FeatureGrantedSpells(schoolOfMentalism, uncontrollableDance);
            mentalismSpell17.setCharacterLevelGranted(15);
            FeatureGrantedSpells mentalismSpell18 = new FeatureGrantedSpells(schoolOfMentalism, phantasmagoria);
            mentalismSpell18.setCharacterLevelGranted(17);
            FeatureGrantedSpells mentalismInitialSchoolSpell = new FeatureGrantedSpells(schoolOfMentalism, charmingPush);
            mentalismInitialSchoolSpell.setCharacterLevelGranted(1);
            FeatureGrantedSpells mentalismAdvancedSchoolSpell = new FeatureGrantedSpells(schoolOfMentalism, invisibilityCloak);
            schoolOfMentalism.setGrantedSpells(List.of(
                    mentalismCantrip1, mentalismCantrip2, mentalismSpell01, mentalismSpell02, mentalismSpell03, mentalismSpell04, mentalismSpell05, mentalismSpell06, mentalismSpell07, mentalismSpell08, mentalismSpell09, mentalismSpell10, mentalismSpell11,
                    mentalismSpell12, mentalismSpell13, mentalismSpell14, mentalismSpell15, mentalismSpell16, mentalismSpell17, mentalismSpell18, mentalismInitialSchoolSpell, mentalismAdvancedSchoolSpell));

            ClassFeatureChoice schoolOfProteanForm = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Protean Form");
            FeatureGrantedSpells proteanFormCantrip1 = new FeatureGrantedSpells(schoolOfProteanForm, gougingClaw);
            proteanFormCantrip1.setCharacterLevelGranted(1);
            FeatureGrantedSpells proteanFormCantrip2 = new FeatureGrantedSpells(schoolOfProteanForm, tangleVine);
            proteanFormCantrip2.setCharacterLevelGranted(1);
            FeatureGrantedSpells proteanFormSpell01 = new FeatureGrantedSpells(schoolOfProteanForm, jump);
            proteanFormSpell01.setCharacterLevelGranted(1);
            FeatureGrantedSpells proteanFormSpell02 = new FeatureGrantedSpells(schoolOfProteanForm, pestForm);
            proteanFormSpell02.setCharacterLevelGranted(1);
            FeatureGrantedSpells proteanFormSpell03 = new FeatureGrantedSpells(schoolOfProteanForm, spiderSting);
            proteanFormSpell03.setCharacterLevelGranted(1);
            FeatureGrantedSpells proteanFormSpell04 = new FeatureGrantedSpells(schoolOfProteanForm, enlarge);
            proteanFormSpell04.setCharacterLevelGranted(3);
            FeatureGrantedSpells proteanFormSpell05 = new FeatureGrantedSpells(schoolOfProteanForm, humanoidForm);
            proteanFormSpell05.setCharacterLevelGranted(3);
            FeatureGrantedSpells proteanFormSpell06 = new FeatureGrantedSpells(schoolOfProteanForm, feetToFins);
            proteanFormSpell06.setCharacterLevelGranted(5);
            FeatureGrantedSpells proteanFormSpell07 = new FeatureGrantedSpells(schoolOfProteanForm, vampiricFeast);
            proteanFormSpell07.setCharacterLevelGranted(5);
            FeatureGrantedSpells proteanFormSpell08 = new FeatureGrantedSpells(schoolOfProteanForm, mountainResilience);
            proteanFormSpell08.setCharacterLevelGranted(7);
            FeatureGrantedSpells proteanFormSpell09 = new FeatureGrantedSpells(schoolOfProteanForm, vaporForm);
            proteanFormSpell09.setCharacterLevelGranted(7);
            FeatureGrantedSpells proteanFormSpell10 = new FeatureGrantedSpells(schoolOfProteanForm, elementalForm);
            proteanFormSpell10.setCharacterLevelGranted(9);
            FeatureGrantedSpells proteanFormSpell11 = new FeatureGrantedSpells(schoolOfProteanForm, toxicCloud);
            proteanFormSpell11.setCharacterLevelGranted(9);
            FeatureGrantedSpells proteanFormSpell12 = new FeatureGrantedSpells(schoolOfProteanForm, cursedMetamorphosis);
            proteanFormSpell12.setCharacterLevelGranted(11);
            FeatureGrantedSpells proteanFormSpell13 = new FeatureGrantedSpells(schoolOfProteanForm, petrify);
            proteanFormSpell13.setCharacterLevelGranted(11);
            FeatureGrantedSpells proteanFormSpell14 = new FeatureGrantedSpells(schoolOfProteanForm, duplicateFoe);
            proteanFormSpell14.setCharacterLevelGranted(13);
            FeatureGrantedSpells proteanFormSpell15 = new FeatureGrantedSpells(schoolOfProteanForm, fieryBody);
            proteanFormSpell15.setCharacterLevelGranted(13);
            FeatureGrantedSpells proteanFormSpell16 = new FeatureGrantedSpells(schoolOfProteanForm, desiccate);
            proteanFormSpell16.setCharacterLevelGranted(15);
            FeatureGrantedSpells proteanFormSpell17 = new FeatureGrantedSpells(schoolOfProteanForm, monstrosityForm);
            proteanFormSpell17.setCharacterLevelGranted(15);
            FeatureGrantedSpells proteanFormSpell18 = new FeatureGrantedSpells(schoolOfProteanForm, metamorphosis);
            proteanFormSpell18.setCharacterLevelGranted(17);
            FeatureGrantedSpells proteanFormInitialSchoolSpell = new FeatureGrantedSpells(schoolOfProteanForm, scrambleBody);
            proteanFormInitialSchoolSpell.setCharacterLevelGranted(1);
            FeatureGrantedSpells proteanFormAdvancedSchoolSpell = new FeatureGrantedSpells(schoolOfProteanForm, shiftingForm);
            schoolOfProteanForm.setGrantedSpells(List.of(
                    proteanFormCantrip1, proteanFormCantrip2, proteanFormSpell01, proteanFormSpell02, proteanFormSpell03, proteanFormSpell04, proteanFormSpell05, proteanFormSpell06, proteanFormSpell07, proteanFormSpell08, proteanFormSpell09,
                    proteanFormSpell10, proteanFormSpell11, proteanFormSpell12, proteanFormSpell13, proteanFormSpell14, proteanFormSpell15, proteanFormSpell16, proteanFormSpell17, proteanFormSpell18, proteanFormInitialSchoolSpell,
                    proteanFormAdvancedSchoolSpell));

            ClassFeatureChoice schoolOfTheBoundary = new ClassFeatureChoice(wizard, "Arcane Schools", "School of the Boundary");
            FeatureGrantedSpells boundaryCantrip1 = new FeatureGrantedSpells(schoolOfTheBoundary, telekineticHand);
            boundaryCantrip1.setCharacterLevelGranted(1);
            FeatureGrantedSpells boundaryCantrip2 = new FeatureGrantedSpells(schoolOfTheBoundary, voidWarp);
            boundaryCantrip2.setCharacterLevelGranted(1);
            FeatureGrantedSpells boundarySpell01 = new FeatureGrantedSpells(schoolOfTheBoundary, grimTendrils);
            boundarySpell01.setCharacterLevelGranted(1);
            FeatureGrantedSpells boundarySpell02 = new FeatureGrantedSpells(schoolOfTheBoundary, phantasmalMinionSpell);
            boundarySpell02.setCharacterLevelGranted(1);
            FeatureGrantedSpells boundarySpell03 = new FeatureGrantedSpells(schoolOfTheBoundary, summonUndead);
            boundarySpell03.setCharacterLevelGranted(1);
            FeatureGrantedSpells boundarySpell04 = new FeatureGrantedSpells(schoolOfTheBoundary, darkness);
            boundarySpell04.setCharacterLevelGranted(3);
            FeatureGrantedSpells boundarySpell05 = new FeatureGrantedSpells(schoolOfTheBoundary, seeTheUnseen);
            boundarySpell05.setCharacterLevelGranted(3);
            FeatureGrantedSpells boundarySpell06 = new FeatureGrantedSpells(schoolOfTheBoundary, bindUndead);
            boundarySpell06.setCharacterLevelGranted(5);
            FeatureGrantedSpells boundarySpell07 = new FeatureGrantedSpells(schoolOfTheBoundary, ghostlyWeapon);
            boundarySpell07.setCharacterLevelGranted(5);
            FeatureGrantedSpells boundarySpell08 = new FeatureGrantedSpells(schoolOfTheBoundary, flicker);
            boundarySpell08.setCharacterLevelGranted(7);
            FeatureGrantedSpells boundarySpell09 = new FeatureGrantedSpells(schoolOfTheBoundary, translocate);
            boundarySpell09.setCharacterLevelGranted(7);
            FeatureGrantedSpells boundarySpell10 = new FeatureGrantedSpells(schoolOfTheBoundary, banishment);
            boundarySpell10.setCharacterLevelGranted(9);
            FeatureGrantedSpells boundarySpell11 = new FeatureGrantedSpells(schoolOfTheBoundary, invokeSpirits);
            boundarySpell11.setCharacterLevelGranted(9);
            FeatureGrantedSpells boundarySpell12 = new FeatureGrantedSpells(schoolOfTheBoundary, teleport);
            boundarySpell12.setCharacterLevelGranted(11);
            FeatureGrantedSpells boundarySpell13 = new FeatureGrantedSpells(schoolOfTheBoundary, vampiricExsanguination);
            boundarySpell13.setCharacterLevelGranted(11);
            FeatureGrantedSpells boundarySpell14 = new FeatureGrantedSpells(schoolOfTheBoundary, eclipseBurst);
            boundarySpell14.setCharacterLevelGranted(13);
            FeatureGrantedSpells boundarySpell15 = new FeatureGrantedSpells(schoolOfTheBoundary, interplanarTeleport);
            boundarySpell15.setCharacterLevelGranted(13);
            FeatureGrantedSpells boundarySpell16 = new FeatureGrantedSpells(schoolOfTheBoundary, quandary);
            boundarySpell16.setCharacterLevelGranted(15);
            FeatureGrantedSpells boundarySpell17 = new FeatureGrantedSpells(schoolOfTheBoundary, unrelentingObservation);
            boundarySpell17.setCharacterLevelGranted(15);
            FeatureGrantedSpells boundarySpell18 = new FeatureGrantedSpells(schoolOfTheBoundary, massacre);
            boundarySpell18.setCharacterLevelGranted(17);
            FeatureGrantedSpells boundaryInitialSchoolSpell = new FeatureGrantedSpells(schoolOfTheBoundary, fortifySummoning);
            boundaryInitialSchoolSpell.setCharacterLevelGranted(1);
            FeatureGrantedSpells boundaryAdvancedSchoolSpell = new FeatureGrantedSpells(schoolOfTheBoundary, spiralOfHorrors);
            schoolOfTheBoundary.setGrantedSpells(List.of(boundaryCantrip1, boundaryCantrip2, boundarySpell01, boundarySpell02, boundarySpell03, boundarySpell04, boundarySpell05, boundarySpell06, boundarySpell07, boundarySpell08, boundarySpell09,
                    boundarySpell10, boundarySpell11, boundarySpell12, boundarySpell13, boundarySpell14, boundarySpell15, boundarySpell16, boundarySpell17, boundarySpell18, boundaryInitialSchoolSpell, boundaryAdvancedSchoolSpell));

            ClassFeatureChoice schoolOfUnifiedMagicalTheory = new ClassFeatureChoice(wizard, "Arcane Schools", "School of Unified Magical Theory");

            ClassFeatureChoice experimentalSpellshaping = new ClassFeatureChoice(wizard, "Arcane Thesis", "Experimental Spellshaping");
            ClassFeatureChoice improvedFamiliarAttunement = new ClassFeatureChoice(wizard, "Arcane Thesis", "Improved Familiar Attunement");
            FeatureGrantedFeat improvedFamiliarAttunementFeat = new FeatureGrantedFeat(improvedFamiliarAttunement, familiarFeat);
            improvedFamiliarAttunement.setGrantedFeats(List.of(improvedFamiliarAttunementFeat));
            ClassFeatureChoice spellBlending = new ClassFeatureChoice(wizard, "Arcane Thesis", "Spell Blending");
            ClassFeatureChoice spellSubstitution = new ClassFeatureChoice(wizard, "Arcane Thesis", "Spell Substitution");
            ClassFeatureChoice staffNexus = new ClassFeatureChoice(wizard, "Arcane Thesis", "Staff Nexus");

            ClassFeatureChoice enigma = new ClassFeatureChoice(bard, "Muse", "Enigma");
            FeatureGrantedFeat enigmaFeat = new FeatureGrantedFeat(enigma, bardicLore);
            enigma.setGrantedFeats(List.of(enigmaFeat));
            FeatureGrantedSpells enigmaSpell = new FeatureGrantedSpells(enigma, sureStrike);
            enigmaSpell.setCharacterLevelGranted(1);
            enigma.setGrantedSpells(List.of(enigmaSpell));

            ClassFeatureChoice maestro = new ClassFeatureChoice(bard, "Muse", "Maestro");
            FeatureGrantedFeat maestroFeat = new FeatureGrantedFeat(maestro, lingeringComposition);
            maestro.setGrantedFeats(List.of(maestroFeat));

            ClassFeatureChoice polymath = new ClassFeatureChoice(bard, "Muse", "Polymath");
            FeatureGrantedFeat polymathFeat = new FeatureGrantedFeat(polymath, versatilePerformance);
            polymath.setGrantedFeats(List.of(polymathFeat));
            FeatureGrantedSpells polymathSpell = new FeatureGrantedSpells(polymath, phantasmalMinionSpell);
            polymathSpell.setCharacterLevelGranted(1);
            polymath.setGrantedSpells(List.of(polymathSpell));

            ClassFeatureChoice warriorMuse = new ClassFeatureChoice(bard, "Muse", "Warrior");
            FeatureGrantedFeat warriorFeat = new FeatureGrantedFeat(warriorMuse, martialPerformance);
            warriorMuse.setGrantedFeats(List.of(warriorFeat));

            ClassFeatureChoice flurryEdge = new ClassFeatureChoice(ranger, "Hunter's Edge", "Flurry");
            ClassFeatureChoice outwitEdge = new ClassFeatureChoice(ranger, "Hunter's Edge", "Outwit");
            ClassFeatureChoice precisionEdge = new ClassFeatureChoice(ranger, "Hunter's Edge", "Precision");

            ClassFeatureChoice alchemicalSciences = new ClassFeatureChoice(investigator, "Methodology", "Alchemical Sciences");
            FeatureGrantedProficiency alchemicalSciencesCrafting = new FeatureGrantedProficiency(alchemicalSciences, "Crafting", ProficiencyCategory.SKILL, ProficiencyRank.TRAINED);
            alchemicalSciences.setGrantedProficiencies(List.of(alchemicalSciencesCrafting));

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
                    animalOrder, leafOrder, stormOrder, untamedOrder,
                    faithsFlamekeeper, silenceInSnow, starlessShadow, theInscribedOne, theResentment, wildingSteward,
                    lessonOfDreams, lessonOfLife, lessonOfProtection, lessonOfTheElements, lessonOfVengeance,
                    lessonOfMischief, lessonOfShadow, lessonOfSnow,
                    lessonOfDeath, lessonOfRenewal,
                    schoolOfArsGrammatica, schoolOfBattleMagic, schoolOfCivicWizardry, schoolOfMentalism, schoolOfProteanForm, schoolOfTheBoundary, schoolOfUnifiedMagicalTheory,
                    experimentalSpellshaping, improvedFamiliarAttunement, spellBlending, spellSubstitution, staffNexus,
                    enigma, maestro, polymath, warriorMuse,
                    flurryEdge, outwitEdge, precisionEdge,
                    alchemicalSciences,
                    empiricism
            ));

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

            AttributeBoostRule warriorPhysBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.CONSTITUTION), 1);
            warriorPhysBoost.setBackground(warriorBackground);
            AttributeBoostRule warriorFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            warriorFreeBoost.setBackground(warriorBackground);

            AttributeBoostRule acolyteMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.WISDOM), 1);
            acolyteMentalBoost.setBackground(acolyte);
            AttributeBoostRule acolyteFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            acolyteFreeBoost.setBackground(acolyte);

            AttributeBoostRule acrobatPhysBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.DEXTERITY), 1);
            acrobatPhysBoost.setBackground(acrobat);
            AttributeBoostRule acrobatFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            acrobatFreeBoost.setBackground(acrobat);

            AttributeBoostRule animalWhispererMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.WISDOM, AttributeName.CHARISMA), 1);
            animalWhispererMentalBoost.setBackground(animalWhisperer);
            AttributeBoostRule animalWhispererFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            animalWhispererFreeBoost.setBackground(animalWhisperer);

            AttributeBoostRule artisanFirstBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.INTELLIGENCE), 1);
            artisanFirstBoost.setBackground(artisan);
            AttributeBoostRule artisanFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            artisanFreeBoost.setBackground(artisan);

            AttributeBoostRule artistFirstBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.DEXTERITY, AttributeName.CHARISMA), 1);
            artistFirstBoost.setBackground(artist);
            AttributeBoostRule artistFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            artistFreeBoost.setBackground(artist);

            AttributeBoostRule banditFirstBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.DEXTERITY, AttributeName.CHARISMA), 1);
            banditFirstBoost.setBackground(bandit);
            AttributeBoostRule banditFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            banditFreeBoost.setBackground(bandit);

            AttributeBoostRule barkeepDrunkBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.CONSTITUTION, AttributeName.CHARISMA), 1);
            barkeepDrunkBoost.setBackground(barkeep);
            AttributeBoostRule barkeepFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            barkeepFreeBoost.setBackground(barkeep);

            AttributeBoostRule barristerMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.CHARISMA), 1);
            barristerMentalBoost.setBackground(barrister);
            AttributeBoostRule barristerFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            barristerFreeBoost.setBackground(barrister);

            AttributeBoostRule bountyHunterFirstBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.WISDOM), 1);
            bountyHunterFirstBoost.setBackground(bountyHunter);
            AttributeBoostRule bountyHunterFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            bountyHunterFreeBoost.setBackground(bountyHunter);

            AttributeBoostRule charlatanMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.CHARISMA), 1);
            charlatanMentalBoost.setBackground(charlatan);
            AttributeBoostRule charlatanFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            charlatanFreeBoost.setBackground(charlatan);

            AttributeBoostRule cookTasteBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.CONSTITUTION, AttributeName.INTELLIGENCE), 1);
            cookTasteBoost.setBackground(cook);
            AttributeBoostRule cookFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            cookFreeBoost.setBackground(cook);

            AttributeBoostRule criminalKnackBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.DEXTERITY, AttributeName.INTELLIGENCE), 1);
            criminalKnackBoost.setBackground(criminal);
            AttributeBoostRule criminalFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            criminalFreeBoost.setBackground(criminal);

            AttributeBoostRule cultistMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.CHARISMA), 1);
            cultistMentalBoost.setBackground(cultist);
            AttributeBoostRule cultistFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            cultistFreeBoost.setBackground(cultist);

            AttributeBoostRule detectiveMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.WISDOM), 1);
            detectiveMentalBoost.setBackground(detective);
            AttributeBoostRule detectiveFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            detectiveFreeBoost.setBackground(detective);

            AttributeBoostRule emissaryMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.CHARISMA), 1);
            emissaryMentalBoost.setBackground(emissary);
            AttributeBoostRule emissaryFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            emissaryFreeBoost.setBackground(emissary);

            AttributeBoostRule entertainerActBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.DEXTERITY, AttributeName.CHARISMA), 1);
            entertainerActBoost.setBackground(entertainer);
            AttributeBoostRule entertainerFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            entertainerFreeBoost.setBackground(entertainer);

            AttributeBoostRule farmhandFirstBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), 1);
            farmhandFirstBoost.setBackground(farmhand);
            AttributeBoostRule farmhandFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            farmhandFreeBoost.setBackground(farmhand);

            AttributeBoostRule fieldMedicStoicBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), 1);
            fieldMedicStoicBoost.setBackground(fieldMedic);
            AttributeBoostRule fieldMedicFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            fieldMedicFreeBoost.setBackground(fieldMedic);

            AttributeBoostRule fortuneTellerMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.CHARISMA), 1);
            fortuneTellerMentalBoost.setBackground(fortuneTeller);
            AttributeBoostRule fortuneTellerFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            fortuneTellerFreeBoost.setBackground(fortuneTeller);

            AttributeBoostRule gamblerBluffBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.DEXTERITY, AttributeName.CHARISMA), 1);
            gamblerBluffBoost.setBackground(gambler);
            AttributeBoostRule gamblerFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            gamblerFreeBoost.setBackground(gambler);

            AttributeBoostRule gladiatorFirstBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.CHARISMA), 1);
            gladiatorFirstBoost.setBackground(gladiator);
            AttributeBoostRule gladiatorFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            gladiatorFreeBoost.setBackground(gladiator);

            AttributeBoostRule guardBounceBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.CHARISMA), 1);
            guardBounceBoost.setBackground(guard);
            AttributeBoostRule guardFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            guardFreeBoost.setBackground(guard);

            AttributeBoostRule herbalistGrowBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), 1);
            herbalistGrowBoost.setBackground(herbalist);
            AttributeBoostRule herbalistFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            herbalistFreeBoost.setBackground(herbalist);

            AttributeBoostRule hermitTrekBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.CONSTITUTION, AttributeName.INTELLIGENCE), 1);
            hermitTrekBoost.setBackground(hermit);
            AttributeBoostRule hermitFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            hermitFreeBoost.setBackground(hermit);

            AttributeBoostRule hunterHuntBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.DEXTERITY, AttributeName.WISDOM), 1);
            hunterHuntBoost.setBackground(hunter);
            AttributeBoostRule hunterFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            hunterFreeBoost.setBackground(hunter);

            AttributeBoostRule laborerPhysBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.CONSTITUTION), 1);
            laborerPhysBoost.setBackground(laborer);
            AttributeBoostRule laborerFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            laborerFreeBoost.setBackground(laborer);

            AttributeBoostRule martialDiscipleFightBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.DEXTERITY), 1);
            martialDiscipleFightBoost.setBackground(martialDisciple);
            AttributeBoostRule martialDiscipleFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            martialDiscipleFreeBoost.setBackground(martialDisciple);

            AttributeBoostRule merchantMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.CHARISMA), 1);
            merchantMentalBoost.setBackground(merchant);
            AttributeBoostRule merchantFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            merchantFreeBoost.setBackground(merchant);

            AttributeBoostRule minerGrindBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.WISDOM), 1);
            minerGrindBoost.setBackground(miner);
            AttributeBoostRule minerFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            minerFreeBoost.setBackground(miner);

            AttributeBoostRule nobleMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.CHARISMA), 1);
            nobleMentalBoost.setBackground(noble);
            AttributeBoostRule nobleFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            nobleFreeBoost.setBackground(noble);

            AttributeBoostRule nomadTrekBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.CONSTITUTION, AttributeName.WISDOM), 1);
            nomadTrekBoost.setBackground(nomad);
            AttributeBoostRule nomadFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            nomadFreeBoost.setBackground(nomad);

            AttributeBoostRule prisonerPhysBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.CONSTITUTION), 1);
            prisonerPhysBoost.setBackground(prisoner);
            AttributeBoostRule prisonerFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE,  allSix, 1);
            prisonerFreeBoost.setBackground(prisoner);

            AttributeBoostRule raisedByBeliefDivineBoost = new AttributeBoostRule(AttributeBoostType.DEITY_CHOICE, List.of(), 1);
            raisedByBeliefDivineBoost.setBackground(raisedByBelief);
            AttributeBoostRule raisedByBeliefFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            raisedByBeliefFreeBoost.setBackground(raisedByBelief);

            AttributeBoostRule sailorPhysBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.STRENGTH, AttributeName.DEXTERITY), 1);
            sailorPhysBoost.setBackground(sailor);
            AttributeBoostRule sailorFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            sailorFreeBoost.setBackground(sailor);

            AttributeBoostRule scholarMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.WISDOM), 1);
            scholarMentalBoost.setBackground(scholar);
            AttributeBoostRule scholarFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            scholarFreeBoost.setBackground(scholar);

            AttributeBoostRule scoutFindBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.DEXTERITY, AttributeName.WISDOM), 1);
            scoutFindBoost.setBackground(scout);
            AttributeBoostRule scoutFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            scoutFreeBoost.setBackground(scout);

            AttributeBoostRule streetUrchinPhysBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.DEXTERITY, AttributeName.CONSTITUTION), 1);
            streetUrchinPhysBoost.setBackground(streetUrchin);
            AttributeBoostRule streetUrchinFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            streetUrchinFreeBoost.setBackground(streetUrchin);

            AttributeBoostRule teacherMentalBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.INTELLIGENCE, AttributeName.WISDOM), 1);
            teacherMentalBoost.setBackground(teacher);
            AttributeBoostRule teacherFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            teacherFreeBoost.setBackground(teacher);

            AttributeBoostRule tinkerMakeBoost = new AttributeBoostRule(AttributeBoostType.CHOICE, List.of(AttributeName.DEXTERITY, AttributeName.INTELLIGENCE), 1);
            tinkerMakeBoost.setBackground(tinker);
            AttributeBoostRule tinkerFreeBoost = new AttributeBoostRule(AttributeBoostType.FREE, allSix, 1);
            tinkerFreeBoost.setBackground(tinker);

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
                    warriorPhysBoost, warriorFreeBoost,
                    acolyteMentalBoost, acolyteFreeBoost, acrobatPhysBoost, acrobatFreeBoost,
                    animalWhispererMentalBoost, animalWhispererFreeBoost, artisanFirstBoost, artisanFreeBoost,
                    artistFirstBoost, artistFreeBoost, banditFirstBoost, banditFreeBoost,
                    barkeepDrunkBoost, barkeepFreeBoost, barristerMentalBoost, barristerFreeBoost,
                    bountyHunterFirstBoost, bountyHunterFreeBoost, charlatanMentalBoost, charlatanFreeBoost,
                    cookTasteBoost, cookFreeBoost, criminalKnackBoost, criminalFreeBoost,
                    cultistMentalBoost, cultistFreeBoost, detectiveMentalBoost, detectiveFreeBoost,
                    emissaryMentalBoost, emissaryFreeBoost, entertainerActBoost, entertainerFreeBoost,
                    farmhandFirstBoost, farmhandFreeBoost, fieldMedicStoicBoost, fieldMedicFreeBoost,
                    fortuneTellerMentalBoost, fortuneTellerFreeBoost, gamblerBluffBoost, gamblerFreeBoost,
                    gladiatorFirstBoost, gladiatorFreeBoost, guardBounceBoost, guardFreeBoost,
                    herbalistGrowBoost, herbalistFreeBoost, hermitTrekBoost, hermitFreeBoost,
                    hunterHuntBoost, hunterFreeBoost, laborerPhysBoost, laborerFreeBoost,
                    martialDiscipleFightBoost, martialDiscipleFreeBoost, merchantMentalBoost, merchantFreeBoost,
                    minerGrindBoost, minerFreeBoost, nobleMentalBoost, nobleFreeBoost, nomadTrekBoost, nomadFreeBoost,
                    prisonerPhysBoost, prisonerFreeBoost, raisedByBeliefDivineBoost, raisedByBeliefFreeBoost,
                    sailorPhysBoost, sailorFreeBoost, scholarMentalBoost, scholarFreeBoost,
                    scoutFindBoost, scoutFreeBoost, streetUrchinPhysBoost, streetUrchinFreeBoost,
                    teacherMentalBoost, teacherFreeBoost, tinkerMakeBoost, tinkerFreeBoost,
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

            GameAction verdantRest = new GameAction("Verdant Rest", ActionType.SINGLE_ACTION, "You turn into a tree or other noncreature plant.");
            GameActionGrant featVerdantRestGrant = new GameActionGrant(verdantRest, ActionSourceType.FEAT);
            featVerdantRestGrant.setFeat(verdantMetamorphosis);
            verdantRest.setGrants(List.of(featVerdantRestGrant));

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
                    callOnAncientBlood, jinx,
                    verdantRest));

            System.out.println("===== PATHFINDER DATA SEEDED =====");

        };
    }
}
