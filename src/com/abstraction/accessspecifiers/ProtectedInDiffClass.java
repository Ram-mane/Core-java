package com.abstraction.accessspecifiers;


class TestProtectedMenber{
	protected int no = 10;
	
	protected void print() {
		System.out.println("protected func outside class ");
	}
}

public class ProtectedInDiffClass {

	public static void main(String[] args) {


		TestProtectedMenber t = new TestProtectedMenber();
		t.print();
		System.out.println(t.no);
	}

}
