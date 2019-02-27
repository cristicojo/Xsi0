public abstract class Referee implements Readable {

    private Board t;
    private Player p1;
    private Player p2;
    private boolean xTurn;

    Referee(Player a, Player b) {

        t = new Board();
        this.p1 = a;
        this.p2 = b;
        this.xTurn = true;

    }


    public Player start() {
        System.out.println();

        int coord[];

        while (true) {

            coord = getCoord();

            if (!t.move(coord[0], coord[1], xTurn ? Board.Mark.MARK_X : Board.Mark.MARK_0)) {
                System.out.println("spatiu este ocupat deja");
                continue;
            }


            if (xTurn)
                xTurn = false;
            else
                xTurn = true;

            System.out.println(t + "\n");

            if (t.isGameOver(coord[0], coord[1]))
                break;


        }

        Board.Mark aux = t.getWinner(coord[0], coord[1]);

        if (p1.Symbol(aux)) {
            System.out.println("A castigat "+p1);
            return p1;
        }

         else if (p2.Symbol(aux)) {
            System.out.println("A castigat "+p2);
            return p2;

        } else
            System.out.println("Nu a castigat nimeni: REMIZA");


        return null;
    }
}
