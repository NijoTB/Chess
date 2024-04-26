public class Move {
    public final int currentX;
    public final int currentY;
    public final int nextX;
    public final int nextY;


    public Move(int currentX, int currentY, int nextX, int nextY) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.nextX = nextX;
        this.nextY = nextY;
    }

    public String toString() {
        return "start: " + currentX + "|" + currentY + "  end: " + nextX + "|" + nextY;
    }
}
