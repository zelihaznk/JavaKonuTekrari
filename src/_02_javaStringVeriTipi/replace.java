package _02_javaStringVeriTipi;

public class replace {
    public static void main(String[] args) {

       /*
       String tipinin bir başka özelliği de değer olarak atanmış
       metin içerisinde istediğimiz bir karakteri yine istediğimiz
       bir karakterle değiştirebiliyor olmamızdır.
        */

        String stringDeger = "Hello Java, Hello Word";
        System.out.println(stringDeger.replace("e", "i")); //Hillo Java, Hillo Word
        System.out.println(stringDeger.replace("Hello", "Merhaba")); //Merhaba Java, Merhaba Word


    }
}
