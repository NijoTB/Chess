import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Player {

    public ChessColor playerColor;

    public static final Map<String, Integer> inputMap = Map.of("a", 0, "b", 1, "c", 2, "d", 3, "e", 4, "f", 5, "g", 6, "h", 7);

    Scanner scanner = new Scanner(System.in);


    public Player(ChessColor color) {
        playerColor = color;
    }

    public String getInput() {
        return scanner.nextLine();
    }


    public boolean validInput(Board board, String input) {
        if (input.length() != 5) {
            return false;
        }
        String startXStr = input.substring(0, 1);
        String startYStr = input.substring(1, 2);
        String endXStr = input.substring(3, 4);
        String endYStr = input.substring(4, 5);

        if (!inputMap.containsKey(startXStr) || !inputMap.containsKey(endXStr)) {
            return false;
        }
        int startY;
        int endY;

        try {
            startY = Integer.parseInt(startYStr);
            endY = Integer.parseInt(endYStr);
        } catch (NumberFormatException e) {
            return false;
        }
        if (startY < 1 || startY > 8) {
            return false;
        }
        if (endY < 1 || endY > 8) {
            return false;
        }

        Move validMove = getMove(input);

        Piece validMoveTest = board.board[validMove.currentY][validMove.currentX].piece;
        if (validMoveTest == null) {
            return false;
        }
        if (validMoveTest.color != this.playerColor) {
            return false;
        }
        return validMoveTest.canMove(board, validMove);
    }


    public Move getMove(String move) {
        String startXStr = move.substring(0, 1);
        String startYStr = move.substring(1, 2);
        String endXStr = move.substring(3, 4);
        String endYStr = move.substring(4, 5);

        int startX = inputMap.get(startXStr);
        int startY = Integer.parseInt(startYStr)- 1;
        int endX = inputMap.get(endXStr);
        int endY = Integer.parseInt(endYStr) - 1;

        return new Move(startX, startY, endX, endY);
    }


    public Move getTurn(Board board) {
        String playerMove = "";

        Scanner scanner = new Scanner(System.in);

        while (!validInput(board, playerMove)) {
            System.out.println("Type a move");
            playerMove = scanner.nextLine();
        }
        return getMove(playerMove);
    }
}
