public abstract class Piece {

    public Piece(Color color) {
        this.color = color;
    }

    public enum Color {
        BLACK, WHITE
    }

    public Color color;

    abstract public int getValue();
}
