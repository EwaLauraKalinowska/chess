package model;

/**
 * Created by ewcia on 17.05.17.
 */
public class Move {
    Square initialSquare;
    Square finalSquare;
    Chessman chessman;

    public Move(Square initialSquare, Square finalSquare, Chessman chessman) {
        this.initialSquare = initialSquare;
        this.finalSquare = finalSquare;
        this.chessman = chessman;
    }
}
