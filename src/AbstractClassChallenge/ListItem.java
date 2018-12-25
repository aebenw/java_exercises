package AbstractClassChallenge;

import java.util.List;

public abstract class ListItem {
    protected ListItem next = null;
    protected ListItem prev = null;
    protected Object val;

    public ListItem(Object val) {
        this.val = val;
    }

    abstract ListItem setNext(ListItem node);
    abstract ListItem setPrevious(ListItem node);
    abstract ListItem getNext();
    abstract ListItem getPrev();
    abstract int compareTo(ListItem node);


    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }
}
