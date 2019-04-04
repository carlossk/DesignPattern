package abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(boolean flag) {
		return flag? new RoundedShapeFactory(): new ShapeFactory();
	}
}
