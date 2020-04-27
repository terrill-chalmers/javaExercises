public class Card {
    CardRank rank;
    CardSuit suit;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public CardRank getRank() {
        return rank;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public void printCard() {
        System.out.println(this.rank + " of " + this.suit);
    }
}
