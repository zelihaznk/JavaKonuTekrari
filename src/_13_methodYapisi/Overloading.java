package _13_methodYapisi;

public class Overloading {
    //Overloading (Aşırı yükleme)

    /*
    Java’nın güzel özelliklerinden bir tanesi de metotları
    aşırı yükleme özelliğidir. Aşırı yükleme bir metodun
    aynı isimle fakat parametrik olarak farklı veri tipleriyle
    çağrılması durumuna denilir. Yukarıda vermiş olduğumuz
    örnekler üzerinden gidersek, muhasebe programımızda toplama
    işlemleri tam sayılar üzerinden yani int veri tipleriyle
    gerçekleştirilmektedir. Fakat bu bazı sıkıntılara yol açabilir
    ve bu işlemlerin küsuratlı ve daha büyük sayıları yani double
    veri tiplerini desteklemesi gerekebilir. Bu gibi durumlarda
    metot aşırı yüklenir ve verilen iki tipi de kabul edecek
    şekle getirilir.
    Aşağıda bunun bir örneğini görebilirsiniz;
     */


    public static int toplama(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        return sonuc;
    }

    public static double toplama(double sayi1, double sayi2) {
        double sonuc = sayi1 + sayi2;
        return sonuc;
    }

    public static void main(String[] args) {
        int tamSayi = toplama(5, 6);
        System.out.println("5 + 6 = " + tamSayi);

        double kusurluSayi = toplama(5.5, 6.5);
        System.out.println("5.5 + 6.5 = " + kusurluSayi);
    }






}
