package com.multithreading;


class Notify1 extends Thread{
	
	public void run() {
		synchronized(this) {
			System.out.println("starting of "+ Thread.currentThread().getName());
			try {
				this.wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
				System.out.println(Thread.currentThread().getName()+"...notified ");
			}
		}
	}
	
}

class Notify2 extends Thread{
	
	Notify1 notify1;
	
	public Notify2(Notify1 notify1) {
		this.notify1=notify1;
	}
	
	public void run() {
		synchronized(this.notify1) {
			System.out.println("starting of "+ Thread.currentThread().getName());
			try {
				this.notify1.wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


class Notify3 extends Thread{
	
	Notify1 notify1;
	
	public Notify3(Notify1 notify1) {
		this.notify1=notify1;
	}
	
	public void run() {
		synchronized(this.notify1) {
			System.out.println("starting of "+ Thread.currentThread().getName());
			try {
				this.notify1.wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


public class NotifyAllExce {

	public static void main(String[] args) {


		Notify1 notify1 = new Notify1();
		Notify2 notify2 = new Notify2(notify1);
		Notify3 notify3 = new Notify3(notify1);
		
		// creating thread
		
		Thread t1 = new Thread(notify1, "Thread-1");
		Thread t2 = new Thread(notify2, "Thread-2");
		Thread t3 = new Thread(notify3, "Thread-3");
		
		try {
			System.out.println("waiting for threads ");
			t1.join();
			t2.join();
			t3.join();
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
		System.out.println("thread one is alive "+ t1.isAlive());
		System.out.println("thread two is alive "+ t2.isAlive());
		System.out.println("thread tree is alive "+ t3.isAlive());

		
		System.out.println("main thread existing");
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("thread one is alive "+ t1.isAlive());
		System.out.println("thread two is alive "+ t2.isAlive());
		System.out.println("thread tree is alive "+ t3.isAlive());
		
		

	}

}
