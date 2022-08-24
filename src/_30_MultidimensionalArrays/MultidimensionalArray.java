package _30_MultidimensionalArrays;

public class MultidimensionalArray {

    public static void main(String[] args) {

        for(int row = 0; row < getBarcelonaFutbolTakimKadro().length; row++) {
            for(int column = 0; column<getBarcelonaFutbolTakimKadro()[row].length; column++) {
                System.out.print(getBarcelonaFutbolTakimKadro()[row][column] + " ");
            }
            System.out.println();
        }

    }

    private static String[][] getBarcelonaFutbolTakimKadro() {

        String[][] barcelonaKadro = {
                {"1", "Ter", "Stegen", "Kaleci"},
                {"3", "Pique", "Defans"},
                {"4", "Rakitic", "Orta Saha"},
                {"5", "Sergio", "Orta Saha"},
                {"6", "Denis", "Suarez", "Orta Saha"},
                {"7", "Arda", "Orta Saha"},
                {"8", "Iniesta", "Orta Saha"},
                {"9", "Suarez", "Forvet"},
                {"10", "Messi", "Forvet"},
                {"11", "Neymar", "Forvet"}
        };

        return barcelonaKadro;
    }

    /*
    Bu örnekte görüleceği gibi çok boyutlu diziler içerisinde birbirinden
    farklı uzunlukta diziler kullanılabilmektedir.
     */

}
