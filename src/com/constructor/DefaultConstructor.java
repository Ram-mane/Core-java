package com.constructor;

public class DefaultConstructor {

	
	public DefaultConstructor() {
		String name = "this is default constructor !";
		System.out.println(name);
	}
	public static void main(String[] args) {

		DefaultConstructor obj = new DefaultConstructor() ;
		
	}

}
