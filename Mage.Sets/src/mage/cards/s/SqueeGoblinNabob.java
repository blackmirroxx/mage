package mage.cards.s;

import mage.MageInt;
import mage.abilities.triggers.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.effects.common.ReturnSourceFromGraveyardToHandEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;

import java.util.UUID;

/**
 *
 * @author LevelX2
 */
public final class SqueeGoblinNabob extends CardImpl {

    public SqueeGoblinNabob(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{R}");
        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.GOBLIN);

        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // At the beginning of your upkeep, you may return Squee, Goblin Nabob from your graveyard to your hand.
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(Zone.GRAVEYARD,
                TargetController.YOU, new ReturnSourceFromGraveyardToHandEffect(), true));
    }

    private SqueeGoblinNabob(final SqueeGoblinNabob card) {
        super(card);
    }

    @Override
    public SqueeGoblinNabob copy() {
        return new SqueeGoblinNabob(this);
    }
}
