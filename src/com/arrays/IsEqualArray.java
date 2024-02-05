package com.arrays;

import java.util.Scanner;

public class IsEqualArray {

	
	boolean isEqual() {
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		
		for(int i=0; i<arr1.length;i++) {
			
			System.out.println("enter the element of arr1 ");
			arr1[i]= sc.nextInt();
		}
		
		for(int i=0; i<arr2.length;i++) {
			
			System.out.println("enter the element of arr2 ");
			arr2[i]= sc.nextInt();
		}
		
		for(int var1:arr1) {
			System.out.print(var1+" ");
		}
		System.out.println();
		for(int var1:arr2) {
			System.out.print(var1+" ");
		}
		System.out.println();
		
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					
					return false;
				}
			}
			
		}else {
			return false;
		}
		return true;
		
		
	}
	
	
	public static void main(String[] args) {


		IsEqualArray cheack = new IsEqualArray();
		System.out.println(cheack.isEqual());
	}

}
