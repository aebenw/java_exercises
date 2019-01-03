package Generics;

import java.util.ArrayList;

//To only allow a specific player to a team we add a Type after our Team declaration <T> (for type)
//Second refactoring
    //To make sure that the T is only a player type we extends it inside the diamond
    //now when insantiaed it only works with a player type
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println( player.getName() + " is already on the team");
            return false;
        }

        members.add(player);
        System.out.println(player.getName()  + " added");
        return true;
    }

    public int numPlayers(){
        return this.members.size();
    }

    //To ensure that this method is only used between teams of the same Type, we add the type declaration next to the param
    public void matchResults (Team<T> opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore){
            won++;
            message = " beat ";
        } else if (ourScore < theirScore){
            lost++;
            message = " lost to ";
        } else {
            tied ++;
            message = " tied with ";

        }
        played++;
        if(opponent != null) {
            System.out.println(this.name + message + opponent.getName());
            opponent.matchResults(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        int rank = (won * 2) + tied;
        System.out.println(name + ": " + rank);
        return rank;
    }

    @Override
    public int compareTo(Team<T> o) {
        if(this.ranking() > o.ranking()){
            return -1;
        } else if (this.ranking() < o.ranking()){
            return 1;
        }
        return 0;
    }

    //My mind is blown
    //implimenting the comparable interface and overridding the CompareTo
    // is necessary in order to be seen by the Collections static method of sort()
    //sort() is looking for the compareTo() method inside of whatever class that is indicated in the type

}
