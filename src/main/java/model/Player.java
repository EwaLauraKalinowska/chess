package model;

/**
 * Created by ewcia on 15.05.17.
 */
public class Player {


    private Color color;

    public Player() {

    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void move(Chessboard chessboard) {
        color.makeMove(chessboard);
    }

    public boolean dontHaveKing() {
      return   color.noKing();
    }
}
