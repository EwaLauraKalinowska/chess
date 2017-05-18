package model;

import java.util.Collection;

/**
 * Created by ewcia on 15.05.17.
 */
public interface Chessman {


    public String getNameOfColor();

    public Color getColor();


    public char getName();
    public char toString2();

    Collection<? extends Move> allMoves(Chessboard chessboard, Square square);
}
