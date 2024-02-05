package com.string;

public class StringProblems {

	
	static String reverseString(String str) {
		String str1 = "";
		for(int i=str.length()-1; i>=0;i--) {
			str1+=(str.charAt(i));
		}
		
		return str1;
		
	}
	
	static boolean isPalindrome(String str) {
		if(str.equals(reverseString(str))){
			return true;
		}else {
			return false ;
		}	
	}
	
	
	// counting white spaces
	static int countingWhiteSpaces(String str ) {
		
		int counter =0;
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				counter ++;
			}
		}
		return counter;
	}
	
	
	
	public static void main(String[] args) {


		String str = "madam";
		String str1 = " Hello world!  ";

		System.out.println("original string :"+str);
		
		
		System.out.println("reversed string : "+reverseString(str));
		
		System.out.println("palindrome :"+isPalindrome(str));
		
		System.out.println("total white spaces in string :"+ countingWhiteSpaces(str1));
	}

}
