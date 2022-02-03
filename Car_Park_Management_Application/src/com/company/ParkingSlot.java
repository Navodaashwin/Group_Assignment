package com.company;

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
    }
}
