package com.arrays;

import java.util.Scanner;

public class NoOfEvenAndOddElementsInArray {
	
	
	int noOfEvenElements(int arr1[]) {
		int count =0;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				count++;
			}
		}
		
		return count;
	}
	
	int noOfOddElements(int arr1[]) {
		int count =0;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]%2!=0) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[10];
		
		System.out.println("enter the elements in array ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		NoOfEvenAndOddElementsInArray count = new NoOfEvenAndOddElementsInArray();
		count.noOfEvenElements(arr1);
		System.out.println("total even no in the array is "+count.noOfEvenElements(arr1));
		;
		System.out.println("total odd no in the array is "+count.noOfOddElements(arr1));
		
		

	}

}
