import Goban.Stones.Goban;
import BadukSystem.*;
import Goban.Stones.*;

public class Baduk {
    public static void main(String args[]){
        Goban gobanNumber1= new Goban(9);
        Printer.print(gobanNumber1);
        Stone stoneOne = new Stone('O');
        Stone stoneTwo = new Stone('B');

        for(int i = 0;i<10;i++){
            System.out.println();
        }

        gobanNumber1.playStone(stoneOne,3,3);
        gobanNumber1.playStone(stoneTwo,4,4);
        Printer.print(gobanNumber1);


    }
}
