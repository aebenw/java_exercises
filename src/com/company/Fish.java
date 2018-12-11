package com.company;

public class Fish extends Animal {

    private int gils;
    private int eyes;
    private int fins;

    public Fish( String name, int size, int weight) {
        super(1, 1, name, size, weight);
    }


    private void swim(){

    }

    private void moveMuscles(){
        System.out.println("move muscles");
    }

    private void moveBackFin(){
        System.out.println("back fin()");
    }

    public void swim(int speed){
        moveMuscles();
        moveBackFin();
        move(speed);
    }
}
