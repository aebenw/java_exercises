package GenericsP2;

public class Main2 {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer steve = new FootballPlayer("Joe");

        BaseBallPlayer pat =  new BaseBallPlayer("pat");
        SoccerPlayer pete = new SoccerPlayer("Pete");

        //Now that we've type Team, only soccer players will be allowed on it
        Team<SoccerPlayer> Crows = new Team<>("crows");
        Crows.addPlayer(pete);
//        Crows.addPlayer(joe);
//        Crows.addPlayer(pat);

        Team<BaseBallPlayer> dodgers = new Team<>("dodgers");
        dodgers.addPlayer(pat);

        //This makes it so that the team class only operates with the same type of objects
        //But there's still a problem
        //It will still work for objects that are not players
        //We could make a
//         Team<String> team = new Team<>();
        // and it would be valid

        Team<FootballPlayer> pats = new Team<>("Patriots");
        pats.addPlayer(joe);

        Team<FootballPlayer> jets = new Team<>("Jets");
        pats.addPlayer(steve);

        pats.matchResults(jets, 0,12);

        //Below line won't work because not of the same type;
//        Crows.matchResults(pats, 0, 1);

        System.out.println(pats.ranking());
    }
}
