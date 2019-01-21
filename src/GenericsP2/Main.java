package GenericsP2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList items = new ArrayList();
//        items.add(1);
//        items.add(3);
//        items.add(2);
//        items.add(4);
//        items.add(5);
        //as the AL list is implemented currently, its "raw" meaning any type of Object can be added into the AL
        //the following line would be valid
//        items.add("Eben");
        //this is valid but when we run it through the below method, it throws an error
        //because "eben" can't be treated in the same way as an integer
        //by adding a type element after the AL declaration, the AL won't allow any other type of object

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        printDouble(numbers);
    }
    //Can also be indicated in the params below to prevent other types of arrays to be passed in
    private static void printDouble(ArrayList<Integer> array){
        for(int i : array){
            System.out.println(i * 2);
        }
    }
}
