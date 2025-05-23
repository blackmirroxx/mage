package mage.abilities.effects.common;

import mage.abilities.Ability;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.cards.Card;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.ZoneChangeEvent;
import mage.game.stack.StackObject;
import mage.players.Player;

/**
 * @author LoneFox
 */
public class DiscardOntoBattlefieldEffect extends ReplacementEffectImpl {

    public DiscardOntoBattlefieldEffect() {
        super(Duration.EndOfGame, Outcome.PutCardInPlay);
        staticText = "If a spell or ability an opponent controls causes you to discard this card, put it onto the battlefield instead of putting it into your graveyard";
    }

    protected DiscardOntoBattlefieldEffect(final DiscardOntoBattlefieldEffect effect) {
        super(effect);
    }

    @Override
    public DiscardOntoBattlefieldEffect copy() {
        return new DiscardOntoBattlefieldEffect(this);
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.ZONE_CHANGE;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        if (!event.getTargetId().equals(source.getSourceId())) {
            return false;
        }
        ZoneChangeEvent zcEvent = (ZoneChangeEvent) event;
        if (zcEvent.getFromZone() != Zone.HAND || zcEvent.getToZone() != Zone.GRAVEYARD) {
            return false;
        }
        StackObject spell = game.getStack().getStackObject(event.getSourceId());
        return spell != null && game.getOpponents(source.getControllerId()).contains(spell.getControllerId());
    }

    @Override
    public boolean replaceEvent(GameEvent event, Ability source, Game game) {
        Card card = game.getCard(source.getSourceId());
        if (card == null) {
            return false;
        }
        Player owner = game.getPlayer(card.getOwnerId());
        return owner != null && owner.moveCards(card, Zone.BATTLEFIELD, source, game);
    }
}
