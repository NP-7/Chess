public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public int getValue() {
        return 1;
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2659"
                : "\u265F";
    }


}
