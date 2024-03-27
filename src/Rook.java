public class Rook extends Piece{
    public Rook(String id, ChessColor color, char symbol) {
        super(id, color, symbol);
    }

    @Override
    public boolean canMove(Move move) {

        return false;
    }

    //♖ ♜
}
