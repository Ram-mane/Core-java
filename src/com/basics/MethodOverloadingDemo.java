package com.basics;

public class MethodOverloadingDemo {

	void method(int a) {
		System.out.println("single para int value method");
		
	}
	
	void method(String name) {
		System.out.println("single para string value method");
		
	}
	
	void method(int a, int b) {
		System.out.println("2 para value method");
	}
	
	
	
	public static void main(String[] args) {

		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		
		obj.method(5);
		obj.method("Ram");
		obj.method(2,7);
		
	}

}
