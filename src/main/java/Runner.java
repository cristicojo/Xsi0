public class Runner {

    public static void main(String[] args) {
        Board x = new Board();

        System.out.println(x.toString() + "\n");


        Player p1 = new Player("IONEL", Board.Mark.MARK_0);
        Player p2 = new Player("CRISTI", Board.Mark.MARK_X);

        System.out.println(p1);
        System.out.println(p2);


        TicTacToeConsole tc = new TicTacToeConsole(p1, p2);

        tc.start();

    }
}
