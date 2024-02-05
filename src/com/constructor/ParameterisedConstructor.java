package com.constructor;

public class ParameterisedConstructor {

	int id;
	String name;
	String city;
	public ParameterisedConstructor(int userId,String userName, String userCity) {
		id = userId;
		name = userName;
		city = userCity;
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("city = "+city);
		System.out.println("this is Parameterised Constructor ");
				
	}
	
	public static void main(String[] args) {


		ParameterisedConstructor obj = new ParameterisedConstructor(5,"Ram","Latur");
	}

}
