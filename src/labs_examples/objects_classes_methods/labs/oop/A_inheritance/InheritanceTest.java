package labs_examples.objects_classes_methods.labs.oop.A_inheritance;//
//Without running the code below, please tell me what it will print.
//I will print "child called," because the method overrides the superclass method.
//


public class InheritanceTest
{
  public static void main(String[] args)
  {
    Parent c = new Child();
    c.doSomething();
  }
}

class Parent
{
  public void doSomething()
  {
    System.err.println("Parent called");
  }
}

class Child extends Parent
{
  public void doSomething()
  {
    System.err.println("Child called");
  }
}