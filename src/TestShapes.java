/*
 * Author: Abhishek Vichare
 * Date: 2/7/17
 */

public class TestShapes {
	public static void main(String [] args) {

		Rectangle rect1 = new Rectangle(5, 10);
		Rectangle rect2 = new Rectangle(6, 8);
		Square squ1 = new Square(3);
		Circle cir1 = new Circle(8);
		Circle cir2 = new Circle(10);

		System.out.println(rect1);
		System.out.println(rect2);
		System.out.println(squ1);
		System.out.println(cir1);
		System.out.println(cir2);

		// Part 2

		Rectangle testRectangle1 = new Rectangle(4, 6);
		Rectangle testRectangle2 = new Rectangle(4, 6);


		if (testRectangle1.equals(testRectangle2)) {
			System.out.println("They are same rectangles.");
		} else {
			System.out.println("They are different rectangles.");
		}
		
		Square testSquare1 = new Square(5);
		Square testSquare2 = new Square(6);

		if (testSquare1.equals(testSquare2)) {
			System.out.println("They are same squares.");
		} else {
			System.out.println("They are different squares.");
		}


		// Optional
		
		Circle testCircle1 = new Circle(9);
		Circle testCircle2 = new Circle(9);
		
		if (testCircle1.equals(testCircle2)) {
			System.out.println("They are same circles.");
		} else {
			System.out.println("They are different circles.");
		}
		

	}
}
