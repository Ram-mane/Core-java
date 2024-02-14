package com.filehandling;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {


		createDir("C:/Users/ramma/OneDrive/Desktop/code.txt");
	}
	
	public static void createDir(String directoryName) {
		File directory = new File(directoryName);
		if(!directory.exists()) {
			if(directory.mkdir()) {
				System.out.println("Directory created succesfully !");
				
			}else System.err.println("Failed to create directory ?");
			
		}else System.out.println("Directory already exists !");
	}

}
