package Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Interface.ParkingSpot;

public class DisplayBoard {
  private int id;
  private Map<String, List<ParkingSpot>> parkingSpots;

  public DisplayBoard(int id) {
    this.id = id;
    parkingSpots = new HashMap<>();
  }

  public void showFree() {

  }

  public void sendParkingFullNotification() {

  }

  public void addParkingSpot(String spotType, List<ParkingSpot> spot) {
    
  }
}
