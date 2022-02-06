package com.company;

import java.util.Scanner;

public class UI {
    private Scanner scan = new Scanner(System.in);

    public void mainMenu(University university){
        int command;
        int TempAreaIndex;
        int TempSlotIndex;


        System.out.println("Welcome");
        System.out.println("..........................................................");
        System.out.println("Please enter 1 for check-in a vehicle");
        System.out.println("Please enter 2 for check-out a vehicle");
        System.out.println("Please enter 3 for check parking slots");
        System.out.println("Enter 0 anytime for return back to main menu");
        command = readInt("Enter Command");

        //if command = check-in
        if(command==1) {
            //print available slots with serial number
            System.out.println("..........................................................");
            System.out.println("Available Areas : ");
            university.ListAvailableArea();
            System.out.println("..........................................................");
            // enter the parking area serial number
            command = readInt("Enter The Parking Area Serial Number") - 1;

            //if the serial number of the area that was inserted by the user == 0 (command-1), go to the mainmanu
            if (command == -1) {
                mainMenu(university);
            }
            //if the serial number of the area inserted by the user is greater than 0 and less than the number of areas in the area list,
            else if (command >= 0 && command < university.getAreaList().size()) {
                //check parking area is full,
                if(university.getAreaList().get(command).isFull()){
                    System.out.println("..........................................................");
                    System.out.println("Sorry! Parking Area Is Full");
                    System.out.println("..........................................................");
                }
                else {
                    //else, display the available slots
                    TempAreaIndex = command;
                    System.out.println("..........................................................");
                    System.out.println("Available Slots in You Selected Area: ");
                    university.getAreaList().get(TempAreaIndex).displayAvailableSlotList();
                    System.out.println("..........................................................");

                    // enter the serial number of the parking slot corresponding to the driver
                    command = readInt("Enter Prefer Slot Serial Number") - 1;
                    //if the serial number of the slot that was inserted by the user == 0, go to the mainmenu
                    if (command == -1) {
                        mainMenu(university);
                    }
                    //else, check inserted slot serial number is greater than 0 and less than the size of the slots list of the inserted area
                    else if (command >= 0 && command < university.getAreaList().get(TempAreaIndex).getSlot().size()){
                        // if inserted slot serial number is an available slot, enter vehicle no, mobile no, university id
                        if(university.getAreaList().get(TempAreaIndex).getSlot().get(command).isAvailable()){
                            TempSlotIndex = command;
                            String vehicle_no = readStr("Enter Vehicle No");
                            String mobile_no = readStr("Enter Mobile No");
                            String university_id = readStr("Enter University ID No");
                            // save the above things in the new tempDriver variable
                            Driver tempDriver = new Driver(vehicle_no, mobile_no, university_id);

                            //change availability of slot and store tempDriver details
                            university.getAreaList().get(TempAreaIndex).getSlot().get(TempSlotIndex).setAvailable(false);
                            university.getAreaList().get(TempAreaIndex).getSlot().get(TempSlotIndex).setDriver(tempDriver);
                            System.out.println("..........................................................");
                            System.out.println("Check-In Successful....!!"); //print "check-in successful"
                            System.out.println("..........................................................");
                            university.getAreaList().get(TempAreaIndex).setFull();
                        }
                        else {
                            //if the inserted slot No is not available,
                            System.out.println(".......................Sorry,This Slot Is Already Used...................");
                            mainMenu(university);
                        }
                    } else {
                        //if the user insert the invalid slot no,
                        System.out.println(".......................Sorry, Invalid Slot Serial Number...................");
                        mainMenu(university);
                    }
                }

            } else {
                System.out.println(".......................Sorry, Invalid Area Serial Number...................");
                mainMenu(university);
            }
        }
        //if command = check-out
        else if(command==2) {
            //print available slots with serial number
            System.out.println("..........................................................");
            System.out.println("All Areas : ");
            university.ListArea();

            // enter the parking area serial number
            System.out.println("..........................................................");
            command = readInt("Enter Area Serial Number") - 1;
            //if the serial number of the area that was inserted by user == 0 (command-1), go to the mainmanu
            if (command == -1) {
                mainMenu(university);
            }
            //if the serial number of the area inserted by the user is greater than 0 and less than the number of areas in the area list,
            else if (command >= 0 && command < university.getAreaList().size()) {
                TempAreaIndex = command;        // the command is saved in the TempAreaIndex variable
                //insert university id
                String uni_id = readStr("Enter University ID of Driver");
                //if university id == 0, go to the mainmanu
                if (uni_id.equals("0")) {
                    mainMenu(university);
                }
                else {
                    //else, go and find the slot of the corresponding university id and make it available and print "Check-Out Successful"
                    for (int i = 0; i < university.getAreaList().get(TempAreaIndex).getSlot().size(); i++) {
                        Driver driver= university.getAreaList().get(TempAreaIndex).getSlot().get(i).getDriver();
                        if (driver != null) {
                            if (uni_id.equals(driver.getUniversityID())) {
                                university.getAreaList().get(TempAreaIndex).getSlot().get(i).setAvailable(true);
                                System.out.println("..........................................................");
                                System.out.println("Check-Out Successful..!!");
                                System.out.println("..........................................................");
                                university.getAreaList().get(TempAreaIndex).setFull();
                                break;
                            }
                        }
                    }
                }
            }
            else {
                //if the user inserts the invalid area no,
                System.out.println(".......................Invalid Area Serial Number......................");
                mainMenu(university);
            }
        }

        //if command = check parking slots
        else if(command==3) {
            //print all parking ares
            System.out.println("..........................................................");
            System.out.println("Areas : ");
            university.ListArea();
            System.out.println("..........................................................");

            //get the parking area serial No that the user wanted to check
            command = readInt("Enter Parking Area Serial Number for Check") - 1;
            System.out.println("..........................................................");

            //if the serial number of the area that was inserted by user == 0 (command-1), go to the mainmanu
            if (command == -1) {
                mainMenu(university);
            }
                /*if the serial number of the area inserted by the user is greater than 0 and less
                than the number of areas in the area list, display the parking areas and slots of that area*/
            else if (command >= 0 && command < university.getAreaList().size()) {
                TempAreaIndex = command;        // command save in TempAreaIndex variable
                university.getAreaList().get(TempAreaIndex).displayParkingArea();
                System.out.println("..........................................................");
                System.out.println("Slot List");
                university.getAreaList().get(TempAreaIndex).displaySlotList();
                System.out.println("..........................................................");

                //get the parking slot serial No that user wanted to check
                command = readInt("Enter Prefer Slot Serial Number for Check") - 1;
                System.out.println("..........................................................");
                //if the parking slot serial No that the user wanted to check == 0, go to the mainmanu
                if (command == -1) {
                    mainMenu(university);
                }
                    /*else, check inserted slot serial number is greater than 0 and less than the size of the slots
                    list of inserted area, display the details of slots*/
                else if (command >= 0 && command < university.getAreaList().get(TempAreaIndex).getSlot().size()) {
                    university.getAreaList().get(TempAreaIndex).getSlot().get(command).displaySlot();
                    System.out.println("..........................................................");
                }
                //else, go to the mainmanu
                else {
                    System.out.println("...........................Invalid Slot Serial Number.....................");
                    mainMenu(university);
                }
            }
            //else, go to the mainmanu
            else {
                System.out.println("...........................Invalid Area Serial Number.....................");
                mainMenu(university);
            }
        }
        //else, go to the mainmanu
        else {
            System.out.println("...........................Invalid command.....................");
            mainMenu(university);
        }
        mainMenu(university);
    }

    //method for getting a command(int) from the user
    public int readInt(String msg){
        System.out.print(msg+" : ");
        int check = scan.nextInt();
        scan.nextLine();
        return check;
    }

    //method for getting a command(string) from the user
    public String readStr(String msg){
        System.out.print(msg+" : ");
        String check = scan.nextLine();
        return check;
    }
}
