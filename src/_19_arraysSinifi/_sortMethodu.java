package _19_arraysSinifi;

import java.util.Arrays;

public class _sortMethodu {
    public static void main(String[] args) {
        int[] liste = {1, 4, 99, 2, 5, -3, 6, 2, -49, 52};//Dizi'mizi oluşturuyoruz

        //Diziyi sıralamak için Arrays.sort() kullanırız
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));


    }
}
