package AbstractClassChallenge;

public class SearchTree implements NodeList {

    private ListItem head = null;

    public SearchTree(ListItem head) {
        this.head = head;
    }

    @Override
    public ListItem getHead() {
        return this.head;
    }

    @Override
    public boolean addNode(ListItem item) {
        return false;
    }

    @Override
    public boolean removeNode(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
