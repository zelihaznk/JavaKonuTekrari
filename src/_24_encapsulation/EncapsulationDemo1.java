package _24_encapsulation;

public class EncapsulationDemo1 {

    private Object ad;

    public static void main(String[] args) {

        EncapsulationDemo1 ed = new EncapsulationDemo1();
        ed.ad = "All is well";

    }
}

class EncapsulationDemo {
    public String ad;
}

/*
Yukarıda ki örnekte görüleceği üzere encapsulation
yapısından faydalanılmamış, bu sebeple EncapsulationDemo
sınıfı içerisinde tanımlanan ad değişkeni kontrolden uzak kalmıştır.
EncapsulationDemo sınıfından nesne üreten tüm kullanıcılar
ad değişkenini istedikleri gibi kullanacaklar, ayrıca ad değişkenine
değer verirken karışıklık yaşayacaklardır. Bu gibi durumların önüne
geçilmesi için Java Encapsulation yapısından faydalanılmalıdır.
 */
