package com.arrays;

import java.util.Scanner;

public class Arraya3D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mat = 2;
		int rows = 3;
		int cols = 3;
		
		int arr[][][]= new int[mat][rows][cols];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int ar[][]:arr) {
			for(int a[]:ar) {
				for(int no:a) {
					System.out.print(no +" ");
				}
				System.out.println();
			}
			System.out.println();
		}
				
		
	}

}
