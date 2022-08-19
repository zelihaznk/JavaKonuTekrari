package _17_dizilerdeArama_ArraySearch;

import java.util.Arrays;

public class BinarySearch_2 {
    public static void main(String[] args) {

        /*
        Bir onceki BinarySearch Class'ında bizim yazmış olduğumuz
        binarySearch methodunu kendimiz yazmadan da Java’da
        yazılmış olanı kullanabiliriz.
        Bunun için java.util.Arrays kütüphanesini projemize import
        ediyoruz. Örnek kullanım kodlarını paylaşıyorum.
         */

        int[] liste = {2, 4, 7, 10, 11, 45, 50, 52, 59, 60, 66, 69, 70, 79}; //Arrayimizi Sıralı biçimde oluşturduk

        int sayiIndex = Arrays.binarySearch(liste,66);//Arrays.binarySearch methoduna dizimizi ve aradığımız sayıyı gönderiyoruz

        if(sayiIndex >= 0){ //method 0 dan küçük dönmüyorsa aradığımız sayıyı bulmuşuz demektir
            System.out.println("Aranan sayinin index'i :"+sayiIndex);

        }else{ //sayı 0 dan küçük döndüğünde aradığımız sayı dizi içinde değildir.
            System.out.println("Aranan sayi bulunamadi.");
        }








    }
}
