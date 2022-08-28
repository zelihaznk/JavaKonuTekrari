package _09_whileDongusu;

public class WhileDongusuOrnek_Toplama {
    public static void main(String[] args) {

     //1’den 20’ye kadar olan tam sayıların toplamı:

     int toplam =0;
     int i =0;

     while (i<20){
         toplam = toplam+i;
         i++;
     }
        System.out.println("Toplam : " + toplam);

     /*
     NOT: Yukarıdaki kodda eğer i ‘yi i++; şeklinde 1 arttırmazsak,
     i her zaman 0 olarak kalacak ve her zaman 20 den küçük kalacaktır.
     Dolayısıyla sonsuz döngü oluşacaktır.
      */













    }
}
