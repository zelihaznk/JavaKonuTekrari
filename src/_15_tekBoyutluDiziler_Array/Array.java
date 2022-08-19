package _15_tekBoyutluDiziler_Array;

public class Array {

   public static void main(String[] args) {
        /*
   Biz bu dersimizde tek boyutlu diziler’den bahsedeceğiz.
   Nedir bu diziler derseniz programın çalışma anında (runtime)
   birden fazla aynı tip veriyi tutmak/saklamak isteyebiliriz.
   Örneğin 10 tane sayının ortalamasını alacağız. Dizi kullanmadan
   bunu 10 tane farklı int değişken tanımlayıp tek tek toplayıp sonra
   10’a bölerek bulabiliriz. Fakat bu çok zor bir kullanım ve
   daha büyük rakamlarda neredeyse imkansız bir hal alabilir.
   İşte bu sorunu Dizi kullanarak çözebiliriz.

   Dizi’yi elementTipi diziAdi[]  = new elementTipi[Dizi Boyutu];
   şeklinde oluşturabiliriz.
    */

       String[] stringListe = new String[10];
       int[] intListe = new int[8];
       double[] doubleListe = new double[18];
       boolean[] boolList = new boolean[9];
       char charListe[] = new char[10]; //Bu kullanım şeklide doğrudur.
       // Ama javada genel olarak yukarıdaki gibi kullanım olmaktadır.
       // Tercih sizindir.

       /*
       Yukarıda farklı boyutlarda ve farklı tiplerde diziler oluşturduk.
       Burda bilmemiz gereken önemli bir nokta dizinin boyutunu diziyi
       oluşturduktan sonra değiştiremiyoruz. Ne dizinin boyunu arttırabilir
       ne de azaltabiliriz.

        Gelelim diziye değerlerimizi atamaya.
        */

       int[] arrListe = new int[8]; //8 elemanlı Diziyi oluşturduk
       arrListe[0] =12;//ilk değerini atadık
       arrListe[1] =11;
       arrListe[2] =10;
       arrListe[3] =9;
       arrListe[4] =8;
       arrListe[5] =7;
       arrListe[6] =6;
       arrListe[7] =5;//son değerini atadık

       /*
       Yukarıda oluşturduğumuz mobilhanemListe dizimize değer atadık.
       Dikkat ettiyseniz ilk elemana değeri mobilhanemListe[1] ile
       değilde mobilhanemListe[0] şeklinde atadık. Bunun sebebi ise
       Java’da bir dizideki elemanların sıra numaraları, yani indeksleri
        0 dan başlar ve boyutundan 1 eksik olarak biter. Yani 10 elemanlık
        bir dizinin son elemanına değeri diziAdi[9] = x
        şeklinde atayabiliriz. Aşağıda mobilhanemListe dizimizi görüyorsunuz.
        Gördüğünüz gibi ilk eleman yani 0. indeks 12 değerini tutuyor.
        */

       int[] arr = new int[8];
       arr[0]=2;
       arr[1]=4;
       arr[2]=6;

       //Diziyi aşağıdaki gibi farklı bir yollada oluşturup değerler atayabiliriz.

       //int array = {12,8,34,19,26,31,-5,78} // Diziyi bu şekildede oluşturabiliriz

       /*
       Gelelim oluşturduğumuz ve değer atadığımız dizinin değerini
       geri almaya. diziAdi[indeks] şeklinde önceden atadığımız
       değeri/değerleri alabiliriz.
        */

       System.out.println(arrListe[0]);
       System.out.println(arrListe[3]);
       System.out.println(arrListe[5]);

      /*
      Diyelim ki diziyi oluşturduk ama değer ataması yapmadık.
      Değer ataması yapmadan belli bir indekse ulaşmaya çalıştığımızda
      ne olur dersiniz?

      Diziyi oluşturduğumuz an başlangıç değerleri zaten bulunmaktadır.
      Aşağıdaki listede bir dizinin oluşturulduğu an başlangıç değerlerini
      paylaşıyorum.

String -> null
int/short/byte/long -> 0
double/float -> 0.0
boolean -> false
char -> ‘\u0000’
Herhangi Bir Objeyi tutan referans -> null

       Örneğin:

       int[] mobilhanemListe = new int[8]; // 8 elemanlı dizi oluşturuldu
       System.out.println(mobilhanemListe[4]); //herhangi bir değer ataması yapılmadan 5. elemana ulaşmaya çalışıyoruz

       Konsol çıktısı:
       0


       Gördüğünüz gibi biz bir atama yapmadan da 4.indeksin(beşinci eleman)
       değeri 0 dönmektedir. Bunun sebebi yukarıdada belirttiğim gibi
       başlangıç değerinin 0 olmasıdır. Biz diziyi oluşturur oluşturmaz
       Java tüm değerlerini 0 olarak set ediyor, eğer dizimizin tipi int ise.


       Bu dersimde birde dizi boyutunu öğrenme işleminden bahsedeceğim.
       Biz bir diziyi oluştuduğumuz zaman o diziye ait length adında
       bir int değişken( method değil) otomatik olarak oluşur ve dizinin
       boyutunu tutar.

       Yukarıdaki arrListe dizimizin boyutu 8’dir. Bunu aşağıdaki şekilde öğrenebiliriz.
       */

       int diziBoyutu = arrListe.length;
       System.out.println("DiziBoyutu : " + diziBoyutu);


   }
}
