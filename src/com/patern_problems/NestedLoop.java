package com.patern_problems;

public class NestedLoop {

	
	static void printValueOfij() {
		for(int i=0; i<=5; i++) {
			for (int j=0; j<=5; j++) {
				System.out.print("["+i+"]"+"["+j+"]"+" ");
				
			}
			System.out.println();
		}
	}
	
	static void squrepattern() {
		for(int i=0; i<=5; i++) {
			for (int j=0; j<=5; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	static void rightAngleTriangle() {
		for(int i=0; i<=5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
	static void hallowRectangle() {
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				if(i==0 || i==5 || j==0 || j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	

     static void triangle(int n) {
    	 for(int i=0; i<n; i++) {
    		 for(int j=0; j<n-i; j++) {
    			 System.out.print(" ");
    			 
    		 }
    		 for (int k=0; k<=i; k++) {
    			 
    			 System.out.print("* ");
    		 }
    		 System.out.println();
    		 
    	 }
     }
     
     static void numberTriangle(int n) {
    	 for(int i=0; i<n; i++) {
    		 for(int j=0; j<n-i; j++) {
    			 System.out.print(" ");
    			 
    		 }
    		 for (int k=0; k<=i; k++) {
    			 
    			 System.out.print(i+1+" ");
    		 }
    		 System.out.println();
    		 
    	 }
     }
     
     static void rightAngleTriangleOfNumbers(int n) {
 		for(int i=1; i<=n; i++) {
 			for (int j=1; j<=i; j++) {
 				System.out.print(j+" ");
 				
 			}
 			System.out.println();
 		}
 	}
     
     static void reverseRightAngleTriangleOfNumbers(int n) {
  		for(int i=1; i<=n; i++) {
  			for (int j=n; j>=i; j--) {
  				System.out.print(n-j+1+" ");
  				
  			}
  			System.out.println();
  		}
  	}
	
	
	public static void main(String[] args) {

		printValueOfij();
		System.out.println();
		squrepattern();
		System.out.println();
		rightAngleTriangle();
		System.out.println();
		hallowRectangle();
		System.out.println();
		triangle(5);
		System.out.println();
		numberTriangle(5); 
		System.out.println();
		rightAngleTriangleOfNumbers(5);
		System.out.println();
		reverseRightAngleTriangleOfNumbers(5);
	}

}
