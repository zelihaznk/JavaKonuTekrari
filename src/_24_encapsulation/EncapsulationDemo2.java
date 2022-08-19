package _24_encapsulation;

/**
 * Encapsulation kullanılarak oluşturulan bir değişken ve kullanımı
 **/

public class EncapsulationDemo2 {
    public static void main(String[] args) {

        encapsulationDemo ed = new encapsulationDemo();
        ed.setAd("All is well");
        System.out.println(ed.getAd());

    }

}

class encapsulationDemo {
    private String ad;
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getAd() {
        return ad;
    }
}

    /*
    İkinci örnekte rahatlıkla görebileceğiniz gibi ad değişkeni private
    olarak tanımlandığı için direk olarak değiştirilemez.
    Bunun yerine public erişim belirtecine sahip getter ve setter
    metotları aracılığı ile değiştirilip kullanılabilir. Bu da bizim
    veri güncellerken veya kullanırken yaşanabilecek karışıklıkların
    önüne geçmemizi sağlar.

    Bunların yanı sıra kullanıcıların ad değişkenine ait değeri
    değiştirmesini istemediğimiz takdirde, public void setAd(String ad)
    şeklinde tanımladığımız metodumuzun erişim belirtecini private
    olarak değiştirdiğimizde artık ad değişkeni kullanıcılar
    için sadece-okuma (read-only) yetkisine sahip oldukları
    bir değişken olacaktır. Bu şekilde erişim belirteçlerini
    değiştirerek sınıflar içerisinde değişkenlerimizi
    okuma-yazma (read-write), sadece okuma (read-only),
    sadece yazma (write-only) şeklinde yetkilendirebiliriz.

    Java Encapsulation ile yazılan kodların bakımı çok daha kolay
    hale gelecektir. Örnek vermek gerekirse bir class yazdınız.
    Sadece o class’ın içinde kullandığınız bir değişkeni ve ya
    metodu public yaptınız. Bu metoda ve ya değişkene başka
    class’lardan rahatça erişilecek. Bu class’ı tekrar
    güncellerken public metod ve değişkenimizi istediğimiz
    gibi değiştiremeyiz. Çünkü başka class’lardan bu değişkene
    ve ya metoda erişilmiş olabilir. Dolayısıyla en baştan
    kodumuzu yazarken Class’ın içindeki değişken ve ya metodumuzu
    private (Encapsulation yaparak) tutarak ilerleyen zamanlarda ki
    değişikliklerde daha rahat olalım.

    Sonuç

    ava Encapsulation yapısından faydalanılarak yazılan kodlar bakımı
    daha kolay, değiştirmeye ve geliştirmeye daha açık ve daha esnek
    hale gelmektedir.
     */
