package AbstractClassChallenge;

public class Main {
    public static void main(String[] args) {
        ListItem one = new Num("la");
        ListItem two = new Num("dc");
        ListItem three = new Num("col");
        ListItem four = new Num("ny");
        ListItem five = new Num("sd");

        Linked linker = new Linked();

        linker.addNode(one);
        linker.addNode(two);
        linker.addNode(three);

        linker.addNode(four);
        linker.removeNode(two);
        linker.traverse(one);


    }
}
