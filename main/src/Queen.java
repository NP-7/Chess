public class Queen extends Piece{
    public Queen(Color color) {
        super(color);
    }

    @Override
    public int getValue() {
        return 9;
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2655"
                : "\u265B";
    }
}
