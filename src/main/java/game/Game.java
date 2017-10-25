package game;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {

    public static final String NOT_STARTED = "NOT_STARTED";
    public static final String STARTED = "STARTED";
    public static final String FINISHED = "FINISHED";


    private List<Player> players;
    private Player currentPlayer;
    private int currentPlayerIndex;
    private String status;

    public Game() {
        this.players = new ArrayList<>();
        this.status = NOT_STARTED;
    }

    public void register(Player motiejus) throws GameException {
        if (NOT_STARTED.equals(this.status)) {
            this.players.add(motiejus);
        } else {
            throw new GameException("Game already started");
        }
    }

    public Player start() {
        this.currentPlayer = this.players.get(this.currentPlayerIndex);
        this.status = STARTED;

        return this.currentPlayer;
    }

    public Player nextPlayer() {
        if (this.currentPlayerIndex + 1 < this.players.size()) {
            this.currentPlayerIndex++;
        } else {
            this.currentPlayerIndex = 0;
        }
        this.currentPlayer = this.players.get(this.currentPlayerIndex);

        return this.currentPlayer;
    }

    public void finish() {
        this.status = FINISHED;
    }

    public List<Player> getPlayers() {
        // Collections API ieina List, Map ir kitokiu duomenu strukturu.
        // o Collections cia yra statine klase kuri turi padedanciu funkciju darbui su List/Map.
        return Collections.unmodifiableList(players);
    }
}
