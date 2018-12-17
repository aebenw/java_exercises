package com.DataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList gL = new GroceryList();

    public static void main(String[] args){
        boolean quit = false;
        int choice = 0;
        printInstructions();



    }

    private static void printInstructions(){
        System.out.println("instructions");
    }

    public static void processArrayList(){
        //how to copy an arraylist into a new arraylist
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(gL.getGroceryList());

        //how to turn an arrayList into an Array
        String[] myArray = new String[gL.getGroceryList().size()];
        myArray = gL.getGroceryList().toArray(myArray);
    }

}
