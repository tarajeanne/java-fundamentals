package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int length = str.length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        boolean isEqual = str.equals(str2);

        // please concatenate str & str2 and set the result to a new String variable below

        String happyGreeting = str2 + " " + str;
        System.out.println(happyGreeting);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        String germanGreeting = happyGreeting.replace('e', 'a');
        System.out.println(germanGreeting);

        String germanShortGreeting = germanGreeting.substring(0, 5);
        System.out.println(germanShortGreeting);

        boolean isGerman = germanGreeting.contains("a");
        System.out.println(isGerman);

        int exclamationPoint = happyGreeting.indexOf('!');
        System.out.println(exclamationPoint);

    }


}