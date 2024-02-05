package com.abstraction.accessspecifiers;



class TesttProtectedMem{
	protected int no =4;
	protected void prinnt() {
		System.out.println(" protected func ooutside the class ");
	}
}



class TesttProtected{
	protected int no =4;
	protected void prinnt() {
		System.out.println(" protected func of TesttProtected ooutside the class ");
	}
}

public class ProtectedInDiffClassWithInheritance extends TesttProtectedMem {

	public static void main(String[] args) {


		ProtectedInDiffClassWithInheritance p = new ProtectedInDiffClassWithInheritance();
		p.prinnt();
		System.out.println(p.no);
		
		TesttProtected t = new TesttProtected();
		t.prinnt();
		System.out.println(t.no);
	}

}
