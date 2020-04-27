import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DealerTest {
    Dealer classToTest;
    List<Card> thisDeck;

    @Before
    public void setUp() throws Exception {
        classToTest = new Dealer();
        thisDeck = Dealer.shuffleDeck();
    }

    @Test
    public void selectCard() {
        assertEquals(52, thisDeck.size());

        Card selectedCard = classToTest.selectCard(thisDeck);
        selectedCard.printCard();
        assertEquals(51, thisDeck.size());
    }

    @Test
    public void selectHand() {
        assertEquals(52, thisDeck.size());

        List<Card> thisHand = classToTest.selectHand(thisDeck, 5);
        assertEquals(47, thisDeck.size());

        for(Card card : thisHand){
            card.printCard();
        }
    }
}