package com.company;

public class Main {

    public static void main(String[] args) {
        //temporary variable for add parking area
        ParkingArea temp;

        //insert parking areas and slots
        temp = new ParkingArea("A01","Art","-14.25,78.52","14.23,-85.12",false);
        temp.AddSlot(new Standard("S01",true,"12.52,12.35"));
        temp.AddSlot(new Long("S02",true,"12.14,-85.12", 06.5f,17.3f));
        temp.AddSlot(new Handicapped("S03",true,"12.74,-75.12", "Medical"));
        university.AddParkingArea(temp);    //add temp values to university parking area


        temp = new ParkingArea("A02","Law","-14.55,78.72","-74.25,78.72",false);
        temp.AddSlot(new Standard("S01",true,"-34.24,08.72"));
        temp.AddSlot(new Standard("S02",true,"-14.24,78.72"));
        temp.AddSlot(new Long("S03",true,"94.25,98.52", 07.5f,19.3f));
        temp.AddSlot(new Handicapped("S04",true,"-44.25,48.52", "Law"));
        university.AddParkingArea(temp);    //add temp values to university parking area

        UI ui = new UI();
        ui.mainMenu(university);
    }
}
