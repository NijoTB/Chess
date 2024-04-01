import java.util.Dictionary;

public class Rook extends IterationPiece {
    public static Direction[] moveSet = new Direction[] {new Direction(1, 0), new Direction(0, 1), new Direction(-1, 0), new Direction(0, -1)};

    public Rook(String id, ChessColor color, char symbol) {
        super(id, color, symbol, moveSet);
    }


    //♖ ♜
}
