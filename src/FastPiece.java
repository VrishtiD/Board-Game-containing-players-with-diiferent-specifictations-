import java.awt.*;
// FastPiece class extends Piece class
public class FastPiece extends Piece{
    // constructor to initialize slowpiece object
    public FastPiece(String name, String colour, Point position) {
        super(name, colour, position);      // provides attributes to parent class constructor
    }

    /**
     * method to make the fastpiece move left or right by the steps specified by user
     * @param direction to make the piece move
     * @param n number of steps to move
     */
    public void move(String direction, int n){
        if(direction.equals("left") && !(getPosition().getX()-n<0)){
            this.position.y-=n ;  // to make it move n step in left subtracting n from x-coordinate
        }
        else if(direction.equals("right") && !(getPosition().getX()+n>7)){
            this.position.y+=n;   // to make it move n step in right adding n to x-coordinate
        }
        else{
            this.position.x=this.position.x;
        }

    }



// to print the fastpiece attributes
    public String toString() {

        return getName()+getColour()+"F";
    }
}

