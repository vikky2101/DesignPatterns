package state;

public class AtmMachine implements AtmMachineState{
	private AtmMachineState atmState;

	public AtmMachine() {
		atmState = new NoDebitCardState();
	}

	private void setState(AtmMachineState state) {
		this.atmState = state;
	}

	@Override
	public void insertDebitCard() {
		atmState.insertDebitCard();
		this.setState(new HasDebitCardStae());
		
		
	}

	@Override
	public void ejectDebitCard() {
		this.atmState.ejectDebitCard();
		this.setState(new NoDebitCardState());
		
	}

	@Override
	public void enterPinandWithdrwawMoney() {
		this.atmState.enterPinandWithdrwawMoney();
		
	}

}
