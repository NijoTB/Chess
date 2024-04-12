import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class GameState {

    public Player[] players;
    public Board board;
    public Player currentPlayer;


    public GameState() {
        this.players = new Player[2];
        this.players[0] = new Player();
        this.players[1] = new Player();
        this.board = new Board();
        this.currentPlayer = this.randomPlayer();
    }


    public void newGame() {
        this.board = new Board();
        this.currentPlayer = this.randomPlayer();
    }


    public Player randomPlayer() {
        return this.players[new Random().nextBoolean() ? 0 : 1];
    }


    public void nextPlayer() {
        if (this.currentPlayer.equals(this.players[0])) {
            this.currentPlayer = this.players[1];
        } else {
            this.currentPlayer = this.players[0];
        }
    }



}
