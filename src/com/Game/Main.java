package com.Game;

public class Main {

    public static void main(String[] args){
        Player player= new Player();
        player.name = "Tim";
        player.health = 29;
        player.weapon = "hammer";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining Health " + player.healthRemaining());

    }
}
