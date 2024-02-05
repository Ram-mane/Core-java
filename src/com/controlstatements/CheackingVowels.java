package com.controlstatements;

import java.util.Scanner;

public class CheackingVowels {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the charecter to cheack eithe vowel or no : ");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'a':
			System.out.println(ch+" is vowel");
			break;
		
		case 'e':
			System.out.println(ch+" is vowel");
			break;
			
		
		case 'i':
			System.out.println(ch+" is vowel");
			break;
		

		case 'o':
				System.out.println(ch+" is vowel");
				break;
			
		case 'u':
				System.out.println(ch+" is vowel");
				break;
		default:
            System.out.println("not a vowel"); // Default case if 'day' doesn't match any case
            break;

		}
	
	}

}
