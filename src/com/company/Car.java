package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    //setter method
    //this is this, this is self

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("toyota")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //getter
    public String getModel(){
        return this.model;
    }
}
