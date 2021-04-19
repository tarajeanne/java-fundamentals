package labs_examples.lambdas.labs;

import java.util.Locale;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class SuperRando {
    public String message;
    public SuperRando(String message) {
        this.message = message;
    }
    public String capitalizeMessage() {
        return this.message.toUpperCase();
    }
}

public class Exercise_02 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(2);
        Supplier<Double> supplier = Math::random;
        Function<String, SuperRando> func = SuperRando::new;
        SuperRando superRando = func.apply("Taco!!!");
        Supplier<String> randoBig = superRando::capitalizeMessage;
        System.out.println(randoBig.get());
        System.out.println(superRando.message);
        System.out.println(supplier.get());
        Predicate<String> isDinner = (a) -> {
            return a.equals("Risotto");
        };
        System.out.println(isDinner.test("Risotto"));
        BiFunction<Number, Number, Number> doMultiply = (a, b) -> {
            Class class1 = a.getClass();
            Class class2 = b.getClass();
            if (class1 == Double.class && class2 == Double.class) {
                return (double)a * (double)b;
            }
            else return 0;
        };
        double multiplier = (double)doMultiply.apply(5.5, 8.7);
        System.out.println(multiplier);
    }
}