package Models;

import java.util.Map;

import Interface.Vehicle;

public class ParkingLotSystem {
  private int id;
  private String name;
  private String address;
  private final int MAX_CAPACITY = 40000;

  private static ParkingLotSystem parkingLotSystem = null;

  private Map<String, Entrance> entrance;
  private Map<String, Exit> exit;
  private ParkingRate parkingRate;
  private Map<String, DisplayBoard> displayBoards;
  private Map<String, ParkingTicket> parkingTickets;

  private ParkingLotSystem() {

  }

  synchronized public static ParkingLotSystem getInstance() {
    if(parkingLotSystem == null) {
      parkingLotSystem = new ParkingLotSystem();
    }
    return parkingLotSystem;
  }

  public ParkingTicket getParkingTicket(Vehicle vehicle) {
    return null;
  }

  public boolean isFull() {
    return false;
  }

  public boolean addEntrance(Entrance entrance) {
    return false;
  }
}
