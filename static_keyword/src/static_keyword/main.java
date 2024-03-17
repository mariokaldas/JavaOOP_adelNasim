package static_keyword;

public class main {
	
	static int x;
	
	//static block used for initializing static variables (if it requires some calculations)
	//static block executed before main 
	static{ // static block
		
		x = 20;
		System.out.println("static block");
	}//multiple static blocks can be defined
	
	
	//no need for JVM to create object to call main
	public static void main(String args[]) {
		
		Student s1 = new Student("Ali","123");
		Student s2 = new Student("Ahmed","456");
		Student s3 = new Student("Anwar","789");
		
		//You can invoke college attribute directly without an object
		System.out.println(Student.college);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println();
		
		System.out.println(s1.logIn(1,"1234"));
		System.out.println();

		
		OuterClass.InnerClass obj = new OuterClass.InnerClass();
		obj.print();
		
		
	}

}
