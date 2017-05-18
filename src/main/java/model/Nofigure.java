package model;

import java.util.Collection;

/**
 * Created by ewcia on 16.05.17.
 */
public class Nofigure implements Figure {
    char name;
    public Nofigure() {
        name='.';
    }
    public void setName(String name) {

    }

    public String getNameOfColor() {
        return null;
    }

    public Color getColor() {
        return null;
    }

    public char getName() {
        return name;
    }


    public char toString2(){
        return name;
    }

    public Collection<? extends Move> allMoves(Chessboard chessboard, Field field) {
        return null;
    }
}
