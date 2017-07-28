package decorator;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Shape greenDecorator = new GreenShapeDecorator(circle);
		circle.draw();
		greenDecorator.draw();

	}

}
