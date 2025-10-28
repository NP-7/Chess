public class Bishop extends Piece{
    public Bishop(Color color) {
        super(color);
    }

    @Override
    public double getValue() {
        return 3.35;
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2657"
                : "\u265D";
    }
}
