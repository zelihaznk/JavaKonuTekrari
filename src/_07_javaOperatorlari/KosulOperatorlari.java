package _07_javaOperatorlari;

public class KosulOperatorlari {
    public static void main(String[] args) {

        //Koşul Operatörleri

        /*
        Koşul operatörleri verilen parametrelerin birden fazla eşitlik
        veya ilişkisel koşulu sağlayıp sağlamadığını kontrol ederken kullanılır.
         &&(ve), ||(veya), ?:(üçlü) operatör seçenekleri mevcuttur.
         Bu operatörleri örnekle kısaca anlatmak gerekirse;
         */

        int deger1 = 2;
        int deger2 = 4;
        String strDeger1 = "zelihaoznuk";
        String strDeger2 = "zeliha";
        if((deger1 < deger2) && (strDeger1.contains(strDeger2))) {
            System.out.println(deger1 + " kucuktur " + deger2
                    + " ve " + strDeger1 + " " + strDeger2 + " String degerini icermektedir.");
        }

        if((deger1 == deger2) || (strDeger1.contains(strDeger2))) {
            System.out.println(deger1 + " esittir " + deger2
                    + " veya " + strDeger1 + " " + strDeger2 + " String degerini icermektedir.");
        }

        if((deger1 < deger2) || (strDeger1.equals(strDeger2))) {
            System.out.println(deger1 + " kucuktur " + deger2
                    + " veya " + strDeger1 + " " + strDeger2 + " String degerini icermektedir.");
        }

        int deger3 = 23;

        //deger3 23'e esitse deger4'un degerini 24 yap degilse 22 yap

        int deger4 = (deger3 == 23) ? 24 : 22;
        System.out.println("deger4: " + deger4);

        //deger3 22'ye esitse deger4'un degerini 24 yap degilse 22 yap

        deger4 = (deger3 == 22) ? 24 : 22;
        System.out.println("deger4: " + deger4);

        /*
        OUTPUT:
2 esittir 4 veya zelihaoznuk zeliha String degerini icermektedir.
2 kucuktur 4 veya zelihaoznuk zeliha String degerini icermektedir.
deger4: 24
deger4: 22
         */











    }
}
