package com.Game;

public class Player {

    //using Public for the first time instead of Private
    //this allows these to be set without a method
    //Player.health = 200 would change the health

    public String name;
    public  int health;
    public  String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <=0 ) {
            System.out.println("knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}


// downside to this is that if we change the name of attribute, we have to change it everywhere, instead of with a constructor
// by making it private, these can only in our class

