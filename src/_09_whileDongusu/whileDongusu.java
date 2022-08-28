package _09_whileDongusu;

public class whileDongusu {
    public static void main(String[] args) {

        /*
        Kod yazarken bazı satırları birden fazla defa çalıştırmamız gerekebilir.
         Çok basit bir örnekle “Merhaba Robot Ron Grubu :)” yazısını konsola 10 defa
         alt alta yazdırmamız gerekti.
         Bunu aşağıdaki gibi yapabiliriz.
         */

        System.out.println("Merhaba Robot Ron Grubu :)");
        System.out.println("Merhaba Robot Ron Grubu :)");
        System.out.println("Merhaba Robot Ron Grubu :)");
        System.out.println("Merhaba Robot Ron Grubu :)");
        System.out.println("Merhaba Robot Ron Grubu :)");
        System.out.println("Merhaba Robot Ron Grubu :)");
        System.out.println("Merhaba Robot Ron Grubu :)");
        System.out.println("Merhaba Robot Ron Grubu :)");
        System.out.println("Merhaba Robot Ron Grubu :)");
        System.out.println("Merhaba Robot Ron Grubu :)");

        /*
        10 tane yazdırmak için yukarıdaki kod kullanılabilinir,
         ancak düşünün ki 500 adet istendi veya her hangi bir koşula
         bağlanması istendi. İşte bu durumlarda Java bize çok kullanışlı
         bir yapı olan döngü yapısını sunmaktadır. 3 adet döngü çeşidi vardır.
         While döngüsü, do-while döngüsü ve for döngüsü.
         Biz bu dersimizde While döngüsünü anlatacağız.
         İlerleyen derslerde ise diğer döngüleri anlatmaya devam edeceğiz.
          While döngüsüne başlamadan önce şunu belirtmek isterim.
          Bu 3 döngü arasında en çok kullanılan döngü çeşidinin
          for döngüsü olduğunu belirttikten sonra artık gelelim
          While döngüsü kullanımına.

          Yukarıda “Merhaba Robot Ron Grubu :)” yazısını konsola
          10 defa alt alta yazdırmak için aynı kodu 10 defa alt alta yazdık.
           Bunu while döngüsü ile aşağıdaki şekilde yapabiliriz.
         */

        int i =0;

        while (i<10){ //i 10 dan küçük olduğu müddetçe true dönecektir ve while kod bloğuna girecektir
            System.out.println("Merhaba Robot Ron Grubu :)");
            i++; //her seferinde i'yi 1 arttırır
        }

        /*
        Yukarıda görüldüğü gibi 10 defa alt alta yazmaktansa while döngüsü
        kullanarak bu işlemi kolaylaştırdık. While içine yazılan koşul
        true oldukça program while kod bloğuna girecek ve işlemleri yapacaktır.
         Eğer while içine while(true) şeklinde yaparsak burada sonsuz
         döngüye girecektir ve sürekli while bloğu çalışacaktır.
         (break ve continue ifadeleri ile döngüden çıkmak mümkün ilerleyen
         derslerimizde anlatacağız).
         */








    }
}
