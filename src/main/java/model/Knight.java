package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ewcia on 18.05.17.
 */
public class Knight implements Chessman {
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

    public Collection<? extends Move> allMoves(Chessboard chessboard, Square square) {
        List<Move> moveList=new ArrayList<Move>();
        if(square.getX()-1>=0){
            if(square.getY()-2>=0){
               if(chessboard.getSquares()[square.getX()-1][square.getY()-2].getChessman().getNameOfColor()!=this.getNameOfColor()){
                   moveList.add(new Move(square, chessboard.getSquares()[square.getX()-1][square.getY()-2], this));
               }
            }
            if (square.getY()+2<8){
                if(chessboard.getSquares()[square.getX()-1][square.getY()+2].getChessman().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX()-1][square.getY()+2], this));
                }
            }
        }
        if(square.getX()-2>=0){
            if(square.getY()-1>=0){
                if(chessboard.getSquares()[square.getX()-2][square.getY()-1].getChessman().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX()-2][square.getY()-1], this));
                }

            }
            if (square.getY()+1<8){
                if(chessboard.getSquares()[square.getX()-2][square.getY()+1].getChessman().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX()-2][square.getY()+1], this));
                }
            }
        }
        if(square.getX()+1<8){
            if(square.getY()-2>=0){
                if(chessboard.getSquares()[square.getX()+1][square.getY()-2].getChessman().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX()+1][square.getY()-2], this));
                }
            }
            if (square.getY()+2<8){
                if(chessboard.getSquares()[square.getX()+1][square.getY()+2].getChessman().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX()+1][square.getY()+2], this));
                }
            }
        }
        if(square.getX()+2<8){
            if(square.getY()-1>=0){
                if(chessboard.getSquares()[square.getX()+2][square.getY()-1].getChessman().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX()+2][square.getY()-1], this));
                }

            }
            if (square.getY()+1<8){
                if(chessboard.getSquares()[square.getX()+2][square.getY()+1].getChessman().getNameOfColor()!=this.getNameOfColor()){
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX()+2][square.getY()+1], this));
                }
            }
        }


        return moveList;
    }
}
