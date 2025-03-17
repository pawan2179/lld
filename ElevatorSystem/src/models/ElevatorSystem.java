package models;

public class ElevatorSystem {
  private Building building;

  public void monitoring() {

  }

  public void dispatcherAlgo() {

  }

  private ElevatorSystem(){};
  private static ElevatorSystem elevatorSystemInstance = null;

  synchronized public static ElevatorSystem getInstance() {
    if(elevatorSystemInstance == null) {
      elevatorSystemInstance = new ElevatorSystem();
    }
    return elevatorSystemInstance;
  }
}
