package _20_MultidimensionalArrays_cokBoyutluDiziler;

public class MultidimensionalArrays {

        /*
        Tek boyutlu diziler tek bir sütunda verileri tutmaktadır.
        Çok boyutlu diziler ise birden fazla sütunda verileri tutmaktadır.
        Bu şekilde tanımlanan array tiplerinde daha çok matriksler
        veya tablo yapıları tutulmaktadır. Genel olarak çok boyutlu
        diziler aşağıdaki şekilde tanımlanmaktadır.
         */

        /*
        DegiskenTipi[][] degiskenAdi;

        DegiskenTipi degiskenAdi[][]; //geçerli fakat tercih edilmeyen kullanım.
         */

        /*
        Yukarıdaki koddan da göreceğiniz gibi iki şekildede tanılama
        yapmak mümkün, ikinci satırdaki tanımlama kodu okurken karmaşıklığa
        sebebiyet vermesinden dolayı kullanımı tavsiye edilmemektedir.
        Genel tanımlamalar yapının nasıl kurulacağıyla ilgili
        bilgi vermektedir. Şimdi ise aşağıda Java değişken tipleri
        ile nasıl çok boyutlu diziler tanımlanacağına bakalım;
         */


    int[][] matriks;
    String[][] tablo;
    double[][] degerler;

        /*
        Yukarıdaki şekilde java değişlen tipinde çok boyutlu diziler
        tanımlanabilir. Tanımladığımız çok boyutlu diziler içersine
        farklı şekillerde değer atayabiliriz.
        Şöyle ki;
         */

    private void multidimensionalArrayTest() {
        String[][] robotRon = {
                {"Ismail","Lale" },
                {"Deniz","Zeliha"},
                {"Sumeyye","Fatma Nur"},
                {"Yasemen","Feyza"},
                {"Emsal","Enes"},
        };

        stringArrayPrinter(robotRon);

        String[][] robotRonGrubu = new String[6][2];
        robotRonGrubu[0][0] ="Ismail";
        robotRonGrubu[0][1] ="Lale";
        robotRonGrubu[1][0] ="Deniz";
        robotRonGrubu[1][1] ="Zeliha";
        robotRonGrubu[2][0] ="Sumeyye";
        robotRonGrubu[2][1] ="Fatma Nur";
        robotRonGrubu[3][0] ="Yasemen";
        robotRonGrubu[3][1] ="Feyza";
        robotRonGrubu[4][0] ="Emsal";
        robotRonGrubu[4][1] ="Enes";

        stringArrayPrinter(robotRonGrubu);

    }

    private void stringArrayPrinter(String[][] strArray) {

        int rowSize = strArray.length;
        for (int i = 0; i < rowSize; i++) {
            int columnSize = strArray[i].length;
            for (int j = 0; j < columnSize; j++) {
                System.out.println(strArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

    }

    /*
    Yukarıdaki örnekte “robotRon” ve “robotRonGrubu”
    değişkenleri farklı yöntemlerle tanımlanmış olsa da aynı verileri
    içermektedir. Metotları örnek bir sınıf içerisinde çalıştırdığımızda
    çıktılarının aynı olduğunu görebiliriz. Bu örnekte String veri tipinde
    çok boyutlu dizi oluşturduk, bir sonraki örnekte int veri tipinde
    çok boyutlu dizi oluşturarak devam edeceğiz.
     */


}
