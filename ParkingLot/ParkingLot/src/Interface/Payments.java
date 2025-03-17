package Interface;

import java.util.Date;

import Constants.PaymentStatus;

public abstract class Payments {
  private double amount;
  private PaymentStatus status;
  private Date timestamp;
  private String transactionId;

  public abstract boolean initiateTransaction();
}
