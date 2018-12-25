package AbstractClassChallenge;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linked implements NodeList {
//    LinkedList<Num> numList;
    private ListItem head = null;
    private ListItem tail = null;

    public Linked() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public ListItem getHead() {
        return this.head;
    }


    @Override
    public boolean removeNode(ListItem item) {
        return false;
    }


    @Override
    public boolean addNode(ListItem node){

        if(this.head == null) {
            this.head = node;
            this.tail = node;
            return true;
        }
            ListItem current = this.head;

            while (current != null) {

                int diff = current.compareTo(node);
                if (diff < 0) {
                    if (current.getNext() != null) {
                        current = current.getNext();
                    } else {
                        node.setPrevious(current);
                        current.setNext(node);
                        this.tail = node;
                        return true;
                    }
                } else if (diff > 0) {
                        if(current.getPrev() == null){
                            node.setNext(current);
                            current.setPrevious(node);
                            this.head = node;
                        } else {
                            node.setPrevious(current);
                            current.getNext().setPrevious(node);
                            current.setNext(node);

                        }
                        return true;
                }
            }
            return false;
    }

    @Override
    public void traverse(ListItem root) {
        ListItem current = this.head;
        while(current != null){
            System.out.println(current.getVal());
            current = current.getNext();
        }
    }
}
