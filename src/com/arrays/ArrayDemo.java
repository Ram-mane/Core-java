package com.arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		// declaration of arrays
		int arr[] = {1,2,3,4,5,6};
		
		int arr1[]= new int[5];
		
		// taking input in array
		
		for(int i=0; i<5; i++) {
			System.out.println("enter element :");
			arr1[i]=sc.nextInt();
		}
		
		// print the array
		for(int no:arr1) {
			System.out.print(no);
		}

	}

}
