package Inheritance;

/*
 * Super class - parent class - base class - general class
 * 
 * This class is by default a subclass from super-class called "object"
 * 
 * */
public class Employee { 

	/*
	* The access level of protected modifier is within the package and outside the package
	* through child class. if you don't make the child class, it can's be accessed from 
	* outside the package
	* */
	protected String name;
	protected String emailAddress;
	protected String phone;
	protected String department;
	protected String address;
	protected int yearOfBirth;

	public Employee() {
		System.out.println("No parameter constructor - super class");
	}

	public Employee(String name, String emailAddress, String phone, String department,
			String address,int yearOfBirth) {
		super();
		this.name = name;
		this.emailAddress = emailAddress;
		this.phone = phone;
		this.department = department;
		this.address = address;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
	

}
