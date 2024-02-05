package com.interfaces;

public class MultipleInheritanceDemo implements Interface1, Interface2 {

	public static void main(String[] args) {


		MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
		
		System.out.println(obj.func1());
		System.out.println(obj.func2());
	}

	@Override
	public String func2() {
		// TODO Auto-generated method stub
		return "method of Interface2";
	}

	@Override
	public String func1() {
		// TODO Auto-generated method stub
		return "method of Interface1";
	}

}
