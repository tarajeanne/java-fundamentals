package labs_examples.exception_handling.labs;
import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10");
        int num1 = input.nextInt();
        System.out.println("Pick another number between 1 and 10");
        int num2 = input.nextInt();
        try {
            System.out.println(num1/num2);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getStackTrace());
        }
        finally {
            System.out.println("Closing keyboard");
            input.close();
        }
    }
}
