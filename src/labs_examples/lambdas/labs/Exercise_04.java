package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demontsrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 */

public class Exercise_04 {
    public static void main(String[] args) throws IOException {
        IntStream.range(1, 15).forEach(System.out::println);
        int[] arr = {1, 5, 8, 45, 8};
        IntStream stream = Arrays.stream(arr);
        int sum = stream.reduce(0, (a, b) -> a + b);
        System.out.println(sum);
        IntStream stream2 = Arrays.stream(arr);
        int sum2 = stream2.map((i) -> i * 3).sum();
        System.out.println(sum2);
        IntStream stream3 = Arrays.stream(arr);
        int avg = (int)stream3.filter((i) -> i < 30).average().getAsDouble();
        System.out.println(avg);

        Stream<String> rows1 = Files.lines(Paths.get("./src/labs_examples/lambdas/labs/stream_text_lab.csv"));
        rows1.forEach(System.out::println);

        Stream<String> rows2 = Files.lines(Paths.get("./src/labs_examples/lambdas/labs/stream_text_lab.csv"));
        rows2.map((line) -> line.split(",")).forEach((lineArr) -> System.out.println(lineArr[1]));

        Stream<String> rows3 = Files.lines(Paths.get("./src/labs_examples/lambdas/labs/stream_text_lab.csv"));
        int csvSum = rows3.map((line) -> Integer.getInteger(line.split(",")[2])).reduce(0, (a, b) -> a + b);
    }
}