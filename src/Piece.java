import java.util.ArrayList;

public abstract class Piece {
    String id;
    ChessColor color;
    char symbol;

    public Piece(String id, ChessColor color, char symbol) {
        this.id = id;
        this.color = color;
        this.symbol = symbol;
    }


    public String toString() {
        return Character.toString(symbol);
    }

    public abstract boolean canMove(Board board, Move move);


    public ArrayList<Move> getAllValidMoves(Board board, int x, int y) {
        ArrayList<Move> validMoves = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Move move = new Move(x, y, i, j);
                if (canMove(board, move)) {
                    validMoves.add(move);
                }
            }
        }
        return validMoves;
    }


}
