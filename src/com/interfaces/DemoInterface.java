package com.interfaces;



class Inter implements InterfaceDemo{

	@Override
	public void test() {
System.out.println("this is another implemented class ");		
	}
	
}

public class DemoInterface implements InterfaceDemo {

	public static void main(String[] args) {


		InterfaceDemo obj = new DemoInterface();
		InterfaceDemo obj1 = new Inter();
		obj.test();
		obj1.test();
	}

	@Override
	public void test() {


		System.out.println("Welocome to interface implementation  of main class");
	}

}
