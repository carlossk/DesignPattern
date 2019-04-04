package factory;

public class Rectangle implements Shape {

	@Override
	public void draw(String shape) {
		// TODO Auto-generated method stub
		System.out.println("Inside rectangle draw "+shape);
	}
	public void otherFun() {
		System.out.println("other fun");
	}

}
