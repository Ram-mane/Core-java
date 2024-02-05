package com.inheritance;

class Shape {
	void draw() {
		System.out.println("Drawing a shape !");
		
	}
	
}
class ColoredShape extends Shape{
	String color;
	ColoredShape(String color){
		this.color=color;
	}
	
	void displayColor() {
		System.out.println("Color :"+color);
	}
}

class ThreeDShape extends ColoredShape{
	int depth; 
	ThreeDShape(String color, int depth){
		super(color);
		this.depth = depth;
	}
	
	void displayDimension() {
		System.out.println("Depth "+depth);
	}
}

class Cube extends ThreeDShape{

	Cube(String color, int depth) {
		super(color, depth);
		// TODO Auto-generated constructor stub
	}
	void displayCubeInfo() {
		draw();
		displayColor();
		displayDimension();
	}
	
}


public class MultilevelInheritaneAndChainingConstr {

	public static void main(String[] args) {


		Cube obj = new Cube("Blue", 5);
		obj.displayCubeInfo();
		
	}

}
