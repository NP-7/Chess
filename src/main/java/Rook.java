public class Rook extends Piece{
    public Rook(Color color) {
        super(color);
    }

    @Override
    public double getValue() {
        return 5.3;
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2656"
                : "\u265C";
    }
}
