package com.company;

public class Long extends ParkingSlot {
    private float Width;
    private float length;

    public Long(String id, boolean available, String GPS_Coordinate, float Width, float length) {
        super(id, available, GPS_Coordinate);
        this.Width = Width;
        this.length = length;
    }
}
