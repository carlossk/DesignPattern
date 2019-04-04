package Main;

import abstractFactory.*;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFactory factory = FactoryProducer.getFactory(false);
		Shape rectangle = (Rectangle) factory.getShape(ShapeType.RECTANGLE);
		rectangle.draw(rectangle.getClass().toString());
		
		Shape circle = factory.getShape(ShapeType.CIRCLE);
		circle.draw(circle.toString());
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
		
		Shape rounted = shapeFactory.getShape(ShapeType.RECTANGLE);
		rounted.draw(rounted.toString());
	}

}
