package com.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextInsertingIntoFile {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		// Get the file name from the user
		
		System.out.println("Enter the file name or path : ");
		 String fileName = sc.nextLine();
		 
		 // Get the text to insert in file
		 System.out.println("Enter the text to insert in the file : ");
		 String textToInsert = sc.nextLine();
		 
		 // insert text into file
		 insertTextIntFile(fileName, textToInsert);
		 
		 sc.close();
	}
	
	public static void insertTextIntFile(String fileName,  String textToInsert) {
		
		File file = new File(fileName);
		
		
		try {
			// read the existing data into file
			
			BufferedReader reader = new BufferedReader(new FileReader(file));
			StringBuilder stringBiulder = new StringBuilder();
			String line = reader.readLine();
			
			while (line!=null) {
				stringBiulder.append(line).append(System.lineSeparator());
				line = reader.readLine();
			}
			reader.close();
			
			// Insert the new text
			stringBiulder.append(textToInsert).append(System.lineSeparator());
			
			// wrrite the new content back to the line
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(stringBiulder.toString());
			System.out.println("Text Inserted Succesfully !");
			writer.close();
		}
		catch(IOException e) {
			System.out.println("error : "+e.getMessage());
		}
		
	}

}
