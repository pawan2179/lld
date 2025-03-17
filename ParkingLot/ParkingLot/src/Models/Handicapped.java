package Models;

import Interface.ParkingSpot;

public class Handicapped extends ParkingSpot {
  @Override
  public boolean getIsFree() {
    return true;
  }
}
