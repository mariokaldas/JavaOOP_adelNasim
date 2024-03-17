package constructor;

public class Main {
	public static void main(String args[]) {
		
		/* Constructor is automatically invoked as soon as new object declared */
		Product p1 = new Product(); // No-Arg constructor 
		Product p2 = new Product("Camera","Auto focus...",1000,2,40); // parameterized constructor
		System.out.println();
		
		// Parameterized constructor with color attribute
		Product p3 = new Product("Camera", "Auto focus",2000,3,30,"blue");//two constructors called
		System.out.println();
		
		Product p4 = new Product(p3); // copy constructor >> three constructors are called
		System.out.println();
		
		// this is how to define an array of objects
		Product[] p = new Product[4];
		p[0] = new Product();
		p[1] = new Product(p1);
		
		//array of object with initialization of previous objects 
		Product[] prods = {p1,p2,p3,p4};
		
		System.out.println("p1 = " + p1.toString());
		System.out.println("p2 = " + p2.toString());
		
		System.out.println("p3 = " + p3.toString());
		System.out.println("p4 = " + p4.toString());
		
		
	}
}
