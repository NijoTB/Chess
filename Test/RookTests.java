import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RookTests {



    @Test
    public void rookMove(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,0, 5);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertTrue(moveTest.canMove(moveUp));
    }
}
