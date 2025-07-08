public class Tabuleiro {
    private char tab[][];
    private static final int LIN = 8;
    private static final int COL = 8;
    
    public Tabuleiro() {
        tab = new char[LIN][COL];
        for (int l = 0; l < tab.length; l++) {
            for (int c = 0; c < tab[l].length; c++) {
                tab[l][c] = '.';
            }
        }
    }

    public String toString() {
        String rep = "";
        for (int l = 0; l < tab.length; l++) {
            for (int c = 0; c < tab[l].length; c++) {
                rep += tab[l][c] + " ";
            }
            rep += "\n";
        }

        return rep;
    }

    
}
