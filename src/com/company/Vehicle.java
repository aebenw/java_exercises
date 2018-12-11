package com.company;

public class Vehicle {

    private boolean steering;
    private int doors;


    public Vehicle(){
        this(true, 0);
    }

    public Vehicle( boolean steering, int doors) {
        this.steering = steering;
        this.doors = doors;
    }

    public boolean isSteering() {
        return steering;
    }

    public void setSteering(boolean steering) {
        this.steering = steering;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }


}
