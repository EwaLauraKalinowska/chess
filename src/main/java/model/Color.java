package model;

import java.util.*;

/**
 * Created by ewcia on 16.05.17.
 */
public class Color {
    private String name;
    boolean hawKing;
    private List<Field> listOfFields= new LinkedList<Field>();
    public Color(String name) {
        this.name = name;

    }

    public void add(Field field){
        listOfFields.add(field);
    }

    public String getName() {
        return name;
    }

    public List<Field> getListOfFields() {
        return listOfFields;
    }
    public void makeMove(Chessboard chessboard){
        List <Move>listOfMoves= new ArrayList<Move>();
        for (Field field: listOfFields) {
            if(field.getFigure().allMoves(chessboard, field)==null){

            }else {
                listOfMoves.addAll(field.getFigure().allMoves(chessboard, field));
            }
        }
        Random random=new Random();
       Move move= listOfMoves.get(random.nextInt(listOfMoves.size()));
       listOfFields.add(move.finalField);
       listOfFields.remove(move.initialField);
       if(!move.finalField.isEmpty()){
           move.finalField.getFigure().getColor().listOfFields.remove(move.finalField);
       }


       chessboard.doMove(move);
    }

    public boolean noKing() {
        boolean isKing=false;
        for (Field field: listOfFields ) {
            if(field.getFigure().getName()==((char)9812)||field.getFigure().getName()==(char)9818){
                isKing=true;
            }
        }
        return isKing;

    }
}
