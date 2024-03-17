package passingObjects2methods;

public class Math {

	 int val;
	 
	 Math(){};
	 
	 Math(int val){
		 this.val = val;
	 }
	
	 /*
	  * The following t2o methods is two ways for adding objects 
	  * passing objects as arguments and returning objects  
	  * 
	  * */
	 
	 static Math add(Math n1,Math n2) {
		 
		Math n3 = new Math();
		n3.val = n1.val + n2.val;
		return n3;
	 }
	 
	 Math add(Math n2) {
		 
		Math n3 = new Math();
		
		// "this" keyword is referring to object which invoked method (n1)
		n3.val = this.val + n2.val; 
		return n3;
	 }
	 
	 boolean isEqual(Math n) {
		 
		 return this.val == n.val; // short if : return true if true and return false if false
	 }
	 
}
