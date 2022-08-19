package _18_dizilerdeSiralama_ArraySort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        //Selection Sort

        /*
        Öncelikle Seçmeli Sıralama’nın mantığını anlatmaya çalışacağım,
        sonrasında ise bir örnekle devam edeceğim. Seçmeli sıralamada,
        sırası ile tüm elemanlar ele alınıp, dizinin sonuna kadar
        o elemandan küçük eleman olup olmadığı kontrol edilir ve
        en küçük eleman bulunup eldeki sayı ile değiştirilir.

        Daha açık anlatmak gerekirse , listenin 1. elemanın değeri alınır
        ve dizinin sonuna kadar tüm elemanlar kontrol edilir en
        küçük eleman bulunur ve 1. sıradaki eleman ile yer değiştirilir.
        Artık en küçük eleman 1. sırada yer almaktadır. 1. sıradaki
        elemanı tekrardan kontrol etmek gerekmediği için 2.sıradaki
        elemana geçilir ve aynı işlem tekrarlanarak
        son elemana kadar gidilir.

        Kendi oluşturmuş olduğum liste’yi nasıl selection sort ile
        listelediğimi de paylaşayım.

        Kod üzerinde açıklama yapmaya çalıştım.
         */

        int[] liste = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz

        for (int i = 0; i < liste.length-1; i++) { //Dizimizin değerlerini sırası ile alıyoruz

            int sayi = liste[i]; //sıradaki değeri sayi değişkenine atıyoruz
            int temp = i; //sayi 'nin indeksini temp değerine atıyoruz

            for (int j = i+1; j < liste.length ; j++) { //dizimizde i' den sonraki elemanlara bakıyoruz
                if(liste[j]<sayi){ //sayi değişkeninden küçük sayı var mı
                    sayi = liste[j]; //varsa sayi değişkenimizide değiştiriyoruz
                    temp = j; //indeks değerinide değiştiriyoruz
                }
            }

            if(temp != i){ //temp değeri başlangıç değeri ile aynı değil ise , yani list[i]'nin değerinden küçük sayı varsa onları yer değiştiriyoruz
                liste[temp] = liste[i];
                liste[i] = sayi;
            }

        }

        for (int sayi:liste) {
            //Bu kısım sıralama ile ilgili değil sadece sıralamanın doğru calısıp calısmadıgını kontrol etmek için
            System.out.println(sayi);

        }





        System.out.println("**********************************");

        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("Orijinal dizi: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nSıralanan dizi: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }






    }
}
