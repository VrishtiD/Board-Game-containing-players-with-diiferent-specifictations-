import java.awt.*;
// Slowflexible class extends SlowPiece class
public class SlowFlexible extends SlowPiece {

    // constructor to initialize slowFlexible object
    public SlowFlexible(String name, String colour, Point position) {
        super(name, colour, position);      // provides attributes to parent class constructor
    }

    @Override
    /**
     * method to make the slow piece move left or right by one position
     */
    public void move(String direction) {
        super.move(direction);    // first access the move method of parent class

        if (direction.equals("down") && getPosition().getY() != 0) {
            this.position.x = this.position.x+ 1;   // to make it move one step down subtracting i from y-coordinate
        } else if (direction.equals("up") && getPosition().getY() != 7) {
            this.position.x =this.position.x-1;   // to make it move one step up adding 1 to y-coordinate
        }
    }

    // to print the slowflexible attributes
    public String toString() {
        return getName() + getColour() + "SF";
    }
}