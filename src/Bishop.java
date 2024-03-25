public class Bishop extends Piece{
    public Bishop(String id, ChessColor color, char symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canMove(Move move) {
        return false;
    }

    //♗ ♝
}
