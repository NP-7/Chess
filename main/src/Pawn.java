public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public double getValue() {
        return 1.05;
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2659"
                : "\u265F";
    }


}
