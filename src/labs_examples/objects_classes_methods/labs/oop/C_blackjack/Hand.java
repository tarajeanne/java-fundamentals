package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private int handValue;

    public Hand() {
        cards = new ArrayList<Card>();
        this.handValue = 0;
    }

    public int getHandValue() {
        return this.handValue;
    }

    public void addCard(Card card) {
        this.cards.add(card);
        this.handValue += card.getCardValue();
    }

    public boolean isBust() {
        return this.handValue > 21;
    }

    @Override
    public String toString() {
        String text = "| ";
        for (Card card: this.cards) {
            text = text + card.toString() + " | ";
        }
        return text;
    }
}
