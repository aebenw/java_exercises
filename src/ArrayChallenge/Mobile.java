package ArrayChallenge;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;

public class Mobile {

    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public Mobile() {
        Contacts eben = new Contacts(323, "Eben");
        this.contacts.add(eben);
    }

    public void getContacts() {
        String contacts = "";
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println(this.contacts.get(i).getName() + ": " + this.contacts.get(i).getNumber());
        }

    }

    public String addContacts(String contact, int number) {
        for (int i = 0; i < this.contacts.size(); i++) {
            if(contact.equals(this.contacts.get(i).getName())) {
                return "contact already exists";
            } else if (number == this.contacts.get(i).getNumber()){
                return "number already exists";
            }
        }

        Contacts newContact = new Contacts(number, contact);
        this.contacts.add(newContact);
        System.out.println(Arrays.toString(this.contacts.toArray()));
        return "New contact added";
    }

    private Contacts searchByName(String name){
        for (int i = 0; i < this.contacts.size(); i++) {
            if (name.equals(this.contacts.get(i).getName())) {
                return this.contacts.get(i);
            }
        }
        return null;

    }

    private Contacts searchByNumber(int number){
        for (int i = 0; i < this.contacts.size(); i++) {
            if (number == this.contacts.get(i).getNumber()) {
                return this.contacts.get(i);
            }
        }
        return null;
    }

    public String search(String name){
        Contacts contact = searchByName(name);
        if(contact != null){
            return String.valueOf(contact.getNumber());
        }
        return "nope";

    }

    public String search(int number){
        Contacts contact = searchByNumber(number);
        if(contact != null){
            return contact.getName();
        }
        return "nope";
    }

    public String changeName(String name){
        Contacts contact = searchByName(name);
        contact.setName(name);
        return "contact name now changed to " + contact.getName();

    }

    public String changeNumber(String name, int number){
        Contacts contact = searchByName(name);
        contact.setNumber(number);
        return "contact number now changed to " + contact.getNumber();
    }

    public void removeContact(String name){
        Contacts contact = searchByName(name);
        this.contacts.remove(contact);
    }


    public void quit(){
        System.out.println("powering down");
    }






}
