import nathan.chess.game.Board;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import nathan.chess.game.Pawn;
import nathan.chess.game.Piece;
import nathan.chess.game.Position;


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    int i = 5;


//    var x = new nathan.chess.game.King(nathan.chess.game.Piece.Color.BLACK);
//    System.out.println(x);


    var pawn = new Pawn(Piece.Color.BLACK);
    //var position = new Position(4,4);
    var position =  Position.from("A2");
    List<Position> possiblePositions = pawn.getPossiblePositions(position);
    System.out.println(possiblePositions);


    var board = new Board();

    while (true) {
        IO.println(board);

        String from = IO.readln("Next move from: ");
        String to = IO.readln("Next move to: ");
        try {
            var movedPiece = board.move(from, to);
            System.out.println("You moved the following : " + movedPiece);
        } catch (IllegalArgumentException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
