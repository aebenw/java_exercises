package com.company;

public class Toyota extends Car1{

    private int gears;
    private int doors;
    private int speed;
    private boolean clean;


    public Toyota() {
        this(4, 4, 0, false );
    }

    public Toyota(int gears, int doors, int speed, boolean clean) {
        if(this.clean){
            this.clean = clean;
        } else {
            this.clean = false;
        }
        this.gears = gears;
        this.doors = doors;
        this.speed = 0;
    }

    public Toyota(int wheels, boolean powerSteering, boolean headLamps, String color, int gears, int doors, int speed, boolean clean) {
        super(wheels, powerSteering, headLamps, color);
        this.gears = gears;
        this.doors = doors;
        this.speed = speed;
        this.clean = clean;
    }

    public Toyota(int wheels, String color, int gears, int doors, int speed, boolean clean) {
        super(wheels, color);
        this.gears = gears;
        this.doors = doors;
        this.speed = speed;
        this.clean = clean;
    }

    public Toyota(int gears, int doors, int speed, String color, int wheels) {
        super(wheels, color);
        this.gears = gears;
        this.doors = doors;
        this.speed = 0;
    }



    public void changingSpeed(int speed){
        System.out.println("before speed increase " + speed);
        this.speed += speed;
        System.out.println("after speed increase " + speed);
    }

    private void clearOutCar(){
        this.clean = true;
        System.out.println("car is now clean");
    }

    @Override
    public void paint(String color) {
        clearOutCar();
        super.paint(color);
    }

//    public void paint(String color){
//        super.paint(color);
//    }


}
