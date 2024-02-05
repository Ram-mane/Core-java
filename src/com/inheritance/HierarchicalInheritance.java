package com.inheritance;


class Base1{
	void base1() {
		System.out.println("this is method of Base1 class ");
	}
}

class Derived1 extends Base1{
	void derived1() {
		System.out.println("this is method of Derives1 class ");
	}
}
class Derived2 extends Base1{
	void derived2() {
		System.out.println("this is method of Derives2 class ");
	}
}
class Derived11 extends Derived1{
	void derived11() {
		System.out.println("this is method of Derives11 class ");
	}
}
public class HierarchicalInheritance  extends Derived11 {

	void child() {
		System.out.println("this is method of child class ");
	}
	
	public static void main(String[] args) {


		HierarchicalInheritance obj = new HierarchicalInheritance();
		obj.child();
		obj.derived11();
		obj.derived1();
		obj.base1();
		
		Derived2 obj2 = new Derived2();
		obj2.derived2();
		
	}

}
