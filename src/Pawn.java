public class Pawn extends Piece {
    public Pawn(String id, ChessColor color, char symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canMove(Move move) {
        //if this happens the white or black pawn will have the option to move once or twice
        // but only on the first move. any move after is only one space.
        if (color == ChessColor.WHITE) {
            if (move.nextY == move.currentY - 1 && move.currentX == move.nextX || move.currentY == 6 && move.nextY == move.currentX - 2 && move.currentX == move.nextX) {
                if (Board.board[move.nextY][move.nextX].piece != null) {
                    return false;
                }
                return true;
            }
            if (Board.board[move.nextY][move.nextX].piece != null && Board.board[move.nextY][move.nextX].piece.color == ChessColor.BLACK) {
                if (move.nextY == move.currentY - 1 && (move.nextX == move.currentX + 1 || move.nextX == move.currentX - 1)) {
                    return true;
                }

            }

            return false;
        }

        if (color == ChessColor.BLACK) {
            if (move.nextY == move.currentY + 1 && move.currentX == move.nextX || move.currentY == 1 && move.nextY == move.currentY + 2 && move.currentX == move.nextX) {
                if (Board.board[move.nextY][move.nextX].piece != null) {
                    return false;
                }
                return true;
            }
            if (Board.board[move.nextY][move.nextX].piece != null && Board.board[move.nextY][move.nextX].piece.color == ChessColor.WHITE) {
                if (move.nextY == move.currentY + 1 && (move.nextX == move.currentX + 1 || move.nextX == move.currentX - 1)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    //♙ ♟
}
