import java.awt.*;
// Slowflexible class extends FastPiece class
public class FastFlexible extends FastPiece {

    // constructor to initialize FastFlexible object
    public FastFlexible(String name, String colour, Point position) {
        super(name, colour, position);      // provides attributes to parent class constructor
    }


    /**
     * method to make the fastFlexible move left,right,up or down by the steps specified by user
     * @param direction to make the piece move in any direction
     * @param n number of steps to move
     */
    public void move(String direction,int n) {
        super.move(direction,n);   // first access the move method of parent class

        if(direction.equals("down") && !(getPosition().getY()-n<0)){
            this.position.x+=n;    // to make it move n step down subtracting n from y-coordinate
        }
        else if(direction.equals("up") && !(getPosition().getY()+n>7)){
            this.position.x-=n;    // to make it move n step up adding n to y-coordinate
        }
    }
    // to print the fastflexible attributes
    public String toString() {
        return getName()+getColour()+"FF";
    }
}


