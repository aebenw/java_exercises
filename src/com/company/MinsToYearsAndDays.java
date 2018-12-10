package com.company;

public class MinsToYearsAndDays {

    public static void main(String[] args){
        printYearsAndDays(561600);
    }

    private static void printYearsAndDays(long mins){
        if(mins < 0) System.out.println("Invalid Values");
        int hours = (int) mins/60;
        int days = hours / 24;
        int years = days / 365;
        int leftOverDays = days % 365;

        System.out.println(mins + "min = " + years + "y and " + leftOverDays + " d");
    }
}
