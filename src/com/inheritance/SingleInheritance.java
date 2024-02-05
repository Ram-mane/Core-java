package com.inheritance;


class Base{
	public int squre(int no) {
		

		int sq = no*no;
		return sq;
	}
}
public class SingleInheritance extends Base {

	void derivesfunc() {
		System.out.println("this is derived class");
	}
	public static void main(String[] args) {


		SingleInheritance obj =new SingleInheritance();
		obj.derivesfunc();
		System.out.println(obj.squre(6));

	}

}
