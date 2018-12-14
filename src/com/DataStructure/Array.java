package com.DataStructure;

import java.util.Arrays;

public class Array {

    public static void main(String[] args){
//        One way of doing it
//        int[] myIntArray = new int[10];
//        Then assign values for places in the array
//        myIntArray[5] = 2;

//        Another Way of doing it
        int[] myIntArray = {1,4,3,2,5};


//        Third Way


//        int[] myIntArray = new int[10];
//        for (int i = 0; i <10; i ++){
//            myIntArray[i] = i * 10;
//        }
//        for (int i = 0; i <10; i ++){
//            System.out.println("Element " + i + ", value is" + myIntArray[i]);
//        }
//        System.out.println(myIntArray);
        System.out.println(sortIntegers(myIntArray));
    }

    public static void printArray(int[] array){
        for (int i = 0; i <10; i ++){
            System.out.println("Element " + i + ", value is" + array[i]);
        }
    }

    public static int[] sortIntegers(int [] array){
//        int[] sortedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        //copying an array

        int[] sortedArray = Arrays.copyOf(array, array.length);

        for(int i = 0; i< array.length; i++){
            for(int j=i+1; j < array.length; j++) {
                if(sortedArray[j] < sortedArray[i]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }

        }

        return sortedArray;
    }







}
