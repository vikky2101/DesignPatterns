package abstractFactory;

public class Driver {

  public static void main(String[] args) {
    AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
    Shape shape = abstractFactory.getShape("Circle");
    shape.draw();
  }
}
