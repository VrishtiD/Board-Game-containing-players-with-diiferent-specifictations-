import java.awt.*;

public class Board<T> {

    // making a piece 2d array of gameboard
    public Piece[][] gameBoard;

    public Board() {
        this.gameBoard = new Piece[8][8];
    }

    public void setGameBoard() {        // making 2d array of null
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                gameBoard[i][j] = null;   //  initializing array as null
                System.out.print(gameBoard[i][j]);
            }
            System.out.println("");
        }

    }

    /**
     * adds piece to game board
     * @param p piece to add
     * @param name of piece
     * @param color of piece
     * @param type  of piece
     */
    public void addPiece(Piece p, String name, String color, String type) {

        // if piece is slow
        if (gameBoard[p.getPosition().x][p.getPosition().y] == null && type.equals("S")) {

            SlowPiece newp = new SlowPiece(p.getName(), p.getColour(), p.getPosition());
            gameBoard[p.getPosition().x][p.getPosition().y] = newp;
        }
        // if piece is fast
        if (gameBoard[p.getPosition().x][p.getPosition().y] == null && type.equals("F")) {

            FastPiece newp = new FastPiece(p.getName(), p.getColour(), p.getPosition());
            gameBoard[p.getPosition().x][p.getPosition().y] = newp;
        }
        // if piece is slow flexible
        if (gameBoard[p.getPosition().x][p.getPosition().y] == null && type.equals("SF")) {

            SlowFlexible newp = new SlowFlexible(p.getName(), p.getColour(), p.getPosition());
            gameBoard[p.getPosition().x][p.getPosition().y] = newp;
        }
        // if piece is fast flexible
        if (gameBoard[p.getPosition().x][p.getPosition().y] == null && type.equals("FF")) {

            FastFlexible newp = new FastFlexible(p.getName(), p.getColour(), p.getPosition());
            gameBoard[p.getPosition().x][p.getPosition().y] = newp;
        }
    }


    /**
     * method to move the pieces
     * @param p position of piece
     * @param direction of piece to be moved
     * @param n number of spaces to move
     * @return
     */
    public void move(Point p, String direction, int n) {
        Piece pe = gameBoard[p.x][p.y];

        // checking if there is no piece at the given location
        if (pe == null) {
            System.out.println("Error: no piece at (" + pe.getPosition().x + "," + pe.getPosition().x+")");
        }

        // using else if to check about the type of piece and moving them accordingly
        else if (pe instanceof SlowPiece) {
            gameBoard[pe.getPosition().x][pe.getPosition().y] = null;
            ((SlowPiece) pe).move(direction);
            gameBoard[pe.getPosition().x][pe.getPosition().y] = pe;
            System.out.println("Piece at (" + pe.getPosition().x + "," + pe.getPosition().y + ") moved " + direction + " by 1 space");
        }
       else  if (pe instanceof SlowFlexible) {
            gameBoard[pe.getPosition().x][pe.getPosition().y] = null;
            ((SlowFlexible) pe).move(direction);
            gameBoard[pe.getPosition().x][pe.getPosition().y] = pe;
            System.out .println("Piece at (" + pe.getPosition().x + "," + pe.getPosition().y + ") moved " + direction + " by 1 space");
        }

        else if (pe instanceof FastPiece) {
            gameBoard[pe.getPosition().x][pe.getPosition().y] = null;
            ((FastPiece) pe).move(direction, n);
            gameBoard[pe.getPosition().x][pe.getPosition().y] = pe;
            System.out.println("Piece at (" + pe.getPosition().x + "," + pe.getPosition().y + ") moved " + direction + " by " + n + " spaces");
        }
       else if (pe instanceof FastFlexible) {
            gameBoard[pe.getPosition().x][pe.getPosition().y] = null;
            ((FastFlexible) pe).move(direction, n);
            gameBoard[pe.getPosition().x][pe.getPosition().y] = pe;
            System.out.println("Piece at (" + pe.getPosition().x + "," + pe.getPosition().y + ") moved " + direction + " by " + n + " spaces");
        }


    }


// displaying the board
    public void displayGameBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(gameBoard[i][j]==null){

                    System.out.print("\t-\t\t");
                }
              else{
                  System.out.print(gameBoard[i][j].toString()+"\t");
                }
            }
            System.out.println("");
        }
    }
}


