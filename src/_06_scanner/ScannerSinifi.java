package _06_scanner;

import java.util.Scanner;
public class ScannerSinifi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//Kullanıcıdan string değer alabilmek için Scanner sınıfını kullandık
        System.out.println("Lutfen mesajinizi giriniz :");
        String mesaj = scan.nextLine(); //String değeri burda alıyoruz
        System.out.println("Mesajiniz : " + mesaj);

        /*
        Girmiş olduğunuz mesajı konsola bastıracaktır.
         Şimdi kullanıcıdan dört sayı isteyelim ve bu sayıların toplamını
         konsola bastıralım.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz");
        int sayi2 = input.nextInt();
        System.out.println("Lutfen 3. sayiyi giriniz");
        int sayi3 = input.nextInt();
        System.out.println("Lutfen 4. sayiyi giriniz");
        int sayi4 = input.nextInt();
        System.out.println("Toplam :" +(sayi1+sayi2+sayi3+sayi4));

        /*
        Yukarıdaki iki örnekten gördüğümüz gibi nextLine() ile string değerini nextInt() ile int değerini aldık. Diğer tiplerde değerler alabilmek için aşağıdaki şekillerde kullanabiliriz.
         nextLine() -> String
        nextInt() -> Integer
        nextByte() -> Byte
        nextFloat -> Float
        nextDouble -> Double
         */








    }

}
