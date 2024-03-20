import java.util.Scanner;

public class Board {

    private static final int BOARD_SIZE = 8;
    private Tile[][] board;

    public Board(){

        this.board = new Tile[8][8];
    }


    public void display(){
        System.out.println("╔═══╦═══╦═══╦═══╦═══╦═══╦═══╦═══╗");
        System.out.printf("║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║\n", board[0][0], board[0][1], board[0][2], board[0][3], board[0][4], board[0][5], board[0][6], board[0][7]);
        System.out.println("╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.printf("║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║\n", board[1][0], board[1][1], board[1][2], board[1][3], board[1][4], board[1][5], board[1][6], board[1][7]);
        System.out.println("╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.printf("║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║\n", board[2][0], board[2][1], board[2][2], board[2][3], board[2][4], board[2][5], board[2][6], board[2][7]);
        System.out.println("╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.printf("║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║\n", board[3][0], board[3][1], board[3][2], board[3][3], board[3][4], board[3][5], board[3][6], board[3][7]);
        System.out.println("╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.printf("║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║\n", board[4][0], board[4][1], board[4][2], board[4][3], board[4][4], board[4][5], board[4][6], board[4][7]);
        System.out.println("╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.printf("║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║\n", board[5][0], board[5][1], board[5][2], board[5][3], board[5][4], board[5][5], board[5][6], board[5][7]);
        System.out.println("╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.printf("║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║\n", board[6][0], board[6][1], board[6][2], board[6][3], board[6][4], board[6][5], board[6][6], board[6][7]);
        System.out.println("╠═══╬═══╬═══╬═══╬═══╬═══╬═══╬═══╣");
        System.out.printf("║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║ %s ║\n", board[7][0], board[7][1], board[7][2], board[7][3], board[7][4], board[7][5], board[7][6], board[7][7]);
        System.out.println("╚═══╩═══╩═══╩═══╩═══╩═══╩═══╩═══╝");
    }



    public void newBoard(){
        this.board[0][0] = new Tile (new Rook("rookQ", ChessColor.BLACK));
        this.board[0][1] = new Tile (new Knight("knightQ", ChessColor.BLACK));
        this.board[0][2] = new Tile (new Bishop("bishopQ", ChessColor.BLACK));
        this.board[0][3] = new Tile (new Queen("queen", ChessColor.BLACK));
        this.board[0][4] = new Tile (new King("king", ChessColor.BLACK));
        this.board[0][5] = new Tile (new Bishop("bishopK", ChessColor.BLACK));
        this.board[0][6] = new Tile (new Knight("knightK", ChessColor.BLACK));
        this.board[0][7] = new Tile (new Rook("rookK", ChessColor.BLACK));

        this.board[1][0] = new Tile (new Pawn("pawnA", ChessColor.BLACK));
        this.board[1][1] = new Tile (new Pawn("pawnB", ChessColor.BLACK));
        this.board[1][2] = new Tile (new Pawn("pawnC", ChessColor.BLACK));
        this.board[1][3] = new Tile (new Pawn("pawnD", ChessColor.BLACK));
        this.board[1][4] = new Tile (new Pawn("pawnE", ChessColor.BLACK));
        this.board[1][5] = new Tile (new Pawn("pawnF", ChessColor.BLACK));
        this.board[1][6] = new Tile (new Pawn("pawnG", ChessColor.BLACK));
        this.board[1][7] = new Tile (new Pawn("pawnH", ChessColor.BLACK));


        this.board[7][0] = new Tile (new Rook("rookQ", ChessColor.WHITE));
        this.board[7][1] = new Tile (new Knight("knightQ", ChessColor.WHITE));
        this.board[7][2] = new Tile (new Bishop("bishopQ", ChessColor.WHITE));
        this.board[7][3] = new Tile (new Queen("queen", ChessColor.WHITE));
        this.board[7][4] = new Tile (new King("king", ChessColor.WHITE));
        this.board[7][5] = new Tile (new Bishop("bishopK", ChessColor.WHITE));
        this.board[7][6] = new Tile (new Knight("knightK", ChessColor.WHITE));
        this.board[7][7] = new Tile (new Rook("rookK", ChessColor.WHITE));

        this.board[7][0] = new Tile (new Pawn("pawnA", ChessColor.WHITE));
        this.board[7][1] = new Tile (new Pawn("pawnB", ChessColor.WHITE));
        this.board[7][2] = new Tile (new Pawn("pawnC", ChessColor.WHITE));
        this.board[7][3] = new Tile (new Pawn("pawnD", ChessColor.WHITE));
        this.board[7][4] = new Tile (new Pawn("pawnE", ChessColor.WHITE));
        this.board[7][5] = new Tile (new Pawn("pawnF", ChessColor.WHITE));
        this.board[7][6] = new Tile (new Pawn("pawnG", ChessColor.WHITE));
        this.board[7][7] = new Tile (new Pawn("pawnH", ChessColor.WHITE));
    }


    public Move getTurn() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to play your move?");
        number = scanner.nextInt();



        return null;
    }
}