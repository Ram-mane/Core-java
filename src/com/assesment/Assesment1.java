package com.assesment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Assesment1 {

	
	
	//1.Reverse an Array: Write a Java program to reverse an array of integers.
	
	void reverseArray(int arr[]) {
		int n = arr.length;
		
		for(int i=0;i<n/2; i++) {
			int temp;
			temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i]=temp;
		}
		System.out.println("reversed array :");
		
	}
	
	
	//2. Find Maximum and Minimum: Write a Java program to find the maximum and minimum elements in an array.

	void maxAndMinInArray(int arr[]) {
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<minValue) {
				minValue=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
		}
		
		System.out.println("Min value in array is :"+minValue);
		System.out.println("Max value in array is :"+maxValue);
			
	}
	
	// 3.Array Rotation:  Implement a Java program to rotate an array to the right by a given number of steps.
	
	
	//4. Sum of Elements:  Calculate the sum of all elements in an array.
	
	void sumOfElementsInArray(int arr[]) {
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum of elements in the array is :"+ sum);
	}
	
	// 5.Duplicate Elements: Find and remove duplicate elements from an array.
	
	void removingDuplicateElement(int arr[]) {
		ArrayList<Integer> duplicateElement = new ArrayList<>();
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j] && !duplicateElement.contains(arr[i])) {
					duplicateElement.add(arr[i]);
				}
			}
		}
		System.out.println("duplicate elenemt in the array was "+ duplicateElement);	
	}
	
	//6.Array Intersection: Write a Java program to find the intersection of two arrays.
	
	void intersectionOfTwoArrays(int[] arr, int[] arr1) {
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> intersectionSet = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		for(int num:arr1) {
			if(set.contains(num)) {
				intersectionSet.add(num);
			}
		}
		
		System.out.print("intersection element in the given arrays are : ");
		for(int element:intersectionSet) {
			System.out.print(element+" ");
		}
	}
	
	//7.Missing Number: Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing.
	
	void missingNumber(int distNoArr[]) {
		int missingNo;
		for(int i=0; i<distNoArr.length;i++) {
			if(distNoArr[i]!=i) {
				missingNo=i;
				System.out.println("missing no in array is "+ missingNo);
				break;
			}
		}
		
	}

	

	
	//8. Sort Array Without Using Arrays.sort(): Implement a sorting algorithm to sort an array 
	//   without using the Arrays.sort() method.
	
	void sortingArray(int arr[]) {
		int n = arr.length;
	
		for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
		}
	}

	
	//9.Product of Array Except Self: Given an array nums, return an array output such that output[i]
	//  is equal to the product of all the elements of nums except nums[i].
	
	void arrayProductExceptSelf(int arr[]) {
		int[] output = new int[arr.length];
		
		for(int i=0; i<arr.length;i++) {
			int product=1;
			for(int j=0; j<arr.length;j++) {
				if(i!=j) {
					product*=arr[j];
				}	
			}
			output[i]=product;
		}
		for(int prod:output) {
			System.out.print(prod+" ");
		}
		
	}

	
	//10. Leaders in an Array: Write a Java program to find all leaders in an array. An element is a leader if it is 
	//    greater than all the elements to its right side.
	
	void leaderInArray(int arr[]) {
		HashSet<Integer> leadersInArry= new HashSet<>();
		
		for(int i=0; i<arr.length;i++) {
			int counter =0;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					counter++;
					
				}
			}
			// counter is used to cheack that value of the element should always greater than the right elements
			if(counter ==(arr.length-1-i)){
				leadersInArry.add(arr[i]);
			}
		}
		System.out.print("leaders in array are :" );
		for(int leader:leadersInArry) {
			System.out.print(leader+" ");
		}
	}
	
	
	// 11. Kth Largest Element: Find the kth largest element in an array.
	void kthLargestElement(int arr[], int k) {
		
		sortingArray(arr);
		int kthLargest = arr[arr.length-k];
		System.out.println(k+" th largest element in the array is :"+kthLargest);
	}
	
	//12.Two Sum:	Given an array of integers, find two numbers such that they add up to a specific target.
	void twoSNumberSum(int arr[], int target) {
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.print("["+arr[i]+","+arr[j]+"]");
				}
			}
			System.out.println();
		}
	}
	
	//13. Spiral Order Matrix:	Given an m x n matrix, return all elements of the matrix in spiral order.
	   void printSpiral(int matrix[][]){
	        int startRow = 0;
	        int startCol = 0;
	        int endRow = matrix.length-1;
	        int endCol = matrix[0].length-1;

	        while (startRow<=endRow && startCol<=endCol) {
	            // top

	            for(int j=startCol; j<=endCol; j++){
	                System.out.print(matrix[startRow][j]+" ");

	            }

	            //right
	            for(int i=startRow+1; i<=endRow; i++){
	                System.out.print(matrix[i][endCol]+" ");
	            }

	            //bottom
	            for(int j=endCol-1; j>=startCol; j--){
	                System.out.print(matrix[endRow][j]+" ");
	            }

	            //left
	            for(int i=endRow-1; i>=startRow+1; i--){
	                System.out.print(matrix[i][startCol]+" ");
	            }

	            startCol++;
	            startRow++;
	            endCol--;
	            endRow--;
	        }
	    }

	

	

	
	
	 void printArray(int arr[]) {
		 System.out.print("[ ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
		
	}
	
		

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int arr1[] = {1,5,3,4,7};
		int distNoArr[] = {0,1,2,3,5,6,7};
		
		Assesment1 obj = new Assesment1();
		
		System.out.println("Enter the 5 elements to array :");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
//		obj.printArray(arr);
//		obj.reverseArray(arr);
//		
//		obj.printArray(arr);
//		obj.maxAndMinInArray(arr);
		
//		obj.printArray(arr);
//		obj.sumOfElementsInArray(arr);
		
		obj.printArray(arr);
		obj.removingDuplicateElement(arr);
		
//		obj.printArray(arr);
//		obj.printArray(arr1);
//		obj.intersectionOfTwoArrays(arr, arr1);
		
		
//		obj.printArray(distNoArr);
//		obj.missingNumber(distNoArr);
		
		
//		obj.printArray(arr);
//		obj.sortingArray(arr);
//		obj.printArray(arr);
		
		
//		obj.printArray(arr);
//		obj.arrayProductExceptSelf(arr);
		
//		obj.printArray(arr);
//		obj.leaderInArray(arr);

//		obj.printArray(arr);
//		obj.kthLargestElement(arr,4);
		
//		obj.printArray(arr);
//		obj.twoSNumberSum(arr, 8);
		
//		int matrix[][]={{1,2,3,4},
//		                {5,6,7,8},
//		                {9,10,11,12},
//		                {13,14,15,16}};
//		obj.printSpiral(matrix);
	}

}
