package Models;

import Interface.Payments;

public class CashPayment extends Payments {
  @Override
  public boolean initiateTransaction() {
    return true;
  }
}
