public class Move {
    public final int currentX;
    public final int currentY;
    public final int nextX;
    public final int nextY;


    public Move(int currentX, int currentY, int nextX, int nextY) {
//        if (!(pos >= 1 && pos <= 9)) {
//            throw new IllegalArgumentException("Invalid Position: Must be 1-9");
//        }
        this.currentX = currentX;
        this.currentY = currentY;
        this.nextX = nextX;
        this.nextY = nextY;
    }
}
