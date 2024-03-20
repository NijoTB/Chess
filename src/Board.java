import java.util.Scanner;

public class Board {

    private static final int BOARD_SIZE = 8;
    private static final String EMPTY_SQUARE = "-";
    private static Piece[][] board;


    public Move getTurn() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where would you like to play your move?");
        number = scanner.nextInt();



        return null;
    }
}