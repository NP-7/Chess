public class Knight extends Piece{
    public Knight(Color color) {
        super(color);
    }

    @Override
    public double getValue() {
        return 3;
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2658"
                : "\u265E";
    }
}
