package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TextFile {

    public static void main(String[] args) {
        // Specifying the file path
        String filePath = "c:/Users/ramma/eclipse-workspace/Core_java/TextFile.txt";

        // Creating a File object
        File file = new File(filePath);
        
        
        try {
			FileOutputStream fw = new FileOutputStream(filePath);
			fw.write(65);
			System.out.println("Hi  ");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        try {
        	FileInputStream fin = new FileInputStream(filePath);
        	int i = fin.read();
        	System.out.println((char)i);
        	fin.close();
        }
        catch(Exception e){
        	System.out.println(e);
        	
        }

//        // Checking if the file already exists
//        if (file.exists()) {
//            System.out.println("File already exists.");
//        } else {
//            // Creating the file
//            try {
//                if (file.createNewFile()) {
//                    System.out.println("File created successfully!");
//                } else {
//                    System.out.println("File creation failed.");
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }
}

