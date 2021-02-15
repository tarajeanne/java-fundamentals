package labs_examples.objects_classes_methods.labs.oop.A_inheritance;//
//Without running the code below, please tell me what will print. Why?
//it will print Parent called, then child called because we need to construct the superclass before constructing the subclass.



public class InheritanceTest2
{
  public static void main(String[] args)
  {
    Parent2 c = new Child2();
  }
}

class Parent2
{
  public Parent2()
  {
    System.err.println("Parent called");
  }
}

class Child2 extends Parent2
{
  public Child2()
  {
    System.err.println("Child called");
  }
}