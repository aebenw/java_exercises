package com.DataStructure;

public class Array {

    public static void main(String[] args){
//        One way of doing it
//        int[] myIntArray = new int[10];
//        Then assign values for places in the array
//        myIntArray[5] = 2;

//        Another Way of doing it
//        int[] myIntArray = {0,1,2,3,4,5,6,7,8,9};


//        Third Way


        int[] myIntArray = new int[10];
        for (int i = 0; i <10; i ++){
            myIntArray[i] = i * 10;
        }
        for (int i = 0; i <10; i ++){
            System.out.println("Element " + i + ", value is" + myIntArray[i]);
        }
//        System.out.println(myIntArray);
    }

    public static void printArray(int[] array){
        for (int i = 0; i <10; i ++){
            System.out.println("Element " + i + ", value is" + array[i]);
        }
    }







}
