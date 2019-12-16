package facade;

public class Facade {

  private Travel flight;
  private Travel hotel;

  public Facade() {
    flight = new Flight();
    hotel = new Hotel();
  }

  public void hotelBook() {
    hotel.book();
  }

  public void flightBook() {
    flight.book();
  }
}
