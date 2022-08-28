package _04_ifElseKosulYapisi_AndOr;

public class and_or_ornek {
    public static void main(String[] args) {

        int x = 55;

        if (x>5 && x<10){
            System.out.println("5'den buyuk 10'dan kucuk");
        }else {
            System.out.println("5'den buyuk 10'dan kucuk degil");
        }
        //Output : 5'den buyuk 10'dan kucuk degil

        /*
        Yukarıda AND kullanımına basit bir örnek verdik.
        x değerimiz 8 olduğunu varsayarsak x 5 ten büyük olduğu için
        x>5 koşulu true dönecektir aynı şekilde x<10 true dönecektir.
        AND kullanımında tüm değerler true ise if bloğuna girecektir.
        x değerimizin 13 olduğunu varsayalım. x>5 koşulu true ancak
        x<10 değeri false dönecektir. Dolayısıyla koşulumuz false dönecek
        else bloğu çalışacaktır.
         */

        int y =8;

        if (y>5 || y<10){
            System.out.println("5'den buyuk 10'dan kucuk");
        }else {
            System.out.println("5'den buyuk 10'dan kucuk degil");
        }
        //Output : 5'den buyuk 10'dan kucuk

        /*
        Yukarıdaki kodda ise OR kullanımına örnek verdik. x değerimiz 7,
        y değerimiz 9 olsun. x>5 true, y<10 true dönecek true || true => true
        dönecektir.

        x değerimiz 7, y değerimiz 13 olsun. x>5 true, y <10 false dönecek ,
        true || false => true dönecek

        x değerimiz 3, y değerimiz 13 olsun. x>5 false,y < 13 false dönecek ,
        false || false => false dönecek ve else bloğu çalışacak
         */



    }
}
