package com.abstraction.accessspecifiers;

public class ProtectedInSamelass {

	
	private int  no =6;
	
	private void print() {
		
		System.out.println("proteocoted within class ");
	}
	
	
	public static void main(String[] args) {

		ProtectedInSamelass t = new ProtectedInSamelass();
		System.out.println(t.no);
		t.print();
	}

}
