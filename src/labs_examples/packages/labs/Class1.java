package labs_examples.packages.labs;

public class Class1 {
    public void class1PublicMethod() {
        System.out.println("Class 1, public method!");
    }

    protected void class2ProtectedMethod() {
        System.out.println("Class 1, protected method!");
    }

    public void class1CallsClass2Default() {
        Class2 obj2 = new Class2();
        obj2.class2DefaultMethod();
    }
}
