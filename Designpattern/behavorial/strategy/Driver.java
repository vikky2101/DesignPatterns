package strategy;

public class Driver {

  public static void main(String[] args) {

    Context context = new Context(new AddStrategy());
    context.perform(3, 4);
    context = new Context(new MultiplyStrategy());
    context.perform(3, 4);
  }

}
