package com.company;

public class VIPCustomer {

    private int credit;
    private String name;
    private String email;

    public VIPCustomer(){
        this(100, "eben", "eben.eben");
    }

    public VIPCustomer(String name, String email){
        this.name = name;
        this.email = email;
    }

    public VIPCustomer(int credit, String name, String email){
        this.credit = credit;
        this.name = name;
        this.email = email;
    }

    public int getCredit() {
        return credit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
