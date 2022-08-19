package _16_diziler_ForeachKullanimi;

public class LengthKullanimi {
    public static void main(String[] args) {
      //bir dizinin uzunlugu length ile alınır

      //Diziler length kullanımı:

        /*
        Bir dizi oluşturulduğu an dizinin uzunluğu length değişkenine atanır.
        Aşağıdaki örnek ile daha net bir şekilde anlayacağız.
         */

        int[] sayi = new int[10];
        System.out.println("Sayinin uzunluguz :" +sayi.length); //Sayinin uzunluguz :10

        /*
        Gördüğünüz gibi sayi adında uzunluğu 10 olan bir dizi tanımladık
        ve biz bu diziyi oluşturur oluşturmaz o diziye ait bir
        length değişkenine o dizinin uzunluğu atanıyor.
        Ve biz istediğimiz zaman diziReferans.length şeklinde
        dizinin uzunluğunu öğrenebiliriz.
        Aşağıda bir örnek daha veriyorum.
         */

        int[] sayi2 = {100,200,300,400,500,600,700,800,900,1000};
        System.out.println("Sayi2'nin uzunlugu :" + sayi2.length); //Sayi2'nin uzunlugu :10





    }
}
