import java.awt.*;

public  class Piece {
    // initializing the name,colour and position of Piece
    private String name;
    private String colour;
    public Point position;

    //constructor to initialize the object of Piece
    public Piece(String name, String colour, Point position) {
        this.name = name;
        this.colour = colour;
        this.position = position;
    }

    //getters and setters for the variables in Piece class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }





}
