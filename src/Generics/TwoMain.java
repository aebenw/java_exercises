package Generics;

public class TwoMain {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPlayer pat =  new BaseBallPlayer("pat");
        SoccerPlayer pete = new SoccerPlayer("Pete");

//        Team Crows = new Team("Crows");
//        Crows.addPlayer(joe);
//        Crows.addPlayer(pat);
//        Crows.addPlayer(pete);

//        Crows.numPlayers();
        //The problem posed by the above code is that any kind of player can be added to the team.
        //To fix this with Generics, we need to fix it in the Teams class

        //After we add a type declaration in our class, we then need to specify that type in our instaniation of that object

        Team<FootballPlayer> Crows = new Team<>("Crows");
        Crows.addPlayer(joe);
        //following 2 lines will error out bc now it needs to be a specific kind of player
//        Crows.addPlayer(pat);
//        Crows.addPlayer(pete);


        Team<BaseBallPlayer> diamonds = new Team<>("diamonds");
        diamonds.addPlayer(pat);


        Team<SoccerPlayer> galaxy = new Team<>("galaxy");
        galaxy.addPlayer(pete);

        Team<SoccerPlayer> jets = new Team<>("jets");
        galaxy.addPlayer(pete);

        Team<SoccerPlayer> pellets = new Team<>("pellets");
        galaxy.addPlayer(pete);

        //Although the above code allows for typing, it allows for all types to be added, not just players
        //A String type of team could be made and it can break the the whole app but pass all the specs

        galaxy.matchResults(pellets, 12, 2);
        galaxy.matchResults(jets, 12, 22);
        jets.matchResults(pellets, 22, 2);

        jets.ranking();
        galaxy.ranking();
        pellets.ranking();

        //tp compare like teams by ranking, we need to alter the Team class and impliment the Compareable interface

        jets.compareTo(galaxy);

        //to make sure we only have like teams we add the subtype in the type
        //i.e A leage of teams of a certain kind of player
        League<Team<SoccerPlayer>> soccer = new League<>("soccer");
        soccer.addTeam(galaxy);
        soccer.addTeam(pellets);

        //Now the below code will error
//        soccer.addTeam(diamonds);



        soccer.listTeams();


    }
}
