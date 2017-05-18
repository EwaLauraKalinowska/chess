package model;

import java.util.Collection;

/**
 * Created by ewcia on 18.05.17.
 */
public class Pawn implements Figure{
    Color color;
    private char name;

    public Pawn(char name, Color color) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return this.color.getName();
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
