package com.string;

public class StringOperarations {

	public static void main(String[] args) {


		String str = "Hello";
		
		String str2 = new String("World");
		
		// concatat
		String result = str +" "+str2;
		System.out.println("Concatinated string :"+result);
		
		//length of string 
		int length = result.length();
		System.out.println("lenght of result string :"+length);
				
		// substring
		
		String substring = result.substring(4,8);
		System.out.println("subsring "+ substring);
		
		// charecter at specific index
		
		char charAt  = result.charAt(3);
		System.out.println("charecter at index 4 :"+charAt);
		
		//index of substring
		System.out.println(result);
		int indexOfSubstring = result.indexOf("W");
		System.out.println("index of w in result :"+indexOfSubstring);
		
		
	}

}
