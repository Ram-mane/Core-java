package com.operator;

import java.util.Scanner;

public class TernaryOpDemo2 {

	public static void main(String[] args) {


		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the age to cheack the eligibility: ");
		int age = sc.nextInt();
		
		
		
		String eligiibility = (age>18)?"you are eligible for voting.":"You are not eligible !!";
		System.out.println(eligiibility);
	}

}
