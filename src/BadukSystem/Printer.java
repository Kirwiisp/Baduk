package BadukSystem;
import Goban.Stones.*;

public abstract class Printer {
    public static void print(Goban gobanToPrint){
        for(int i=gobanToPrint.getSize();i>0;i--){
            printGobanLine(gobanToPrint,i);
            System.out.println();
        }

    }

    private static void printGobanLine(Goban gobanToPrint, int lineToPrint){
        Stone[][] workingGrid = gobanToPrint.getGrid();
       int size = gobanToPrint.getSize();
        for(int i =0; i<size;i++ ){
            print(workingGrid[i][lineToPrint-1]);
        }
    }

    public static void print(Stone stoneToPrint){
        if(stoneToPrint ==null) {
            System.out.print("+ ");
        }
        else{
            char colorOfTheStone = stoneToPrint.getColor();
            System.out.print(colorOfTheStone + " ");
            }
        }

}
