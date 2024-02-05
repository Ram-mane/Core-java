package com.interfaces;

public class MainApp {

	public static void main(String[] args) {


		Bank h = new HDFC();
		Bank s = new SBI();
		
		System.out.println("rate of interest of HDFC is : "+h.rateOfInterest());
		System.out.println("rate of interest of SBI is : "+s.rateOfInterest());
	}

}
