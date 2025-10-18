public class Board {

    private Piece[][] board = new Piece[8][8];
    private Piece.Color nextPlayer;

    public Board() {
        nextPlayer = Piece.Color.WHITE;

        board[0][0] = new Rook(Piece.Color.BLACK);
        board[0][1] = new Knight(Piece.Color.BLACK);
        board[0][2] = new Bishop(Piece.Color.BLACK);
        board[0][3] = new Queen(Piece.Color.BLACK);
        board[0][4] = new King(Piece.Color.BLACK);
        board[0][5] = new Bishop(Piece.Color.BLACK);
        board[0][6] = new Knight(Piece.Color.BLACK);
        board[0][7] = new Rook(Piece.Color.BLACK);

        board[7][0] = new Rook(Piece.Color.WHITE);
        board[7][1] = new Knight(Piece.Color.WHITE);
        board[7][2] = new Bishop(Piece.Color.WHITE);
        board[7][3] = new Queen(Piece.Color.WHITE);
        board[7][4] = new King(Piece.Color.WHITE);
        board[7][5] = new Bishop(Piece.Color.WHITE);
        board[7][6] = new Knight(Piece.Color.WHITE);
        board[7][7] = new Rook(Piece.Color.WHITE);
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(Piece.Color.BLACK);
            board[6][i] = new Pawn(Piece.Color.WHITE);
        }
    }

    // E2   C4
    public void move(String from, String to) {
        int fromCol =  from.charAt(0) - 'A';
        int fromRow = 8 -(from.charAt(1) - '0');

        int toCol =  to.charAt(0) - 'A';
        int toRow = 8 - (to.charAt(1) - '0');

        board[toRow][toCol] = board[fromRow][fromCol];
        board[fromRow][fromCol] = null;
    }

    @Override
    public String toString() {
        String result = "Next player : " + nextPlayer + "\n\n";

        for (int row = 0; row < 8; row++) {

            result = result + (8-row) + " ";

            for (int col = 0; col < 8; col++) {
                if (board[row][col] == null) {
                    result = result + ". ";
                } else {
                    result = result + board[row][col] + " ";
                }
            }
            result = result + "\n";


        }
        result = result + "  " + "A B C D E F G H\n";


        return result;
    }
}
