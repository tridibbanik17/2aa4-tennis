package ca.mcscert.se2aa4.demos.tennis;

public class Match {

    public static final String P1_NAME = "p1";
    public static final String P2_NAME = "p2";

    public Match(Integer integer, Integer integer1) { }

    public Player play() {
        ScoreSystem scorer = new ScoreSystem();
        while(! scorer.isEnded()) {
            Player who = decideGameWinner();
            scorer.score(who);
        }
        return scorer.winner()
                .orElseThrow(() -> new IllegalStateException("No Winner!"));
    }

    private Player decideGameWinner() {
        System.out.println("Winning this game: " + P1_NAME);
        return new Player(P1_NAME);
    }

}
