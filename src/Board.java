import java.util.ArrayList;
import java.util.Scanner;

public class Board {

    private static final int BOARD_SIZE = 8;
    public Tile[][] board;

    public Board() {
        this(true);

    }

    public Board(Tile[][] newBoard) {
        this.board = new Tile[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                this.board[row][col] = new Tile(newBoard[row][col].piece);
            }
        }
    }

    public Board(boolean fill) {
        this.board = new Tile[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                this.board[row][col] = new Tile();
            }
        }
        if (fill) {
            this.newBoard();
        }
    }


    public void display() {
        System.out.print("      A      B      C      D      E      F      G      H \n");
        System.out.print("  ╔════╦════╦════╦════╦════╦════╦════╦════╗\n");


        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 1 + " ");

            for (Tile tile : board[i]) {
                if (tile == null) {
                    System.out.print("║         ");
                } else {
                    System.out.printf("║    %s    ", tile);
                }
            }

            System.out.println("║");
            if (i == 7) {
                System.out.println("  ╚════╩════╩════╩════╩════╩════╩════╩════╝");
            } else {
                System.out.println("  ╠════╬════╬════╬════╬════╬════╬════╬════╣");
            }

        }

        //System.out.printf("1 ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║\n", row[0], row[0], row[0], row[0], row[0], row[0], row[0], row[0];

//            if (Piece != null) {
//
//            }
//        }

//        for (int row = 0; row < 8; row++){
//            for (int col = 0; col < 8; col++){
//                System.out.print(this.board[row][col]);
//            }
//            System.out.println();
//        }

//        System.out.print( "      A      B      C      D      E      F      G      H \n");
//        System.out.print( "  ╔════╦════╦════╦════╦════╦════╦════╦════╗\n");
//        System.out.printf("1 ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║\n", board[0][0], board[0][1], board[0][2], board[0][3], board[0][4], board[0][5], board[0][6], board[0][7]);
//        System.out.println("  ╠════╬════╬════╬════╬════╬════╬════╬════╣");
//        System.out.printf("2 ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║\n", board[1][0], board[1][1], board[1][2], board[1][3], board[1][4], board[1][5], board[1][6], board[1][7]);
//        System.out.println("  ╠════╬════╬════╬════╬════╬════╬════╬════╣");
//        System.out.printf("3 ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║\n", board[2][0], board[2][1], board[2][2], board[2][3], board[2][4], board[2][5], board[2][6], board[2][7]);
//        System.out.println("  ╠════╬════╬════╬════╬════╬════╬════╬════╣");
//        System.out.printf("4 ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║\n", board[3][0], board[3][1], board[3][2], board[3][3], board[3][4], board[3][5], board[3][6], board[3][7]);
//        System.out.println("  ╠════╬════╬════╬════╬════╬════╬════╬════╣");
//        System.out.printf("5 ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║\n", board[4][0], board[4][1], board[4][2], board[4][3], board[4][4], board[4][5], board[4][6], board[4][7]);
//        System.out.println("  ╠════╬════╬════╬════╬════╬════╬════╬════╣");
//        System.out.printf("6 ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║\n", board[5][0], board[5][1], board[5][2], board[5][3], board[5][4], board[5][5], board[5][6], board[5][7]);
//        System.out.println("  ╠════╬════╬════╬════╬════╬════╬════╬════╣");
//        System.out.printf("7 ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║\n", board[6][0], board[6][1], board[6][2], board[6][3], board[6][4], board[6][5], board[6][6], board[6][7]);
//        System.out.println("  ╠════╬════╬════╬════╬════╬════╬════╬════╣");
//        System.out.printf("8 ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║    %s    ║\n", board[7][0], board[7][1], board[7][2], board[7][3], board[7][4], board[7][5], board[7][6], board[7][7]);
//        System.out.println("  ╚════╩════╩════╩════╩════╩════╩════╩════╝");
    }


    public void newBoard() {
        this.board[7][0] = new Tile(new Rook("rookQ-Black", ChessColor.BLACK, '♖'));
        this.board[7][1] = new Tile(new Knight("knightQ-Black", ChessColor.BLACK, '♘'));
        this.board[7][2] = new Tile(new Bishop("bishopQ-Black", ChessColor.BLACK, '♗'));
        this.board[7][3] = new Tile(new Queen("queen-Black", ChessColor.BLACK, '♕'));
        this.board[7][4] = new Tile(new King("king-Black", ChessColor.BLACK, '♔'));
        this.board[7][5] = new Tile(new Bishop("bishopK-Black", ChessColor.BLACK, '♗'));
        this.board[7][6] = new Tile(new Knight("knightK-Black", ChessColor.BLACK, '♘'));
        this.board[7][7] = new Tile(new Rook("rookK-Black", ChessColor.BLACK, '♖'));

        this.board[6][0] = new Tile(new Pawn("pawnA-Black", ChessColor.BLACK, '♙'));
        this.board[6][1] = new Tile(new Pawn("pawnB-Black", ChessColor.BLACK, '♙'));
        this.board[6][2] = new Tile(new Pawn("pawnC-Black", ChessColor.BLACK, '♙'));
        this.board[6][3] = new Tile(new Pawn("pawnD-Black", ChessColor.BLACK, '♙'));
        this.board[6][4] = new Tile(new Pawn("pawnE-Black", ChessColor.BLACK, '♙'));
        this.board[6][5] = new Tile(new Pawn("pawnF-Black", ChessColor.BLACK, '♙'));
        this.board[6][6] = new Tile(new Pawn("pawnG-Black", ChessColor.BLACK, '♙'));
        this.board[6][7] = new Tile(new Pawn("pawnH-Black", ChessColor.BLACK, '♙'));


        this.board[0][0] = new Tile(new Rook("rookQ-White", ChessColor.WHITE, '♜'));
        this.board[0][1] = new Tile(new Knight("knight-White", ChessColor.WHITE, '♞'));
        this.board[0][2] = new Tile(new Bishop("bishopQ-White", ChessColor.WHITE, '♝'));
        this.board[0][3] = new Tile(new Queen("queen-White", ChessColor.WHITE, '♛'));
        this.board[0][4] = new Tile(new King("king-White", ChessColor.WHITE, '♚'));
        this.board[0][5] = new Tile(new Bishop("bishopK-White", ChessColor.WHITE, '♝'));
        this.board[0][6] = new Tile(new Knight("knightK-White", ChessColor.WHITE, '♞'));
        this.board[0][7] = new Tile(new Rook("rookK-White", ChessColor.WHITE, '♜'));

        this.board[1][0] = new Tile(new Pawn("pawnA-White", ChessColor.WHITE, '♟'));
        this.board[1][1] = new Tile(new Pawn("pawnB-White", ChessColor.WHITE, '♟'));
        this.board[1][2] = new Tile(new Pawn("pawnC-White", ChessColor.WHITE, '♟'));
        this.board[1][3] = new Tile(new Pawn("pawnD-White", ChessColor.WHITE, '♟'));
        this.board[1][4] = new Tile(new Pawn("pawnE-White", ChessColor.WHITE, '♟'));
        this.board[1][5] = new Tile(new Pawn("pawnF-White", ChessColor.WHITE, '♟'));
        this.board[1][6] = new Tile(new Pawn("pawnG-White", ChessColor.WHITE, '♟'));
        this.board[1][7] = new Tile(new Pawn("pawnH-White", ChessColor.WHITE, '♟'));

//        char kingSymbol = '\u2654';
    }





    public void addPiece(Piece piece, int x, int y) {
        this.board[y][x].piece = piece;
    }


    public void applyMove(Move move) {
        board[move.nextY][move.nextX].piece = board[move.currentY][move.currentX].piece;
        board[move.currentY][move.currentX].piece = null;
    }


    public boolean isKingInCheck(ChessColor kingColor) {
        int kingX = -1;
        int kingY = -1;

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Piece piece = this.board[y][x].piece;
                if (piece instanceof King && piece.color == kingColor) {
                    kingX = x;
                    kingY = y;
                }
            }
        }

        if (kingX == -1 && kingY == -1) {
            return false;
        }

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                Piece piece = this.board[y][x].piece;
                if (piece == null) {
                    continue;
                }
                if (piece.canMove(this, new Move(x, y, kingX, kingY))) {
                    return true;
                }
            }
        }
        return false;
    }

    // makes a clone board and does a move on it
    public Board virtualBoard(Move move) {
        Board newBoard = new Board(this.board);
        newBoard.applyMove(move);
        return newBoard;
    }


    public boolean checkmate(ChessColor color) {
        if (!isKingInCheck(color)) {
            return false;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece targetPiece = board[j][i].piece;
                if (targetPiece == null) {
                    continue;
                }
                if (color != targetPiece.color) {
                    continue;
                }

                ArrayList<Move> possibleMoves = targetPiece.getAllValidMoves(this, i, j);

                for (Move move : possibleMoves) {
                    Board boardClone = virtualBoard(move);
                    if (!boardClone.isKingInCheck(color)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}