package classes_objects;

public class Main {

	public static void main(String args[]) {
		
		Car c1 = new Car(); // create an object
		/*
		 * c1 : object name
		 * new car(): for reserving place in memory of object from data-type : car 
		 * 
		 * */
		c1.name = "honda"; // how to access attributes directly
		
		c1.setName("mazda"); // how to access attributes using methods
		
		// why we need methods to access attributes ??
		
		c1.setModel(2018); 
		c1.setModel(2011); // this is why
		
		/*
		 * To prevent accessing attributes directly we use Private keyword 
		 * before attribute declaration 
		 * if not specified it's by default package private
		 * 
		 * This called access modifier 
		 * 
		 * */
		//c1.model = 2020; // Error
		
		
		/*
		 * Always access the attributes by setters and getters and prevent 
		 * direct accessing 
		 * 
		 * This technique called Data hiding
		 * */
		
		
		Circle cir1 = new Circle(), cir2 = new Circle(); // declare two object in same line
		
		cir1.setColor("Grey");
		cir1.setRadius(2.5);
		System.out.println(cir1.toString());
		
		/* We can invoke same method "toString" by this way */
		System.out.println(cir1);
		
	}
	
}
