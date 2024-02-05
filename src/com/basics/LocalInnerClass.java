package com.basics;

public class LocalInnerClass {

	private int data = 30;
	 void display(){
		 class Local{
			 void msg() {
				 System.out.println(data);
				 
			 }
			 
		 }
		 Local l = new Local();
		 l.msg();
	 }
	
	public static void main(String[] args) {


		LocalInnerClass l1 = new LocalInnerClass();
		l1.display();
	}

}
