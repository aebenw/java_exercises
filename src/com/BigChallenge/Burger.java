package com.BigChallenge;

public class Burger {

    private int price;
    private String rolltype;
    private Item meat;
    private Item[] toppings = new Item[4];
//    private Item topping1;
//    private Item topping2;
//    private Item topping3;
//    private Item topping4;

    public Burger(int price, String rolltype, Item meat) {
        this.rolltype = rolltype;
        this.meat = meat;
        this.price = price;
        this.price += meat.getPrice();
    }

    public Burger(int price, Item meat) {
        this.price = price;
        this.meat = meat;
    }

    public Burger(String rolltype, Item meat) {
        this.price = price;
        this.meat = meat;
    }

    public int getPrice(){
        return this.price;
    }

    public void addTopping(Item item){
        this.toppings[0] = item;
        this.price += item.getPrice();
    }



}
