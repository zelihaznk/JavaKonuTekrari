package _20_MultidimensionalArrays_cokBoyutluDiziler;

public class MultidimensionalArrayOrnek {
    public static void main(String[] args) {

        for (int i = 0; i < getrobotRonGrubu().length; i++) {
            for (int j = 0; j <getrobotRonGrubu()[i].length ; j++) {
                System.out.println(getrobotRonGrubu()[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static String [][] getrobotRonGrubu() {
        String[][] robotRon = {
                {"Ismail","Lale" },
                {"Deniz","Zeliha"},
                {"Sumeyye","Fatma Nur"},
                {"Yasemen","Feyza"},
                {"Emsal","Enes"},
        };

        return robotRon;
    }
}
