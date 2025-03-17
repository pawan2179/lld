package Models;

import Interface.Account;
import Interface.ParkingSpot;

public class AdminAccount extends Account {

  public boolean addEntry(Entrance entry) {
    return false;
  }

  public boolean addExit(Exit exit) {
    return false;
  }

  public boolean addDisplayBoard(DisplayBoard board) {
    return false;
  }

  public boolean addParkingSpot(ParkingSpot spot) {
    return false;
  }
  
  @Override
  public boolean resetPassword() {
    return false;
  }
}
