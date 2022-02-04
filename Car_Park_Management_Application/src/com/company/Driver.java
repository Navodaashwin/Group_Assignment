package com.company;

public class Driver {
    private String VehicleNo;
    private String MobileNo;
    private String UniversityID;

    public Driver(String vehicleNo, String mobileNo, String universityID) {
        VehicleNo = vehicleNo;
        MobileNo = mobileNo;
        UniversityID = universityID;
    }
    public void displayDriver(){
        System.out.println("vehicle No : "+VehicleNo);
        System.out.println("Mobile No : " + MobileNo);
        System.out.println("University ID : "+ UniversityID);
    }
}
