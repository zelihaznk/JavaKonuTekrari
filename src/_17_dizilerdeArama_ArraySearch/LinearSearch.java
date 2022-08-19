package _17_dizilerdeArama_ArraySearch;

public class LinearSearch {
    public static void main(String[] args) {

        /*
        Dizilerde genel olarak 2 şekilde arama yapabiliriz.
        1.si Linear Search, ikincisi ise Binary Search‘tür.
        Öncelikle şunu bildirelim ki Binary Search yapabilmemiz
        için dizimiz sıralı olmalıdır. Ya büyükten küçüğe
        ya da küçükten büyüğe sıralanmış olmalıdır.
        Gelelim nasıl yapacağımıza. Ben direk kod üzerinden
        anlatmaya çalışacağım.
         */


        //1- Linear Search

        /*
        Linear Search , sıralı olmayan dizilerde ve küçük olan sıralı
        dizilerde arama yaparken kullanılır. Sıralı olup büyük olan
        dizilerde ise Binary Search kullanmak daha etkilidir.

        Gelelim Linear Search kullanımına. Direk örnek üzerinden anlatacağım.
         */

        int[] liste = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz

        int sayiIndex = linearSearchh(liste,52); //linearSearch methoduna dizimizi ve aradığımız sayıyı gönderiyoruz
        if (sayiIndex != -1){  //method -1 dönmediyse sayı bulunmuştur
            System.out.println("Aranan sayinin index'i :"+sayiIndex);
        }else { //-1 döndüğünde -1 dönecek ve else düşecek
            System.out.println("Aranan sayi bulunamadi");
        }




    }

    private static int linearSearchh(int[] liste, int arananSayi) {

        for (int i = 0; i < liste.length; i++) {//döngümüz dizimizin uzunluğu kadar dönüyor
           if (liste[i] == arananSayi){//sırası ile tüm elemanlara bakıyourz
               return i; //eğer aradığımız elemanı bulduysak index'ini geri gönderiyoruz
           }
        }
        return -1;//Herhangi  bir değer bulunamadıysa -1 dönderiyoruz

    }
}

//Yukarıda da gördüğünüz gibi Linear yani doğrusal arama yaptık. Sırası ile tüm elemanlara baktık.
