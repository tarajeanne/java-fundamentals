package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

public class Exercise_02 {
    public <N extends Number> double sum(ArrayList<N> nums) {
        double sum = 0.0;
        for (N num : nums) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Exercise_02 obj = new Exercise_02();
        ArrayList<Short> arr = new ArrayList<>();
        arr.add((short)5);
        arr.add((short)4);
        arr.add((short)7);
        System.out.println((short)obj.sum(arr));
    }
}