package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 * <p>
 * Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 * print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */


class Counter {
    int count;

    public Counter() {
        this.count = 0;
    }

    public synchronized void countEvens() {
        while (count % 2 == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        count += 1;
        System.out.println(Thread.currentThread().getName() + ": " + count);
        notifyAll();
    }
    public synchronized void countOdds() {
        while (count % 2 == 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        count += 1;
        System.out.println(Thread.currentThread().getName() + ": " + count);
        notifyAll();
    }

    public int getCount() {
        return count;
    }
}

class CountController implements Runnable {
    Thread thread;
    Counter counter;

    public CountController(Counter counter, String name) {
        this.counter = counter;
        this.thread = new Thread(this, name);
        this.thread.start();
    }

    @Override
    public void run() {
        while (counter.getCount() < 100) {
            if (thread.getName().equals("Evens")) {
                counter.countEvens();
            }
            else {
                counter.countOdds();
            }

//            try {
//                counter.count();
//                notifyAll();
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

public class Exercise_06 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CountController evens = new CountController(counter, "Evens");
        CountController odds = new CountController(counter, "Odds");
    }
}