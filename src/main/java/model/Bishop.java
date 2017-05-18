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

        int x=square.getX();
        int y=square.getY();
        while (x<7&&chessboard.getSquares()[x+1][y].isEmpty()){
            x++;
            if(chessboard.getSquares()[x][y].getChessman().getNameOfColor()!=square.getChessman().getNameOfColor()){
                moveList.add(new Move(square, chessboard.getSquares()[x][y], this));
            }
        }
        x=square.getX();
        y=square.getY();

        while (x>1&&chessboard.getSquares()[x-1][y].isEmpty()){
            x--;
            if(chessboard.getSquares()[x][y].getChessman().getNameOfColor()!=square.getChessman().getNameOfColor()){
                moveList.add(new Move(square, chessboard.getSquares()[x][y], this));
            }
        }

        x=square.getX();
        y=square.getY();
        while (y<7&&chessboard.getSquares()[x][y+1].isEmpty()){
            y++;
            if(chessboard.getSquares()[x][y].getChessman().getNameOfColor()!=square.getChessman().getNameOfColor()){
                moveList.add(new Move(square, chessboard.getSquares()[x][y], this));
            }
        }

        x=square.getX();
        y=square.getY();
        while (y>1&&chessboard.getSquares()[x][y-1].isEmpty()){
            y--;
            if(chessboard.getSquares()[x][y].getChessman().getNameOfColor()!=square.getChessman().getNameOfColor()){
                moveList.add(new Move(square, chessboard.getSquares()[x][y], this));
            }
        }



        return moveList;
    }
}
