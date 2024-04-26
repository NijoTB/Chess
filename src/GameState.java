import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class GameState {

    public Player[] players;
    public Board board;
    public Player currentPlayer;


    public GameState() {
        this.players = new Player[2];
        this.players[0] = new Player(ChessColor.WHITE);
        this.players[1] = new Player(ChessColor.BLACK);
        this.board = new Board();
        this.currentPlayer = this.players[0];
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


    public void playGame() {
        board.display();
        while (true) {
            if (this.currentPlayer.playerColor == ChessColor.WHITE) {
                System.out.println("Player White turn");
            } else {
                System.out.println("Player Black turn");
            }
            Move playerMove = currentPlayer.getTurn(board);

            board.applyMove(playerMove);
            board.display();
            if (board.checkmate(currentPlayer.playerColor == ChessColor.WHITE ? ChessColor.BLACK : ChessColor.WHITE)) {
                System.out.println("CHECK MATE" + currentPlayer + "WINS!!!");
                break;
            }
            nextPlayer();
        }
    }
}
