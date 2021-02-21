package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("Let's divide by zero!");
        int[] nums = {1, 2, 3, 4, 0};
        try {
            System.out.println(nums[3] / nums[4]);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println("The program did not terminate!");
    }
}