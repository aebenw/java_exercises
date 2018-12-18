package ArrayChallenge;

public class Main {

    public static void main(String[] args){
        Mobile mobile = new Mobile();
        System.out.println(mobile.addContacts("Joy", 33));
        mobile.getContacts();
        System.out.println(mobile.search(323));
        System.out.println(mobile.search(3));
        System.out.println(mobile.search("Eben"));
        System.out.println(mobile.search("Jo"));



    }
}
