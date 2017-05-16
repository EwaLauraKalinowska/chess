import model.Chessboard;
import model.Game;
import model.Player;

/**
 * Created by ewcia on 15.05.17.
 */
public class Main {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        Chessboard chessboard= new Chessboard();


        Game game= new Game();
        game.play(chessboard, player1, player2);


    }
}
