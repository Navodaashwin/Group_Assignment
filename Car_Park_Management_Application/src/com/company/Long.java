package com.company;

public class Long extends ParkingSlot {
    private float Width;
    private float length;

    public Long(String id, boolean available, String GPS_Coordinate, float Width, float length) {
        super(id, available, GPS_Coordinate);
        this.Width = Width;
        this.length = length;
    }/*
    @Override
    //method for display long slots details
    public void displaySlot(){
        super.displaySlot()
        System.out.println("Width : "+Width);
        System.out.println("Length : " + length);
    }*/
}
