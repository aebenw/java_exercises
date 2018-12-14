package com.OO;

public class Material {

    private String name;
    private int softNess;


    public Material(String name, int softNess) {
        this.name = name;
        this.softNess = softNess;
    }


    public void burning(){
        System.out.println("Your " + this.name + "is burning");
    }
}
