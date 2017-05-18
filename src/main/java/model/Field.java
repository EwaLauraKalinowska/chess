package model;

/**
 * Created by ewcia on 15.05.17.
 */
public class Field {
    private boolean isEmpty;
    private Figure figure;
    private int x;
    private int y;

    Field(int x, int y) {
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

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }



    public char toString2(){

            return figure.toString2();

    }
}
