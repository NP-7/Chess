public class Bishop extends Piece{
    public Bishop(Color color) {
        super(color);
    }

    @Override
    public int getValue() {
        return 3;
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2657"
                : "\u265D";
    }
}
