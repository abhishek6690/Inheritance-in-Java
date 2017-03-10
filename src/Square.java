/*
 * Author: Abhishek Vichare
 * Date: 2/7/17
 */

public class Square extends Rectangle {
	
	public Square(int width) { // overloading
		super(width, width); // because the width of a square is the same as its height
	}

	public String toString() {
		return "The square has a width of " + width + " and height of " + height + 
				". The area is " + computeArea() + " and the perimeter is " + computeCircumference();
	}

}
