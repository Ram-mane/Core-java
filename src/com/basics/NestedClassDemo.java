package com.basics;

public class NestedClassDemo {

	private int data=30;
	class Inner{
		void msg() {
			System.out.println("data is "+data);
		}
		
	}
	
	public static void main(String[] args) {

		NestedClassDemo obj = new NestedClassDemo();
		NestedClassDemo.Inner in = obj.new Inner();
		
		in.msg();

		
	}

}
