package generics.teamAndPlayerAdder;

public class Main {
    public static void main(String[] args) {
        BaseBallPlayer bryan = new BaseBallPlayer("Bryan");
        SoccerPlayer jonas = new SoccerPlayer("Jonas");
        Team <BaseBallPlayer>hammerFc= new Team<BaseBallPlayer>("hammerFc");

        hammerFc.addPlayers(bryan);
    }
}
