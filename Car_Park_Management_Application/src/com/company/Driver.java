package com.company;

public class Driver {
    //Attribute
    private String VehicleNo;
    private String MobileNo;
    private String UniversityID;

    //constructor
    public Driver(String vehicleNo, String mobileNo, String universityID) {
        VehicleNo = vehicleNo;
        MobileNo = mobileNo;
        UniversityID = universityID;
    }

    //display the details of the driver
    public void displayDriver(){
        System.out.println("vehicle No : "+VehicleNo);
        System.out.println("Mobile No : " + MobileNo);
        System.out.println("University ID : "+ UniversityID);
    }

    //Getters and Setters

    public String getVehicleNo(){
        return VehicleNo;
    }
    public String getMobileNo(){
        return MobileNo;
    }
    public String getUniversityID(){
        return UniversityID;
    }
    public void setVehicleNo(String vehicleNo){
        VehicleNo = vehicleNo;
    }
    public void setMobileNo(String mobileNo){
        MobileNo = mobileNo;
    }
    public void setUniversityID(String universityID){
        UniversityID = universityID;
    }
}
