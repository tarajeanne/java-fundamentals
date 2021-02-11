package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int firstDice = (int)(Math.random() * 6) + 1;
        int secondDice = (int)(Math.random() * 6) + 1;
        while (true) {
            System.out.println(firstDice + " " + secondDice);
            if (firstDice == secondDice) {
                System.out.println("We got doubles!!!");
                break;
            }
            secondDice = (int)(Math.random() * 6) + 1;
        }
    }
}
