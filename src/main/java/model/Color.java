package model;

import java.util.*;

/**
 * Created by ewcia on 16.05.17.
 */
public class Color {
    private String name;
    boolean hawKing;
    private List<Square> listOfSquares = new LinkedList<Square>();

    public Color(String name) {
        this.name = name;

    }

    public void add(Square square){
        listOfSquares.add(square);
    }

    public String getName() {
        return name;
    }

    public List<Square> getListOfSquares() {
        return listOfSquares;
    }
    public void makeMove(Chessboard chessboard){
        List <Move>listOfMoves= new ArrayList<Move>();
        for (Square square : listOfSquares) {
            if(square.getChessman().allMoves(chessboard, square)==null){

            }else {
                listOfMoves.addAll(square.getChessman().allMoves(chessboard, square));
            }
        }
        Random random=new Random();
       Move move= listOfMoves.get(random.nextInt(listOfMoves.size()));
       listOfSquares.add(move.finalSquare);
       listOfSquares.remove(move.initialSquare);
       if(!move.finalSquare.isEmpty()){
           move.finalSquare.getChessman().getColor().listOfSquares.remove(move.finalSquare);
       }


       chessboard.doMove(move);
    }

    public boolean noKing() {
        boolean isKing=false;
        for (Square square : listOfSquares) {
            if(square.getChessman().getName()==((char)9812)|| square.getChessman().getName()==(char)9818){
                isKing=true;
            }
        }
        return isKing;

    }
}
