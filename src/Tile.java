public class Tile {
    Piece piece;


    public Tile() {
        this.piece = null;
    }

    public Tile(Piece piece) {
        this.piece = piece;
    }
    public void setTile(Piece piece){
        if (this.piece != null){
            this.piece = piece;
        } else {
            System.out.println("Invalid move! Tile full!");
        }
    }
    public String toString(){
        if (this.piece == null) {
            return ". ";
        }
        return Character.toString(this.piece.symbol)+ " ";
    }
}
