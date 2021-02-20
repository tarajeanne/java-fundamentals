package labs_examples.static_nonstatic.labs;

public class ClassA {

    public static void main(String[] args) {
        methodA();
        ClassA taco = new ClassA();
        taco.methodB();
        ClassB.methodA();
        ClassB sandwich = new ClassB();
        sandwich.methodB();
        taco.methodC();
    }
    public static void methodA() {
        System.out.println("Live from Class A, Method A!");
    }

    public void methodB() {
        System.out.println("Live from Class A, Method B!");
    }

    public void methodC() {
        System.out.println("Live from Class A, Method C!");
        methodA();
        methodB();
        ClassB.methodA();
        ClassB lasagna = new ClassB();
        lasagna.methodB();

    }
}
