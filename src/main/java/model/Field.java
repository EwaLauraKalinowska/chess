package model;

/**
 * Created by ewcia on 15.05.17.
 */
public class Field {
    private boolean isEmpty;
    private Figure figure;

    Field() {
        this.isEmpty = true;

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
