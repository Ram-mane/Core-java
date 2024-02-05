package com.arrays;

import java.util.Scanner;

public class MultiplicationOf2DArray {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
		int arr1[][] = new int[3][3];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length;j++) {
				System.out.print("Enter the elements of array as arr1[i][j] ");
				arr1[i][j] = sc.nextInt(); 
				
			}
			System.out.println();
		}
		for(int ar[]:arr1) {
			for(int n:ar) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		System.out.println();
		
        int arr2[][] = new int[3][3];
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length;j++) {
				System.out.print("Enter the elements of array as arr2[i][j] ");
				arr2[i][j] = sc.nextInt(); 
				
			}
			System.out.println();
		}
		for(int ar[]:arr2) {
			for(int n:ar) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
//		System.out.println();
		
		
		int arr3[][] = new int[3][3];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length;j++) {
				for(int k=0; k<arr1[0].length; k++) {
					arr3[i][j] = arr3[i][j]+ arr1[i][k]*arr2[k][j];
				}
				 
				
			}
			System.out.println();
		}
		for(int ar[]:arr3) {
			for(int n:ar) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}

}
