package Main;

import factory.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory = new ShapeFactory();

		Circle circle = (Circle) factory.getShape(ShapeType.CIRCLE);
		circle.draw(circle.getClass().toString());

		Rectangle rectangle = (Rectangle) factory.getShape(ShapeType.RECTANGLE);
		rectangle.draw(rectangle.getClass().toString());
		rectangle.otherFun();

		Square square = (Square) factory.getShape(ShapeType.SQUARE);
		square.draw(square.getClass().toString());

	}

}
