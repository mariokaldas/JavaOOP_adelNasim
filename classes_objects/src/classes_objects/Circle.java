package classes_objects;

public class Circle {
	
	private double radius;
	private String color;
	
	public void setRadius(double radius) // public to all project
	{
		 this.radius = radius; // "this" keyword can access all members of class
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}
	
	/*
	 * there is a shortcut to make all setters and getters if it's too much attributes
	 * Right click >> source >> generate setters and getters
	 * */
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	@Override  // that keyword will be explained in later lesson
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", getArea()=" + getArea() + ", getCircumference()="
				+ getCircumference() + "]";
	}
	
	/*
	 * There is common fn that returns all attributes in class named toString()
	 * use this shortcut :
	 * right click >> source >>
	 * */
		

	

}
