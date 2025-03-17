package Models;

import Interface.Payments;

public class CardPayments extends Payments {
  @Override
  public boolean initiateTransaction() {
    return true;
  }
}
