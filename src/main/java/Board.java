public class Board {

    private Mark table[][];

    public enum Mark {

        MARK_X {
            @Override
            public String toString() {
                return "X";
            }
        },
        MARK_0 {
            @Override
            public String toString() {
                return "0";
            }

        },
        MARK_EMPTY {
            @Override
            public String toString() {
                return "-";
            }
        }

    }


    Board() {
        table = new Mark[3][3];

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[i].length; j++)

                table[i][j] = Mark.MARK_EMPTY;

        }

    }

    @Override
    public String toString() {

        StringBuilder aux = new StringBuilder();
        for (int i = 0; i < table.length; i++) {

            aux.append("\n");

            for (int j = 0; j < table[i].length; j++)
                aux.append(table[i][j] + "   ");

        }

        return aux.toString();
    }

    public boolean move(int row, int col, Mark m) {

        boolean b;
        if (table[row][col] == Mark.MARK_EMPTY) {
            table[row][col] = m;
            b = true;
        } else
            b = false;


        return b;

    }

    Mark getWinner(int i, int j) {

        //coloane
        if (table[0][j] != Mark.MARK_EMPTY && table[0][j] == table[1][j] && table[1][j] == table[2][j])
            return table[0][j];


        //linii
        if (table[i][0] != Mark.MARK_EMPTY && table[i][0] == table[i][1] && table[i][1] == table[i][2])
            return table[i][0];


        //diagonala principala
        if (table[0][0] != Mark.MARK_EMPTY && table[0][0] == table[1][1] && table[1][1] == table[2][2])
            return table[0][0];

        //diagonala secundara
        if (table[0][2] != Mark.MARK_EMPTY && table[0][2] == table[1][1] && table[1][1] == table[2][0])
            return table[0][2];


        return Mark.MARK_EMPTY;
    }

    boolean isGameOver(int row, int col) {


        if (getWinner(row, col) != Mark.MARK_EMPTY)

            return true;

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[i].length; j++)

                if (table[i][j] == Mark.MARK_EMPTY)
                    return false;
        }


        return true;
    }

}