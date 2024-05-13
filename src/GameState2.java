import java.util.Random;
import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

public class GameState2 {

        public Board board;
        public PlayerGUI currentPlayer;


        public final screen.ChessGUI gui;


        public GameState2() {
            this.board = new Board();
            this.currentPlayer = new PlayerGUI(ChessColor.WHITE);
            gui = new screen.ChessGUI(this.currentPlayer);
            gui.updateBoardGUI(board);
        }

        public void playGame() {
            while (true) {
                if (this.currentPlayer.playerColor == ChessColor.WHITE) {
                    System.out.println("Player White turn");
                } else {
                    System.out.println("Player Black turn");
                }
                Move playerMove = currentPlayer.getMove(board);

                board.applyMove(playerMove);
                gui.updateBoardGUI(board);
                if (board.checkmate(currentPlayer.playerColor == ChessColor.WHITE ? ChessColor.BLACK : ChessColor.WHITE)) {
                    System.out.println("CHECK MATE " + currentPlayer.playerColor + " WINS!!!");
                    break;
                }
                currentPlayer.nextPlayer();
            }
        }
    }


