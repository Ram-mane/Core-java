package com.abstraction;



abstract class ThreeDShape{
	
	abstract void draw();
	abstract double volume();
	abstract double surfaceArea();
}

class Spehere extends ThreeDShape{

	int r =5;
	
	@Override
	void draw() {
		System.out.println("drawing a Spehere !");
		
	}

	@Override
	double volume() {
		return (4/3)*3.14*r;
	}

	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		return 4*3.14*r*r;
	}
	
}

class Cube extends ThreeDShape{
	int a = 8; // side
	@Override
	void draw() {
		System.out.println("drawing a Cube !");
		
	}

	@Override
	double volume() {
		
		return a*a*a;
	}

	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		return 6*a*a;
	}
	
}

class Cone extends ThreeDShape{

	int r =4;
	int h = 6;
	int s =8; // length of slant
	@Override
	void draw() {
		System.out.println("drawing a Cone !");
		
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return (3.14*r*r*h)/3;
	}

	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		return 3.14*r*(r+s);
	}
	
}

class Cyllender extends ThreeDShape{

	int r = 8;
	int h = 4; // height of cyll
	@Override
	void draw() {
		System.out.println("drawing a cyllender !");
		
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return 3.14*r*r*h;
	}

	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		return 2*3.14*r*(h+r);
	}
	
}

public class AbstractionExmple {

	public static void main(String[] args) {


		ThreeDShape obj = new Spehere();
		ThreeDShape obj1 = new Cube();
		ThreeDShape obj2 = new Cone();
		ThreeDShape obj3 = new Cyllender();
		
		obj.draw();
		System.out.println(obj.volume());
		System.out.println(obj.surfaceArea());
		obj1.draw();
		System.out.println(obj1.volume());
		System.out.println(obj1.surfaceArea());
		obj2.draw();
		System.out.println(obj2.volume());
		System.out.println(obj2.surfaceArea());
		obj3.draw();
		System.out.println(obj3.volume());
		System.out.println(obj3.surfaceArea());
		
		System.out.println(obj.hashCode());

	}

}
