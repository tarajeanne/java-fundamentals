package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    static String suits = "♠♦♥♣";
    private final char suit;
    private final int cardValue;

    public Card(char suit, int cardValue) throws Exception {
        if (suits.indexOf(suit) != -1) {
            this.suit = suit;
        }
        else {
            throw new Exception();
        }
        this.cardValue = cardValue;
    }

    public char getSuit() {
        return suit;
    }

    public int getCardValue() {
        if (this.cardValue == 11 || this.cardValue == 12 || this.cardValue == 13) {
            return 10;
        }
        else {
            return this.cardValue;
        }
    }

    @Override
    public String toString() {
        return suit + ":" + cardValue;
    }
}
