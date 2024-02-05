package com.arrays;

import java.util.Scanner;

public class ArrayOfObject {
 
	ArrayOfObject (int i){
		System.out.println(i);
	}
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		ArrayOfObject obj[]=new ArrayOfObject[5];
		
		for(int i=0; i<5;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			obj[i]= new ArrayOfObject(a[i]);
		}
		
	}

}
