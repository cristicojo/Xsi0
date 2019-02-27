
public class TicTacToeTestingPurpose extends Referee {

    private int[][] coord;
    private int currentMove;

    TicTacToeTestingPurpose(Player a, Player b, int[][] coord) {

        super(a, b);
        this.coord = coord;
        currentMove = 0;

    }


    public int[] getCoord() {

        return coord[currentMove++];
    }


}
