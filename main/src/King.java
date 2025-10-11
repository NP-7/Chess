public class King extends Piece {

    public King(Color color) {
        super(color);
    }

    @Override
    public int getValue() {
        return 9999;
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2654"
                : "\u265A";
    }
}
