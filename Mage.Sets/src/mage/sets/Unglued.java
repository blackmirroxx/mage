package mage.sets;

import mage.cards.CardGraphicInfo;
import mage.cards.ExpansionSet;
import mage.cards.FrameStyle;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author lopho
 */
public final class Unglued extends ExpansionSet {

    private static final Unglued instance = new Unglued();

    public static Unglued getInstance() {
        return instance;
    }

    private Unglued() {
        super("Unglued", "UGL", ExpansionSet.buildDate(1998, 8, 11), SetType.JOKE_SET);
        this.hasBoosters = false; // un-set, low implemented cards

        cards.add(new SetCardInfo("Burning Cinder Fury of Crimson Chaos Fire", 40, Rarity.RARE, mage.cards.b.BurningCinderFuryOfCrimsonChaosFire.class, RETRO_ART));
        cards.add(new SetCardInfo("Checks and Balances", 16, Rarity.UNCOMMON, mage.cards.c.ChecksAndBalances.class, RETRO_ART));
        cards.add(new SetCardInfo("Chicken a la King", 17, Rarity.RARE, mage.cards.c.ChickenALaKing.class, RETRO_ART));
        cards.add(new SetCardInfo("Chicken Egg", 41, Rarity.COMMON, mage.cards.c.ChickenEgg.class, RETRO_ART));
        cards.add(new SetCardInfo("Clam-I-Am", 19, Rarity.COMMON, mage.cards.c.ClamIAm.class, RETRO_ART));
        cards.add(new SetCardInfo("Clambassadors", 18, Rarity.COMMON, mage.cards.c.Clambassadors.class, RETRO_ART));
        cards.add(new SetCardInfo("Denied!", 22, Rarity.COMMON, mage.cards.d.Denied.class, RETRO_ART));
        cards.add(new SetCardInfo("Elvish Impersonators", 56, Rarity.COMMON, mage.cards.e.ElvishImpersonators.class, RETRO_ART));
        cards.add(new SetCardInfo("Flock of Rabid Sheep", 57, Rarity.UNCOMMON, mage.cards.f.FlockOfRabidSheep.class, RETRO_ART));
        cards.add(new SetCardInfo("Forest", 88, Rarity.LAND, mage.cards.basiclands.Forest.class, new CardGraphicInfo(FrameStyle.UGL_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("Fowl Play", 24, Rarity.COMMON, mage.cards.f.FowlPlay.class, RETRO_ART));
        cards.add(new SetCardInfo("Free-for-All", 25, Rarity.RARE, mage.cards.f.FreeForAll.class, RETRO_ART));
        cards.add(new SetCardInfo("Free-Range Chicken", 58, Rarity.COMMON, mage.cards.f.FreeRangeChicken.class, RETRO_ART));
        cards.add(new SetCardInfo("Gerrymandering", 59, Rarity.UNCOMMON, mage.cards.g.Gerrymandering.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Bowling Team", 44, Rarity.COMMON, mage.cards.g.GoblinBowlingTeam.class, RETRO_ART));
        cards.add(new SetCardInfo("Goblin Tutor", 45, Rarity.UNCOMMON, mage.cards.g.GoblinTutor.class, RETRO_ART));
        cards.add(new SetCardInfo("Growth Spurt", 61, Rarity.COMMON, mage.cards.g.GrowthSpurt.class, RETRO_ART));
        cards.add(new SetCardInfo("Hungry Hungry Heifer", 63, Rarity.UNCOMMON, mage.cards.h.HungryHungryHeifer.class, RETRO_ART));
        cards.add(new SetCardInfo("Incoming!", 64, Rarity.RARE, mage.cards.i.Incoming.class, RETRO_ART));
        cards.add(new SetCardInfo("Infernal Spawn of Evil", 33, Rarity.RARE, mage.cards.i.InfernalSpawnOfEvil.class, RETRO_ART));
        cards.add(new SetCardInfo("Island", 85, Rarity.LAND, mage.cards.basiclands.Island.class, new CardGraphicInfo(FrameStyle.UGL_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("Jack-in-the-Mox", 75, Rarity.RARE, mage.cards.j.JackInTheMox.class, RETRO_ART));
        cards.add(new SetCardInfo("Jalum Grifter", 47, Rarity.RARE, mage.cards.j.JalumGrifter.class, RETRO_ART));
        cards.add(new SetCardInfo("Jumbo Imp", 34, Rarity.UNCOMMON, mage.cards.j.JumboImp.class, RETRO_ART));
        cards.add(new SetCardInfo("Krazy Kow", 48, Rarity.COMMON, mage.cards.k.KrazyKow.class, RETRO_ART));
        cards.add(new SetCardInfo("Mine, Mine, Mine!", 65, Rarity.RARE, mage.cards.m.MineMineMine.class, RETRO_ART));
        cards.add(new SetCardInfo("Miss Demeanor", 10, Rarity.UNCOMMON, mage.cards.m.MissDemeanor.class, RETRO_ART));
        cards.add(new SetCardInfo("Mountain", 87, Rarity.LAND, mage.cards.basiclands.Mountain.class, new CardGraphicInfo(FrameStyle.UGL_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("Once More with Feeling", 11, Rarity.RARE, mage.cards.o.OnceMoreWithFeeling.class, RETRO_ART));
        cards.add(new SetCardInfo("Paper Tiger", 78, Rarity.COMMON, mage.cards.p.PaperTiger.class, RETRO_ART));
        cards.add(new SetCardInfo("Plains", 84, Rarity.LAND, mage.cards.basiclands.Plains.class, new CardGraphicInfo(FrameStyle.UGL_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("Poultrygeist", 37, Rarity.COMMON, mage.cards.p.Poultrygeist.class, RETRO_ART));
        cards.add(new SetCardInfo("Ricochet", 50, Rarity.UNCOMMON, mage.cards.r.Ricochet.class, RETRO_ART));
        cards.add(new SetCardInfo("Rock Lobster", 79, Rarity.COMMON, mage.cards.r.RockLobster.class, RETRO_ART));
        cards.add(new SetCardInfo("Scissors Lizard", 80, Rarity.COMMON, mage.cards.s.ScissorsLizard.class, RETRO_ART));
        cards.add(new SetCardInfo("Spark Fiend", 51, Rarity.RARE, mage.cards.s.SparkFiend.class, RETRO_ART));
        cards.add(new SetCardInfo("Spatula of the Ages", 81, Rarity.UNCOMMON, mage.cards.s.SpatulaOfTheAges.class, RETRO_ART));
        cards.add(new SetCardInfo("Strategy, Schmategy", 52, Rarity.RARE, mage.cards.s.StrategySchmategy.class, RETRO_ART));
        cards.add(new SetCardInfo("Swamp", 86, Rarity.LAND, mage.cards.basiclands.Swamp.class, new CardGraphicInfo(FrameStyle.UGL_FULL_ART_BASIC, false)));
        cards.add(new SetCardInfo("Team Spirit", 67, Rarity.COMMON, mage.cards.t.TeamSpirit.class, RETRO_ART));
        cards.add(new SetCardInfo("Temp of the Damned", 38, Rarity.COMMON, mage.cards.t.TempOfTheDamned.class, RETRO_ART));
        cards.add(new SetCardInfo("The Cheese Stands Alone", 2, Rarity.RARE, mage.cards.t.TheCheeseStandsAlone.class, RETRO_ART));
        cards.add(new SetCardInfo("Timmy, Power Gamer", 68, Rarity.RARE, mage.cards.t.TimmyPowerGamer.class, RETRO_ART));
        cards.add(new SetCardInfo("Urza's Science Fair Project", 83, Rarity.UNCOMMON, mage.cards.u.UrzasScienceFairProject.class, RETRO_ART));
    }
}
