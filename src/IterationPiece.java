public abstract class IterationPiece extends Piece {
    Direction[] moveSet;

    public IterationPiece(String id, ChessColor color, char symbol, Direction[] moveSet) {
        super(id, color, symbol);
        this.moveSet = moveSet;

    }

    @Override
    public boolean canMove(Move move) {
        for (Direction direction : moveSet) {
            int pointerX = move.currentX;
            int pointerY = move.currentY;

            while (true) {

                pointerX += direction.x;
                pointerY += direction.y;

                boolean Check1 = pointerX >= 0 && pointerX <= 7;
                boolean Check2 = pointerY >= 0 && pointerY <= 7;
                if (!(Check1 && Check2)) {
                    break;
                }                Tile pieceChecker1 = Board.board[pointerY][pointerX];
                boolean Check3 = pieceChecker1.piece == null;
                if (!(Check3)) {
                    ChessColor pointerPiece = pieceChecker1.piece.color;
                    if (this.color == pointerPiece) {
                        break;
                    } else if (move.nextX == pointerX && move.nextY == pointerY) {
                        return true;
                    }
                    break;


                }
                if (move.nextX == pointerX && move.nextY == pointerY) {
                    return true;
                }
            }
        }
        return false;
    }
}
