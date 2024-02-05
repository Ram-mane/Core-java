package com.basics;

public class PowerFunction {

public static void main(String[] args) {
		
 findPower();
	}

static void findPower() {
	int a = 5;
	int pow = 5;
	int power = a;
	
	for (int i =1; i<pow; i++) {
		 power*=a;
		
	}
	System.out.println(power);
	
}
}
