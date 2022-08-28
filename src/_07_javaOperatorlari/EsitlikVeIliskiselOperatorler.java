package _07_javaOperatorlari;

public class EsitlikVeIliskiselOperatorler {
    public static void main(String[] args) {

        //Eşitlik ve İlişkisel Operatörler

        /*
        Eşitlik ve İlişkisel Operatörler iki farklı değişkenin eşitliğini
        veya arasındaki ilişkiye yönelik farklılıkları ortaya çıkarmaya yarayan
        operatörlerdir.
        ==(eşittir), !=(eşit değildir), > (büyüktür), <(küçüktür),
        >=(büyük eşittir), <= (küçük eşittir) operatörlerinden oluşur.
        Operatörleri aşağıdaki örnekle daha iyi anlayabilirsiniz:
         */

        int deger1 = 32;
        int deger2 = 32;

        if (deger1 == deger2){
            System.out.println(deger1 + " esittir " + deger2);
        }

        int deger3 = 32;
        int deger4 = 33;

        if (deger3 != deger4){
            System.out.println(deger3 + " esit degildir " + deger4);
        }

        int deger5 = 32;
        int deger6 = 12;

        if (deger5>deger6){
            System.out.println(deger5 +" buyuktur " +deger6);
        }

        int deger7 = 13;
        int deger8 = 13;

        if(deger7 >= deger8) {
            System.out.println(deger7 + " buyuk veya esittir " + deger8);
        }

        /*
OUTPUT:
32 esittir 32
32 esit degildir 33
32 buyuktur 12
13 buyuk veya esittir 13
         */











    }
}
