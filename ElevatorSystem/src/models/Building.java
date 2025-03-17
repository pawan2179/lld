package models;

import java.util.List;

public class Building {
  private List<Floor> floorList;
  private List<Elevator> elevatorList;
  private static Building buildingInstance = null;

  synchronized public static Building getInstance() {
    if(buildingInstance == null) {
      buildingInstance = new Building();
    }
    return buildingInstance;
  } 
}
