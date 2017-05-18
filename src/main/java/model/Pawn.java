package model;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ewcia on 18.05.17.
 */
public class Pawn implements Figure{
    Color color;
    private char name;

    public Pawn(char name, Color color) {
        this.color = color;
        this.name = name;
    }

    public String getNameOfColor() {
        return this.color.getName();
    }

    public Color getColor() {
        return color;
    }

    public char getName() {
        return name;
    }

    public char toString2() {
        return name;
    }

    public Collection<? extends Move> allMoves(Chessboard chessboard, Field field) {
        List<Move> moveList=new ArrayList<Move>();
        if(this.getName()==(char)9817){
            if(field.getX()==7){

            }else{
            if (field.getX()==1&&chessboard.fields[field.getX()+1][field.getY()].isEmpty()&&chessboard.fields[field.getX()+2][field.getY()].getFigure().getNameOfColor()!=this.getNameOfColor()){
                moveList.add(new Move(field, chessboard.fields[field.getX()+2][field.getY()], this));

            }
            if(chessboard.fields[field.getX()+1][field.getY()].getFigure().getNameOfColor()!=this.getNameOfColor()) {
                moveList.add(new Move(field, chessboard.fields[field.getX() + 1][field.getY()], this));
            }}
        }else{
            if(field.getX()==0){

            }else {
                if (field.getX() == 6 && chessboard.fields[field.getX() - 1][field.getY()].isEmpty() && chessboard.fields[field.getX() - 2][field.getY()].getFigure().getNameOfColor() != this.getNameOfColor()) {
                    moveList.add(new Move(field, chessboard.fields[field.getX() - 2][field.getY()], this));

                }
                if (chessboard.fields[field.getX() - 1][field.getY()].getFigure().getNameOfColor() != this.getNameOfColor()) {
                    moveList.add(new Move(field, chessboard.fields[field.getX() - 1][field.getY()], this));
                }
            }
        }

        return moveList;
    }
}
