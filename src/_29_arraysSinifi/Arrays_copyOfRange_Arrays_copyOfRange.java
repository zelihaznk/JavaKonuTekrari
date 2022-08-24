package _29_arraysSinifi;

import java.util.Arrays;

public class Arrays_copyOfRange_Arrays_copyOfRange {

    public static void main(String[] args)
    {
        int[] liste = {1, 4, 5, 11, 15,22, 33,66,67,68,75};//Dizi'mizi oluşturuyoruz

        //Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf metotu kullanılır
        int[] copyArray = Arrays.copyOf(liste, 3);
        System.out.println(Arrays.toString(copyArray));

        //Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için
        int[] copyOfRangeArray = Arrays.copyOfRange(liste, 0,5); //0-5 aralığı
        System.out.println(Arrays.toString(copyOfRangeArray));

    }

    /*
    OUTPUT:
    [1, 4, 5]
    [1, 4, 5, 11, 15]
     */


}
