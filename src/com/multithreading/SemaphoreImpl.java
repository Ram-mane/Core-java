package com.multithreading;

import java.util.concurrent.Semaphore;

class SharedResources1 {
	
	static Semaphore semaphore = new Semaphore(3);
	
	void useResources() {
		try {
			semaphore.acquire();// accurinng permit
			
			System.out.println(Thread.currentThread().getName()+" is using the resource");
			
//			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			semaphore.release(); // realising the resources
			System.out.println(Thread.currentThread().getName()+" is realising the resources");
		}
	}
}


class SharedResources1Impl extends Thread{
	
	private SharedResources1 sharedResources;
	
	public SharedResources1Impl(SharedResources1 sharedResources) {
		this.sharedResources= sharedResources;
	}
	
	public void run() {
		sharedResources.useResources();
	}
}

public class SemaphoreImpl {

	public static void main(String[] args) {


		SharedResources1 sharedResources = new SharedResources1();
		
		for(int i=0; i<=5; i++) {
			Thread t = new SharedResources1Impl(sharedResources);
			t.start();
		}
	}

}
