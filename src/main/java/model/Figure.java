package model;

import java.util.Collection;

/**
 * Created by ewcia on 15.05.17.
 */
public interface Figure {


    public void setName(String name);



    public char getName();
    public char toString2();

    Collection<? extends Move> allMoves(Chessboard chessboard, Field field);
}
