package decorator;

public class GreenShapeDecorator extends ShapeDecorator {

  public GreenShapeDecorator(Shape shape) {
    super(shape);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void draw() {
    super.draw();
    setGreenBorder();
  }

  private void setGreenBorder() {
    System.out.println("Set Border to green");
  }

}
