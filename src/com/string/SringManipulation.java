package com.string;

import java.util.StringJoiner;

public class SringManipulation {

	public static void main(String[] args) {


		String original = "   Trim this String   ";
		
		// trim leading and trailing whitespace
		String trimed = original.trim();
		System.out.println("original length : "+original.length()+" trimmed length : "+trimed.length());
		System.out.println("Trimmed String :"+ trimed);
		
		// convert to uppercase and lowercase
		
		String uppercase = original.toUpperCase();
		System.out.println("Uppercase :"+ uppercase);
		
		String lowercase = original.toLowerCase();
		System.out.println("Lowercase :"+lowercase);
		
		// replace character
		
		String replaced = original.replace("Trim", "Replace");
		System.out.println("replaced : "+replaced);
		
		// splitting string 
		String[] splits = trimed.split(" " );
		for(String parts:splits) {
			System.out.print(parts+",");
		}
		System.out.println();
		
		StringBuilder s = new StringBuilder("Hello");
		System.out.println(s.capacity());
		StringBuilder s1 = new StringBuilder("World");
		
		
		// append
		StringBuilder append = s.append(s1);
		System.out.println("apended string "+append.toString());
		
		// String joiner
		StringJoiner sjoiner = new StringJoiner(",");
		sjoiner.add("Hello");
		sjoiner.add("World");
		System.out.println("String joiner "+sjoiner.toString());
		
		// string join from java utils
		String sj = "Hi";
		String sj1 = "Ram";
		
		String sjoin = String.join(" ",sj, sj1);
		System.out.println("String join "+sjoin.toString());
		
		// innsert func
		s.insert(1,"java");
		System.out.println("insert at 1st index : "+s.toString());
		
		// deletee func
		s.delete(1, 5);
		System.out.println("delete : "+s);
		
		//append
		s.append(" Ram");
		System.out.println("append : "+s);
		
		// unsigned 16bit value
		
		int val = s.codePointAt(4);
		System.out.println("Code point at "+val);
		
		

				
	}

}
