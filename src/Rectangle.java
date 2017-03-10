/*
 * Author: Abhishek Vichare
 * Date: 2/7/17
 */

public class Rectangle extends Shape {

	int width;
	int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double computeArea() { // override
		return (width * height);
	}

	public double computeCircumference() { // override
		// Calculate perimeter
		int perimeter = (width * 2) + (height * 2);
		return perimeter;
	}

	public boolean equals(Rectangle r) {
		if (r.width == this.width && r.height == this.height) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "The rectangle has a width of " + width + " and height of " + height + 
				". The area is " + computeArea() + " and the perimeter is " + computeCircumference();
	}

}
