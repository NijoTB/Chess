public class Knight extends Piece{
    public Knight(String id, ChessColor color) {
        super(id, color, color == ChessColor.WHITE ? '♞' : '♘');
    }
    public Knight(String id, ChessColor color, char symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canMove(Board board, Move move) {
        Direction[] possibilities = new Direction[]{
                new Direction(1, 2),
                new Direction(2, 1),
                new Direction(2, -1),
                new Direction(1, -2),
                new Direction(-2, -1),
                new Direction(-1, -2),
                new Direction(-1, 2),
                new Direction(-2, 1)
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
                        break;
                    }
                    return true;
                } else {
                    return true;
                }
            }
        }


        return false;
    }


    //♘ ♞
}
