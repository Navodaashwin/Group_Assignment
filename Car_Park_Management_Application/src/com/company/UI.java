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
    }/*
    public int readInt(String msg){
        System.out.print(msg+" : ");
        try{
            int check = scan.nextInt();
            scan.nextLine();
            return check;
        }
        catch (Exception e){
            System.out.println("..........................Invalid Input................");
            return 0;
        }
    }

    //method for getting a command from the user
    public String readStr(String msg){
        System.out.print(msg + " : ");
        System check = scan.nextLine();
        return check;
    }*/
}
