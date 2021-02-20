package labs_examples.packages.labs2;
import labs_examples.packages.labs.Class2;

public class Class3 extends Class2 {
    public void class3PublicMethod() {
        class2ProtectedMethod();
        //won't compile
//        class2DefaultMethod();
    }
}
