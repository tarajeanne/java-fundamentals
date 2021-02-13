package labs_examples.arrays.labs;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Give me a number!> ");
            nums[i] = input.nextInt();
        }
        int sum =0;

        for (int num: nums) {
            sum += num;
        }

        System.out.println(sum);

        input.close();
    }

}