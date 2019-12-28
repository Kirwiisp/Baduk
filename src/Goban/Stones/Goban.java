package Goban.Stones;

import Rules.*;

public class Goban {
    private Stone grid [][];
    private int size;

    public Goban(int size){
        this.size = size;
        grid = new Stone[this.size][this.size];
    }

    public void playStone(Stone stonePlayed,int x, int y){
        grid[x-1][y-1]=stonePlayed;
    }

    public int getSize(){return size;}

    public Stone[][] getGrid(){return grid;}

    public void playStone(Player player, Coordinate whereItIsPlayed){


    }

}
