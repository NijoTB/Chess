import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RookTests {


// Move up tests
    @Test
    public void rookMoveUp(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,0, 5);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertTrue(moveTest.canMove(moveUp));
    }
    @Test
    public void rookMoveUp2(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(3,0,3, 7);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertTrue(moveTest.canMove(moveUp));
    }



    // Move down tests
    @Test
    public void rookMoveDown(){
        Board testBoard = new Board(false);
        Move moveDown = new Move(4,6,4, 2);

        Rook moveTest = new Rook( "rook", ChessColor.WHITE, '♖' );

        assertTrue(moveTest.canMove(moveDown));
    }
    @Test
    public void rookMoveDown2(){
        Board testBoard = new Board(false);
        Move moveDown = new Move(2,7,2, 1);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertTrue(moveTest.canMove(moveDown));
    }


    // Move left tests
    @Test
    public void rookMoveLeft(){
        Board testBoard = new Board(false);
        Move moveLeft = new Move(6,5,3, 5);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertTrue(moveTest.canMove(moveLeft));
    }
    @Test
    public void rookMoveLeft2(){
        Board testBoard = new Board(false);
        Move moveLeft = new Move(4,7,3, 7);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertTrue(moveTest.canMove(moveLeft));
    }


    // Move right tests
    @Test
    public void rookMoveRight(){
        Board testBoard = new Board(false);
        Move moveRight = new Move(0,0,5, 0);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertTrue(moveTest.canMove(moveRight));
    }
    @Test
    public void rookMoveRight2(){
        Board testBoard = new Board(false);
        Move moveRight = new Move(1,1,3, 1);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertTrue(moveTest.canMove(moveRight));
    }


    // can't go diagonal tests
    @Test
    public void cantGoDiagonal(){
        Board testBoard = new Board(false);
        Move moveDiagonal = new Move(4,0,7, 5);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertFalse(moveTest.canMove(moveDiagonal));
    }
    @Test
    public void cantGoDiagonal2(){
        Board testBoard = new Board(false);
        Move moveDiagonal = new Move(0,0,5, 5);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertFalse(moveTest.canMove(moveDiagonal));
    }
    @Test
    public void cantGoDiagonal3(){
        Board testBoard = new Board(false);
        Move moveDiagonal = new Move(3,4,5, 6);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertFalse(moveTest.canMove(moveDiagonal));
    }
    @Test
    public void cantGoDiagonal4(){
        Board testBoard = new Board(false);
        Move moveDiagonal = new Move(3,3,7, 7);

        Rook moveTest = new Rook( "rook", ChessColor.BLACK, '♖' );

        assertFalse(moveTest.canMove(moveDiagonal));
    }
}
