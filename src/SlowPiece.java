import java.awt.*;
// SlowPiece class extends Piece class
public class SlowPiece extends Piece {
    // constructor to initialize slowpiece object
    public SlowPiece(String name, String colour, Point position) {
        super(name, colour, position);    // provides attributes to parent class constructor
    }

    /**
     * method to make the slow piece move left or right by one position
     */
    public void move(String direction) {

        if(direction.equals("left") && !(getPosition().getX()-1<0)){
            this.position.y-=1;  // to make it move n step in left subtracting n from x-coordinate

        }
        else if(direction.equals("right") && !(getPosition().getX()+1>7)){
            this.position.y+=1;   // to make it move n step in right adding n to x-coordinate
        }
        else{
            this.position.x=this.position.x;
        }

    }


// to print the slowpiece attributes
        public String toString () {
            return getName() + getColour() + "S";
        }
}


