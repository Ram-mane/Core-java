package com.loop;

public class WhileLoopDemo {

	public static void main(String[] args) {

		EvenNo.evenNo();

		int num = 4;
		int a =1;
		while(a<=10) {
			int b =num*a;
			System.out.println(b);
			a++;
		}
	}
	class EvenNo{
		static void evenNo() {
			int a = 2;
			while(a<=50) {
				System.out.println(a);
				a+=2;
			}
		}
	}

}
