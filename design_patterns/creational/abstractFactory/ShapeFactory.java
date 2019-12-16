package abstractFactory;


public class ShapeFactory implements AbstractFactory {

  @Override
  public Shape getShape(String type) {
    if (type.equalsIgnoreCase("Square")) {
      return new Square();
    } else if (type.equalsIgnoreCase("Circle")) {
      return new Circle();
    } else {
      throw new IllegalArgumentException("No such shape exists");
    }
  }

  @Override
  public Color getColor(String type) {
    // TODO Auto-generated method stub
    return null;
  }


}
