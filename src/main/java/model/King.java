package model;

/**
 * Created by ewcia on 16.05.17.
 */
public class King implements Figure {
    char name;

    public King(char name) {
        this.name = name;
    }


    public char toString2() {
        return name;
    }

    public void setName(String name) {
    }

    public char getName() {
        return name;
    }
}
