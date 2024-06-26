import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class KingTests {
    @Test
    public void kingMoveUp(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,0, 1);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );
        testBoard.display();
        assertTrue(moveTest.canMove(testBoard, moveUp));
    }


    @Test
    public void kingMoveDown(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,2,0, 1);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );

        assertTrue(moveTest.canMove(testBoard, moveUp));
    }


    @Test
    public void kingMoveLeft(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(5,5,4, 5);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );

        assertTrue(moveTest.canMove(testBoard, moveUp));
    }


    @Test
    public void kingMoveRight(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,1, 0);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );

        assertTrue(moveTest.canMove(testBoard, moveUp));
    }


    @Test
    public void kingMoveTopLeft(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(5,3,4, 2);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );

        assertTrue(moveTest.canMove(testBoard, moveUp));
    }


    @Test
    public void kingMoveTopRight(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,7,1, 6);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );

        assertTrue(moveTest.canMove(testBoard, moveUp));
    }


    @Test
    public void kingMoveBottomLeft(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(7,0,6, 1);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );

        assertTrue(moveTest.canMove(testBoard, moveUp));
    }


    @Test
    public void kingMoveBottomRight(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,1, 1);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );

        assertTrue(moveTest.canMove(testBoard, moveUp));
    }


    // ensures that the king cannot go mare than one space at a time
    @Test
    public void kingRandomSpot(){
        Board testBoard = new Board(false);
        Move moveUp = new Move(0,0,2, 2);

        King moveTest = new King( "king", ChessColor.BLACK, '♔' );

        assertFalse(moveTest.canMove(testBoard, moveUp));
    }


    // can capture opposite colored piece
    @Test
    public void capturePiece(){
        Board testBoard = new Board(false);
        Move capturePiece = new Move(0,0,1, 1);


        King capturing = new King( "king", ChessColor.WHITE, '♚' );
        King captured = new King("king", ChessColor.BLACK, '♔' );
        testBoard.addPiece(captured,1, 1);

        assertTrue(capturing.canMove(testBoard, capturePiece));
    }


    // can't capture same colored piece
    @Test
    public void capturePieceFriendlyFire(){
        Board testBoard = new Board(false);
        Move capturePiece = new Move(0,0,1, 1);


        King capturing = new King( "king", ChessColor.WHITE, '♚' );
        King captured = new King( "king", ChessColor.WHITE, '♚' );
        testBoard.addPiece(captured,1, 1);

        assertFalse(capturing.canMove(testBoard, capturePiece));
    }
}
