package com.abstraction;


abstract class Bank{
	abstract float rateOfInterest();
	
	
}

class SBI extends Bank{

	@Override
	float rateOfInterest() {
		// TODO Auto-generated method stub
		return 7.8f;
	}
	
}

class HSBC extends Bank{

	@Override
	float rateOfInterest() {
		// TODO Auto-generated method stub
		return 9.1f;
	}
	
}
public class AbstractionDemo {

	public static void main(String[] args) {


		Bank b = new SBI(); // lose coupling
		Bank b1 = new HSBC();
		
		System.out.println("rate of interest of SBI is "+b.rateOfInterest());
		System.out.println("rate of interest of HSBC is "+b1.rateOfInterest());
	}

}
