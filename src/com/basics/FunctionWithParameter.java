package com.basics;

public class FunctionWithParameter {

	
	int add(int a, int b) {
		return a+b;
	}
	
	// default constructor
	FunctionWithParameter(){
		System.out.println("This is default constructor");
	}
	
	//Parameterized constructor
	FunctionWithParameter(int a){
		System.out.println("This is Parameterized constructor "+a);
	}
	
	public static void main(String[] args) {
		
		FunctionWithParameter obj = new FunctionWithParameter();
		
		System.out.println("Addition is = "+obj.add(3, 7));
		
		FunctionWithParameter obj2 = new FunctionWithParameter(9);
	}

}
