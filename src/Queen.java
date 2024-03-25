public class Queen extends Piece{
    public Queen(String id, ChessColor color, char symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canMove(Move move) {
        return false;
    }

    //♕ ♛
}
