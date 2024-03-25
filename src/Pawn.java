public class Pawn extends Piece{
    public Pawn(String id, ChessColor color, char symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canMove(Move move) {
        //if this happens the white or black pawn will have the option to move once or twice
        // but only on the first move. any move after is only one space.
        if (color == ChessColor.WHITE) {
            if (move.nextX == move.currentX -1 && move.currentY == move.nextY) {
                return true;
            } else if (move.currentX == 6 && move.nextX == move.currentX -2 && move.currentY == move.nextY) {
                return true;
            }
        }
        return false;
    }




    //♙ ♟
}
