public class Player {

    private String name;
    private Board.Mark bm;


    Player(String name, Board.Mark bm) {

        this.name = name;
        this.bm = bm;

    }

    @Override
    public String toString() {

        return name + " cu simbolul: " + bm;

    }

    public boolean Symbol(Board.Mark m) {
        return m == bm;

    }
}
