package com.company;

import javax.print.attribute.Attribute;

public class ParkingSlot {
        private String id;
        private boolean Available;
        private String GPS_Coordinate;
        private Driver driver;

        public ParkingSlot(String id, boolean Available, String GPS_Coordinate) {
            this.id = id;
            this.Available = Available;
            this.GPS_Coordinate = GPS_Coordinate;
            this.driver = null;
    }/*
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
    }*/
}
