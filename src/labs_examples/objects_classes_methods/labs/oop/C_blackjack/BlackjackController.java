package labs_examples.objects_classes_methods.labs.oop.C_blackjack;
import java.util.Scanner;

public class BlackjackController {
    public static int gamesPlayed;
    public static int gamesToTheHouse;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Blackjack!");
        Deck deck = new Deck();
        Player dealer = new Player("Dealer");
        Player[] players = new Player[args.length + 1];
        for (int i = 0; i < args.length; i++) {
            players[i] = new Player(args[i]);
            System.out.println("Welcome to the game, " + args[i] + "!");
        }
        players[args.length] = dealer;
        takeBets(players);
        deal(players, deck);
        play(players, deck);
        resolve(dealer, players, deck);
        gamesPlayed++;
        System.out.print("Play again? (Y/N) > ");
        String response = input.next();
        if (response.equals("Y")) {
            main(args);
        }
    }

    public static void takeBets(Player[] players) {
        System.out.println("Let's take bets.");
        for (int i = 0; i < players.length -1; i++) {
            Player player = players[i];
            int bet = player.placeBet();
            System.out.println(player.name + " bets " + bet + ".");
        }
    }

    public static void deal(Player[] players, Deck deck) {
        System.out.println("Dealing cards now.");
        for (int i = 0; i < 2; i++) {
            for (Player player: players) {
                player.addCard(deck.drawCard());
            }
        }
        printHands(players);
    }

    public static void printHands(Player[] players){
//        int width = 50;
        System.out.println("Here are the hands.");
        System.out.println("-------------------------");
        for (Player player: players) {
            System.out.println(player.name + ": " + player.hand);
        }
    }

    public static void play(Player[] players, Deck deck) {
        System.out.println("It's time to play!");
        for (Player player: players) {
            turn(player, deck);
        }
    }

    public static void resolve(Player dealer, Player[] players, Deck deck) {
        printHands(players);
        boolean playerWon = false;
        for (int i = 0; i < players.length - 1; i ++) {
            Player player = players[i];
            if (player.hand.isBust()) {
                System.out.println("Bust! " + player.name + " loses " + player.getBet());
                player.collectWinnings(player.getBet() * -1);
            }
            else if (player.hand.getHandValue() == dealer.hand.getHandValue()) {
                System.out.println("Tie! " + player.name + " gets back " + player.getBet());
                player.collectWinnings(player.getBet());
                playerWon = true;
            }
            else if (dealer.hand.isBust() || player.hand.getHandValue() > dealer.hand.getHandValue()) {
                System.out.println("Win! " + player.name + " wins " + player.getBet() * 2);
                player.collectWinnings(player.getBet() * 2);
                playerWon = true;
            }
            else {
                System.out.println("Not quite! " + player.name + " loses " + player.getBet());
            }
        }
        if (!playerWon) {
            gamesToTheHouse++;
        }
    }

    public static void turn(Player player, Deck deck) {
        System.out.println(player.name + "'s turn.");
        boolean action;
        do {
            action = player.decide();
            if (action) {
                System.out.println(player.name + " hits!");
                player.addCard(deck.drawCard());
                System.out.println(player.name + "'s hand: " + player.hand);
            }
            else {
                System.out.println(player.name + " stays.");
            }
        } while (action);
    }
}
