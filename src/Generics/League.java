package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class League<T extends Team> {
    //not sure if it is supposed to extend Team or player, since play is the the root of distinction
    private String name;
    private ArrayList<T> teams = new ArrayList<>();


    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team){
        if(teams.contains(team)){
            System.out.println(team.getName() + " has already been added");
            return false;
        }
        teams.add(team);
        System.out.println(team.getName() + " has been added");
        return true;
    }

    public void listTeams(){
        Collections.sort(teams);
        //without the compareTo method in the Teams class, this method would not work.
        for(Team i : teams){
            System.out.println(i.getName());
        }
    }


}



