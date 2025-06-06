package mage.abilities.effects.common;

import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.cards.repository.CardRepository;
import mage.choices.Choice;
import mage.choices.ChoiceHintType;
import mage.choices.ChoiceImpl;
import mage.constants.Outcome;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetOpponent;
import mage.util.CardUtil;

import java.util.Set;
import java.util.function.Supplier;

/**
 * @author LevelX2
 */
public class ChooseACardNameEffect extends OneShotEffect {

    public static final String INFO_KEY = "NAMED_CARD";

    public enum TypeOfName {
        ALL("card name", CardRepository.instance::getNames),
        NOT_BASIC_LAND_NAME("card name other than a basic land card name", CardRepository.instance::getNotBasicLandNames),
        NONBASIC_LAND_NAME("nonbasic land card name", CardRepository.instance::getNonbasicLandNames),
        NON_ARTIFACT_AND_NON_LAND_NAME("nonartifact, nonland card name", CardRepository.instance::getNonArtifactAndNonLandNames),
        NON_LAND_AND_NON_CREATURE_NAME("nonland and non creature name", CardRepository.instance::getNonLandAndNonCreatureNames),
        NON_LAND_NAME("nonland card name", CardRepository.instance::getNonLandNames),
        CREATURE_NAME("creature card name", CardRepository.instance::getCreatureNames),
        ARTIFACT_NAME("artifact card name", CardRepository.instance::getArtifactNames);

        private final String description;
        private final Supplier<Set<String>> nameSupplier;

        TypeOfName(String description, Supplier<Set<String>> nameSupplier) {
            this.description = description;
            this.nameSupplier = nameSupplier;
        }

        private String getMessage() {
            return "choose " + CardUtil.addArticle(description);
        }

        private Set<String> getNames() {
            return nameSupplier.get();
        }

        public Choice makeChoiceObject() {
            Choice cardChoice = new ChoiceImpl(true, ChoiceHintType.CARD);
            Set<String> names = this.getNames();
            if (names.isEmpty()) {
                // see server logs for real errors
                throw new IllegalStateException("Critical error, can't find card names in database. Possible reason: no more free memory on server side");
            }

            cardChoice.setChoices(names);
            cardChoice.setMessage(CardUtil.getTextWithFirstCharUpperCase(this.getMessage()));
            cardChoice.clearChoice();
            return cardChoice;
        }

        public String getChoice(Game game, Ability source) {
            return getChoice(game.getPlayer(source.getControllerId()), game, source, true);
        }

        public String getChoice(Player player, Game game, Ability source, boolean setValue) {
            if (player == null) {
                return null;
            }
            Choice cardChoice = makeChoiceObject();
            player.choose(Outcome.Detriment, cardChoice, game);
            String cardName = cardChoice.getChoice();
            if (cardName == null) {
                return null;
            }
            MageObject sourceObject = game.getPermanentEntering(source.getSourceId());
            if (sourceObject == null) {
                sourceObject = source.getSourceObject(game);
            }
            if (sourceObject == null) {
                return cardName;
            }
            game.informPlayers(sourceObject.getLogName() + ": " + player.getName() + ", chosen name: [" + cardName + ']');
            if (!setValue) {
                return cardName;
            }
            game.getState().setValue(source.getSourceId().toString() + INFO_KEY, cardName);
            if (sourceObject instanceof Permanent) {
                ((Permanent) sourceObject).addInfo(INFO_KEY, CardUtil.addToolTipMarkTags("Chosen name: " + cardName), game);
            }
            return cardName;
        }
    }

    private final TypeOfName typeOfName;
    private final boolean lookAtOpponentHand;

    public ChooseACardNameEffect(TypeOfName typeOfName) {
        this(typeOfName, false);
    }

    public ChooseACardNameEffect(TypeOfName typeOfName, boolean lookAtOpponentHand) {
        super(Outcome.Detriment);
        this.typeOfName = typeOfName;
        this.lookAtOpponentHand = lookAtOpponentHand;
        if (lookAtOpponentHand) {
            staticText = "look at an opponent's hand, then choose any " + typeOfName.description;
        } else {
            staticText = "choose " + CardUtil.addArticle(typeOfName.description);
        }
    }

    protected ChooseACardNameEffect(final ChooseACardNameEffect effect) {
        super(effect);
        this.typeOfName = effect.typeOfName;
        this.lookAtOpponentHand = effect.lookAtOpponentHand;
    }

    @Override
    public boolean apply(Game game, Ability source) {
        if (lookAtOpponentHand) {
            Player player = game.getPlayer(source.getControllerId());
            if (player != null) {
                TargetOpponent target = new TargetOpponent(true);
                if (player.choose(Outcome.Benefit, target, source, game)) {
                    Player opponent = game.getPlayer(target.getFirstTarget());
                    if (opponent != null) {
                        MageObject sourceObject = game.getObject(source);
                        player.lookAtCards(sourceObject != null ? sourceObject.getIdName() : null, opponent.getHand(), game);
                        player.chooseUse(Outcome.Benefit, "Press Ok to name a card",
                                "You won't be able to resize the window showing opponents hand once you do",
                                "Ok", "", source, game);
                    }
                }
            }
        }
        return typeOfName.getChoice(game, source) != null;
    }

    @Override
    public ChooseACardNameEffect copy() {
        return new ChooseACardNameEffect(this);
    }
}
