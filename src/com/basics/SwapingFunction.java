package com.basics;

public class SwapingFunction {

	static int a = 5;
	static int b = 10;
	static void swappingNumbersWithThirdVariable() {
		
		System.out.println("values of numbers before seapping is a : "+a+ " b : "+ b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("values of numbers after swapping is "+"a : "+a+" b : "+ b);
	}
	
	static void swappingNumbersWithoutThirdVariable() {
		System.out.println("values of numbers before seapping is a : "+a+ " b : "+ b);

		 a= a+b;
		 b = a-b;
		 a = a-b;
		 
	 System.out.println("values of numbers after swapping is "+"a : "+a+" b : "+ b);

	}
	
	
	public static void main(String[] args) {
		
		swappingNumbersWithThirdVariable();
		
		swappingNumbersWithoutThirdVariable();

	}

}
