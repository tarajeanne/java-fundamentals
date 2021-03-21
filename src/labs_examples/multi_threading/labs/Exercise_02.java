package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class Scene extends Thread {
    public Scene(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                sleep(100);
                System.out.println("This is the " + getName());
            }
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}

public class Exercise_02 {
    public static void main(String[] args) {
        Scene scene = new Scene("Intro");
        scene.setPriority(1);
        scene.start();
        Scene scene2 = new Scene("Outtro");
        scene2.start();
    }
}