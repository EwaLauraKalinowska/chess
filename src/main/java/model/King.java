package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ewcia on 16.05.17.
 */
public class King implements Chessman {
    private char name;
    private Color color;

    public King(char name, Color color) {
        this.name = name;
        this.color=color;
    }


    public char toString2() {
        return name;
    }

    public List<Move> allMoves(Chessboard chessboard, Square square) {
        List<Move> moveList=new ArrayList<Move>();
        if(square.getX()-1>-1){
            if(chessboard.getSquares()[square.getX()-1][square.getY()].getChessman().getNameOfColor()!=this.getNameOfColor()||chessboard.getSquares()[square.getX()-1][square.getY()].getChessman().getColor()==null) {
                moveList.add(new Move(square, chessboard.getSquares()[square.getX() - 1][square.getY()], this));
            }
            if(square.getY()-1>-1){
                if(chessboard.getSquares()[square.getX()-1][square.getY()-1].getChessman().getNameOfColor()!=this.getNameOfColor()||chessboard.getSquares()[square.getX()-1][square.getY()-1].getChessman().getColor()==null) {
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX() - 1][square.getY() - 1], this));
                }
            }
            if(square.getY()+1<8){
                if(chessboard.getSquares()[square.getX()-1][square.getY()+1].getChessman().getNameOfColor()!=this.getNameOfColor()||chessboard.getSquares()[square.getX()-1][square.getY()+1].getChessman().getColor()==null) {
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX() - 1][square.getY() + 1], this));
                }
            }

        }
        if(square.getY()-1>-1){
            if(chessboard.getSquares()[square.getX()][square.getY()-1].getChessman().getNameOfColor()!=this.getNameOfColor()||chessboard.getSquares()[square.getX()][square.getY()-1].getChessman().getColor()==null) {
                moveList.add(new Move(square, chessboard.getSquares()[square.getX()][square.getY() - 1], this));
            }
        }
        if(square.getY()+1<8){
            if(chessboard.getSquares()[square.getX()][square.getY()+1].getChessman().getNameOfColor()!=this.getNameOfColor()||chessboard.getSquares()[square.getX()][square.getY()+1].getChessman().getColor()==null) {
                moveList.add(new Move(square, chessboard.getSquares()[square.getX()][square.getY() + 1], this));
            }
        }
        if(square.getX()+1<8){

                if(chessboard.getSquares()[square.getX()+1][square.getY()].getChessman().getNameOfColor()!=this.getNameOfColor()||chessboard.getSquares()[square.getX()+1][square.getY()].getChessman().getColor()==null) {
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX() + 1][square.getY()], this));
            }
            if(square.getY()-1>-1){

                if(chessboard.getSquares()[square.getX()+1][square.getY()-1].getChessman().getNameOfColor()!=this.getNameOfColor()||chessboard.getSquares()[square.getX()+1][square.getY()-1].getChessman().getColor()==null){
                    moveList.add(new Move(square, chessboard.getSquares()[square.getX()+1][square.getY()-1], this));}
           }
           if(square.getY()+1<8){

                if(chessboard.getSquares()[square.getX()+1][square.getY()+1].getChessman().getNameOfColor()!=this.getNameOfColor()||chessboard.getSquares()[square.getX()+1][square.getY()+1].getChessman().getColor()==null){
                    moveList.add(new Move(square,chessboard.getSquares()[square.getX()+1][square.getY()+1], this));}
            }

        }
        return moveList;
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
}
