package model;

import java.util.Collection;

/**
 * Created by ewcia on 18.05.17.
 */
public class Queen implements Chessman {
    private Color color;
    private char name;

    public Queen(char name, Color color) {
        this.name=name;
        this.color=color;
    }

    public String getNameOfColor() {
        return color.getName();
    }

    public Color getColor() {
        return color;
    }

    public char getName() {
        return name;
    }

    public char toString2() {
        return name;
    }

    public Collection<? extends Move> allMoves(Chessboard chessboard, Square square) {
        return null;
    }
}
