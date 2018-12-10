package com.company;

public class Sum3and5 {

    public static void main (String[] args){
//        int sum = 0;
//        byte count = 0;
//        for(int i = 1; i <= 1000; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                sum += i;
//                count +=1;
//            }
//            if(count == 5){
//                break;
//            }
//        }
//        System.out.println(sum);
        System.out.println(sumOdd(1, 10));
    }

    private static boolean isOdd(int num){
        if(num < 0 || num % 2 == 0) {return false;}
        else{ return true;}
    }

    private static int sumOdd(int start, int end){

        int sum = 0;
        if(start < 0 || end < start){
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if(isOdd(i)){
                    System.out.println(i);
                    sum += i;
                }
            }
        }
        return sum;
    }
}
