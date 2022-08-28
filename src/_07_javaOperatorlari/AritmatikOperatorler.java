package _07_javaOperatorlari;

public class AritmatikOperatorler {
    public static void main(String[] args) {

       //Aritmetik Operatörler
        /*
        Aritmetik operatörler klasik matematiksel işlemleri yapılamasını
        sağlayan operatörlerdir. +(toplama), -(çıkarma), *(çarpma), /(bölme)
        ve %(mod alma) işlemlerinin yapılmasını sağlayan operatörlerdir.
        Örnek vermek gerekirse;
         */

        int deger1 = 33;
        int deger2 = 12;

        int toplama = deger1+deger2;
        System.out.println("Toplama sonuc  :" + toplama);
        int cikarma = deger1-deger2;
        System.out.println("Cikarma sonuc : " + cikarma);
        int capma = deger1*deger2;
        System.out.println("Capma sonuc : " + capma);
        int bolme = deger1/deger2;
        System.out.println("Bolme sonuc : " + bolme);
        int modulus = deger1%deger2;
        System.out.println("Modulus sonuc : " + modulus);

        /*
        Output:
        Toplama sonuc  :45
        Cikarma sonuc : 21
        Capma sonuc : 396
        Bolme sonuc : 2
        Modulus sonuc : 9
         */














    }

}
