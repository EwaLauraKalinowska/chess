package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ewcia on 18.05.17.
 */
public class Bishop implements Chessman {

    private Color color;
    private char name;


    public String getNameOfColor() {
        return color.getName();
    }

    public Bishop(char name, Color color) {
        this.name=name;
        this.color=color;
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

        int x=square.getX()+1;
        int y=square.getY()+1;
        while (x<8&&y<8&&chessboard.getSquares()[x][y].isEmpty()){

            moveList.add(new Move(square, chessboard.getSquares()[x][y], this));

            x++;
            y++;
        }
        if(x<8&&y<8){

            if(chessboard.getSquares()[x][y].getChessman().getNameOfColor()!=square.getChessman().getNameOfColor()){
                moveList.add(new Move(square, chessboard.getSquares()[x][y], this));
            }}

        x=square.getX()+1;
        y=square.getY()-1;

        while (x<8&&y>=0&&chessboard.getSquares()[x][y].isEmpty()){


            moveList.add(new Move(square, chessboard.getSquares()[x][y], this));


            x++;
            y--;
        }

        if(x<8&&y>=0){

            if(chessboard.getSquares()[x][y].getChessman().getNameOfColor()!=square.getChessman().getNameOfColor()){
                moveList.add(new Move(square, chessboard.getSquares()[x][y], this));
            }}

        x=square.getX()-1;
        y=square.getY()+1;
        while (y<8&&x>=0&&chessboard.getSquares()[x][y].isEmpty()){

            moveList.add(new Move(square, chessboard.getSquares()[x][y], this));

            x--;
            y++;
        }

        if (y<8&&x>=0){

            if(chessboard.getSquares()[x][y].getChessman().getNameOfColor()!=square.getChessman().getNameOfColor()){
                moveList.add(new Move(square, chessboard.getSquares()[x][y], this));
            }}
        x=square.getX()-1;
        y=square.getY()-1;
        while (y>=0&&x>=0&&chessboard.getSquares()[x][y].isEmpty()){


            moveList.add(new Move(square, chessboard.getSquares()[x][y], this));

            x--;
            y--;
        }
        if (y>=0&&x>=0){


                moveList.add(new Move(square, chessboard.getSquares()[x][y], this));
            }


        return moveList;
    }
}
