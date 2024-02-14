package com.filehandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {


		deleteFile("C:/Users/ramma/OneDrive/Desktop/code.txt");
	}
	
	public static void deleteFile(String fileName) {
		File file = new File(fileName);
		if(file.delete()) {
			System.out.println("File deleted succesfully !");
		}else System.err.println(" Failed to delete the file");
	}

}
