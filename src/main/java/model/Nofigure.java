package model;

/**
 * Created by ewcia on 16.05.17.
 */
public class Nofigure implements Figure {
    String name;
    public Nofigure() {
        name=" .";
    }
    public void setName(String name) {

    }



    @Override
    public String toString(){
        return name;
    }
}
