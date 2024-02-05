package com.constructor;

public class ConstructorOverloading {
	
	int id;
	String name;
	String city;
	public ConstructorOverloading(int userId, String userName, String userCity) {
		
		
		System.out.println("ths is the first constructor");
		id = userId;
		name = userName;
		city = userCity;
		System.out.println(userId);
		System.out.println(userName);
		System.out.println(userCity);
		
	}
	
	public ConstructorOverloading(String userName, int userId, String userCity) {
			
		System.out.println("ths is the different constructor");
			id = userId;
			name = userName;
			city = userCity;
			System.out.println(userId);
			System.out.println(userName);
			
			
		}

	
	public static void main(String[] args) {


		ConstructorOverloading obj1 = new ConstructorOverloading(4,"ram","Latur");
		
		ConstructorOverloading obj2 = new ConstructorOverloading("ram",7,"Latur");
		
	}

}
