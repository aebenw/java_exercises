package com.company;

public class SecondsAndMinutes {

    public static void main(String[] args){
        System.out.println(getDurationString(3000));

    }

    private static String getDurationString(int mins, int secs){
        if(mins < 0 || (secs >= 60 || secs < 0)) return "Invalid Value";
        int hours =  mins / 60;
        int leftOver = mins % 60;

        return hours + "h " + leftOver + "m " + secs + "s";
    }

    private static String getDurationString(int secs){
        if(secs < 0 ) return "Invalid Value";
        int mins =  secs / 60;
        int leftOver = secs % 60;

        return getDurationString(mins, leftOver);
    }
}
