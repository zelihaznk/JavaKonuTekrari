package _03_ifElseKosulYapisi;

public class ifElseOrnek {
    public static void main(String[] args) {

        //Kosul saglayan durum

        int x = 3;

        if (x>0){
            int z = x*5;
            System.out.println("z degeri : " + z); //z degeri : 15
        }

        //Kosul saglamayan durum

        int xx = 0;

        if (xx>0){
            int yy = xx*5;
            System.out.println("yy degeri : " + yy); ////Herhangi konsol çıktısı olmuyacaktır.
        }

        /*

        Yukarıda gördüğünüz gibi x’imiz 0 olduğu için x>0 koşulu false dönecektir.
        Yani if bloğundaki kodun çalışabilmesi için if koşulunun true olması gerekmektedir.
        Aslında if(true)  ise if bloğundaki kodlar çalışır.

        Peki diyelim ki if koşulu sağlanamazsada başka bir kod bloğu çalıştırmak istiyorsak,
        yani yukarıdaki örnekten yola çıkarak x’imiz 0 dan büyük değilse başka bir işlem yaptırmak
        istiyorsak, bu durumda else bloğu çalışacaktır. Zaten yapı genel olarak if-else olarak kullanılır.
        Yani koşul sağlanırsa if bloğu içindeki kodlar çalışır, sağlanmazsa else bloğu içindeki kodlar çalışır.

        Yukarıda if else yapısının dışında birden çok kontrol sağlayacağımız
        if – else if – else yapımızda bulunmaktadır. Onuda aşağıdaki kod ile
        anlatmaya çalışacağım.


         */

         int a = 55;

         if (x>90){
             System.out.println("a 90'dan buyuktur");
         }else if (a>=80){
             System.out.println("a 90 ile 80 arasında");
         }else if (a>=70){
        System.out.println("a 80 ile 70 arasında");
         }else if (a>=60){
             System.out.println("a 70 ile 60 arasında");
         }else if (a>=50){
             System.out.println("a 60 ile 50 arasında");
         }else if (a>=40){
             System.out.println("a 50 ile 40 arasında");
         }else if (a>=30){
             System.out.println("a 40 ile 30 arasında");
         }else if (a>=20){
             System.out.println("a 30 ile 20 arasında");
         }else if (a>=10){
             System.out.println("a 20 ile 10 arasında");
         }else if (a>=0){
             System.out.println("a 10 ile 0 arasında");
         }else {
             System.out.println("a 0'dan kucuktur");
         }

         //Output : a 60 ile 50 aras�nda








    }
}
