package Rules;

public class Group {
    private Coordinate[] boundary;
    private int groupNumber;
    private static int numberOfGroup=1;

    public Group(){
        this.groupNumber = numberOfGroup++;

    }
}
