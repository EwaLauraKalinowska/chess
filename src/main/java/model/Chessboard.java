package model;

/**
 * Created by ewcia on 15.05.17.
 */
public class Chessboard {
    public Chessboard() {
        Figure nofigure = new Nofigure();
        for (int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                this.fields[i][j]= new Field();
                this.fields[i][j].setFigure(nofigure);
            }
        }

    }

    Field[][] fields= new Field[8][8];

    @Override
    public String toString(){
        int k;
        String chessboard="    A B C D E F G H"+"\n";
        for (int i=0; i<fields.length; i++){
            k=8-i;
            chessboard=chessboard+k+": ";
            for(int j=0; j<fields[i].length; j++) {
                chessboard = chessboard + fields[i][j].getFigure().toString();
            }
            chessboard=chessboard+" "+k+"\n";
        }

        chessboard=chessboard+"    A B C D E F G H \n";

        return chessboard;
    }

    public void spacingFigure() {




    }
}
