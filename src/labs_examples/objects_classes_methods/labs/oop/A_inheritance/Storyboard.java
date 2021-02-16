package labs_examples.objects_classes_methods.labs.oop.A_inheritance;
import java.util.Scanner;

public class Storyboard implements Scene {
    protected Snippet[] snippet;
    public void start() {
        System.out.println(snippet[0].text);
        Scanner input = new Scanner(System.in);
        int decision = input.nextInt();
        advance();
    }
    public void advance() {
        System.out.println("I'm just implementing an interface. There will be better logic here one day.");
    }
    public void end() {
        System.out.println("I guess this would return to some main controller class to initiate the next scene?");
    }
}
