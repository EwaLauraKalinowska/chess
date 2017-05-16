import model.Chessboard;
import model.Game;
import model.Player;

/**
 * Created by ewcia on 15.05.17.
 */
public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("white");
        Player player2 = new Player("black");

        Chessboard chessboard= new Chessboard();
        chessboard.spacingFigure();

        Game game= new Game();
        game.play(chessboard, player1, player2);


    }
}
