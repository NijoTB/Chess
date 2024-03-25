public class King extends Piece{
    public King(String id, ChessColor color, char symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canMove(Move move) {
        return false;
    }

    //♔ ♚
}
