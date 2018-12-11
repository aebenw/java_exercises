package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog( String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, name, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk()");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run()");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("dog.moveLegsCalled");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move()");
        moveLegs(10);
        super.move(speed);
    }
}
