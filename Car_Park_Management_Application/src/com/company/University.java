package com.company;

import java.util.ArrayList;

public class University {
    //store parking area in university
    private ArrayList<ParkingArea> AreaList = new ArrayList<>();

    //getter and setter
    public ArrayList<ParkingArea> getAreaList() {
        return AreaList;
    }
    public void setAreaList(ArrayList<ParkingArea> areaList) {
        AreaList = areaList;
    }

    //method for adding parking areas to university
    public void AddParkingArea(ParkingArea area) {
        AreaList.add(area);
    }

    //method for display all parking areas
    public void ListArea(){
        for (int i = 0; i< AreaList.size(); i++){
            System.out.println("..........................................................");
            System.out.println("Area Serial Number : "+ (i+1));
            AreaList.get(i).displayParkingArea();
        }
    }

    //method for display only available parking areas
    public void ListAvailableArea() {
        for (int i = 0; i < AreaList.size(); i++) {
            if (!(AreaList.get(i).isFull())) {
                System.out.println("..........................................................");
                System.out.println("Area Serial Number : "+ (i+1));
                AreaList.get(i).displayParkingArea();
            }
        }
    }
}
