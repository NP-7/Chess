package nathan.chess.web;

import nathan.chess.game.Board;
import nathan.chess.game.Piece;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    private Board board = new Board();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nextPlayer", board.getNextPlayer());
        model.addAttribute("board", getBoardAsStringMatrix());

        return "index"; // corresponds to templates/index.html
    }

    @PostMapping("/nextMovement")
    public String nextMovement(@RequestParam("nextMovement") String inputText, Model model) {
        String[] fromTo = inputText.split(" ");
        String error=null;
        try {
            board.move(fromTo[0], fromTo[1]);
        } catch(IllegalArgumentException ex) {
            error = ex.getMessage();
        }


        model.addAttribute("nextPlayer", board.getNextPlayer());
        model.addAttribute("error", error);
        model.addAttribute("board", getBoardAsStringMatrix());
        return "index";
    }

    private String[][] getBoardAsStringMatrix() {
        String[][] result = new String[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board.getPieceAt(row, col);
                result[row][col] = piece == null
                        ? ""
                        : piece.toString();
            }

        }
        return result;
    }
}
