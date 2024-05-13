import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PlayerGUI extends Player {

    public ChessColor playerColor;

    public static final Map<String, Integer> inputMap = Map.of("a", 0, "b", 1, "c", 2, "d", 3, "e", 4, "f", 5, "g", 6, "h", 7);

    int startX = -1;
    int startY = -1;
    int endX = -1;
    int endY = -1;



    public PlayerGUI(ChessColor color) {
        super(color);
        this.playerColor = color;
    }

    public Move getMove(Board board) {

        Move newMove = null;
        try {
            boolean isValid = false;
            while (!isValid) {
                if (endX >= 0 && endY >= 0) {
                    Piece startPiece = board.board[startY][startX].piece;
                    Piece endPiece = board.board[endY][endX].piece;
                    if (startPiece != null && startPiece.color == playerColor && startPiece.canMove(board, new Move(startX, startY, this.endX, this.endY)) ){

                        isValid = true;
                    } else {
                        startX = -1;
                        startY = -1;
                        endX = -1;
                        endY = -1;
                    }
                }
                TimeUnit.MILLISECONDS.sleep(100);
            }
            newMove = new Move(startX, startY, this.endX, this.endY);
            
            startX = -1;
            startY = -1;
            endX = -1;
            endY = -1;
                    
        } catch (InterruptedException ignored) {
            System.out.println("INTERRUPTION");
        }

        return newMove;
    }


    public void nextPlayer() {
        if (this.playerColor == ChessColor.WHITE) {
            this.playerColor = ChessColor.BLACK;
        } else {
            this.playerColor = ChessColor.WHITE;
        }
    }
}
