package com.abstraction;

abstract class Animal{
	abstract void eat();
	
	abstract void sleep();
}

class Deer extends Animal{

	@Override
	void eat() {
		System.out.println("I'm Deer ,I eats only grass and plants !");
		
	}

	@Override
	void sleep() {
		System.out.println("I am deer and i sleep at night !");
		
	}
	
}

class Lion extends Animal{

	@Override
	void eat() {
		System.out.println("I'm Lion ,I am predetor i eat another animals !");
		
	}

	@Override
	void sleep() {
		System.out.println("I am Lion and i sleep at day time  !");
		
	}
	
}

class Tiger extends Animal{

	@Override
	void eat() {
		System.out.println("I'm Tiger ,I eats only another animals !");
		
	}

	@Override
	void sleep() {
		System.out.println("I am Lion and i sleep on the trees !");
		
	}
	
}

public class abstractionProblem {

	public static void main(String[] args) {


		Animal deer = new Deer();
		Animal lion = new Lion();
		Animal tiger = new Tiger();
		
		deer.eat();
		deer.sleep();
		System.out.println();
		lion.eat();
		lion.sleep();
		System.out.println();
		
		tiger.eat();
		tiger.sleep();
		System.out.println(deer.hashCode());
		System.out.println(lion.hashCode());
		System.out.println(tiger.hashCode());
	}

}
