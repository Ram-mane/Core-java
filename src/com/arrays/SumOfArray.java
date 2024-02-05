package com.arrays;

import java.util.Scanner;

public class SumOfArray {

	
	 int sumOfArray() {
		
		 int arr[] = new int[5];
		 
		 Scanner sc = new Scanner(System.in);
		 int sum =0;
		 for(int i=0; i<5; i++) {
			 System.out.println("Enter the elements to add in array : ");
			 
			arr[i] = sc.nextInt(); 
		 }
		 
		 // for each loop for print the no in array
		 for(int var:arr) {
			 System.out.print(var+" ");
			 
		 }
		 System.out.println();
		 for(int i=0; i<5; i++) {
			 sum+=arr[i];
		 }
		 System.out.println("sum of elements in array is "+sum);
		 
		 return sum;
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumOfArray sum = new SumOfArray();
		
		sum.sumOfArray();
		
	}

}
