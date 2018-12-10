package com.company;

public class AreaCalculator {

    public static void main(String[] args){
        System.out.println(area(5));

    }

    private static double area(double radius){
        if(radius < 0) return -1;
        double area = 3.14159 * (Math.pow(radius, 2));
        return area;
    }

    private static double area(double x, double y){
        if(x <0 || y < 0) return -1;
        return x * y;
    }
}
