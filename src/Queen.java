public class Queen extends IterationPiece{
    public static Direction[] moveSet = new Direction[] {new Direction(1, 1), new Direction(1, -1), new Direction(-1, -1), new Direction(-1, 1), new Direction(1, 0), new Direction(0, 1), new Direction(-1, 0), new Direction(0, -1)};

    public Queen(String id, ChessColor color, char symbol) {
        super(id, color, symbol,moveSet);
    }


    }

    //♕ ♛

