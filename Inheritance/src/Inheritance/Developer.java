package Inheritance;

/*
 * Subclass - child class - derived class - extended class
 * 
 * Now this class inherited the attributes and methods of its superclass Employee
 * 
 * */
public class Developer extends Employee{

	String projectName;
	
	public Developer(){
		System.out.println("No parameter constructor - subclass");
	}
	
	public Developer(String name, String emailAddress, String phone, String department,
			String address,int yearOfBirth, String projectName) {

		/*
		* - "super" keyword have access of all attributes and methods of super class Employee only
		* and it DOESN'T have access of child class or inherited class
        * - Same function as "this" keyword but for the super class not same class
        * 
        * NOTE: call to super MUST be first statement in constructor
		* */
		super(name, emailAddress,phone,department,address,yearOfBirth);
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
	
	
	
}
