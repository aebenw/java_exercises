package com.BigChallenge;

public class HealthyBurger extends Burger {

    private Item[] toppings = new Item[6];

    public HealthyBurger(int price, Item meat) {
        super(price, "WheatBread", meat);
    }


}
