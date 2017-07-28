package abstractFactory;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
		Shape shape = abstractFactory.getShape("Circle");
		shape.draw();

	}

}
