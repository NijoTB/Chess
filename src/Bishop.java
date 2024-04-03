import java.util.Dictionary;

public class Bishop extends IterationPiece{
    public static Direction[] moveSet = new Direction[] {new Direction(1, 1), new Direction(1, -1), new Direction(-1, -1), new Direction(-1, 1)};

    public Bishop(String id, ChessColor color, char symbol) {
        super(id, color, symbol, moveSet);
    }


    //♗ ♝
}
