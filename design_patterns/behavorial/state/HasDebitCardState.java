package state;

public class HasDebitCardState implements AtmMachineState {

  @Override
  public void insertDebitCard() {
    System.out.println("Debit Card already inserted, so can not insert other debit card ");

  }

  @Override
  public void ejectDebitCard() {
    System.out.println("Debit Card has been ejected");

  }

  @Override
  public void enterPinAndWithDrawMoney() {
    System.out.println("Money getting withdrawn");

  }
}
