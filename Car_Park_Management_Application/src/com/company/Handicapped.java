package com.company;

public class Handicapped extends ParkingSlot {
    //private attribute
    private String NearestBuilding;

    public Handicapped(String id, boolean available, String GPS_Coordinate, String NearestBuilding) {
        super(id, available, GPS_Coordinate);
        this.NearestBuilding = NearestBuilding;
    }
    @Override
    //method for displaying handicapped slots details
    public void displaySlot(){
        super.displaySlot();
        System.out.println("Nearest Building ; " + NearestBuilding);
    }

    //getters and setters
    public String getNearestBuilding() {
        return NearestBuilding;
    }

    public void setNearestBuilding(String nearestBuilding) {
        NearestBuilding = nearestBuilding;
    }
}
