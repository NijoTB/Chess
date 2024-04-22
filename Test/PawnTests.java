import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PawnTests {
    @Test
    public void pawnMoveUp(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(4,1,4, 2);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertTrue(moveTest.canMove(testBoard, moveUp));
    }
    @Test
    public void pawnMoveUp2(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(2,1,2, 3);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertTrue(moveTest.canMove(testBoard, moveUp));
    }



    // can't go sideways tests
    @Test
    public void pawnMoveLeft(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(4,3,1, 3);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertFalse(moveTest.canMove(testBoard, moveUp));
    }
    @Test
    public void pawnMoveRight(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(3,2,6, 2);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertFalse(moveTest.canMove(testBoard, moveUp));
    }


    // can't go backwards tests
    @Test
    public void pawnMoveBack(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(5,3,5, 0);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertFalse(moveTest.canMove(testBoard, moveUp));
    }


    // can't go diagonal tests
    @Test
    public void pawnMoveTopLeft(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(7,0,0, 7);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertFalse(moveTest.canMove(testBoard, moveUp));
    }
    @Test
    public void pawnMoveTopRight(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,7, 7);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertFalse(moveTest.canMove(testBoard, moveUp));
    }
    @Test
    public void pawnMoveBottomLeft(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(7,7,0, 0);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertFalse(moveTest.canMove(testBoard, moveUp));
    }
    @Test
    public void pawnMoveBottomRight(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,7,7, 0);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertFalse(moveTest.canMove(testBoard, moveUp));
    }


    // can't go anywhere random tests
    @Test
    public void pawnMoveRandom(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(7,7,0, 1);

        Pawn moveTest = new Pawn( "pawn", ChessColor.BLACK, '♙' );
        testBoard.display();
        assertFalse(moveTest.canMove(testBoard, moveUp));
    }
}
