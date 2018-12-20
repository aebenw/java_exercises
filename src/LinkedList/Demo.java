package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        LinkedList<String> places = new LinkedList<String>();
//        places.add("LA");
//        places.add("NY");
//        places.add("OH");
//        places.add("San Fran");
//        places.add("Chicago");
//        places.add("J Tree");
//
//        printList(places);
//
//        places.add(1, "Fresno");
//
//        printList(places);
//
//        places.remove(4);
//
//        printList(places);
        LinkedList<String> places = new LinkedList<String>();
        addInOrder("LA", places);
        addInOrder("NY", places);
        addInOrder("OH", places);
        addInOrder("San Fran", places);
        addInOrder("Chicago", places);
        addInOrder("J Tree", places);
        addInOrder("J Tree", places);


        printList(places);

//        places.add(1, "Fresno");

//        printList(places);

//        places.remove(4);

//        printList(places);
    }

    public static void printList(LinkedList<String> linkedList) {
        //Iterator class comes with Lists
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            ///.next() is moving the iterator along
            // shows what I is before moving to the next
            System.out.println("now at " + i.next());
        }

        System.out.println("============");
    }

    //going to create a method that adds based on alphabetic order
    private static boolean addInOrder(String newPlace, LinkedList<String> linkedList){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            //compareTo gives back a value
            //if the compared items are the same, the value will be 0
            int comparisson = stringListIterator.next().compareTo(newPlace);
            if(comparisson == 0){
                //don't add
                System.out.println(newPlace + " is already included");
                return false;
            } else if (comparisson > 0){
                //new city should appear before the compared item in the list
                stringListIterator.previous();
                stringListIterator.add(newPlace);
                return true;
            }
        }

        stringListIterator.add(newPlace);
        return true;

    }

    private static void visit(LinkedList<String> linkedList){
        //method to check if there's anything in the array
        linkedList.isEmpty();

    }



}
