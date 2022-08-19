package _26_polymorphism;

public class _1_Coercion {
    public static void main(String[] args) {


        /*
        Java’nın sahip olduğu bir özellik olan Implicit Type Conversion
        (Örtük Türde Dönüştürme) polymorphism in alt başlıklarından Coercion
        yapısını anlatmada en iyi yöntem olabilir. Veri tiplerinin
        birbirine dönüştürülmesi konusunu ele alıp temel tiplerden bir
        örnek oluşturalım. Örnek Java kodumuzda bir int değişken
        oluşturalım bir de float değişken oluşturalım. Oluşturduğumuz
        bu değişkenlere değer atayalım. Ardından int olarak
        tanımladığımız değişkeni float olarak tanımladığımız değişkene
        bölelim. Burada derleyici hata ile karşılaşılmasını önlemek
        için integer tipte tanımlanan değişkeni float tipinde bir
        değişkene çevirerek işlemi yapar. Aşağıdaki kod ile ne anlatmaya
        çalıştığımı daha iyi anlayabilirsiniz.
         */

        int intDeger = 2;
        float floatDeger = 2.5f;
        //intDeger derleyici tarafından float tipinde bir degiskene donusturuluyor.

        float sonuc = intDeger/floatDeger;
        System.out.println(sonuc);

        /*
        Yukarıdaki kodda konsola yazdırılan sonuç “0.8” olacaktır.
        int tipindeki intDeger işlem sırasında derleyici tarafından
        float tipine dönüştürülerek işlem yapılmıştır.

        Temel tipteki bu yapıyı örnek alarak kendi sınıflarımızla bir
        örnek oluşturabiliriz. Vereceğim örneği açıklayacak en güzel
        cümle şu olacaktır. “Derleyici işlemleri yaparken, subclass
        türünü superclass türüne dönüştürür ve yapılabilecek işlemleri
        superclass’ ın özellikleriyle sınırlandırır.”
         */














    }
}
