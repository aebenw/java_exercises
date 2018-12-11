package com.company;

public class Animal {

    private int brain;
    private int body;
    private String name;
    private int size;
    private int weight;

    public Animal(int brain, int body, String name, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.name = name;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("from animal");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " + speed);

    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
