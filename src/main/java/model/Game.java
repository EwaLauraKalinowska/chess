package model;

/**
 * Created by ewcia on 15.05.17.
 */
public class Game {
    public void play(Chessboard chessboard, Player player1, Player player2) {

        player1.setColor(new Color("white"));
        player2.setColor(new Color("black"));

        chessboard.spacingFigure(player1, player2);

        System.out.println( chessboard.toString());
    }
}
