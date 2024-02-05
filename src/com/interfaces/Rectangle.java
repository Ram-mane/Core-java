package com.interfaces;

public class Rectangle implements Resizable {

	
	private int width ;
	private int height;
	
	Rectangle(int width, int height){
		this.width=width;
		this.height = height;
	}
	@Override
	public void resizeWidth(int width) {
		System.out.println("resized width of rectangle is "+ width);
		
	}

	@Override
	public void resizeHeight(int height) {
		System.out.println("resized height of rectangle is "+ height);
		
	}

}
