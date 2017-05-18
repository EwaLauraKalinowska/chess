package model;

/**
 * Created by ewcia on 15.05.17.
 */
public class Chessboard {

    private Square[][] squares = new Square[8][8];

    public Chessboard() {
        Chessman nofigure = new Nofigure();
        for (int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                this.squares[i][j]= new Square(i, j);
                this.squares[i][j].setChessman(nofigure);
            }
        }

    }



    @Override
    public String toString(){
        int k;
        String chessboard="    A B C D E F G H"+"\n";
        for (int i = squares.length-1; i>=0; i--){
            k=i+1;
            chessboard=chessboard+k+": ";
            for(int j = 0; j< squares[i].length; j++) {

                    chessboard=chessboard+" ";

                chessboard = chessboard + squares[i][j].getChessman().toString2();
            }
            chessboard=chessboard+" "+k+"\n";
        }

        chessboard=chessboard+"    A B C D E F G H \n";

        return chessboard;
    }

    public void spacingFigure(Player player1, Player player2) {
        player1.getColor().add(squares[0][4]);
        squares[0][4].setChessman(new King((char)9812, player1.getColor()));
        squares[0][4].setEmpty(false);

        player1.getColor().add(squares[0][1]);
        player1.getColor().add(squares[0][6]);
        squares[0][1].setEmpty(false);
        squares[0][6].setEmpty(false);
        squares[0][1].setChessman(new Knight((char)9816, player1.getColor()));
        squares[0][6].setChessman(new Knight((char)9816, player1.getColor()));

        player1.getColor().add(squares[0][0]);
        player1.getColor().add(squares[0][7]);
        squares[0][0].setEmpty(false);
        squares[0][7].setEmpty(false);
        squares[0][0].setChessman(new Rook((char)9814, player1.getColor()));
        squares[0][7].setChessman(new Rook((char)9814, player1.getColor()));

        player1.getColor().add(squares[0][2]);
        player1.getColor().add(squares[0][5]);
        squares[0][2].setEmpty(false);
        squares[0][5].setEmpty(false);
        squares[0][2].setChessman(new Bishop((char)9815, player1.getColor()));
        squares[0][5].setChessman(new Bishop((char)9815, player1.getColor()));

        for(int i=0; i<8; i++){
            player1.getColor().add(squares[1][i]);
            squares[1][i].setEmpty(false);
            squares[1][i].setChessman(new Pawn((char) 9817, player1.getColor()));

            player2.getColor().add(squares[6][i]);
            squares[6][i].setEmpty(false);
            squares[6][i].setChessman(new Pawn((char) 9823 , player2.getColor()));
        }

        player2.getColor().add(squares[7][4]);
        squares[7][4].setChessman(new King((char)9818, player2.getColor()));
        squares[7][4].setEmpty(false);

        player2.getColor().add(squares[7][1]);
        player2.getColor().add(squares[7][6]);
        squares[7][1].setEmpty(false);
        squares[7][6].setEmpty(false);
        squares[7][1].setChessman(new Knight((char)9822, player2.getColor()));
        squares[7][6].setChessman(new Knight((char)9822, player2.getColor()));

        player2.getColor().add(squares[7][0]);
        player2.getColor().add(squares[7][7]);
        squares[7][0].setEmpty(false);
        squares[7][7].setEmpty(false);
        squares[7][0].setChessman(new Rook((char)9820, player2.getColor()));
        squares[7][7].setChessman(new Rook((char)9820, player2.getColor()));

        player2.getColor().add(squares[7][2]);
        player2.getColor().add(squares[7][5]);
        squares[7][2].setEmpty(false);
        squares[7][5].setEmpty(false);
        squares[7][2].setChessman(new Bishop((char)9821, player2.getColor()));
        squares[7][5].setChessman(new Bishop((char)9821, player2.getColor()));



    }

    public void doMove(Move move) {
        move.initialSquare.setEmpty(true);
        move.initialSquare.setChessman(new Nofigure());

        move.finalSquare.setEmpty(false);
        move.finalSquare.setChessman(move.chessman);
    }

    public Square[][] getSquares() {
        return squares;
    }
}
