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

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println();
    }

    public void removeItem(String item){
        int position = findItem(item);
        removeItem(position);

    }

    private void removeItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        int position = groceryList.indexOf(searchItem);
        return position;

    }

    public void modifyGroceryItem(String newItem){
        int position = findItem(newItem);
        if (position >=0) {
            modifyGroceryItem(position, newItem);
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }


}

