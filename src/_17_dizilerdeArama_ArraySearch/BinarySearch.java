package _17_dizilerdeArama_ArraySearch;

public class BinarySearch {
    public static void main(String[] args) {

        //2- Binary Search

        /*
         Sıralı olan büyük dizilerde Binary Search yapmak daha etkili
         bir yöntemdir. Binary Search için dizimiz sıralı olmak zorundadır.

         Binary Search çalışma mantığını kısaca anlatmaya çalışayım.
         Öncelikle dizinin ortanca elementinin değeri alınır.
         Dizimiz sıralı olduğu için ortanca değer , aranan değerden büyük mü ,
         küçük mü ve ya eşit mi diye bakılır. Eğer ortanca değer aranan
         değerden büyükse dizinin ortanca değerden sonraki değerlerine
         artık bakılmaz. Çünkü değerimiz başlangıç değeri ile ortanca
         değer arasındadır. Tam tersi olarak ortanca değer aranan
         değerden küçük ise dizinin ortanca değerinden önceki değerlerine
         bakılmaz. Bu işlem ortanca değer aranan değere eşit olana kadar
         devam eder.

         Kod üzerinden anlatım yapacağım.

         */

        int[] liste = {2, 4, 7, 10, 11, 45, 50, 52, 59, 60, 66, 69, 70, 79}; //Arrayimizi Sıralı biçimde oluşturduk

        int sayiIndex = binarySearchh(liste,52); //binarySearch methoduna dizimizi ve aradığımız sayıyı gönderiyoruz
        if (sayiIndex != -1){//method -1 dönmediyse sayı bulunmuştur
            System.out.println("Aranan sayinin index'i :" +sayiIndex);
        }else {//-1 döndüğünde -1 dönecek ve else düşecek
            System.out.println("Aranan sayi bulunamadi.");
        }


    }

    private static int binarySearchh(int[] liste, int key) {
        int baslangic = 0;//dizinin başlangıç index'i
        int son = liste.length-1;//dizinin bitiş index'i
        int orta;//dizinin ortanca index'i

        while (baslangic<=son){//baslangic sondan büyük olana kadar devam edecek , zaten başlangıç değeri sondan büyğk olursa aradığımız eleman dizide yok demektir
            orta = (int) (baslangic+son)/2; //her seferinde ortanca değer bulunucak
            if (liste[orta]>key){//ortanca değer aranan değerden büyükse array ikiye bölünecek
                son = orta-1;//son değer, ortanca değerden 1 önceki değer olacak

            }else if (liste[orta]==key){//aranan bulundu
                return orta;//indexi dön
            }else {//ortanca değer aranan değerden küçükse
                baslangic =orta+1;//baslangıç değeri, ortanca değerden 1 sonraki değer olacak
            }
        }
        return -1;//sonuç bulunamazsa -1 dönecek
    }
}
