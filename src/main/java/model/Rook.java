package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ewcia on 18.05.17.
 */
public class Rook implements Chessman {
    private Color color;
    private char name;

    public Rook(char name, Color color) {
        this.color=color;
        this.name=name;
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
        List <Move> moveList=new ArrayList<Move>();


        return moveList;
    }
}
