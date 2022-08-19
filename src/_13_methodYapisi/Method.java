package _13_methodYapisi;

public class Method {

      /*
      Metot Yapısı sadece Java geliştirme diline özel bir yapı
      olmadığı için yapacağımız tanım Nesne Yönelimli Programlamayı
      destekleyen bir çok yazılım dili için geçerli bir tanım olacaktır.
      Yazılım dünyasında bir çok ifadenin, tanımlamanın bir araya
      gelerek bir fonksiyon içerisinde işlemleri gerçekleştirmesiyle
      metot yapısı ortaya çıkar. Metot Yapısı bir kez kurulduktan
      sonra bir çok kez ve farklı yerlerde kullanılabilir.
      Java yazılım dilinde metotların kullanım alanları oldukça geniştir,
       en çok kullanılan metot olarak yapılandırıcılar (constructors)
       gösterilebilir. Yapılandırıcı metotlar konusunu ilerleyen derslerde
       detaylarıyla anlatacağız. Şimdilik sadece bir sınıf çalıştığında
       ilk önce eğer varsa yapılandırıcı sınıfını çalıştırır diyerek
       bir başlangıç bilgisi vermiş olalım. Artık metot yapısını daha
       iyi anlayabilmenizi sağlamak için örnekler vermeye başlayalım.
       */

        /*
        Örnek 1
         Bir proje geliştirdiğinizi ve bu projenin bir muhasebe
         projesi olduğunu varsayalım. Bu projede bir çok kez toplama,
         çıkarma, çarpma ve bölme işlemleri yapılacaktır. Bu ve buna
         benzer durumlarda her toplama işlemi yapmamız gerektiğinde
         tek tek o işlemi yazmaktansa bu işlemleri yapan metotlar
         hazırladığımız takdirde işimiz oldukça kolaylaşacaktır.
         Şimdi bunu nasıl yapacağımızı görelim;
         */

    public static void toplama(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
    }

    public static void cikarma(int sayi1, int sayi2) {
        int sonuc = sayi1 - sayi2;
        System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
    }

    //eger cikarma isleminde negatif deger cikmasini istemiyorsak
    public static void cikarma2(int sayi1, int sayi2) {
        if(sayi1 > sayi2) {
            int sonuc = sayi1 - sayi2;
            System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
        } else {
            System.out.println(sayi1 + " küçüktür " + sayi2);
            int sonuc = sayi2 - sayi1;
            System.out.println(sayi2 + " - " + sayi1 + " = " + sonuc);
        }
    }

    public static void carpma(int sayi1, int sayi2) {
        int sonuc = sayi1 * sayi2;
        System.out.println(sayi1 + " x " + sayi2 + " = " + sonuc);
    }

    public static void bolme(int sayi1, int sayi2) {
        int sonuc = sayi1 / sayi2;
        System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc);
    }

    public static void main(String[] args) {
        System.out.println("Toplama");
        toplama(5, 6);
        System.out.println("Çıkarma");
        cikarma(10, 2);
        cikarma2(8, 12);
        System.out.println("Çarpma");
        carpma(5, 6);
        System.out.println("Bölme");
        bolme(10, 2);
    }

    /*
    Bu methodları farklı bir sınıfı içerisinden veya farklı
    bir metot içerisinden rahatlıkla çağırarak heryerde kullanabiliriz.
    Bu şekilde toplama işlemini yapan metodu bir kere yazdıktan
    sonra bir daha yazmamıza gerek kalmadan sadece ilgili metodu
    çağırmak yeterli olacaktır. Dikkatinizi çeken bir konuda,
    yukarıda yazmış olduğumuz örnek metotların hepsi void anahtar
    kelimesiyle değer dönmektedir. Aslında bu tip sınıflar
    dışarıya bir değer dönmezler tüm tanımlanan değerler ile
    kendi içlerinde işlem yaparlar. Bunun aksi durum ise dışarıya
    daha önce anlattığımız veri tiplerini dönen metotlardır.
    Aslında bir metot istediğiniz her türlü nesneyi dönebilir,
    fakat bu konuları önümüzdeki derslerde anlatacağız.
    Şimdi veri tiplerini dönen metotlara örnek kodlar yazalım;
     */






}
