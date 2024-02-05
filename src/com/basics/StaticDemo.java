package com.basics;

public class StaticDemo {

	static int num1 = 5;
	 static int num2 = 23;
	static void add() {
		
		int add = num1+num2;
		System.out.println("Addition is = "+ add);
	}
	
	static void subtraction() {
		int subtraction = num1 - num2;
		System.out.println("Subtraction of the numbers is = "+ subtraction);
	}
	
	static void multiplication() {
		int multiplication = num1*num2;
		System.out.println("Multiplication of the number is = "+ multiplication);
	}
	
	void divide () {
		int division = num1/num2;
		System.out.println("Divisionn of the numbers is = "+ division);
	}
	
	
	public static void main(String[] args) {
		
		add();
		
		StaticDemo division = new StaticDemo();
		division.divide();
		
		multiplication();
		
		subtraction();
		

	}
	
	

}
