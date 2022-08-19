package _12_breakContinueDeyimleri;

public class Break {
    public static void main(String[] args) {
        //break Komutu

    /*
    break continue deyimleri arasında break deyimi
    daha önceden anlattığımız for, while ve do-while
    döngüleriyle birlikte kullanılabilir.
    break deyimi döngülerden ansızın çıkmanızı ve döngüyü
    istediğiniz durumlarda sonlandırmanızı sağlamaktadır.
    Örneğin, bir veritabanından tüm id değerlerini çektiniz
    ve id değerlerinden ilk 15 tanesini listeleyeceksiniz.
    Eğer elinizde 15’ten fazla kayıt varsa döngüyü bir şekilde
    sonlandırmanız gerekmektedir.
     bu örneği bir de kod ile anlatalım;
     */

        int veritabaniKayitSayisi = 35;

        for(int i=1; i<veritabaniKayitSayisi; i++) {
            System.out.println(i + ". kayit");
            if(i == 15) {
                break;
            }
        }

        /*
        Yukarıdaki örnekte veritabanından gelen kayıt sayısını
        bir int tipinde değişkene elle atadık ve for döngüsüne
        sokarak kayıt sayılarını konsola yazdırdık.
        Kayıt sayısı 15’e eşit olduğunda break deyimi ile
        döngüden çıkmasını söyledik ve sonuç olarak konsol çıktımız
        aşağıdaki gibi oldu.

1. kayit
2. kayit
3. kayit
4. kayit
5. kayit
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
        break deyimini while ve do-while deyimleriyle aynı şekilde
         kullanabiliriz. Kısa bir örnek ile while döngüsü içerisinde
         break deyim kullanımını gösterebiliriz;
         */

        int veritabaniKayitSayisi2 = 35;
        int count = 1;
        while(veritabaniKayitSayisi2 >= 0) {
            System.out.println(count + ". kayit");
            if(count == 15) {
                break;
            }
            count++;
            veritabaniKayitSayisi2--;
        }

        /*
        Kullanım olarak hiç bir fark yok, döngü içinden ne zaman çıkmak
        istediğimize karar verdikten sonra bir if bloğu ile kolay bir
        şekilde döngüyü sonlandırabiliyoruz.
         */






    }

}
