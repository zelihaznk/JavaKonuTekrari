package _28_composition;

public class composition {

    //Composition nedir?

    /*
    Bir classı oluşturduktan sonra başka bir class içerisinde kullanmamızı
    sağlayan yapıya composition denir. Bu sayede her kodlamada aynı kodu
    yazmak zorunda kalmayacak ve oluşabilecek kod kirliliğinin önüne geçmiş
    olacaksınız.

    Composition da sahiplik ilişkisi vardır. Bizim bir masaüstü
    bilgisayarımızın olduğunu düşünelim. Bu bilgisayarı oluştururken kasa,
    monitor, anakart, ram vs. alıyoruz.
    Tüm bunları birleştirerek bir bilgisayar ortaya çıkarıyoruz.
    Bu bilgisayarı OOP ile tasarlayacağımızı düşünürsek bu bilgisayar
    objesinin içinde aslında bir tane kasa objesi, bir tane anakart objesi,
    bir tane ram objesi , bir tane monıtor objesi vs. olacak.
    Yani bunlar birleşerek bir tane bilgisayar objesi oluşturuyorlar.
    Compositionun tam olarak anlamı budur.
     */

    /*
     Composition düşünürken gerçek dünya ile bağlantı kurarak birden
     fazla ilişki kurabilir konuyu daha iyi kavrayabiliriz. Peki Composition
     oluşturduktan sonra bunun bize faydası ne olacaktır diye düşündüğümüz zaman
     durumu şöyle izah edebilirim. Esas faydaları bizim çoğu projemizde
     yaşamış olduğumuz sıkıntıları giderebilecek durumdadır. Bunlar ;

     ** Mevcut kodu tekrar kullanabiliriz,
     ** Genişletebiliriz,
     ** Kod tekrarını önleyebiliriz ve bunun sayesinde temiz kod elde etmiş oluruz.

     */





    /*
    Burada bir kasa sınıfı oluşturup obje yaratacağız. Yaratmış olduğumuz
    kasa objesini ise direkt bilgisayar objesine yerleştireceğiz. Anakart
    ve Monitör içinde aynısını yaptıktan sonra Monitör sınıfı içerisinde
    bir tane daha composition uygulamaya çalışacağız. Gelelim bu anlatmış
    olduğumuz örneği koda dökmeye :
     */




}
