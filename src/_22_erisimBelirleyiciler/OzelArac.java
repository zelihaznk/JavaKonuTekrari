package _22_erisimBelirleyiciler;

public class OzelArac {

    private boolean camlarAcilabilir;
    private boolean kapilarAcilabilir;
    
    public OzelArac(){
        motorDegerleriniKontrolEt();
    }

    private void motorDegerleriniKontrolEt() {
        System.out.println("Arabanin motor degerlerinin kontrol edilmesi tamamlandi.");
    }

    protected boolean arabayiCalistir(){
        System.out.println("Arabayi calistirmak icin tetikleme yapildi");
        System.out.println("Araba basarili bir sekilde calisti");

        return true;
    }

    public boolean isCamlarAcilabilir(){
        return camlarAcilabilir;
    }

    protected void setCamlarAcilabilir(boolean camlarAcilabilir){
        this.camlarAcilabilir = camlarAcilabilir;
    }

    public boolean isKapilarAcilabilir() {
        return kapilarAcilabilir;
    }

    protected void setKapilarAcilabilir(boolean kapilarAcilabilir){
        this.kapilarAcilabilir =kapilarAcilabilir;
    }


    /*
    Bu sınıfta ne yaptığımı hemen anlatayım. Öncelikle camlarAcilabilir
    ve kapilarAcilabilir olarak iki tane boolean veri tipine sahip
    değişken tanımladım. Bu değişkenlere başka sınıflardan erişim
    olmasın diye erişim belirleyici olarak private tanımladım.

    Sadece OzelArac’ın kendisini ilgilendiren motorDegerleriniKontrolEt
    adında bir metot tanımladım ve bu metodun erişim belirleyicisini de
    private olarak tanımladım. Çünkü bunu OzelArac kendi içerisinde
    yapacak ve AracKullanicisi’na sadece bilgi verecek.
    Bu metodu constructor içerisinde tetikleyerek OzelArac nesnesi
    her oluştuğunda motor kontrollerinin yapılmasını sağladım.

    AracKullanicisi sınıfını OzelArac sınıfı ile aynı paket içinde
    oluşturacağım için , arabayiCalistir metodunun erişim belirleyicisini
    protected olarak belirledim. Ardından aynı mantıkla boolean
    veri tipine sahip değişkenlerimin değerlerini sadece
    AracKullanicisi değiştirebileceği için setter metotlarını
    protected tanımlarken getter metotlarına herkes erişebilsin
    diye public olarak tanımladım.
     */
}
