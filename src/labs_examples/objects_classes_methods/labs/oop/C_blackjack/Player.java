package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    public String name;
    public Hand hand;
    private int money;
    private int bet;

    public Player(String name) {
        this.money = 100;
        this.name = name;
        this.hand = new Hand();
    }

    public void addCard(Card card) {
        this.hand.addCard(card);
    }

    public int placeBet() {
        this.bet = (int)(Math.random() * (this.money / 2) + 1);
        return this.bet;
    }

    public int getBet() {
        return this.bet;
    }

    public void collectWinnings(int winnings) {
        this.money += winnings;
        this.bet = 0;
    }

    public boolean decide() {
        return this.hand.getHandValue() < 16;
    }
}
