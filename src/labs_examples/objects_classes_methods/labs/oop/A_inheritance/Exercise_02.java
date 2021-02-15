package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer: When we declared "int i" in the subclass, it created a NEW int I. However. because object a is type A, we use that int I (unless explicitly stated as this.i in a getter)
 *
 */
class A {
    protected int i = 10;
    public void printI() {
        System.out.println(this.i);
    }
}

class B extends A{
    int i;
    public B() {
        this.i = 30;
    }
    public void printI() {
        System.out.println(i);
    }
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
        a.printI();
    }
}