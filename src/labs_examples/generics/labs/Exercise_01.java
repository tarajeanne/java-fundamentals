package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01<E> {
    private E first;
    private E second;
    public Exercise_01(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Exercise_01<Integer> obj = new Exercise_01<>(5, 6);
        System.out.println(obj.getFirst());

        Exercise_01<Double> obj2 = new Exercise_01<>(7.0, 5.5);
        System.out.println(obj2.getSecond());
    }
}