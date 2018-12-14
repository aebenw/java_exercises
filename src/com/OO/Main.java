package com.OO;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20, 20 , 100);
//        Case theCase = new Case("220B", "dell", "AC", dimensions);
//        Monitor monitor = new Monitor("goodOne", "dell", 33, new Resolution(200, 300));
//        MotherBoard motherBoard = new MotherBoard("A really good one", "dell", 4, 8, "v12");
//        PC myComputer = new PC(theCase, monitor, motherBoard);
//        myComputer.powerUp();

        Material metal = new Material("metal", 200);
        Material cloth = new Material("cloth", 30000);
        Table table = new Table(metal, 30, 40, false);

        Shade clothPitched = new Shade(cloth, 30);
        Lamp lamp = new Lamp(3000, clothPitched, false);
        Room myRoom = new Room(table, lamp, 30);
        lamp.turnOn();
    }
}
