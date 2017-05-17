package model;

/**
 * Created by ewcia on 17.05.17.
 */
public class Move {
    Field initialField;
    Field finalField;
    Figure figure;

    public Move(Field initialField, Field finalField, Figure figure) {
        this.initialField = initialField;
        this.finalField = finalField;
        this.figure = figure;
    }
}
