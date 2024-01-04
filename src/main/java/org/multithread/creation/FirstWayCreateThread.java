package org.multithread.creation;

public class FirstWayCreateThread {

    public static void main(String[] args) throws InterruptedException {

        // Here we create a new Thread.
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in thread " + Thread.currentThread().getName());
                System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
            }
        });

        //Print result: We are in thread: main before starting a new Thread
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new Thread");

        //Used for set new name to Thread
        thread.setName("Gama Thread");

        //Used for set priority to Thread. The value is between 0 and 10, where 0 is the lowest priority
        // and 10 is the highest.
        thread.setPriority(Thread.MAX_PRIORITY);

        //Used to start thread.
        thread.start();

        //Print result: We are in thread: Gama Thread after starting a new Thread
        System.out.println("We are in thread: " + thread.getName() + " after starting a new Thread");

        //When the Thread is sleeping, there is no CPU consumption.
        Thread.sleep(10000);
    }
}
