public class King extends Piece {

    public King(Color color) {
        super(color);
    }

    @Override
    public int getValue() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2654"
                : "\u265A";
    }
}
