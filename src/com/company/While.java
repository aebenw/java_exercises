package com.company;

public class While {
    public static void main(String[] args){
//        int count = 0;
//        do {
//            System.out.println("count " + count);
//            count ++;
//        } while(count != 6);
        int finishNum = 20;
        int number = 4;
        int count = 0;
        while (number < finishNum){
            number++;
            if(!isEven(number)){
                count ++;
                continue;
            }
            if(count == 5) break;
            System.out.println("number is even, is " + number);
        }
        System.out.println(count + " " + number);
    }

    public static boolean isEven(int num){
        return (num % 2 == 0) ? true : false;
    }
}
