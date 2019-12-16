package adapter;

public class Driver {

  public static void main(String[] args) {
    Target target = new Adapter();
    target.request();
  }
}
