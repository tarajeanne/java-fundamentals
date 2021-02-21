package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
public class Exercise_05 {
    public static void main(String[] args) {
        int[] nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        try {
            try {
                System.out.println(nums[5] / nums[0]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Not enough nums passed in!");
            }
        } catch (ArithmeticException e) {
            System.out.println("You can't pass in 0!!");
        }
        System.out.println("End of program");
    }
}