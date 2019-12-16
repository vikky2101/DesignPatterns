package state;

public class NoDebitCardState implements AtmMachineState{

	@Override
	public void insertDebitCard() {
		System.out.println("Insert Debit Card");
		
	}

	@Override
	public void ejectDebitCard() {
		System.out.println("No Debit Card inserted, so can not eject ");
		
	}

	@Override
	public void enterPinAndWithDrawMoney() {
		System.out.println("No Debit Card inserted, so can not withdraw money ");
		
	}
	
}
