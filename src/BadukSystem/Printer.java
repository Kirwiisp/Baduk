package BadukSystem;
import Goban.Stones.*;

public abstract class Printer {
    public static void print(Goban gobanToPrint){
        for(int i=gobanToPrint.getSize();i>0;i--){
            print(gobanToPrint,i);
            System.out.println();
        }

    }

    private static void print(Goban gobanToPrint, int lineToPrint){
        Stone[][] workingGrid = gobanToPrint.getGrid();
        for(int i =0; i<gobanToPrint.getSize();i++ ){
            print(workingGrid[i][lineToPrint-1]);
        }
    }

    public static void print(Stone stoneToPrint){
        if(stoneToPrint ==null) { System.out.print("+ ");
        }
        else{ System.out.print(stoneToPrint.getColor() + " ");
        }
    }

}
