package labs_examples.packages.labs2;
import labs_examples.packages.labs.Class1;

public class PackageController {
    public static void main(String[] args) {
        Class3 obj3 = new Class3();
        obj3.class3PublicMethod();
//      won't compile
//      Class2 obj = new Class2();
        Class1 obj1 = new Class1();
        obj1.class1PublicMethod();
        obj1.class1CallsClass2Default();
    }
}
