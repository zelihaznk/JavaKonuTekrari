package _18_dizilerdeSiralama_ArraySort;

import java.util.Arrays;

public class SortOrnek {
    public static void main(String[] args) {
        /*
        Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.
         */


        int[] liste = {1232, 1134, 2345, 1022};

        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

        String [] kelime = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        Arrays.sort(kelime);
        System.out.println(Arrays.toString(kelime));
    }
}
