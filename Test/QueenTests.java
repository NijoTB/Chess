import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class QueenTests {
    // Move up tests
    @Test
    public void queenMoveUp(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,0, 5);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveUp));
    }
    @Test
    public void queenMoveUp2(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(3,0,3, 7);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveUp));
    }



    // Move down tests
    @Test
    public void queenMoveDown(){
        Board testBoard = new Board(false);
        Move moveDown = new Move(4,6,4, 2);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveDown));
    }
    @Test
    public void queenMoveDown2(){
        Board testBoard = new Board(false);
        Move moveDown = new Move(2,7,2, 1);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveDown));
    }


    // Move left tests
    @Test
    public void queenMoveLeft(){
        Board testBoard = new Board(false);
        Move moveLeft = new Move(6,5,3, 5);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveLeft));
    }
    @Test
    public void queenMoveLeft2(){
        Board testBoard = new Board(false);
        Move moveLeft = new Move(4,7,3, 7);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveLeft));
    }


    // Move right tests
    @Test
    public void queenMoveRight(){
        Board testBoard = new Board(false);
        Move moveRight = new Move(0,0,5, 0);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveRight));
    }
    @Test
    public void queenMoveRight2(){
        Board testBoard = new Board(false);
        Move moveRight = new Move(1,1,3, 1);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveRight));
    }


    // bottom right tests
    @Test
    public void queenMoveBottomRight(){
        Board testBoard = new Board(false);
        Move moveBottomRight = new Move(0,0,5, 5);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveBottomRight));
    }
    @Test
    public void queenMoveBottomRight2(){
        Board testBoard = new Board(false);
        Move moveBottomRight = new Move(1,2,2, 3);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveBottomRight));
    }


    // bottom left tests
    @Test
    public void queenMoveBottomLeft(){
        Board testBoard = new Board(false);
        Move moveBottomLeft = new Move(7,0,0, 7);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveBottomLeft));
    }
    @Test
    public void queenMoveBottomLeft2(){
        Board testBoard = new Board(false);
        Move moveBottomLeft = new Move(7,5,5, 7);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveBottomLeft));
    }


    // top right tests
    @Test
    public void queenMoveTopRight(){
        Board testBoard = new Board(false);
        Move moveTopRight = new Move(6,6,1, 1);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveTopRight));
    }
    @Test
    public void queenMoveTopRight2(){
        Board testBoard = new Board(false);
        Move moveTopRight = new Move(3,6,6, 3);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveTopRight));
    }


    // top left tests
    @Test
    public void queenMoveTopLeft(){
        Board testBoard = new Board(false);
        Move moveTopLeft = new Move(6,6,0, 0);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveTopLeft));
    }
    @Test
    public void queenMoveTopLeft2(){
        Board testBoard = new Board(false);
        Move moveTopLeft = new Move(5,7,1, 3);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertTrue(moveTest.canMove(testBoard, moveTopLeft));
    }


    // cant go anywhere random
    @Test
    public void queenMoveSomewhereRandom(){
        Board testBoard = new Board(false);
        Move moveSomewhereRandom = new Move(7,7,3, 0);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertFalse(moveTest.canMove(testBoard, moveSomewhereRandom));
    }
    @Test
    public void queenMoveSomewhereRandom2(){
        Board testBoard = new Board(false);
        Move moveSomewhereRandom = new Move(0,0,7, 1);

        Queen moveTest = new Queen( "queen", ChessColor.WHITE, '♛' );

        assertFalse(moveTest.canMove(testBoard, moveSomewhereRandom));
    }
}
