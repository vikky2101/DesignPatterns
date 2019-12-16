package abstractFactory;

public interface AbstractFactory {

  Shape getShape(String type);

  Color getColor(String type);
}
