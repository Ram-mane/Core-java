package com.basics;

public class AreaOfTriangle {

	int base =10, height = 6;
	double areaoftriangle;
	
	public void areaOfTriangle() {
		areaoftriangle = 0.5*base*height;
		System.out.println("Area of triangle = "+ areaoftriangle);
	}
	
	public static void main(String[] args) {

		AreaOfTriangle obj = new AreaOfTriangle();
		obj.areaOfTriangle();
	}

}
