package labs_examples.exception_handling.labs;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
public class Exercise_07 {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("What's your favorite sandwich?");
        String faveSandwich = input.next();
        try {
            int rating = rateSandwich(faveSandwich);
            if (rating <= 5) {
                System.out.println(faveSandwich + "? Bad choice.");
            }
            else if (rating <= 7) {
                System.out.println(faveSandwich + "? Fine, I guess.");
            }
            else {
                System.out.println(faveSandwich + "? Awesome!");
            }
        }
        catch (NotASandwich e) {
            System.out.println(e);
        }
    }

    public static int rateSandwich(String sandwich) throws NotASandwich{
        String[] notSandwiches = {
                "pizza",
                "sushi",
                "poptart",
                "hotdog",
                "ravioli"
        };
        if (Arrays.asList(notSandwiches).contains(sandwich)) {
            throw new NotASandwich(sandwich);
        }
        else {
            return (int)(Math.random() * 10 + 1);
        }
    }
}

class NotASandwich extends Exception {
    public NotASandwich(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "A sandwich has stuff between two distinct breads. " + getMessage() + " is not a sandwich!";
    }
}