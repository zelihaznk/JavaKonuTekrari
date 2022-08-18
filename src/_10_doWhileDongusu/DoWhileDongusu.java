package _10_doWhileDongusu;

public class DoWhileDongusu {
    public static void main(String[] args) {

        /*
        Burada bahsetmemiz gereken ilk konu herkesin kafasında soru işareti
        olarak beliren, do while döngüsü ile while döngüsü arasındaki fark nedir?

        Bu sorunun en basit cevabı, while döngüsü ne verilen ifade doğru değil
         ise kod while döngüsü içerisine hiç girmeden sonraki satır
         ile işlemlere devam eder, do while döngüsü nde ise ifadenin
         doğru olup olmamasına bakmaksızın döngü bir sefer çalışır.
         Dilerseniz bu yapıyı daha iyi anlayabilmeniz için örnekle anlatalım;
         */

        int count = 1;
        while(count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        int doCount = 1;
        do{
            System.out.println("DoCount is: " + doCount);
            doCount++;
        } while(doCount < 11);

/*
yukarıda görmüş olduğunuz while döngüsüne ve do while döngüsüne ait
konsol çıktıları aynı olacaktır.
 */

        /*
Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Count is: 6
Count is: 7
Count is: 8
Count is: 9
Count is: 10
DoCount is: 1
DoCount is: 2
DoCount is: 3
DoCount is: 4
DoCount is: 5
DoCount is: 6
DoCount is: 7
DoCount is: 8
DoCount is: 9
DoCount is: 10
         */

        /*
        Burada while döngüsü önce döngüye girip sonra yazarken
        do while döngüsünde önce yazıp sonraya döngüye girilmektedir.
        Bunu şu şekilde bir örnek ile daha iyi pekiştirebiliriz;
         */

        System.out.println("****************************");

        int count2 = 11;
        while(count < 11) {
            System.out.println("Count2 is: " + count2);
            count2++;
        }

        int doCount2 = 11;
        do{
            System.out.println("DoCount2 is: " + doCount2);
            doCount2++;
        } while(doCount2 < 11);

        /*
        Bu adımda sadece count ve doCount değişken değerlerini
        11 olarak değiştirdik. Bu kodu çalıştırdığımızda konsol çıktısı
        aşağıdaki gibi olacaktır.
         */

        //OUTPUT : DoCount2 is: 11

        //do while döngüsünü bir kodun kesin bir kez çalışması gerektiği yerlerde kullanılabilir.














    }
}
