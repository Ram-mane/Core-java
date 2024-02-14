package com.filehandling;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {


		renameFile("textFile.txt", "renamed.txt" );
				
	}
	
	public static void renameFile(String oldFileName, String newFileName) {
		File file = new File(oldFileName);
		if(file.exists()) {
			File newFile = new File(newFileName);
			if(file.renameTo(newFile)) {
				System.out.println(" File renamed succesfully !");
			}else System.err.println("Failed to raname file ? ");
		}else System.err.println("File does not exist ?");
	}

}
