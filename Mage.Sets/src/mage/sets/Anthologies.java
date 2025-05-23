package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author JayDi85
 */
public final class Anthologies extends ExpansionSet {

    private static final Anthologies instance = new Anthologies();

    public static Anthologies getInstance() {
        return instance;
    }

    private Anthologies() {
        super("Anthologies", "ATH", ExpansionSet.buildDate(1998, 11, 1), SetType.SUPPLEMENTAL);
        this.hasBoosters = false;
        this.hasBasicLands = true;

        cards.add(new SetCardInfo("Aesthir Glider", 67, Rarity.COMMON, mage.cards.a.AesthirGlider.class, RETRO_ART));
        cards.add(new SetCardInfo("Armageddon", 1, Rarity.RARE, mage.cards.a.Armageddon.class, RETRO_ART));
        cards.add(new SetCardInfo("Armored Pegasus", 2, Rarity.COMMON, mage.cards.a.ArmoredPegasus.class, RETRO_ART));
        cards.add(new SetCardInfo("Benalish Knight", 3, Rarity.COMMON, mage.cards.b.BenalishKnight.class, RETRO_ART));
        cards.add(new SetCardInfo("Black Knight", 20, Rarity.UNCOMMON, mage.cards.b.BlackKnight.class, RETRO_ART));
        cards.add(new SetCardInfo("Brushland", 71, Rarity.RARE, mage.cards.b.Brushland.class, RETRO_ART));
        cards.add(new SetCardInfo("Canopy Spider", 52, Rarity.COMMON, mage.cards.c.CanopySpider.class, RETRO_ART));
        cards.add(new SetCardInfo("Carnivorous Plant", 53, Rarity.COMMON, mage.cards.c.CarnivorousPlant.class, RETRO_ART));
        cards.add(new SetCardInfo("Combat Medic", 4, Rarity.COMMON, mage.cards.c.CombatMedic.class, RETRO_ART));
        cards.add(new SetCardInfo("Cuombajj Witches", 21, Rarity.COMMON, mage.cards.c.CuombajjWitches.class, RETRO_ART));
        cards.add(new SetCardInfo("Disenchant", 5, Rarity.COMMON, mage.cards.d.Disenchant.class, RETRO_ART));
        cards.add(new SetCardInfo("Drifting Meadow", 72, Rarity.COMMON, mage.cards.d.DriftingMeadow.class, RETRO_ART));
        cards.add(new SetCardInfo("Erhnam Djinn", 54, Rarity.UNCOMMON, mage.cards.e.ErhnamDjinn.class, RETRO_ART));
        cards.add(new SetCardInfo("Feast of the Unicorn", 22, Rarity.COMMON, mage.cards.f.FeastOfTheUnicorn.class, RETRO_ART));
        cards.add(new SetCardInfo("Fireball", 29, Rarity.COMMON, mage.cards.f.Fireball.class, RETRO_ART));
        cards.add(new SetCardInfo("Forest", 84, Rarity.LAND, mage.cards.basiclands.Forest.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 85, Rarity.LAND, mage.cards.basiclands.Forest.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Freewind Falcon", 6, Rarity.COMMON, mage.cards.f.FreewindFalcon.class, RETRO_ART));
        cards.add(new SetCardInfo("Giant Growth", 55, Rarity.COMMON, mage.cards.g.GiantGrowth.class, RETRO_ART));
        cards.add(new SetCardInfo("Giant Spider", 56, Rarity.COMMON, mage.cards.g.GiantSpider.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Balloon Brigade", 30, Rarity.COMMON, mage.cards.g.GoblinBalloonBrigade.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Digging Team", 31, Rarity.COMMON, mage.cards.g.GoblinDiggingTeam.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Grenade", 32, Rarity.COMMON, mage.cards.g.GoblinGrenade.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Hero", 33, Rarity.COMMON, mage.cards.g.GoblinHero.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin King", 34, Rarity.RARE, mage.cards.g.GoblinKing.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Matron", 35, Rarity.UNCOMMON, mage.cards.g.GoblinMatron.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Mutant", 36, Rarity.UNCOMMON, mage.cards.g.GoblinMutant.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Offensive", 37, Rarity.UNCOMMON, mage.cards.g.GoblinOffensive.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Recruiter", 38, Rarity.UNCOMMON, mage.cards.g.GoblinRecruiter.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Snowman", 39, Rarity.UNCOMMON, mage.cards.g.GoblinSnowman.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Tinkerer", 40, Rarity.COMMON, mage.cards.g.GoblinTinkerer.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Vandal", 41, Rarity.COMMON, mage.cards.g.GoblinVandal.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Warrens", 42, Rarity.RARE, mage.cards.g.GoblinWarrens.class, RETRO_ART));
        cards.add(new SetCardInfo("Gorilla Chieftain", 57, Rarity.COMMON, mage.cards.g.GorillaChieftain.class, RETRO_ART));
        cards.add(new SetCardInfo("Hurricane", 58, Rarity.UNCOMMON, mage.cards.h.Hurricane.class, RETRO_ART));
        cards.add(new SetCardInfo("Hymn to Tourach", 23, Rarity.COMMON, mage.cards.h.HymnToTourach.class, RETRO_ART));
        cards.add(new SetCardInfo("Hypnotic Specter", 24, Rarity.UNCOMMON, mage.cards.h.HypnoticSpecter.class, RETRO_ART));
        cards.add(new SetCardInfo("Icatian Javelineers", 7, Rarity.COMMON, mage.cards.i.IcatianJavelineers.class, RETRO_ART));
        cards.add(new SetCardInfo("Ihsan's Shade", 25, Rarity.UNCOMMON, mage.cards.i.IhsansShade.class, RETRO_ART));
        cards.add(new SetCardInfo("Infantry Veteran", 8, Rarity.COMMON, mage.cards.i.InfantryVeteran.class, RETRO_ART));
        cards.add(new SetCardInfo("Jalum Tome", 68, Rarity.UNCOMMON, mage.cards.j.JalumTome.class, RETRO_ART));
        cards.add(new SetCardInfo("Knight of Stromgald", 26, Rarity.UNCOMMON, mage.cards.k.KnightOfStromgald.class, RETRO_ART));
        cards.add(new SetCardInfo("Lady Orca", 65, Rarity.UNCOMMON, mage.cards.l.LadyOrca.class, RETRO_ART));
        cards.add(new SetCardInfo("Lightning Bolt", 43, Rarity.COMMON, mage.cards.l.LightningBolt.class, RETRO_ART));
        cards.add(new SetCardInfo("Llanowar Elves", 59, Rarity.COMMON, mage.cards.l.LlanowarElves.class, RETRO_ART));
        cards.add(new SetCardInfo("Mirri, Cat Warrior", 60, Rarity.RARE, mage.cards.m.MirriCatWarrior.class, RETRO_ART));
        cards.add(new SetCardInfo("Mogg Fanatic", 44, Rarity.COMMON, mage.cards.m.MoggFanatic.class, RETRO_ART));
        cards.add(new SetCardInfo("Mogg Flunkies", 45, Rarity.COMMON, mage.cards.m.MoggFlunkies.class, RETRO_ART));
        cards.add(new SetCardInfo("Mogg Raider", 46, Rarity.COMMON, mage.cards.m.MoggRaider.class, RETRO_ART));
        cards.add(new SetCardInfo("Mountain", 82, Rarity.LAND, mage.cards.basiclands.Mountain.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 83, Rarity.LAND, mage.cards.basiclands.Mountain.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Nevinyrral's Disk", 69, Rarity.RARE, mage.cards.n.NevinyrralsDisk.class, RETRO_ART));
        cards.add(new SetCardInfo("Order of the White Shield", 9, Rarity.UNCOMMON, mage.cards.o.OrderOfTheWhiteShield.class, RETRO_ART));
        cards.add(new SetCardInfo("Overrun", 61, Rarity.UNCOMMON, mage.cards.o.Overrun.class, RETRO_ART));
        cards.add(new SetCardInfo("Pacifism", 10, Rarity.COMMON, mage.cards.p.Pacifism.class, RETRO_ART));
        cards.add(new SetCardInfo("Pegasus Charger", 11, Rarity.COMMON, mage.cards.p.PegasusCharger.class, RETRO_ART));
        cards.add(new SetCardInfo("Pegasus Stampede", 12, Rarity.UNCOMMON, mage.cards.p.PegasusStampede.class, RETRO_ART));
        cards.add(new SetCardInfo("Pendelhaven", 73, Rarity.UNCOMMON, mage.cards.p.Pendelhaven.class, RETRO_ART));
        cards.add(new SetCardInfo("Plains", 78, Rarity.LAND, mage.cards.basiclands.Plains.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 79, Rarity.LAND, mage.cards.basiclands.Plains.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Polluted Mire", 74, Rarity.COMMON, mage.cards.p.PollutedMire.class, RETRO_ART));
        cards.add(new SetCardInfo("Pyrokinesis", 47, Rarity.UNCOMMON, mage.cards.p.Pyrokinesis.class, RETRO_ART));
        cards.add(new SetCardInfo("Pyrotechnics", 48, Rarity.COMMON, mage.cards.p.Pyrotechnics.class, RETRO_ART));
        cards.add(new SetCardInfo("Raging Goblin", 49, Rarity.UNCOMMON, mage.cards.r.RagingGoblin.class, RETRO_ART));
        cards.add(new SetCardInfo("Ranger en-Vec", 66, Rarity.UNCOMMON, mage.cards.r.RangerEnVec.class, RETRO_ART));
        cards.add(new SetCardInfo("Sacred Mesa", 13, Rarity.RARE, mage.cards.s.SacredMesa.class, RETRO_ART));
        cards.add(new SetCardInfo("Samite Healer", 14, Rarity.COMMON, mage.cards.s.SamiteHealer.class, RETRO_ART));
        cards.add(new SetCardInfo("Scavenger Folk", 62, Rarity.COMMON, mage.cards.s.ScavengerFolk.class, RETRO_ART));
        cards.add(new SetCardInfo("Serra Angel", 15, Rarity.UNCOMMON, mage.cards.s.SerraAngel.class, RETRO_ART));
        cards.add(new SetCardInfo("Serrated Arrows", 70, Rarity.COMMON, mage.cards.s.SerratedArrows.class, RETRO_ART));
        cards.add(new SetCardInfo("Slippery Karst", 75, Rarity.COMMON, mage.cards.s.SlipperyKarst.class, RETRO_ART));
        cards.add(new SetCardInfo("Smoldering Crater", 76, Rarity.COMMON, mage.cards.s.SmolderingCrater.class, RETRO_ART));
        cards.add(new SetCardInfo("Spectral Bears", 63, Rarity.UNCOMMON, mage.cards.s.SpectralBears.class, RETRO_ART));
        cards.add(new SetCardInfo("Strip Mine", 77, Rarity.RARE, mage.cards.s.StripMine.class, RETRO_ART));
        cards.add(new SetCardInfo("Swamp", 80, Rarity.LAND, mage.cards.basiclands.Swamp.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 81, Rarity.LAND, mage.cards.basiclands.Swamp.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Swords to Plowshares", 16, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class, RETRO_ART));
        cards.add(new SetCardInfo("Terror", 27, Rarity.COMMON, mage.cards.t.Terror.class, RETRO_ART));
        cards.add(new SetCardInfo("Unholy Strength", 28, Rarity.COMMON, mage.cards.u.UnholyStrength.class, RETRO_ART));
        cards.add(new SetCardInfo("Uthden Troll", 50, Rarity.UNCOMMON, mage.cards.u.UthdenTroll.class, RETRO_ART));
        cards.add(new SetCardInfo("Volcanic Dragon", 51, Rarity.RARE, mage.cards.v.VolcanicDragon.class, RETRO_ART));
        cards.add(new SetCardInfo("Warrior's Honor", 17, Rarity.COMMON, mage.cards.w.WarriorsHonor.class, RETRO_ART));
        cards.add(new SetCardInfo("White Knight", 18, Rarity.UNCOMMON, mage.cards.w.WhiteKnight.class, RETRO_ART));
        cards.add(new SetCardInfo("Woolly Spider", 64, Rarity.COMMON, mage.cards.w.WoollySpider.class, RETRO_ART));
        cards.add(new SetCardInfo("Youthful Knight", 19, Rarity.COMMON, mage.cards.y.YouthfulKnight.class, RETRO_ART));
    }
}
