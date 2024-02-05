package com.basics;

public class SumOfNumbersInarray {

	
	
	 public static int calculateOddNumberSum(int arr[], int sum, int idx) {

	        if (idx == arr.length) {
	            return sum;
	        }

	        if (arr[idx] % 2 != 0) {
	            sum =sum+arr[idx];
	        }

	        // Return the result of the recursive call
	        return calculateOddNumberSum(arr, sum, idx + 1);
	    }

	    public static void main(String args[]) {
	        int arr[] = {1, 5, 3, 6, 7, 9, 4, 8};

	        System.out.println(calculateOddNumberSum(arr, 0, 0));
	    }
}
