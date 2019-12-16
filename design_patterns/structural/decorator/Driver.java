package decorator;

public class Driver {

  public static void main(String[] args) {
    // FileReader and BufferedReader are examples of decorator
    Circle circle = new Circle();
    Shape greenDecorator = new GreenShapeDecorator(circle);
    circle.draw();
    greenDecorator.draw();
  }
}
