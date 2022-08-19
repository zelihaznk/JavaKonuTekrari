package _19_arraysSinifi;

import java.util.Arrays;

public class _equalsMethodu {
    public static void main(String[] args) {

        int[] list1 = {1, 5, 52};
        int[] list2 = {1, 5, 52};
        int[] list3 = {1, 5, 53};

        //İki dizi birbirinin aynısı olup olmadığını
        // kontrol etmek için Arrays.equals() metotu kullanılır

        System.out.println(Arrays.equals(list1,list2));//true
        System.out.println(Arrays.equals(list2,list3));//false

        /*
        Hem Arrays sınıfı’nı kullanırken hemde genel olarak dizilerle
        çalışırken dizilerin uzunluklarına dikkat ederek çalışmamız
        gerekiyor. Örneğin 3 elemanı olan bir dizinin 5. elemanından
        sonrasını kopyalamaya çalışırsanız hata alırsınız.
        “IndexOutOfBoundsException” bu hata ile karşılaşırsanız
        bilin ki dizinizin boyuyla alakalı hatalı işlem yapıyorsunuz.
         */






    }
}
