package com.company;

public class Car1 extends Vehicle{

    private int wheels;
    private boolean powerSteering;
    private boolean headLamps;
    private String color;


    public Car1() {
        this(3, true, false, "red");
    }

    public Car1(int wheels, boolean powerSteering, boolean headLamps, String color) {
        super(true, 4);
        this.wheels = wheels;
        this.powerSteering = powerSteering;
        this.color = color;
    }

    public Car1(int wheels, String color) {
        super(true, 4);
        this.wheels = wheels;
        this.color = color;
    }

    public void paint(String color){
        System.out.println("color before paintjob " + this.color);
        this.color = color;
        System.out.println("new color " + this.color);
    }
}
