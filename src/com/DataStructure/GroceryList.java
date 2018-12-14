package com.DataStructure;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        for(int i =0; i < groceryList.size(); i++) {
            System.out.println((i+1) + " - " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println();
    }


    public void removeItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
}

