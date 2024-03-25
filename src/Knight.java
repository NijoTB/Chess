public class Knight extends Piece{
    public Knight(String id, ChessColor color, char symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canMove(Move move) {
        return false;
    }

    //♘ ♞
}
