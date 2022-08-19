package _22_erisimBelirleyiciler;

public class Yolcu {

    //Diğer sınıflardan erişilemeyecek sadece
    // bu sınıf içerisinden erişilebilen değişkenler.

    private String yolcuCamlariAcabilir = "Yolcu camlari acabilir";

    private String yolcuCamlariAcamaz = "Yolcu camlari acamaz!";

    private String yolcuKapilariAcabilir = "Yolcu kapilari acabilir";

    private String yolcuKapilariAcamaz = "Yolcu kapilari acamaz!";

    /**
     * Yolcunun yapabileceklerinin AracKullanicisi sınıfında belirlenen yapıya göre tanımlandığı
     * detayları yazdırır.
     */

    public void yolcununYapabilecekleriniYazdir(OzelArac ozelArac){

        if (ozelArac.isCamlarAcilabilir()){
            System.out.println(yolcuCamlariAcabilir);
        }else {
            System.out.println(yolcuCamlariAcamaz);
        }

        if (ozelArac.isKapilarAcilabilir()){
            System.out.println(yolcuKapilariAcabilir);
        }else {
            System.out.println(yolcuKapilariAcamaz);
        }
    }

    /**
     * yolcununYapabilecekleriniYazdir metodu ile aynı işlemi yapmakta olan bu metot
     * if-else kullanımının farklı bir versiyonudur.
     */

    public void yolcununYapabilecekleriniYazdir1(OzelArac ozelArac){
        System.out.println(ozelArac.isCamlarAcilabilir()?yolcuCamlariAcabilir:yolcuCamlariAcamaz);
        System.out.println(ozelArac.isKapilarAcilabilir() ? yolcuKapilariAcabilir : yolcuKapilariAcamaz);
    }

}


/*
Burada ilk dikkat etmemiz gereken, OzelArac ve AracKullanicisi
sınıflarının paketleri aynı iken Yolcu sınıfının paketi farklıdır.
Bu sınıf içerisinde de diğer sınıfları ilgilendirmeyen yolcunun neler
yapabileceği hakkında bilgi verecek değişkenler tanımladım.
Bu değişkenlere getter ve setter yazmadım ve erişim belirleyici
olarak private kullandım. Bu demek oluyor ki bu değişkenlere bu
sınıf haricinde hiçbir sınıftan erişim sağlanamaz
(okunamaz ve değiştirilemez). yolcununYapabilecekleriniYazdir
metodunda erişim belirleyici olarak public kullandım çünkü
AracKullanicisi sınıfı ile farklı paketlerde oldukları için
AracKullanicisi sınıfından erişilebilmeli.
 */
