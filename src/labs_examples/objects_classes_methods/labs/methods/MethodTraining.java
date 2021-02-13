package labs_examples.objects_classes_methods.labs.methods;
import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {
        System.out.println(fight("Korra", "Zaheer"));
        System.out.println(fight("Korra", "Equalist1", "Equalist2", "Equalist3", "Equalist4"));
        boolean won = fight("Korra", "Zaheer", "P'Li");

        int[] originalArray = new int[10];
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = i;
        }
        System.out.println(originalArray[5]);
        changeOriginal(originalArray);
        System.out.println(originalArray[5]);

        System.out.println(largest(1, 5, 7, 2));
        System.out.println(consonantCounter("Caroline"));

//        System.out.println(isPrime(90));
        int[] input = {1, 6, 4, 9, 298, 54, 982, 63};
        int[] output = highLow(input);
        for (int i: output) {
            System.out.println(i);
        }

        ArrayList<Integer> nums = divisors(33, 2, 6);
        for (int i: nums) {
            System.out.print(i + " | ");
        }
        System.out.println();

        System.out.print("Contents of array before reversing - ");
        for (int i: input) {
            System.out.print(i + " ");
        }
        System.out.println();
        arrayReverser(input);
        System.out.print("Contents of array after reversing - ");
        // print each element of the array to verify reverse order
        for(int i : input){
            System.out.print(i + " ");
        }
    }
//    1) Demonstrate method overloading in this class
    public static String fight(String character1, String character2) {
        if (character1.length() > character2.length()) {
            return character1;
        }
        else {
            return character2;
        }
    }

    public static boolean fight(String character1, String...opponents) {
        return opponents.length <= character1.length();
    }

//    2) Demonstrate the difference between "pass by value" and "pass by reference"
    public static void changeOriginal(int[] original) {
        original[5] = 100;
    }
//    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int largest(int...a) {
        int largest = Integer.MIN_VALUE;
        for(int num : a) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }
//
//    4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int consonantCounter(String text) {
        String consonants = "zxcvbnmsdfghjklqwrtypZXCVBNMSDFGHJKLQWRTYP";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (consonants.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
//
//    5) Write a method that will determine whether or not a number is prime
    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        int max = (int)Math.sqrt(num);
        for (int i = 2; i <= max; i++) {
            boolean currPrime = isPrime(i);
            if (currPrime && num % i == 0) {
                return false;
            }
        }
        return true;
    }
//
//    6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//    which is passed in as an argument
    public static int[] highLow(int[] arr) {
        int lowest =  Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;

        for (int num: arr) {
            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }
        int[] smallArr = {lowest, highest};
        return smallArr;
    }
//    7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//    length of the returned list
    public static ArrayList<Integer> divisors(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 1; i <= maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                output.add(i);
            }
        }

        return output;
    }

//    8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//    variable is used to temporarily store individual values in the array

    public static void arrayReverser(int[] nums) {
        int temp;

        for(int i = 0; i < nums.length / 2; i++){
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

    }


}
