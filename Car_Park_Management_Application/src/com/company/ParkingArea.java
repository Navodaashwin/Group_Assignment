package com.company;

import javax.print.attribute.Attribute;
import java.util.ArrayList;

public class ParkingArea {
    private String ID;
    private String FacultyInstitute;
    private String GPS_CoordinateEntrance;
    private String GPS_CoordinateExit;
    private boolean Full;

    private ArrayList<ParkingSlot> Slot = new ArrayList<ParkingSlot>();

    public ParkingArea(String ID, String facultyInstitute, String GPS_CoordinateEntrance, String GPS_CoordinateExit, boolean Full){
        this.ID = ID;
        this.FacultyInstitute = facultyInstitute;
        this.GPS_CoordinateEntrance = GPS_CoordinateEntrance;
        this.GPS_CoordinateExit = GPS_CoordinateExit;
        this.Full = Full;
    }

    public ArrayList<ParkingSlot> getSlot() {
        return Slot;
    }


    public void setSlot(ArrayList<ParkingSlot> slot) {
        Slot = slot;
    }

    // add parking slot to area
    public void AddSlot(ParkingSlot Slot){
        this.Slot.add(Slot);
    }
}
