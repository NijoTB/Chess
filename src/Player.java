import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Player {

    public static final Map<String, Integer> inputMap = Map.of("a", 0, "b", 1, "c", 2, "d", 3, "e", 4, "f", 5, "g", 5, "h", 6, "i", 7);

    Scanner scanner = new Scanner(System.in);


    public String getInput() {
        return scanner.nextLine();
    }


    public boolean validInput(String input) {
        if (input.length() != 5) {
            return false;
        }
        String startXStr = input.substring(0, 2);
        String startYStr = input.substring(3, 5);
        String endXStr = input.substring();
        String endYStr = input.substring();


    }


}
