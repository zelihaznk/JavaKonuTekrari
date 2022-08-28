package _07_javaOperatorlari;

public class TekliOperatorler {
    public static void main(String[] args) {

        //Tekli Operatörler

        /*
        Tekli operatörler bir değişkenin sağına veya soluna gelerek
        tek başına değişkenin değerini değiştirebilen operatörlerdir.
        +(artı), -(eksi), ++(1 değer arttırma), –(1 değer düşürme),
        !(boolean tipi tersine çevirme) operatörleri mevcuttur.
        Şimdi bu operatörleri aşağıdaki örnek ile pekiştirelim
         */

        int deger = +1;
        System.out.println("deger = " + deger);

        deger = -deger;
        System.out.println("deger = " + deger);

        deger++;
        System.out.println("deger = " + deger);

        deger--;
        System.out.println("deger = " + deger);

        boolean durum = true;
        System.out.println("durum = " + durum);
        System.out.println("durum = " + !durum); // ! degildir demek

        /*
        OUTPUT:
        deger = 1
        deger = -1
        deger = 0
        deger = -1
        durum = true
        durum = false

         */















    }
}
