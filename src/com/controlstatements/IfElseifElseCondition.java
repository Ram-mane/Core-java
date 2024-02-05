package com.controlstatements;

public class IfElseifElseCondition {

	
	public static void main(String[] args) {


		int marks = 85;
		
		if(marks>=50 && marks <60) {
			System.out.println("your grade is C");
		}else if(marks>=60 && marks <70) {
			System.out.println("your grade is B");
		}else if(marks>=70 && marks <80) {
			System.out.println("your grade is A");
		}else if(marks>=80) {
			System.out.println("your grade is A+");
		}else {
			System.out.println("you are fail !");
		}

}
}
