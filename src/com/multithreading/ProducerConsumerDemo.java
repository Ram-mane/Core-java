package com.multithreading;





class SharedResources {
    boolean isDataProduced = false;

    public synchronized void produce() {
        while (isDataProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Producing data ");
        isDataProduced = true;

        notify();
    }

    public synchronized void consume() {
        while (!isDataProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consuming data ");

        isDataProduced = false; // Reset the flag after consuming data
        notify();
    }
}

class Produce extends Thread {
    private SharedResources sharedResources;

    public Produce(SharedResources sharedResources) {
        this.sharedResources = sharedResources;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResources.produce();
        }
    }
}

class Consume extends Thread {
    private SharedResources sharedResources;

    public Consume(SharedResources sharedResources) {
        this.sharedResources = sharedResources;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResources.consume();
        }
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        SharedResources sharedResources = new SharedResources();

        Produce produce = new Produce(sharedResources);
        Consume consume = new Consume(sharedResources);

        produce.start();
        consume.start();
    }
}
