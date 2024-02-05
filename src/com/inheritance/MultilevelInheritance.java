package com.inheritance;

class BaseClass{
	int sqre(int no) {
		int sqr = no*no;
		return sqr;
	}
}

class Derived extends BaseClass{
	
	void derivedMethod() {
		System.out.println("this is derived class of base class ");
	}
}

public class MultilevelInheritance extends Derived {

	void child() {
		System.out.println("this is child class method ");
	}
	public static void main(String[] args) {


		MultilevelInheritance obj = new MultilevelInheritance();
		obj.child();
		obj.derivedMethod();
	System.out.println(obj.sqre(3));}

}
