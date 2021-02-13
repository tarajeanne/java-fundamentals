package labs_examples.arrays.labs;

/**
 * Traversing Arrays Backwards
 * <p>
 * Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 * element in the array in reverse order.
 */

public class Exercise_05 {
    public static void main(String[] args) {
        String[] life = {"learn to walk", "move to Houston", "learn piano", "join band", "go to Baylor", "be gay", "do crime", "go to Rice", "be a teacher", "learn code"};
        System.out.println("My life in reverse!");
        for (int i = life.length -1; i >= 0; i--) {
            System.out.println(life[i]);
        }
    }



}
