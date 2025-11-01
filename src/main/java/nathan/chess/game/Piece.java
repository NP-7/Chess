package nathan.chess.game;

import java.util.List;

public abstract class Piece {

    public Piece(Color color) {
        this.color = color;
    }

    public enum Color {
        BLACK, WHITE
    }

    public Color color;

    abstract public double getValue();

    abstract public List<Position> getPossiblePositions(Position position);
}
