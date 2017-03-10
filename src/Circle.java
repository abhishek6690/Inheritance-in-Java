/*
 * Author: Abhishek Vichare
 * Date: 2/7/17
 */

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public double computeArea() { // area of a circle
		return (Math.PI) * (radius * radius);
	}

	public double computeCircumference() {
		return (Math.PI) * 2 * radius;
	}
	
	public boolean equals(Circle c) {
		if (c.radius == this.radius) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "The circle has a radius of " + radius +
				". The area is " + computeArea() + " and the circumference is " + computeCircumference();
	}
	
}
