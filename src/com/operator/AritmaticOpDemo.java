package com.operator;

import java.util.Scanner;

public class AritmaticOpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		int rem = num1%num2;
		
		System.out.println("Addition = "+sum+"\nsubtraction is "+sub+"\nmultiplication is "+mul+"\ndivision is "+div+"\nremender is "+rem);
		sc.close();
	}

}
