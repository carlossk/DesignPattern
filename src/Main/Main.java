package Main;
import factory.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.getShape(ShapeType.CIRCLE);
		circle.draw(circle.getClass().toString());
		
		Shape rectangle = factory.getShape(ShapeType.RECTANGLE);
		rectangle.draw(rectangle.getClass().toString());
		
		Shape square = factory.getShape(ShapeType.SQUARE);
		square.draw(square.getClass().toString());
		
	}

}
