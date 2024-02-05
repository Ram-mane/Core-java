package com.controlstatements;

import java.util.Scanner;

public class SwitchOpDemo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the operetion to perform (Add,Sub,Multiply,Divide) : ");
		String op = sc.next();
		
		switch(op) {
		case "Add": 
			System.out.println("Enter the value for addition : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int add = test.addition(a, b);
			System.out.println("Addition is : "+add);
			break;
		case "Sub": 
			System.out.println("Enter the value for subtraction : ");
			int a1 = sc.nextInt();
			int b1 = sc.nextInt();
			int subtract = test.subtraction(a1, b1);
			System.out.println("Subtraction is : "+subtract);
			break;
		case "Multiply": 
			System.out.println("Enter the value for multiplication : ");
			int a11 = sc.nextInt();
			int b11 = sc.nextInt();
			int multiply = test.multiplication(a11, b11);
			System.out.println("multiplication is : "+multiply);
			break;
		case "Divide": 
			System.out.println("Enter the value for division : ");
			int a111 = sc.nextInt();
			int b111 = sc.nextInt();
			int division = test.division(a111, b111);
			System.out.println("division is : "+division);
			break;
		default:
			System.out.println("Enter correct Operetion name !");
			break;
		}
		
	}

}

class test{
	
	static int addition(int a, int b) {
		
		return a+b;
	}
	static int multiplication(int a, int b) {
		return a*b;
	}
	static int subtraction(int a, int b) {
		return a-b;
	}
	static int division(int a, int b) {
		return a/b;
	}
	
}
