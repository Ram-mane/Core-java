package com.interfaces;



//1. write a java programme to create interface playable with a method play() that takes no arguments
//and returns void. Create three classes Football, Volleyball, and Basketball that implement the playble 
//interface and override the play method to play the respective sports.


//2. write a java programme to create interface resizable with methods resizeWidth(int width) and resizeHeight(int height)
//that allow an object to be resized. create a class rectangle that implements the resizable interface and implements the resize methods
// 


public class InterfaceProblems {

	public static void main(String[] args) {


		//1st
		Playble football = new Football();
		Playble volleyball = new Volleyball();
		Playble basketball = new Basketball();
		
		football.play();
		volleyball.play();
		basketball.play();
		
		System.out.println();
		
		//2
		Resizable rectangle = new Rectangle(10,14);
		rectangle.resizeHeight(5);
		rectangle.resizeWidth(10);
	}

}
