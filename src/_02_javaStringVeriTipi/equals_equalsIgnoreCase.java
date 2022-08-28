package _02_javaStringVeriTipi;

public class equals_equalsIgnoreCase {
    public static void main(String[] args) {

       /*
       String veri tipini kullanarak iki metin birbiriyle aynı mı metin
       içerisinde bir kelime geçiyor mu gibi kontrollerde gerçekleştirebiliriz.
        */

        String stringDeger = "Hello Java, Hello Word";
        boolean durum1 =stringDeger.equals("Hello Java, Hello Word");
        System.out.println(durum1); //true

        boolean durum2 = stringDeger.equals("hello java, hello word");
        System.out.println(durum2); //false cıktısı verir cunku buyuk kucuk harf duyarlıdır

        boolean durum3 = stringDeger.equalsIgnoreCase("hello java, hello word"); //Yazı büyük ve ya küçük harf olması önemsiz
        System.out.println(durum3); //true cıktısı verir cunku equalsIgnoreCase buyuk kucuk harfe bakmaz




    }
}
