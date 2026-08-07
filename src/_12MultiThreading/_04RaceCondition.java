package _12MultiThreading;

class Counter {

    int counter = 0;

    public  synchronized void increment() {
        counter++;
    }
}

class ClassOne implements Runnable {

    Counter c;

    public ClassOne(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10000; i++) {
            c.increment();
        }
    }
}

class ClassTwo implements Runnable {

    Counter c;

    public ClassTwo(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10000; i++) {
            c.increment();
        }
    }
}
//ThreadSafe means when one threa work on one thing, another thread could not be interput
//For Multithreading good to use Immutable items
public class _04RaceCondition {

    public static void main(String[] args) {

        // Shared Counter Object
        Counter c = new Counter();

        // Pass the same Counter object to both Runnable objects
        Runnable obj1 = new ClassOne(c);
        Runnable obj2 = new ClassTwo(c);

        // Create Threads
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start Threads
        t1.start();
        t2.start();

        // Wait until both threads finish

        try{
            t1.join();
            t2.join();


        }catch(Exception e){

        }

        // Print Final Counter Value
        System.out.println("Counter Value = " + c.counter);
    }
}