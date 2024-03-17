package constructor;

/* 4 types of constructors :
 * 
 * 1- No-Arg constructor
 * 2- Parameterized constructor
 * 3- copy constructor
 * 4- Default constructor
 * 
 *  */

public class Product {
	
	private String name;
	private String description;
	private float price;
	private int quantity;
	private float discount;
	
	private String color;
	
	/*
	 * Rules for making constructor :
	 * 
	 * 1- constructor name must be the same name as its class name
	 * 2- a constructor must have no return type not even void
	 * 3- java constructor cannot be abstract, static, final and synchronized
	 * ( (3) will be explained in later lessons )
	 * 
	 * */

	/* This is No-Arg constructor : doesn't accept any arguments */
	public Product() {
		 // Constructor is used for initialization
		
		this.name = "no name";
		this.description = "no description";
		this.price = 0.0f;
		this.quantity = 0;
		this.discount = 0;
		
		System.out.println("No-Arg constructor is called");
	}

	/* Remember overloading functions >> same name of different functions is accepted if :
	 * 1- different arguments data types
	 * 2- different arguments order
	 *  */
	
	/* This is parameterized constructor : accept any arguments */
	public Product(String name, String description, float price, int quantity, float discount) {
		 // Constructor is used for initialization
		
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
		
		System.out.println("Parameterized constructor is called");
	}
	
	
	
	/* This constructor is the same as previous parameterized but with additional attribute : color
	 * - This constructor is used with objects that we need to initialize color to 
	 * and previous constructor for objects that doesn's require color initialization
	 * 
	 *  */
	public Product(String name, String description, float price, int quantity, float discount, String color) {

		/* instead of repeated previous function we use this method
		 * 
		 *  when constructor calls another instructor of same class then this is called 
		 *  "Constructor chaining"
		 *  
		 *  */
		this (name,description,price,quantity,discount);
		this.color = color;
		System.out.println("Parameterized constructor with color attribute is called");
		
	}
	
	
	
	public Product(Product obj) { /* This is copy constructor*/
		
	//	this.name = obj.name; // you can use this way or the preferred way ...
		
		this(obj.name,obj.description, obj.price,obj.quantity,obj.discount,obj.color);
		System.out.println("copy constructor is called");
	}
	
	

	/*
	 * If no constructor defined AT ALL There is default No-Arg constructor is already
	 * defined that gives the following values as initial :
	 * 
	 * 
	 * boolean : false
	 * byte : 0
	 * short : 0
	 * int : 0
	 * long : 0l
	 * char : \u0000
	 * float : 0.0f
	 * double : 0.0d
	 * object : null >> object is originally from class and string as originally a class
	 * then any String will be null
	 * 
	 * If at-least one constructor is defined even it's parameterized you MUST define
	 * NO-ARG constructor or it's Error
	 * */
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + ", price=" + price + ", quantity=" + quantity
				+ ", discount=" + discount + "]";
	}
	
	
	
	/*
	 * in Java when we create object of the class it occupies some space in the memory (heap)
	 * if we don's delete this object it remains in the memory and occupies unnecessary space
	 * 
	 * Java provides the garbage collector that works the same as destructor it runs out 
	 * on the JVM it automatically deletes the unused objects and free-up the memory, 
	 * programmer has no need to manage memory manually 
	 * 
	 * Destructor is also known as finalizer
	 * 
	 * 
	 * */
	
	
}
