package _02_javaStringVeriTipi;

public class toUpperCase_toLowerCase {
    public static void main(String[] args) {

        /*
        Bu şekilde String verileri bölüp istediğiniz kısmı yazdırabileceğiniz
        gibi yine String veri tipinin özelliklerinden faydalanarak tüm harfleri
        büyük veya tüm harflari küçük şekilde yazdırabilirsiniz.
         */


        String stringDeger = "Hello Java, Hello Word";
        System.out.println(stringDeger.toUpperCase()); //HELLO JAVA, HELLO WORD
        System.out.println(stringDeger.toLowerCase()); //hello java, hello word

        String stringDeger1 = "Ben Java'yi Ogrenecegim.";
        System.out.println(stringDeger1.toUpperCase());
        System.out.println(stringDeger1.toLowerCase());


    }
}
