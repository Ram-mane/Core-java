package com.basics;

public class AreaAndCircumferenceOfCircle {

	
	int r = 10;
	double area, circumference;
	
	public void show() {
		area = 3.14*r*r;
		circumference = 2*3.14*r;
		
		System.out.println("Area of circle= " +area);
		System.out.format("Circumference of circircle = %.2f",circumference);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaAndCircumferenceOfCircle obj = new AreaAndCircumferenceOfCircle();
		obj.show();
		
		AreaOfTriangle obj1 = new AreaOfTriangle();
		obj1.areaOfTriangle();
	}

}
