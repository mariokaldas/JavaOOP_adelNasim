package classes_objects;

/*
 * Access modifiers for all members
 * 
 * 1- private >> private for same class only. Symbol (-)
 * 2- public >> public in all project. Symbol (+)
 * 3- not determined >> public for same package only
 * 
 * */




public class Car {  // first letter in class is always uppercase
	
	String name;
	int maxSpeed;
	float price; // package private by default
	private int model; //cannot access this attribute directly outside this class 


	/*
	 * All functions are package public by default 
	 * */
	void setName(String n) {  // setters or mutators
		name = n;
	}
	
	String getName() {  // getters or accessors 
		return name;
	}
	
	void setModel(int m) {
		
		if(m >= 2015) {
			model = m;
		}
		else
			System.out.println("sorry we don't accept model less than 2015");
		
	}
	
	
	
}
