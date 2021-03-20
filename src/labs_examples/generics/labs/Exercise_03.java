package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */
public class Exercise_03 {
    public <C extends Collection<String>> int count(C list) {
        int count = 0;
        for (String i : list) {
            count ++;
        }
        return count;
    }

    public <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public <E extends Comparable<E>, L extends List<E>> E largest(L list, int beg, int end) {
        E max = list.get(beg);
        for (int i = beg + 1; i < end; i++) {
            E curr = list.get(i);
            int comparison = curr.compareTo(max);
            if (comparison > 0) {
                max = curr;
            }
        }
        return max;
    }

    public <C extends Collection<String>> int countPalindromes(C list) {
        int count = 0;
        for (String word : list) {
            boolean isPalindrome = true;
            for (int i = 0; i <= word.length() / 2; i++) {
                char letter1 = word.charAt(i);
                int index2 = word.length() - i - 1;
                char letter2 = word.charAt(index2);
                if (letter1 != letter2) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Exercise_03 obj = new Exercise_03();
        ArrayList<String> list = new ArrayList<String>();
        list.add("It");
        list.add("loveevol");
        list.add("chicken");
        list.add("racecar");
        System.out.println(obj.count(list));

        String[] list2 = {"It", "love", "chicken", "racecar"};
        Exercise_03 obj2 = new Exercise_03();
        System.out.println(obj2.count(list));

        obj.swap(list2, 1, 3);
        for (String i : list2) {
            System.out.println(i);
        }

        System.out.println(obj.countPalindromes(list));

    }
}