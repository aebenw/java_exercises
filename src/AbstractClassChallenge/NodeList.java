package AbstractClassChallenge;


public interface NodeList {
    ListItem getHead();
    boolean addNode(ListItem item);
    boolean removeNode(ListItem item);
    void traverse(ListItem root);
}
