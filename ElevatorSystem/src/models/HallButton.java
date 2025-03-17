package models;

import constants.DirectionStatus;
import instance.Button;

public class HallButton extends Button {
  private DirectionStatus directionStatus;

  @Override
  public void press() {

  }

  @Override
  public boolean isPressed() {
    return false;
  }
}
