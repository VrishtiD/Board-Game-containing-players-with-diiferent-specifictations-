import java.awt.*;
import java.util.Scanner;

public class GameDemo {

    public static void main(String[] args) {
        Board gameBoard = new Board(); //initializing the game board

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a command  (type help for details)");

        String cmnd = in.nextLine();
        while (!cmnd.equals("exit")) {    // using while loop to keep taking commands from user
            String[] getText = cmnd.split(" ");   // splitting string to array

            if (cmnd.equals("help")) {
                System.out.println("Possible commands are as follows:\n" +
                        "create location [fast][flexible]: Creates a new piece.\n" +
                        "move location direction [spaces]: Moves a piece.\n" +
                        "print: Displays the board.\n" +
                        "help: Displays help.\n" +
                        "exit: Exits the program.");
            }
            else if (cmnd.equals("print")) {   // prints the whole board

                gameBoard.displayGameBoard();
            }

            // using else if to create different kinds of type of pieces
            else if (getText[0].equals("create") && getText.length == 3) {
                int x = Integer.parseInt(getText[1]);
                int y = Integer.parseInt(getText[2]);

                System.out.println("Input a name for the new piece:");
                String name = in.nextLine();
                System.out.println("Input a colour for the new piece:");
                String color = in.nextLine();
                Point p = new Point(x,y);
                SlowPiece s = new SlowPiece(name, color, p);
                gameBoard.addPiece(s,name,color,"S");
            }
            else if(getText[0].equals("create") && getText.length == 4){
                int x = Integer.parseInt(getText[1]);
                int y = Integer.parseInt(getText[2]);
                String fastslow =getText[3];

                System.out.println("Input a name for the new piece:");
                String name = in.nextLine();
                System.out.println("Input a colour for the new piece:");
                String color = in.nextLine();
                Point p = new Point(x,y);
                if(fastslow.equals("slow")) {
                    SlowPiece s = new SlowPiece(name, color, p);
                    gameBoard.addPiece(s, name, color, "S");
                }
                else{
                    FastPiece s = new FastPiece(name, color, p);
                    gameBoard.addPiece(s, name, color, "F");
                }
            }
            else if(getText[0].equals("create") && getText.length == 5) {
                int x = Integer.parseInt(getText[1]);
                int y = Integer.parseInt(getText[2]);
                String fastslowFlex = getText[3];

                System.out.println("Input a name for the new piece:");
                String name = in.nextLine();
                System.out.println("Input a colour for the new piece:");
                String color = in.nextLine();
                Point p = new Point(x,y);
                if (fastslowFlex.equals("slow")) {
                    SlowFlexible s = new SlowFlexible(name, color, p);
                    gameBoard.addPiece(s, name, color, "SF");
                } else {
                    FastFlexible s = new FastFlexible(name, color, p);
                    gameBoard.addPiece(s, name, color, "FF");
                }
            }
            // using else if to move the piece in according to type and spaces
           else if(getText[0].equals("move") && getText.length == 4){
                int x = Integer.parseInt(getText[1]);
                int y = Integer.parseInt(getText[2]);
                String direction= getText[3];
                Point p= new Point(x,y);
                gameBoard.move(p,direction,1);


                }
           // specific case of flexible piece
            else if(getText[0].equals("move") && getText.length == 5){
                int x = Integer.parseInt(getText[1]);
                int y = Integer.parseInt(getText[2]);
                int place= Integer.parseInt(getText[4]);
                String direction= getText[3];

                Point p= new Point(x,y);
                gameBoard.move(p,direction,place);

            }
             System.out.println("Enter a command (type help for details):");
            cmnd = in.nextLine();

            }
        }
    }








