import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class KingTests {
    @Test
    public void kingMoveUp(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,0, 1);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );

        assertTrue(moveTest.canMove(moveUp));
    }
}
