package nathan.chess.game;

import java.util.List;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public double getValue() {
        return 1.05;
    }

    @Override
    public List<Position> getPossiblePositions(Position position) {
        Position next = this.color == Color.WHITE
                ? position.moveUp()
                : position.moveDown();

        return List.of(next);
    }

    @Override
    public String toString() {
        return color == Color.BLACK
                ? "\u2659"
                : "\u265F";
    }


}
