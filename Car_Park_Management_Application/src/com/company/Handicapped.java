package com.company;

public class Handicapped extends ParkingSlot {
    private String NearestBuilding;

    public Handicapped(String id, boolean available, String GPS_Coordinate, String NearestBuilding) {
        super(id, available, GPS_Coordinate);
        this.NearestBuilding = NearestBuilding;
    }
}
