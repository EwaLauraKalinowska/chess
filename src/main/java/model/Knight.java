package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ewcia on 18.05.17.
 */
public class Knight implements Figure {
    private Color color;
    private char name;

    public Knight( char name, Color color) {
        this.color = color;
        this.name = name;
    }

    public String getNameOfColor() {
        return color.getName();
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
        if(field.getX()-1>=0){
            if(field.getY()-2>=0){
               if(chessboard.getFields()[field.getX()-1][field.getY()-2].getFigure().getNameOfColor()!=this.getNameOfColor()){
                   moveList.add(new Move(field, chessboard.getFields()[field.getX()-1][field.getY()-2], this));
               }
            }
            if (field.getY()+2<8){
                if(chessboard.getFields()[field.getX()-1][field.getY()+2].getFigure().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(field, chessboard.getFields()[field.getX()-1][field.getY()+2], this));
                }
            }
        }
        if(field.getX()-2>=0){
            if(field.getY()-1>=0){
                if(chessboard.getFields()[field.getX()-2][field.getY()-1].getFigure().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(field, chessboard.getFields()[field.getX()-2][field.getY()-1], this));
                }

            }
            if (field.getY()+1<8){
                if(chessboard.getFields()[field.getX()-2][field.getY()+1].getFigure().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(field, chessboard.getFields()[field.getX()-2][field.getY()+1], this));
                }
            }
        }
        if(field.getX()+1<8){
            if(field.getY()-2>=0){
                if(chessboard.getFields()[field.getX()+1][field.getY()-2].getFigure().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(field, chessboard.getFields()[field.getX()+1][field.getY()-2], this));
                }
            }
            if (field.getY()+2<8){
                if(chessboard.getFields()[field.getX()+1][field.getY()+2].getFigure().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(field, chessboard.getFields()[field.getX()+1][field.getY()+2], this));
                }
            }
        }
        if(field.getX()+2<8){
            if(field.getY()-1>=0){
                if(chessboard.getFields()[field.getX()+2][field.getY()-1].getFigure().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(field, chessboard.getFields()[field.getX()+2][field.getY()-1], this));
                }

            }
            if (field.getY()+1<8){
                if(chessboard.getFields()[field.getX()+2][field.getY()+1].getFigure().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(field, chessboard.getFields()[field.getX()+2][field.getY()+1], this));
                }
            }
        }


        return moveList;
    }
}
