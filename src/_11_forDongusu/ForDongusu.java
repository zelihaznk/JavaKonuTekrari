package _11_forDongusu;

public class ForDongusu {
    public static void main(String[] args) {

        int i = 0;

        //for dongusu kullanmadan
        System.out.println("Deger: " + i);
        System.out.println("Deger: " + (i+1));
        System.out.println("Deger: " + (i+2));
        System.out.println("Deger: " + (i+3));
        System.out.println("Deger: " + (i+4));
        System.out.println("Deger: " + (i+5));
        System.out.println("Deger: " + (i+6));
        System.out.println("Deger: " + (i+7));
        System.out.println("Deger: " + (i+8));
        System.out.println("Deger: " + (i+9));


        System.out.println("*********************");

        //for dongusu kullanarak
        for(i = 0; i < 10; i++) {
            System.out.println("Value: " + i);
        }


        /*
        görmüş olduğunuz gibi for döngüsü
        ile çok daha kolay bir şekilde yazdırabildik.
         */

        /*
        Önemli Not: “System.out.println(“Deger: ” + (i+2));”
        satırında değişkeni (i+2) şeklinde yazmamızın sebebi,
        “Deger: ” + dan sonrasını String tipinde göreceği için
        eğer matematiksel işlemi parantez içerisinde yapmazsak
        ekrana verileri 0, 01, 02, 03 … şeklinde yazdırdığını görürüz.
         */

    }
}
