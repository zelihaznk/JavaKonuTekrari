package _12_breakContinueDeyimleri;

public class Continue {
    public static void main(String[] args) {

        //continue Komutu

        /*
       break continue deyimleri arasında continue deyimi yine
       break deyiminde olduğu gibi for, while ve do-while
       döngülerinde kullanılmaktadır. break deyiminden
       farklı olarak continue döngüyü sonlandırmamakta
       fakat döngüde ilgili tekrarı atlamaktadır (es geçmektedir).
       Örneğin bir veritabanından yine tüm kayıtları çektiniz ve
       bu kayıtlar arasından 5. kayıdı atlamak istiyor ve
       döngünün devam etmesini istiyorsunuz. Bu gibi durumlarda
       continue kullanılabilecek en güzel tercihtir.
       Şimdi bu örneği kod üzerinde gösterelim;
         */

        int veritabaniKayitSayisi = 15;
        for(int i =1; i<=veritabaniKayitSayisi; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println(i + ". kayit");
        }

        /*
        Yukarıdaki örnekte for döngüsü içerisinde if bloğunu tanımlayarak
        i değeri 5 olduğunda continue ile döngünün bir sonraki değer
        için başa dönmesini sağladık. Bu şekilde konsol ekranına
        5. kayıt şeklinde yazılmasının önüne geçmiş olduk.
        İlgili örneğin konsol çıktısı şu şekildedir;

1. kayit
2. kayit
3. kayit
4. kayit
6. kayit
7. kayit
8. kayit
9. kayit
10. kayit
11. kayit
12. kayit
13. kayit
14. kayit
15. kayit
         */

        /*
        Yine diğer örneklerde olduğu gibi continue deyimi
        while içerisinde ve do-while döngüsü içerisinde kullanılabilmektedir.

         break continue deyimleri hakkında anlatacaklarımız bu kadar,
         Java dilinde döngüleri kullanırken bu deyimler oldukça büyük önem
         kazanmaktadırlar. Kullanım alanları ise oldukça geniştir.
         */



    }

}
