package state;

public class Driver {

  public static void main(String[] args) {
    AtmMachine atm = new AtmMachine();
    atm.ejectDebitCard();
    atm.enterPinAndWithDrawMoney();
    atm.insertDebitCard();
    atm.enterPinAndWithDrawMoney();
    atm.ejectDebitCard();
  }

}
