package _30_MultidimensionalArrays;

public class RobotRonGrubu {

    public static void main(String[] args) {


        String[][] robotRonGrubu = {

                {"Lale", "Gozudeli"},
                {"Ismail", "Akdogan"},
                {"Zeliha", "Oznuk"},
                {"Deniz", "Taskiran"},
                {"Sumeyye", "Gecici"},
        };

        stringArrayPrinter(robotRonGrubu);

        String[][] robotRonGrubuListesi = new String[8][2];
        robotRonGrubuListesi[0][0] = "Lale";
        robotRonGrubuListesi[0][1] = "Gozudeli";
        robotRonGrubuListesi[1][0] = "Ismail";
        robotRonGrubuListesi[1][1] = "Akdogan";
        robotRonGrubuListesi[2][0] = "Zeliha";
        robotRonGrubuListesi[2][1] = "Oznuk";
        robotRonGrubuListesi[3][0] = "Deniz";
        robotRonGrubuListesi[3][1] = "Taskiran";
        robotRonGrubuListesi[4][0] = "Sumeyye";
        robotRonGrubuListesi[4][1] = "Gecici";

        stringArrayPrinter(robotRonGrubuListesi);
    }



    private static void stringArrayPrinter(String[][] strArray) {
        int rowSize = strArray.length;
        for (int row = 0; row < rowSize; row++) {
            int columnSize = strArray[row].length;
            for (int column = 0; column < columnSize; column++) {
                System.out.print(strArray[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }


}

/*
Yukarıdaki örnekte “robotRonGrubu” ve “robotRonGrubuListesi”
değişkenleri farklı yöntemlerle tanımlanmış olsa da aynı verileri
içermektedir. Metotları örnek bir sınıf içerisinde çalıştırdığımızda
çıktılarının aynı olduğunu görebiliriz.
 */

