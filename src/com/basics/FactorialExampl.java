package com.basics;

public class FactorialExampl {

	
	//write recursive function
	//to count no of occurances of specific element in an array
	
	static int countOccurance(int arr[], int occuranceElement, int idx) {

		if(idx>=arr.length) {
			return 0;
		}
		if(arr[idx]==occuranceElement) {
			return 1+countOccurance(arr, occuranceElement,idx+1);
		}else {
			return countOccurance(arr, occuranceElement,idx+1);
		}
	}
	
	
	public static int calculateFactorial(int n) {
		
		if(n==0) {
			return 1;
		}
		return n*calculateFactorial(n-1);
	}
	
	public static void main(String[] args) {

		

		System.out.println("factorial of number is "+calculateFactorial(7));
		
		int arr[]= {1,2,3,4,1,1,2,6,4};
		System.out.println(countOccurance(arr,1,0));;
	}

}
