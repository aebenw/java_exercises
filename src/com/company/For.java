package com.company;

public class For {

    public static void main(String[] args){
        calculateIntrest(1000.0);
        for (int i =0; i<5; i++){
            System.out.println("Loop" + i + " hello!");
        }
    }

    public static void calculateIntrest(double amount){
        for (int i = 2; i < 9; i++){
            double interest = amount * i/100;
            System.out.println(amount + " @" + i + "% = " + interest);

        }
    }
}
