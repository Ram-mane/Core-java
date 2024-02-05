package com.controlstatements;

import java.util.Scanner;

public class SwitchStateDemo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of your choice : ");
		int num = sc.nextInt();
		
		switch(num  ){
		
		case 1:
			System.out.println("monday");
			break;
			
		case 2:
			System.out.println("tuesday");
			break;
			
		case 3:
			System.out.println("wednesday");
			break;
			
		case 4:
			System.out.println("thirsday");
			break;
			
		case 5:
			System.out.println("friday");
			break;
			
		case 6:
			System.out.println("saterday");
			break;
			
		case 7:
			System.out.println("sunday");
			break;
		default:
            System.out.println("invalid input"); // Default case if 'day' doesn't match any case
            break;

		}
	}

}
