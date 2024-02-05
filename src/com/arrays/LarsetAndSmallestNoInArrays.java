package com.arrays;

public class LarsetAndSmallestNoInArrays {

	static void largestNumberInArray() {
		
		int arr[]= {5,1,3,9,4,7};
		
		int largestNo = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largestNo) {
				largestNo = arr[i];
			}
		}
		System.out.println("largest no in array is "+largestNo);
	}
	
   static void smallestNumberInArray() {
		
		int arr[]= {5,1,3,9,4,7};
		
		int smallestNo = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<smallestNo) {
				smallestNo = arr[i];
			}
		}
		System.out.println("smallest no in array is "+smallestNo);
	}
   
   static void secondLargestElement() {
	   
	   int arr[]= {5,1,3,9,4,7};
		
		int largestNo = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largestNo) {
				secondLargest = largestNo;
				largestNo = arr[i];
				
			}else if (arr[i] > secondLargest && arr[i] != largestNo) {
                secondLargest = arr[i];
            }
		}
		System.out.println("largest no in array is "+largestNo);
		System.out.println("second Largest no in array is "+secondLargest);
	   
   }
	
	
	public static void main(String[] args) {
		largestNumberInArray();
		smallestNumberInArray();
		secondLargestElement();

	}

}
