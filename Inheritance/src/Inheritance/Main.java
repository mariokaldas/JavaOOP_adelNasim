package Inheritance;

/*
 * A subclass inherits all the members (fields, methods and nested class)
 * from its super class. Constructors are not members, so they are not inherited by subclass
 * BUT the constructor of the super class can be invoked from the subclass
 * 
 * */


public class Main {
	public static void main(String args[]) {
		
		//Constructor of superclass Employee is automatically invoked then subclass constructor
		Developer d1 = new Developer();
		
		d1.setName("Ali");
		System.out.println(d1.getName());
		
	}
}
