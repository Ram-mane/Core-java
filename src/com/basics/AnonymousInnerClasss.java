package com.basics;

public abstract class AnonymousInnerClasss {

	abstract void eat();
	
	class InnerClass{
		public static void main(String args[]) {
			
			AnonymousInnerClasss referance = new AnonymousInnerClasss(){ void eat(){System.out.println("nice fruit");}};
			referance.eat();
		}
	}
}
