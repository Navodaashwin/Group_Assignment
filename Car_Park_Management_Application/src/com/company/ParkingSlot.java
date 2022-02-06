package com.company;

import javax.print.attribute.Attribute;

public class ParkingSlot {
    //Attribute
    private String id;
    private boolean Available;
    private String GPS_Coordinate;
    private Driver driver;

    //constructor
    public ParkingSlot(String id, boolean Available, String GPS_Coordinate) {
        this.id = id;
        this.Available = Available;
        this.GPS_Coordinate = GPS_Coordinate;
        this.driver = null;
    }

    //method for displaying the parking slots
    public void displaySlot(){
            System.out.println("ID : " + getId());
            System.out.println("Coordinate : " +getGPS_Coordinate());
            if (isAvailable()){
                System.out.println("Is Available : Available");
            }
            else {
                System.out.println("Is Available : Taken");
                System.out.println("Driver Details : ");
                getDriver().displayDriver();
            }
    }

    //getters and setters
    public String getId(){
            return id;
    }
    public boolean isAvailable(){
            return Available;
    }
    public String getGPS_Coordinate(){
            return GPS_Coordinate;
    }
    public Driver getDriver(){
            return driver;
    }
    public void setId(String id){
            this.id = id;
    }
    public void setAvailable(boolean available){
            Available = available;
    }
    public void setGPS_Coordinate(String GPS_Coordinate){
            this.GPS_Coordinate = GPS_Coordinate;
    }
    public void setDriver(Driver driver){
            this.driver = driver;
    }
}
