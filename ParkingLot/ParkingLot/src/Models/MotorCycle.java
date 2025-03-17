package Models;

import Interface.ParkingSpot;

public class MotorCycle extends ParkingSpot {

  @Override
  public boolean getIsFree() {
    return false;
  }
}
