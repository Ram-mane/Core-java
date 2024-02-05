package com.arrays;

public class SortingOfArray {
	
	// Alternate position
	void mergingOfArrays() {
		int arr1[] = {1,2,3,4};
		
		int arr2[]= {5,6,7,8};
		
		int arr3[]= new int[arr1.length+arr2.length];
		
		for(int i=0; i<=arr1.length-1; i++) {
			arr3[i*2]=arr1[i];
		}
		for(int i=0; i<=arr2.length-1; i++) {
			arr3[(i*2)+1]=arr2[i];
		}
		for(int var: arr3) {
			System.out.print(var+" ");
		}
	}
	
	void sortingOfArray() {
	
		
		int arr[] = {7,5,1,56,3};
		
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[i]>arr[j]) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i]=temp;
				}
			}
		}
		
		System.out.print("[");
		for(int var:arr) {
			System.out.print(var+" ");
		}
		System.out.print("]");
		
	}
	
	void alternetMethodOfMerging() {
		int arr1[] = {1,2,3,4};
		
		int arr2[]= {5,6,7,8};
		
		int arr3[]= new int[arr1.length+arr2.length];
		
		for(int i=0,  j=0; i<arr3.length; i+=2, j++) {
			arr3[i] = arr1[j];
			arr3[i+1] = arr2[j];
		}
		System.out.print("[");
		for(int var:arr3) {
			System.err.print(var+" ");
		}
		System.out.print("]");
	}
	
	
	

	public static void main(String[] args) {


		
		SortingOfArray srt = new SortingOfArray();
//		srt.mergingOfArrays();
//		System.out.println();
//		
//		srt.sortingOfArray();
		
		srt.alternetMethodOfMerging();
		
		
	}
		
		

}
