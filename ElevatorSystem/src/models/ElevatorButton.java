package models;

import instance.Button;

public class ElevatorButton extends Button {
  private int destinationFloorNumber;

  @Override
  public void press() {

  }

  @Override
  public boolean isPressed() {
    return false;
  }
}
