package com.filehandling;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileInfo {

	public static void main(String[] args) {


		fileInfo("C:/Users/ramma/OneDrive/Desktop/code.txt");
	}
	
	public static void fileInfo(String fileName) {
		File file = new File(fileName);
		if(file.exists()) {
			System.out.println("File name : "+file.getName());
			System.out.println("Absolute Path : "+file.getAbsolutePath());
			System.out.println("Size in byytes : "+file.length());
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			System.out.println("Last modified at  : "+sdf.format(file.lastModified()));
			System.out.println("Readeable : "+file.canRead());
			System.out.println("Writable : "+file.canWrite());
			System.out.println("Exutable : "+file.canExecute());

		}
	}

}
