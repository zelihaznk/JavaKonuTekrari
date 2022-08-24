package _29_arraysSinifi;

import java.util.Arrays;

public class Arrays_binarySearchMethodu {

    public static void main(String[] args)
    {
        int[] liste = {1, 4, 5, 11, 15,22, 33,66,67,68,75};//Dizi'mizi oluşturuyoruz

        //Dizide bir elemanın indeksini bulmak için Arrays.binarySearch() kullanırız
        //!!!!! Arrays.binarySearch() kullanabilmemiz için dizimiz SIRALI olmalıdır. !!!!
        //Eğer sıralı değilse Arrays.sort ile sıralayabilirsiniz

        int index = Arrays.binarySearch(liste,5); //bulunduğu indeksi döner,aradığımız sayı dizide mevcut değilse negatif bir sayı döner
        System.out.println("5'in indeksi :"+index);

    }

    /*
    OUTPUT:
    5'in indeksi :2
     */

}
