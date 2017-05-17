package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ewcia on 16.05.17.
 */
public class King implements Figure {
    char name;
    Color color;

    public King(char name, Color color) {
        this.name = name;
        this.color=color;
    }


    public char toString2() {
        return name;
    }

    public List<Move> allMoves(Chessboard chessboard, Field field) {
        List<Move> moveList=new ArrayList<Move>();
        if(field.getX()-1>-1){
            moveList.add(new Move(field, chessboard.fields[field.getX()-1][field.getY()], this));
            if(field.getY()-1>-1){
                moveList.add(new Move(field, chessboard.fields[field.getX()-1][field.getY()-1], this));
            }
            if(field.getY()+1<8){
                moveList.add(new Move(field,chessboard.fields[field.getX()-1][field.getY()+1], this));
            }

        }
        if(field.getY()-1>-1){
            moveList.add(new Move(field, chessboard.fields[field.getX()][field.getY()-1], this));
        }
        if(field.getY()+1<8){
            moveList.add(new Move(field,chessboard.fields[field.getX()][field.getY()+1], this));
        }
        if(field.getX()+1<8){
            moveList.add(new Move(field, chessboard.fields[field.getX()+1][field.getY()], this));
            if(field.getY()-1>-1){
                moveList.add(new Move(field, chessboard.fields[field.getX()+1][field.getY()-1], this));
           }
           if(field.getY()+1<8){
                moveList.add(new Move(field,chessboard.fields[field.getX()+1][field.getY()+1], this));
            }

        }
        return moveList;
    }

    public void setName(String name) {
    }

    public char getName() {
        return name;
    }
}
