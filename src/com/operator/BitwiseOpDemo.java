package com.operator;

public class BitwiseOpDemo {

	public static void main(String[] args) {


		int no1 = 3;
		int no2 = 2;
		
		// &, |,^,~
		//           16  8  4  2  1
		//no1=3                1  1
		//no2=2                1  0
		// &                   1  0  = 2
		// |                   1  1  = 3
		// ^(exOr)             0  1  = 1 (if a and b are same the thhen output is 0 if inverse then 1
		
		
		//no1<<2         1  1  0  0  = 12 (this is the left shift operetor which shift the bit at left by the assigned value i.e. 2 here
		//no1>>2               1  1  = 3 (this is the right shift operetor which shift the bit at right by the assigned value i.e. 2 here
		
		System.out.println(no1&no2);
		System.out.println(no1|no2);
		System.out.println(no1^no2);
		System.out.println(~no2); // 1's compliment and 2's compliment (just add 1 to the existing no and assign - sign)
		
		System.out.println(no1>>2);
		System.out.println(no1<<2);
		
	}

}
