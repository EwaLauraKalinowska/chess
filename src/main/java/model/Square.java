package model;

/**
 * Created by ewcia on 15.05.17.
 */
public class Square {
    private boolean isEmpty;
    private Chessman chessman;
    private int x;
    private int y;

    Square(int x, int y) {
        this.isEmpty = true;
        this.x=x;
        this.y=y;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Chessman getChessman() {
        return chessman;
    }

    public void setChessman(Chessman chessman) {
        this.chessman = chessman;
    }



    public char toString2(){

            return chessman.toString2();

    }
}
