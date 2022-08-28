package _02_javaStringVeriTipi;

public class substring_charAt {
    public static void main(String[] args) {

        //Farklı bir String veri tipi tanımlama yöntemi
        String stringDeger = new String("Hello Word, Hello Java");
        System.out.println(stringDeger); // Hello Word, Hello Java

        //String değerden bir karakter çekme
        char charDeger = stringDeger.charAt(9);
        System.out.println(charDeger); // d

        //Substring kullanımı
        String substringDeger = stringDeger.substring(12);
        System.out.println(substringDeger); //Hello Java

        //Substring kullanımı
        String substringDeger1 = stringDeger.substring(12,17);
        System.out.println(substringDeger1); // Hello







    }
}
