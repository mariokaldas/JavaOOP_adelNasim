package static_keyword;

public class OuterClass {
	
	static int x =10;
	
	/*
	 * static class MUST be nested
	 * */
	public static class InnerClass{
		
		public void print() {
			System.out.println("x = " + x); // x MUST be static
			System.out.println("from nested static class");
		}
	}

}
