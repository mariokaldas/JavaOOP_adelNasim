package static_keyword;

/*
 * static variables and static methods are important 
 * static block and classes are not very important
 * */

public class Student {
	
	private int id;
	
	// count will bee initialized ONCE to preserve previous value
	private static int count =1;
	private String name;
	private String password;
	private boolean loggedIn;
	
	
	 /* this attribute will be reserved  in memory only ONCE even with 1000 objects
	  * this attribute doesn't belong to specific attribute it belongs to the whole class 
	  */
	static String college = "IT";
	
	// no need to reserve this attribute in every object
	private static long minimalPasswordLength = 6;
	
	
	Student(String name,String password){ // we want the id entered by the system not manually
		
		this.id = count;
		this.name = name;
		this.password = password;
		count++;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	public boolean logIn(int enteredId,String enteredPassword) {
		
		if(enteredId == id  && enteredPassword.equals(password)) {
			loggedIn = true;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//this method doesn't belong to specific object it serves whole class 
	public static boolean validatePassword(String password) {
		
		if(password.length() >= minimalPasswordLength) {
			return true;
		}
		else {
			return false;
		}
	}
	/*
	 * some restrictions on static methods (NOTE that main is static method) :
	 * 
	 * 1- static method cannot use non-static data member or call non-static method directly
	 * unless you declare new object inside the static method
	 * >>>>logically because every non-static data member belong to specific object but
	 * static method don't
	 * 
	 * 2- you cannot use "this" or "super"(explained in inheritance) keywords in static method
	 * 
	 * 
	 * */

}
