package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main (String[] args) {

        String[][] family = {
                {"Caroline"},
                {"Mama", "Daddy"},
                {"Nathan", "Crystal"},
                {"Pete", "Mia", "Charlie", "Reyna"}
        };

        for (String[] group : family) {
            for (String name : group) {
                System.out.println(name);
            }
        }
    }
}
