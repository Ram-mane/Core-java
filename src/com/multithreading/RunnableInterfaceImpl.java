package com.multithreading;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        // Code to be executed by the thread
        for (int i = 0; i < 5; i++) {
            System.out.println("thread id of ThreadDemo : "+Thread.currentThread().getId() + " Value " + i);
            System.out.println("Thread state: of ThreadDemo class : " + Thread.currentThread().getState());

        }
    }
}

public class RunnableInterfaceImpl extends Thread {

    @Override
    public void run() {
        System.out.println("Thread id of RunnableInterfaceImpl :"+Thread.currentThread().getId());

        System.out.println("Thread state of RunnableInterfaceClass : " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {
        ThreadDemo runnableInstance = new ThreadDemo();
        Thread thread1 = new Thread(runnableInstance);
        thread1.start();

        Thread thread2 = new Thread(runnableInstance);
        thread2.start();

        RunnableInterfaceImpl customThread = new RunnableInterfaceImpl();
        customThread.start();
    }
}
