package model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ewcia on 16.05.17.
 */
public class Color {
    String name;
    List<Field> listOfFields= new LinkedList<Field>();
    public Color(String name) {
        this.name = name;

    }

    public void add(Field field){
        listOfFields.add(field);
    }


}
