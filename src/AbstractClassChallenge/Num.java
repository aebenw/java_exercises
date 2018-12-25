package AbstractClassChallenge;

public class Num extends  ListItem {

    public Num(Object val) {
        super(val);
    }

    @Override
    ListItem setNext(ListItem node) {
        this.next = node;
        return node;
    }

    @Override
    ListItem setPrevious(ListItem node) {
        this.prev = node;
        return node;
    }

    @Override
    ListItem getNext() {
        return this.next;
    }

    @Override
    ListItem getPrev() {
        return this.prev;
    }

    @Override
    int compareTo(ListItem node) {
        if(node != null){
            return ((String) super.getVal()).compareTo((String) node.getVal());
        } else {
            return -1;
        }
    }
}
