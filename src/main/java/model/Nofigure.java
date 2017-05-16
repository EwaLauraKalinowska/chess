package model;

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

    public char getName() {
        return name;
    }


    public char toString2(){
        return name;
    }
}
