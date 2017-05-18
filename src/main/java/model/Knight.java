package model;

import java.util.Collection;

/**
 * Created by ewcia on 18.05.17.
 */
public class Knight implements Figure {
    private Color color;
    private char name;

    public Knight( char name, Color color) {
        this.color = color;
        this.name = name;
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

    public Collection<? extends Move> allMoves(Chessboard chessboard, Field field) {
        return null;
    }
}
