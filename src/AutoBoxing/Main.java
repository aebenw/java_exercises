package AutoBoxing;

import com.DataStructure.Array;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
    //Can't make an ArrayList with a primitive type
        // ArrayList<int> does not fly
        //what can be done instead is using the Integer class
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        //And the way to add integers to this is demonstrated in the
        // following for loop

//

        ArrayList<Double> doubleArray = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <10.0; dbl += .5){
            doubleArray.add(dbl);
        }

        for(int i =0; i < doubleArray.size(); i++){
            //this is how you convert Integer back to int
            //**********this is called UnBoxing***********
            System.out.println(i + "-->" + doubleArray.get(i));

        }




    }
}
