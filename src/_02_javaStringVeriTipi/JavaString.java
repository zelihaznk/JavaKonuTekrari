package _02_javaStringVeriTipi;

public class JavaString {
    public static void main(String[] args) {

        char[] chars = {'M','e','r','h','a','b','a'};
        String stringDeger = new String(chars);
        System.out.println(stringDeger); //Konsol Çıktısı: Merhaba

        /*
        Yukarıda ki örnekten de görebileceğiniz gibi kodu koşturduğumuzda
         konsol ekranına “Merhaba” yazdığını göreceksiniz. Elbette kod yazarken
         Java String veri tipi bu şekilde karakterleri tek tek yazarak
         elde edilmiyor. Bunu yerine aşağıdaki şekilde bir Java String veri tipi
         tanımlaması yapabiliriz.
         */

        String stringDeger2 ="Merhaba Java :)";
        System.out.println(stringDeger2); //Merhaba Java :)




    }
}
