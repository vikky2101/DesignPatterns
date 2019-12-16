package facade;

public class Flight implements Travel {

  @Override
  public void book() {
    System.out.println("Flight Ticket Booked");
  }
}
