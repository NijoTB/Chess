import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class KnightTests {
    @Test
    public void knightMoveUpRight(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,1, 2);

        Knight moveTest = new Knight( "knight", ChessColor.WHITE, '♞' );
        testBoard.display();
        assertTrue(moveTest.canMove(moveUp));
    }


    @Test
    public void knightMoveRightUp(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,2, 1);

        Knight moveTest = new Knight( "knight", ChessColor.WHITE, '♞' );
        testBoard.display();
        assertTrue(moveTest.canMove(moveUp));
    }


    @Test
    public void knightMoveRightDown(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(3,3,5, 2);

        Knight moveTest = new Knight( "knight", ChessColor.WHITE, '♞' );
        testBoard.display();
        assertTrue(moveTest.canMove(moveUp));
    }


    @Test
    public void knightMoveDownRight(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(6,5,7, 3 );

        Knight moveTest = new Knight( "knight", ChessColor.WHITE, '♞' );
        testBoard.display();
        assertTrue(moveTest.canMove(moveUp));
    }


    @Test
    public void knightMoveDownLeft(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(4,5,3, 3);

        Knight moveTest = new Knight( "knight", ChessColor.WHITE, '♞' );
        testBoard.display();
        assertTrue(moveTest.canMove(moveUp));
    }


    @Test
    public void knightMoveLeftDown(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(2,2,0, 1);

        Knight moveTest = new Knight( "knight", ChessColor.WHITE, '♞' );
        testBoard.display();
        assertTrue(moveTest.canMove(moveUp));
    }


    @Test
    public void knightMoveLeftUp(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(2,2,0, 3);

        Knight moveTest = new Knight( "knight", ChessColor.WHITE, '♞' );
        testBoard.display();
        assertTrue(moveTest.canMove(moveUp));
    }


    @Test
    public void knightMoveUpLeft(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(6,2,5, 4);

        Knight moveTest = new Knight( "knight", ChessColor.WHITE, '♞' );
        testBoard.display();
        assertTrue(moveTest.canMove(moveUp));
    }
}
