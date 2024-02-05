package com.operator;

public class AssignmentOpDemp {

	public static void main(String[] args) {


		// =,+=,-=,*=,/=
		
		int a;
		int b=40;
		
		a=b; 
		System.out.println("a= "+a+" b= "+b+" after a=b");
		
		a+=b;
		System.out.println("a= "+a+" b= "+b+" after a+=b");
		
		a-=b;
		System.out.println("a= "+a+" b= "+b+" after a-=b");
		
		a*=b;
		System.out.println("a= "+a+" b= "+b+" after a*=b");
		
		a/=b;
		System.out.println("a= "+a+" b= "+b+" after a/=b");
	}

}
