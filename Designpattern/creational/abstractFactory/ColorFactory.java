package abstractFactory;

public class ColorFactory implements AbstractFactory{

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String type) {
		if(type.equalsIgnoreCase("Red"))
			return new Red();
		else if(type.equalsIgnoreCase("Green"))
			return new Green();
		else
			throw new IllegalArgumentException("No such color exists");
	}
}
