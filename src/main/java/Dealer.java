import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Dealer {
    public static List<Card> shuffleDeck() {
        List<Card> deck = createDeck();

        Collections.shuffle(deck);

        return deck;
    }

    public Card selectCard(List<Card> deck) {
        int cardIndex = ThreadLocalRandom.current().nextInt(0, deck.size() - 1);

        Card randomCard = deck.get(cardIndex);

        deck.remove(cardIndex);

        return randomCard;
    }

    public List<Card> selectHand(List<Card> deck, int numberOfCards) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            hand.add(selectCard(deck));
        }

        return hand;
    }

    private static List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();

        for (CardRank rank : CardRank.values()) {
            for (CardSuit suit : CardSuit.values()) {
                deck.add(new Card(rank, suit));
            }
        }

        return deck;
    }
}
