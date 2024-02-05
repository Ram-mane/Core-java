package com.string;

public class StringComparison {

	public static void main(String[] args) {


		String str1 = "hello";
		
		String str2 = "hello";
		
		String str3 = "World";
		
		String str4 = new String("hello");
		String str5 = new String("hello");
		
		
		// cheack if the referance is same not the hashcode
		boolean isReferanceSame = (str1==str2);
		boolean isReferanceSame1 = (str4==str5);
		System.out.println(isReferanceSame);
		
		System.out.println(isReferanceSame1);

		// case sensitive comparison
		boolean isEqual = str1.equals(str2);
		System.out.println("case sensitive comparison :"+isEqual);
		
		//Case insensitive comparison
		boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println("case insensitive comparison :"+isEqualIgnoreCase);
		
		// comapare to another string lexographically
		
		int comResult = str1.compareTo(str3);
		System.out.println("comparison result: "+comResult);
	}

}
