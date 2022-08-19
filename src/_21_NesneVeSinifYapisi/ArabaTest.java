package _21_NesneVeSinifYapisi;

public class ArabaTest {
    public static void main(String[] args) {

        Araba arabaNesnesi = new Araba();
        arabaNesnesi.calistir();

        Araba baskaArabaNesnesi = new Araba(2998);
        baskaArabaNesnesi.calistir();
    }

    /**
    OUTPUT:
Araba nesnesi olusturuldu, yeni varsayilan motor hacmi degeri : 1399.0
Araba calismaya basladi!
Araba nesnesi olusturuldu, yeni varsayilan motor hacmi degeri :2998.0
Araba calismaya basladi!
     */

    /*
    Araba arabaNesnesi = new Araba(); şeklinde oluşturduğumuz nesnemizde
    sizlerin de dikkatinden kaçmayacağı gibi parametre almayan constructor
    kullanılarak bir nesne oluşturuldu. Sınıftan yeni bir
    nesne oluşturulurken constructor devreye girdi ve görevini yerine
    getirdi.
     Aynı şekilde Araba baskaArabaNesnesi = new Araba(2998);
     şeklinde oluşturulan nesnede ikinci constructor yani içerisine
     double yeniMotorHacmi değerini alan constructor devreye girdi ve
     görevini tamamladı. Araba sınıfından nesne oluşturduktan sonra
     calistir() methodunu yine bizim tetiklememiz gerekti,
     işte metotlarla constructor farkı burada ortaya çıkıyor.
     Kısaca toparlamak gerekirse; constructor lar sınıflardan
     nesne oluşturuluğu esnada tetiklenmekte, metotlar ise nesne
     oluşturulup çağırıldıktan sonra tetiklenmektedir.
     */
}
