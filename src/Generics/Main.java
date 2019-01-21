package Generics;

import com.DataStructure.Array;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList items = new ArrayList();
        //above is a raw data type and will allow anything to be added into the array List
        //if we wanted to only use a specific datatype in the AL then we can use Generics
        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        ArrayList<String> strung = new ArrayList<>();
        strung.add("Eben");
//        print(strung);


        printDouble(items);

    }

    public static void printDouble(ArrayList n){
        //type can be Object, Integer, or int
        for(Object i : n){
            System.out.println((Integer) i * 2);
        }
    }

    public static void print(ArrayList<Integer> n){
        for(Object i : n){
            System.out.println(i);
        }
    }
}
