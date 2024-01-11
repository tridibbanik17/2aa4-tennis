package ca.mcscert.se2aa4.demos.tennis;

import java.util.Optional;

public class ScoreSystem {

    private Player winner = null;

    public void score(Player playerName) {
        this.winner = playerName;
    }

    public boolean isEnded() {
        return winner != null;
    }

    public Optional<Player> winner() {
        return (isEnded()? Optional.of(winner): Optional.empty());
    }

}
