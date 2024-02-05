package com.basics;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to find squre :");
		int number = sc.nextInt();
		
		int squre = number*number;
		System.out.println("Squre of the number is :"+squre);
		sc.close();
	}

}
