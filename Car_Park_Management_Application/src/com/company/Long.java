package com.company;

public class Long extends ParkingSlot {
    //private attributes
    private float Width;
    private float length;

    public Long(String id, boolean available, String GPS_Coordinate, float Width, float length) {
        super(id, available, GPS_Coordinate);
        this.Width = Width;
        this.length = length;
    }

    @Override
    //method for display long slots details
    public void displaySlot(){
        super.displaySlot();
        System.out.println("Width : "+Width);
        System.out.println("Length : " + length);
    }

    //getters and setters
    public float getWidth() {
        return Width;
    }
    public float getLength() {
        return length;
    }
    public void setWidth(float width) {
        this.Width = width;
    }
    public void setLength(float length) {
        this.length = length;
    }

}
