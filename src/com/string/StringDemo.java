package com.string;

public class StringDemo {

	public static void main(String[] args) {


		String str1 = "Hi";
		
		String str2 = "Hi";
		String str3 = str1.concat(" Ram");
		
		String var = new String("Hi");
		 str1 = str2.concat(" Ram");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(var.hashCode());
		System.out.println(str1);
				
	}

}
