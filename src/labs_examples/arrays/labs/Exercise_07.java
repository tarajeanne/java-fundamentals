package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main (String[] args) {
        ArrayList<String> aangGaang = new ArrayList<String>();

        aangGaang.add("Aang");
        aangGaang.add("Katara");
        aangGaang.add("Sokka");
        aangGaang.add("Suki");
        aangGaang.remove("Suki");
        aangGaang.add("Toph");
        if (aangGaang.contains("Zuko")) {
            System.out.println("Must be season 3!");
        }
        String thirdMember = aangGaang.get(2);
        System.out.println(thirdMember + " was the third member of the gaang!");

    }
}
