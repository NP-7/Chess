package nathan.chess.game;

import java.util.List;

public class Queen extends Piece{
    public Queen(Color color) {
        super(color);
    }

    @Override
    public double getValue() {
        return 9.5;
    }

    @Override
    public List<Position> getPossiblePositions(Position position) {
        return List.of();
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2655"
                : "\u265B";
    }
}
