package com.company;

public class DidgetSum {

    public static void main(String[] args){
        System.out.println(sumDigits(125));

    }

    public static int sumDigits(int number){
        if(number < 10) return -1;
        int sum = 0;
        int count = digetCount((number));
            int i = 0;
            while (i <= count ){
                sum += getDigit(number, i);
                i++;
            }
            return sum;
    }

    public static int digetCount(int num){
        return (int) Math.floor(Math.log10(Math.abs(num))) + 1;
    }

    public static int getDigit(int num, int place){
        return (int) Math.floor(Math.abs(num) /Math.pow(10, place)) % 10;
    }

}
