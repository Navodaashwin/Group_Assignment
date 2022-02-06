package com.company;

import javax.print.attribute.Attribute;
import java.util.ArrayList;

public class ParkingArea {
    //Attribute
    private String ID;
    private String FacultyInstitute;
    private String GPS_CoordinateEntrance;
    private String GPS_CoordinateExit;
    private boolean Full; //for check parking area is full or not

    //store slots created by Parking class
    private ArrayList<ParkingSlot> Slot = new ArrayList<ParkingSlot>();

    //constructor of parkingArea
    public ParkingArea(String ID, String facultyInstitute, String GPS_CoordinateEntrance, String GPS_CoordinateExit, boolean Full){
        this.ID = ID;
        this.FacultyInstitute = facultyInstitute;
        this.GPS_CoordinateEntrance = GPS_CoordinateEntrance;
        this.GPS_CoordinateExit = GPS_CoordinateExit;
        this.Full = Full;
    }
    // method for displaying all parking areas
    public void displayParkingArea(){
        System.out.println("ID : " + getID());
        System.out.println("Faculty : " + getFacultyInstititue());
        System.out.println("Coordinate Entrance :  : " + getGPS_CoordinateEntarnce());
        System.out.println("Coordinate Exit : " + getGPS_CoordinateExit());
        System.out.println("is Full : " + isFull());
    }
    //method for displaying all parking slots in a parking area
    public void displaySlotList(){
        for (int i=0; i<Slot.size();i++){
            if (Slot.get(i).isAvailable()) {
                System.out.println("................................................................");
                System.out.println("Slot Serial Number : " + (i + 1));
                Slot.get(i).displaySlot();
            }
        }

    }


    public ArrayList<ParkingSlot> getSlot() {
        return Slot;
    }
    public String getID(){
        return ID;
    }
    public String getFacultyInstititue(){
        return FacultyInstitute;
    }
    public String getGPS_CoordinateEntarnce(){
        return GPS_CoordinateEntrance;
    }
    public String getGPS_CoordinateExit(){
        return GPS_CoordinateExit;
    }


    public void setSlot(ArrayList<ParkingSlot> slot) {
        Slot = slot;
    }
    public boolean isFull(){
        return Full;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setFacultyInstitute(String facultyInstitute){
        FacultyInstitute = facultyInstitute;
    }
    public void setGPS_CoordinateEntrance(String GPS_CoordinateEntrance){
        this.GPS_CoordinateEntrance = GPS_CoordinateEntrance;
    }
    public  void setGPS_CoordinateExit(String GPS_CoordinateExit){
        this.GPS_CoordinateExit = GPS_CoordinateExit;
    }
    public void setFull(boolean Full){
        this.Full = Full;
    }

    // add parking slot to area
    public void AddSlot(ParkingSlot Slot){
        this.Slot.add(Slot);
    }
}
