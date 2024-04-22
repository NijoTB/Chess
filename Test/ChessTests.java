import org.junit.Assert;
import org.junit.Test;

public class ChessTests {

    @Test
    public void kingInCheck() {
        Board board = new Board(false);
        board.addPiece(new King("kingB", ChessColor.BLACK), 0, 0);
        board.addPiece(new King("kingW", ChessColor.WHITE), 5, 5);

        board.addPiece(new Knight("knightB", ChessColor.BLACK), 4, 3);
        board.addPiece(new Knight("knightW", ChessColor.WHITE), 5, 4);

        Assert.assertTrue(board.isKingInCheck(ChessColor.WHITE));
        Assert.assertFalse(board.isKingInCheck(ChessColor.BLACK));
        board.display();

    }


    @Test
    public void kingNotInCheck() {
        Board board = new Board(false);
        board.addPiece(new King("kingB", ChessColor.BLACK), 0, 0);
        board.addPiece(new King("kingW", ChessColor.WHITE), 5, 5);

        board.addPiece(new Knight("knightB", ChessColor.WHITE), 4, 3);
        board.addPiece(new Knight("knightW", ChessColor.BLACK), 5, 4);

        Assert.assertFalse(board.isKingInCheck(ChessColor.WHITE));
        Assert.assertFalse(board.isKingInCheck(ChessColor.BLACK));
        board.display();
    }
}
