package com.OO;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20 , 100);
        Case theCase = new Case("220B", "dell", "AC", dimensions);
        Monitor monitor = new Monitor("goodOne", "dell", 33, new Resolution(200, 300));
        MotherBoard motherBoard = new MotherBoard("A really good one", "dell", 4, 8, "v12");
        PC myComputer = new PC(theCase, monitor, motherBoard);
        myComputer.getMonitor().drawPixelAt(3, 6, "red");
    }
}
