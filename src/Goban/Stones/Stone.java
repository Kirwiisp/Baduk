package Goban.Stones;

import Rules.Coordinate;
import Rules.Group;
import Rules.Player;

public class Stone {
    private char color;
    private Group groupNumber;

    public Stone (Player player){
        this.color = player.getColor();
    }

    public Stone(char color){this.color = color;}


    public char getColor(){return color;}

}
