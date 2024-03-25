public  abstract class Piece {
    String id;
    ChessColor color;
    char symbol;

    public Piece(String id, ChessColor color, char symbol){
        this.id = id;
        this.color = color;
        this.symbol = symbol;
    }

    public abstract boolean canMove(Move move);


}
