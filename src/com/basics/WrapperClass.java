package com.basics;

public class WrapperClass {

	public static void main(String[] args) {


		//1. Converting  int primitive into Integer object (Autoboxing)
		int num = 100;
		Integer obj=Integer.valueOf(num);
		
		System.out.println(num+" "+obj);
		
		//2.converting the wrapper object to primitive (Unboxing)
		Integer obj1 = Integer.valueOf(100);
		int num1 = obj1.intValue();
		System.out.println(num1+" "+obj1);
		
	}

}
