package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
        for (int i = 0; i < Card.suits.length(); i++) {
            for (int j = 1; j <= 13; j++) {
                try {
                    this.cards.add(new Card(Card.suits.charAt(i), j));
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
    public Card drawCard() {
        int cardNum = (int)(Math.random() * this.cards.size());
        Card drawnCard = this.cards.get(cardNum);
        this.cards.remove(cardNum);
        return drawnCard;
    }
}
