package com.filehandling;

import java.io.File;

public class ListFileDir {

	public static void main(String[] args) {


		listFileDir("C:/Users/ramma/OneDrive/Desktop/Complete web development");
	}
	
	public static void listFileDir(String directoryName) {
		File directory = new File(directoryName);
		File[] files = directory.listFiles();
		
		if(files!=null) {
			System.out.println("File in the directory : ");
			for(File file:files) {
				System.out.println(file.getName());
			}
		}else System.err.println(" directory does not exists !");
	}

}
