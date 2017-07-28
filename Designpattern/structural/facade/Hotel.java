package facade;

public class Hotel implements Travel {

	@Override
	public void book() {
		System.out.println("Hotel Ticket Booked");

	}

}
