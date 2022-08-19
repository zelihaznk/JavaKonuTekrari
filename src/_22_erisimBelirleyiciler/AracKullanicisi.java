package _22_erisimBelirleyiciler;

public class AracKullanicisi {

    public static void main(String[] args) {

        /**
         * OzelArac sınıfından bir nesne olusturuldu.
         */

        OzelArac ozelArac = new OzelArac();

        /**
         * protected erişim tipi ile tanımlanan metot aynı paket içinden çağrıldı.
         */

        ozelArac.arabayiCalistir();

        /**
         * setter yapısı protected olarak tanımlanan camlarAcilabilir değişkeni aynı paket içindeki
         * AracKullainicisi tarafından setlenebildi.
         */

        ozelArac.setCamlarAcilabilir(true);

        /**
         * setter yapısı protected olarak tanımlanan kapilarAcilabilir değişkeni aynı paket içindeki
         * AracKullainicisi tarafından setlenebildi.
         */

        ozelArac.setKapilarAcilabilir(false);

        Yolcu yolcu = new Yolcu();
        System.out.println("If-Else yapisi ile yaz:");
        yolcu.yolcununYapabilecekleriniYazdir(ozelArac);
        System.out.println("? : yapisi ile yaz:");
        yolcu.yolcununYapabilecekleriniYazdir1(ozelArac);


        /*
        AracKullanicisi sınıfı benim ana sınıfım yapıyı buradan
        çalıştırıyorum, bu sebeple AracKullanicisi sınıfı içerisinde
        main metodum var. Bu main metot içerisinde bir tane OzelArac
        nesnesi tanımlıyorum ve arabayı çalıştırmak için arabayiCalistir
        metodunu tetikliyorum. Arabayı çalıştırdıktan sonra araç
        kullanıcısı olarak yolcuları düşünüyorum ve onlar için ufak
        bazı önlemler alıyorum. Sadece OzelArac sınıfı ve
        AracKullanicisi sınıflarından erişim sağlanabilecek
        setCamlarAcilabilir ve setKapilarAcilabilir metotlarına değer atıyorum.
         */




    }
}
