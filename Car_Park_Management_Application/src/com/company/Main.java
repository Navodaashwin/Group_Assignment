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

        UI ui = new UI();
        ui.mainMenu(university);
    }
}
