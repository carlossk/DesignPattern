package abstractFactory;

public class ShapeFactory extends AbstractFactory {
	
	
	@Override
	public Shape getShape(ShapeType shapeType) {
		Shape shape = null;
		switch(shapeType) {
		
		case CIRCLE:
			shape = new Circle();
			break;
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case SQUARE:
			shape = new Square();
			break;	
		default:
			shape = new Circle();
			break;
		}
		
		return shape;
		
		
	}
}
