package com.company;

public class Challenge {

    public static void main(String [] args){
        System.out.println(calcFeetAndInches(111));

    }

    private static double calcFeetAndInches(double feet, double inches){
        if(inches <= 0 || inches >= 12) return -1;
        if(feet <= 0) return -1;
        double feetToCent = feet * 30.48;
        double inchesToCent = inches * 2.54;
        return feetToCent + inchesToCent;
    }

    private static double calcFeetAndInches(double inches){
        if(inches <= 0) return -1;
        double inchesToFeet = (int) inches / 12;
        double leftOver = inches % 12;
        return calcFeetAndInches(inchesToFeet, leftOver);
    }
}
