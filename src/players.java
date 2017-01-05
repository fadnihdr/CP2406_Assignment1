public class players {
    private int playerCount;
    private int position;
    private int id;
    private boolean skipTurn = false;

    public players(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }

    public boolean getSkip() {
        return skipTurn;
    }

    public String toString() {
        return "position = " + position;

    }
}