import org.junit.Assert;
import org.junit.Test;

public class TicTacToeTest{

    @Test
    public void WinX(){

        int[][] coord=new int[][]{{0,0},{1,1},{0,1},{2,2},{0,2}};
        //int[][] coord=new int[][]{{0,0},{1,1},{1,0},{2,2},{2,0}};

        Player a=new Player("Gandalf", Board.Mark.MARK_0);
        Player b=new Player("Frodo", Board.Mark.MARK_X);

        TicTacToeTestingPurpose t=new TicTacToeTestingPurpose(a,b,coord);

        Assert.assertEquals(b,t.start());

    }

    @Test
    public void Win0(){

        int[][] coord=new int[][]{{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};

        Player a=new Player("Gandalf", Board.Mark.MARK_0);
        Player b=new Player("Frodo", Board.Mark.MARK_X);

        TicTacToeTestingPurpose t=new TicTacToeTestingPurpose(a,b,coord);

        Assert.assertEquals(a,t.start());

    }

    @Test
    public void Draw(){


        int[][] coord=new int[][]{{0,0},{1,1},{1,2},{2,2},{0,2},{0,1},{2,0},{1,0},{2,1}};
        //int[][] coord=new int[][]{{1,1},{1,2},{2,1},{2,2},{0,2},{2,0},{0,0},{0,1},{1,0}};

        Player a=new Player("Gandalf", Board.Mark.MARK_0);
        Player b=new Player("Frodo", Board.Mark.MARK_X);

        TicTacToeTestingPurpose t=new TicTacToeTestingPurpose(a,b,coord);

        Assert.assertNull(t.start());

    }


}
