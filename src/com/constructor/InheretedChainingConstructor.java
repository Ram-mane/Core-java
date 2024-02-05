package com.constructor;

class Parent{
	
	Parent(){
		this("ram","sham");
		System.out.println("this is the default constr of patent class !");
		
	}
	Parent(int a, int b){
		this();
		System.out.println("this is INT constr of parent class !");
		
	}
	Parent(String str1, String str2){
		System.out.println("this is STRING constr of parent class !");
	}
}

class Child extends Parent{
	Child(){
		this("str1","str2");
		System.out.println("this is the default constr of Child class !");
		
	}
	Child(int a){
		this();
		System.out.println("this is INT constr of Child class !");
		
	}
	Child(String str1, String str2){
		super(5,4);
		System.out.println("this is STRING constr of Child class !");
	}
	
}

public class InheretedChainingConstructor {

	public static void main(String[] args) {


		Child obj = new Child(10);
	}

}
