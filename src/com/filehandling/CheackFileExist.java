package com.filehandling;

import java.io.File;

public class CheackFileExist {

	public static void main(String[] args) {


		fileExists("destinationFile.txt");
	}
	public static void fileExists(String fileName) {
		File file = new File(fileName);
		if(file.exists()) {
			System.out.println("file is existed in :"+ file.getAbsolutePath());
		}else System.err.println("File does not exist in Core_Java ");
	}

}
