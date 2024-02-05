package com.assesment;


// 1. overriding problem 
class Person{
	String firstName ="Ram";
	String lastName="Mane";
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
}

class Employee extends Person{
	int employeeId =1;
	String jobTitle="Engineer";
	
	public int getEmployeeId() {
		return employeeId;
	}


	


	public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
		super(firstName, lastName);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}





	public String getLastName() {
		return super.getLastName()+", "+jobTitle;
	}
}




//2. BankAccount problem 

class BankAccount{
	
	int deposite;
	int withdraw;
	
	
	public BankAccount(int deposite, int withdraw) {
		
		this.deposite = deposite;
		this.withdraw = withdraw;
	}
	int deposit() {
		return deposite;
	}
	int  withdraw() {
		return withdraw;
	}
}

class SavingAccount extends BankAccount {

	public SavingAccount(int deposite, int withdraw) {
		super(deposite, withdraw);
		// TODO Auto-generated constructor stub
	}

	@Override
	int withdraw() {
		// TODO Auto-generated method stub
		if(deposite>100) {
			return super.withdraw();
		}
		return 0;
	}
	
	
}

public class InheritanceProblems {

	public static void main(String[] args) {


		Employee obj = new Employee("Ram", "Mane", 1,"HR Manager");
		
//		System.out.println( obj.getEmployeeId()+", "+obj.getFirstName()+" "+obj.getLastName());
		
		
//		System.out.println(obj.getLastName());
		
		SavingAccount obj1 = new SavingAccount(1000,50);
		System.out.println(obj1.withdraw());
	}

}
