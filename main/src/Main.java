
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    int i = 5;


//    var x = new King(Piece.Color.BLACK);
//    System.out.println(x);


    var board = new Board();

    while(true) {
        IO.println(board);

        String from = IO.readln("Next move from: ");
        String to = IO.readln("Next move to: ");
        var movedPiece = board.move(from, to);
        System.out.println("You moved the following : " + movedPiece);
    }
}
