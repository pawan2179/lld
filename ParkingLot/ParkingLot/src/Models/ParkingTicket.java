package Models;

import java.util.Date;

import Interface.Payments;
import Interface.Vehicle;

public class ParkingTicket {
  private int ticketNo;
  private Date entryTimestamp;
  private Date exitTimestamp;
  private double amount;
  private boolean status;
  private Vehicle vehicle;
  private Entrance entrance;
  private Exit exit;
  private Payments payment;
}
