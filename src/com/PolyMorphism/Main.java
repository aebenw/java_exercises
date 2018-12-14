package com.PolyMorphism;

import java.util.Random;

class Movie {

    private String name;


    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No Plot";
    }
}

class Jaws extends Movie {
    public Jaws(String name) {
        super(name);
    }

    public String plot() {
        return "Shark eating";
    }
}


class IndependenceDay  extends Movie{

    public IndependenceDay() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens, yum";
    }
}

class StarWars  extends Movie{

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Aliens, yuck";
    }
}
class Dumb  extends Movie{

    public Dumb() {
        super("Dumb");
    }

    @Override
    public String plot() {
        return "dumb dumb dumb";
    }
}

public class Main {

    public static void main(String[] args){
        Movie movie = randomMovive();
    }

    public static Movie randomMovive() {
        int randomNumber = (int) (Math.random() * 4) + 1;

        switch (randomNumber) {
            case 1:
                return new Jaws("Jaws");
            case 2:
                return new StarWars();

            default:
                return null;
        }
    }



}

//basically, if there's no override in a class that inherets  that method defaults to the super, which makes it polymorphic
