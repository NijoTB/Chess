import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BishopTests {


// bottom right tests
    @Test
    public void bishopMoveBottomRight(){
        Board testBoard = new Board(false);
        Move moveBottomRight = new Move(0,0,5, 5);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertTrue(moveTest.canMove(testBoard, moveBottomRight));
    }
    @Test
    public void bishopMoveBottomRight2(){
        Board testBoard = new Board(false);
        Move moveBottomRight = new Move(1,2,2, 3);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertTrue(moveTest.canMove(testBoard, moveBottomRight));
    }


    // bottom left tests
    @Test
    public void bishopMoveBottomLeft(){
        Board testBoard = new Board(false);
        Move moveBottomLeft = new Move(7,0,0, 7);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertTrue(moveTest.canMove(testBoard, moveBottomLeft));
    }
    @Test
    public void bishopMoveBottomLeft2(){
        Board testBoard = new Board(false);
        Move moveBottomLeft = new Move(7,5,5, 7);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertTrue(moveTest.canMove(testBoard, moveBottomLeft));
    }


    // top right tests
    @Test
    public void bishopMoveTopRight(){
        Board testBoard = new Board(false);
        Move moveTopRight = new Move(6,6,1, 1);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertTrue(moveTest.canMove(testBoard, moveTopRight));
    }
    @Test
    public void bishopMoveTopRight2(){
        Board testBoard = new Board(false);
        Move moveTopRight = new Move(3,6,6, 3);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertTrue(moveTest.canMove(testBoard, moveTopRight));
    }


    // top left tests
    @Test
    public void bishopMoveTopLeft(){
        Board testBoard = new Board(false);
        Move moveTopLeft = new Move(6,6,0, 0);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertTrue(moveTest.canMove(testBoard, moveTopLeft));
    }
    @Test
    public void bishopMoveTopLeft2(){
        Board testBoard = new Board(false);
        Move moveTopLeft = new Move(5,7,1, 3);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertTrue(moveTest.canMove(testBoard, moveTopLeft));
    }


    // cant go anywhere random
    @Test
    public void bishopMoveSomewhereRandom(){
        Board testBoard = new Board(false);
        Move moveSomewhereRandom = new Move(7,7,7, 0);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertFalse(moveTest.canMove(testBoard, moveSomewhereRandom));
    }
    @Test
    public void bishopMoveSomewhereRandom2(){
        Board testBoard = new Board(false);
        Move moveSomewhereRandom = new Move(0,0,7, 0);

        Bishop moveTest = new Bishop( "bishop", ChessColor.WHITE, '♝' );

        assertFalse(moveTest.canMove(testBoard, moveSomewhereRandom));
    }
}

