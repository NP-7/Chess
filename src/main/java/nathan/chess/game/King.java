package nathan.chess.game;

import java.util.List;

public class King extends Piece {

    public King(Color color) {
        super(color);
    }

    @Override
    public double getValue() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public List<Position> getPossiblePositions(Position position) {
        return List.of();
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2654"
                : "\u265A";
    }
}
