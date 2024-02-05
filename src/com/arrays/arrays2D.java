package com.arrays;

import java.util.Scanner;

public class arrays2D {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length;j++) {
				System.out.print("Enter the elements of array as arr[i][j] ");
				arr[i][j] = sc.nextInt(); 
				
			}
			System.out.println();
		}
		for(int ar[]:arr) {
			for(int n:ar) {
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}
