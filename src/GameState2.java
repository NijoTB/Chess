import java.util.Random;
import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class GameState2 {

        public Player[] players;
        public Board board;
        public Player currentPlayer;

        public final screen.ChessGUI gui = new screen.ChessGUI();


        public GameState2() {
            this.players = new Player[2];
            this.players[0] = new Player(ChessColor.WHITE);
            this.players[1] = new Player(ChessColor.BLACK);
            this.board = new Board();
            this.currentPlayer = this.players[0];
            gui.updateBoardGUI(board);
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
            while (true) {
                if (this.currentPlayer.playerColor == ChessColor.WHITE) {
                    System.out.println("Player White turn");
                } else {
                    System.out.println("Player Black turn");
                }
                Move playerMove = currentPlayer.getTurn(board);

                board.applyMove(playerMove);
                gui.updateBoardGUI(board);
                if (board.checkmate(currentPlayer.playerColor == ChessColor.WHITE ? ChessColor.BLACK : ChessColor.WHITE)) {
                    System.out.println("CHECK MATE" + currentPlayer + "WINS!!!");
                    break;
                }
                nextPlayer();
            }
        }
    }


