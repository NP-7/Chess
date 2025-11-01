package nathan.chess.game;

import java.util.List;

public class Bishop extends Piece{
    public Bishop(Color color) {
        super(color);
    }

    @Override
    public double getValue() {
        return 3.35;
    }

    @Override
    public List<Position> getPossiblePositions(Position position) {
        return List.of();
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2657"
                : "\u265D";
    }
}
