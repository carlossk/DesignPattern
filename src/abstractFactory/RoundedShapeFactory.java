package abstractFactory;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType type) {
		// TODO Auto-generated method stub
		Shape shape = null;
		switch(type) {
		
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
			shape = null;
			break;
		}
		
		return shape;
	}

}
