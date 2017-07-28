package state;

public class Main {

	public static void main(String[] args) {
		AtmMachine atm = new AtmMachine();
		atm.ejectDebitCard();
		atm.enterPinandWithdrwawMoney();
		atm.insertDebitCard();
		atm.enterPinandWithdrwawMoney();
		atm.ejectDebitCard();
	}

}
