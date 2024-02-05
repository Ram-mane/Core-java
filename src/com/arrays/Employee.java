package com.arrays;

import java.util.Scanner;

public class Employee {
	
	Employee(int id,String name, int salary){
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id[] = new int[5];
		int salary[] = new int[5];
		String name[] = new String[5];
		Employee obj[]=new Employee[5];
		
		for(int i=0; i<5;i++) {
			System.out.print("id :");
			id[i]=sc.nextInt();
			System.out.print("salary :");
			salary[i]= sc.nextInt();
			System.out.print("name :");
			name[i] =sc.next();
		}
		for(int i=0;i<5;i++) {
			obj[i]= new Employee(id[i],name[i],salary[i]);
		}

	}

}
