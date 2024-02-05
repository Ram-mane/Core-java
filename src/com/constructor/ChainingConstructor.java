package com.constructor;

class Base{
	 Base(){
		 this(" hello !");
		 System.out.println("this is the method of base class");
	}
	 Base(String str) {
		 System.out.println("this is string of base class "+str);
	 }
}

public class ChainingConstructor extends Base {

	int id;
	
	ChainingConstructor(){
		this("Ram");
		System.out.println("this is default constr ");
	}
	
	ChainingConstructor(int id){
		
		this();
		
		this.id = id;
	}
	
	ChainingConstructor(String name){
		super();
		System.out.println("this is para construct ");
	}
	@Override
	public String toString() {
		return "ChainingConstructor [id=" + id + "]";
	}
	
	public static void main(String[] args) {


		ChainingConstructor obj1 = new ChainingConstructor(4);
		ChainingConstructor obj2 = new ChainingConstructor(5);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

	

}
