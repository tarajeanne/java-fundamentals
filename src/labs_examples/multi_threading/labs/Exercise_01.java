package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Game game = new Game();
        Menu menu1 = new Menu(game, "Save Menu");
        Menu menu2 = new Menu(game);
        Thread thread = new Thread(menu2, "Items Menu");

        thread.start();
    }
}

class Game {
    public synchronized void save(String data){
        System.out.println(Thread.currentThread().getName() + " has entered save block.");
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + " has saved!");
    }
}

class Menu implements Runnable {
    Thread thread;
    Game game;

    public Menu(Game game, String name) {
        this.game = game;
        this.thread = new Thread(this, name);
        thread.start();
    }

    public Menu(Game game) {
        this.game = game;
        this.thread = Thread.currentThread();
    }

    @Override
    public void run() {
        System.out.println("Choose an options in " + Thread.currentThread().getName());
        game.save(Thread.currentThread().getName() + " saved!");
    }
}
