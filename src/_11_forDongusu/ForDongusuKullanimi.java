package _11_forDongusu;

public class ForDongusuKullanimi {
    public static void main(String[] args) {

       /*
       For Döngüsü ‘nün bir çok farklı kullanımı olabilir.
       Örneğin verileri sadece arttırarak yazmamız gerekmemektedir,
       veya döngüyü 0 (sıfır) dan başlatmak zorunda değilizdir.
       For Döngüsü nün bir kaç farklı kullanım örneğini vermek gerekirse;
        */

        System.out.println("standart kullanim");
        System.out.print("i: ");
        for(int i = 0; i < 10 ; i++) {
            System.out.print(i + " ");
        }


        System.out.println("azaltarak kullanım");
        System.out.print("\nj: ");
        for(int j = 10; j >= 0 ; j--) {
            System.out.print(j + " ");
        }

        System.out.println("5ten 10a kadar");
        System.out.print("\nk: ");
        for(int k = 5; k <= 10; k++) {
            System.out.print(k + " ");
        }

        System.out.println("0dan 100 e 10ar 10ar");
        System.out.print("\nl: ");
        for(int l = 0 ; l <= 100; l+=10) {
            System.out.print(l + " ");
        }

        System.out.println("50den 0a 5er 5er");
        System.out.print("\nm: ");
        for(int m = 50; m >= 0; m-=5) {
            System.out.print(m + " ");
        }

        /*
        Burada gözden kaçabilecek bir kaç ufak ama önemli bilgi vermek
        faydalı olacaktır. Kodun herhangi bir yerinde for içinde
        tanımladığımız değişkeni kullanmayacaksak yukardaki örneklerde
        olduğu gibi for içerisinde tanımlayabiliriz.
        System.out.println ve System.out.print komutları farklı
        komutlardır. Baştaki komut her yazılanı yeni bir satırda
        yazarken sonraki komut yazılanları aynı
         satırda yazmak için kullanılır.
         */



    }
}
