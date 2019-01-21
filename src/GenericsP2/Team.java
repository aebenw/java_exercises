package GenericsP2;

//This is where our generics come in
//we want our team to be comprised of specific TYPES
//of players, not just any player

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>> {
    //above T indicated Type
    //To combat any sort of object creating its own team class
        //i.e this would work if they all were of the String class
    //Inside the T diamond, we write extends so it only applys to those that of the same kind of class
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<T> members = new ArrayList<>();
    //Type here too
    //This is indication of how we type the Team class in general
    //If the array list can only be made up of type T
    //then the team can only be of the same Type
    //meaning that the team is dictated by the players that are on it
    // Team crows = new Team<SoccerPlayer>() is my guess

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " already is on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.members.size();
    }

    //We have a problem here
    //Here we can have any team go up against any sort of team
    //To fix this we add a type to the team param
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
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) return -1;
        if(this.ranking() < team.ranking()) return 1;
        return 0;

    }
}
