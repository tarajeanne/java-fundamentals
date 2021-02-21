package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        try {
            divideByZero(4, 2);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static int divideByZero(int a, int b) throws ArithmeticException {
        try {
            return a / b;
        }
        catch (ArithmeticException e) {
            throw e;
        }
    }
}
