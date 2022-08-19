package _19_arraysSinifi;

import java.util.Arrays;

public class _copyOf_copyOfRange {
    public static void main(String[] args) {

        int[] liste = {1, 4, 5, 11, 15,22, 33,66,67,68,75};//Dizi'mizi oluşturuyoruz

        //Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için
        // Arrays.copyOf metotu kullanılır

        int[] copyArray = Arrays.copyOf(liste,3);
        System.out.println(Arrays.toString(copyArray)); //[1, 4, 5]

        //Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için

        int [] copyOfRangeArray = Arrays.copyOfRange(liste,3,9);//3-9 aralığı
        System.out.println(Arrays.toString(copyOfRangeArray));//[11, 15, 22, 33, 66, 67]





    }
}
