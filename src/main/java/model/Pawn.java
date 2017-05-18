package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ewcia on 18.05.17.
 */
public class Pawn implements Chessman {
    private Color color;
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

    public Collection<? extends Move> allMoves(Chessboard chessboard, Square square) {
        List<Move> moveList=new ArrayList<Move>();
        if(this.getName()==(char)9817){
            if(square.getX()==7){

            }else{
            if (square.getX()==1&&chessboard.getSquares()[square.getX()+1][square.getY()].isEmpty()&&chessboard.getSquares()[square.getX()+2][square.getY()].getChessman().getNameOfColor()!=this.getNameOfColor()){
                moveList.add(new Move(square, chessboard.getSquares()[square.getX()+2][square.getY()], this));

            }
            if(chessboard.getSquares()[square.getX()+1][square.getY()].getChessman().getNameOfColor()!=this.getNameOfColor()) {
                moveList.add(new Move(square, chessboard.getSquares()[square.getX() + 1][square.getY()], this));
            }}
        }else{
            if(square.getX()==0){

            }else {
                if (square.getX() == 6 && chessboard.getSquares()[square.getX() - 1][square.getY()].isEmpty() && chessboard.getSquares()[square.getX() - 2][square.getY()].getChessman().getNameOfColor() != this.getNameOfColor()) {
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX() - 2][square.getY()], this));

                }
                if (chessboard.getSquares()[square.getX() - 1][square.getY()].getChessman().getNameOfColor() != this.getNameOfColor()) {
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX() - 1][square.getY()], this));
                }
            }
        }

        return moveList;
    }
}
