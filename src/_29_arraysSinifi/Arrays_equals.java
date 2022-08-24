package _29_arraysSinifi;

import java.util.Arrays;

public class Arrays_equals {

    public static void main(String[] args)
    {
        int[] list1 = {1, 5, 52};
        int[] list2 = {1, 5, 52};
        int[] list3 = {1, 5, 53};

        //İki dizi birbirinin aynısı olup olmadığını kontrol etmek için Arrays.equals() metotu kullanılır
        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false

    }

}
