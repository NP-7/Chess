package nathan.chess.game;

public class Position {

    int row;
    int col;

    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }

    public static Position from(String text) {
        text = text.toUpperCase();

        int col = text.charAt(0) - 'A';
        int row = 8 - (text.charAt(1) - '0');
        return new Position(row, col);
    }

    public Position moveUp() {
        return new Position(row - 1, col);
    }

    public Position moveDown() {
        return new Position(row + 1, col);
    }

    @Override
    public String toString() {
        return Character.toString('A' + col) + (8-row);
    }
}
