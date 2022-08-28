package _01_veriTipleriVeDegiskenler;

public class Float {
    public static void main(String[] args) {

        /*
        FLOAT: float veri tipi 32 bitlik büyüklüğe sahiptir ve
        1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
        float olarak belirlenmiş olan veri tipine integer bir değer
        atandığı takdirde java tarafından direk olarak 1.0 şeklinde algılanır.
         Geliştirme aşamasında hata oluşmaz. Fakat float veri tanımlarken
          (.) noktadan sonra değişken değerinin sonuna “f” veya “F” koyulmadığı
          takdirde geliştirme esnasında hata alınacaktır. Sebebi ise javanın
          bu değişkeni double olarak algılayacak olmasıdır.
          Aşağıdaki örneklerle konuya biraz daha açıklık getirmeye çalışalım.
         */

        float floatDeger1 = 35.4f; //dogru tanim
        System.out.println(floatDeger1);
        float floatDeger2 = 4.5F; //dogru tanim
        System.out.println(floatDeger2);
        float floatDeger3 = 67; //dogru tanim
        System.out.println(floatDeger3);
        //float floatDeger4 = 45.0; //hatali tanim
        //float floatDeger5 = 34.65; //hatali tanim

        /*
        float veri tipinin sonuna “f” veya “F” koyulmadığında Java bu
        tanımlamadaki veri tipini double olarak algılayacağı için geliştirme
        anında hata verecektir. Kod geliştirirken float anahtar kelimesi ile
        tanımlama yapılır.
         */

    }
}
