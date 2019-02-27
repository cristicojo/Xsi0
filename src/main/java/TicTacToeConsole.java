import java.util.Scanner;

public class TicTacToeConsole extends Referee {

    private Scanner s;


    TicTacToeConsole(Player p1, Player p2) {

        super(p1, p2);

        this.s = new Scanner(System.in);


    }


    public int[] getCoord() {


        while (true) {

            System.out.print("Dati linia: ");
            int a = s.nextInt();

            System.out.print("Dati coloana: ");
            int b = s.nextInt();


            if ((a >= 3) || (b >= 3)) {
                System.out.println("linia si coloana trebuie sa fie mai mica decat 3");
                continue;
            }


            return new int[]{a, b};
        }


    }


}
