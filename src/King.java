import java.util.TreeMap;

public class King extends Piece {
    public King(String id, ChessColor color) {
        super(id, color, color == ChessColor.WHITE  ? '♚': '♔');
    }
    public King(String id, ChessColor color, char symbol) {
        super(id, color, symbol);
    }



    @Override
    public boolean canMove(Board board, Move move) {
        Direction[] possibilities = new Direction[]{
                new Direction(1, 0),
                new Direction(0, 1),
                new Direction(-1, 1),
                new Direction(1, -1),
                new Direction(1, 1),
                new Direction(-1, -1),
                new Direction(0, -1),
                new Direction(-1, 0)
        };

        for (Direction possibility : possibilities) {
            int x = move.currentX;
            int y = move.currentY;
            x += possibility.x;
            y += possibility.y;
            if (move.nextX == x && move.nextY == y) {
                boolean Check1 = x >= 0 && x <= 7;
                boolean Check2 = y >= 0 && y <= 7;
                if (!(Check1 && Check2)) {
                    continue;
                }
                Tile pieceChecker1 = board.board[y][x];
                boolean Check3 = pieceChecker1.piece == null;
                if (!(Check3)) {
                    ChessColor pointerPiece = pieceChecker1.piece.color;
                    if (this.color == pointerPiece) {
                        return false;
                    }
                    return true;
                } else {
                    return true;
                }
            }
        }


        return false;
    }


}

//♔ ♚

