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

}
