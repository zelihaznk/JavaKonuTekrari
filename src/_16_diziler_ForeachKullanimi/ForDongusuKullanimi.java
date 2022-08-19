package _16_diziler_ForeachKullanimi;

public class ForDongusuKullanimi {
    public static void main(String[] args) {

       //Diziler for döngüsü kullanımı:

       /*
        Dersimiz forach döngüsü kullanımı , ancak dizilerin for döngüsü
        ile kullandımdan da bahsetmemiz gerekiyor. Anlatımı örnekler
        üzerinden yapacağım.
        Gelelim örnek kullanımlara:

        Dizinin tüm elemanlarına 1-100 arasında random değerler atama.
        */

        int[] sayi = new int[10];//uzunluğu 10 olan diziyi oluşturduk

        for (int i = 0; i < sayi.length; i++) {
            sayi[i] = (int) (Math.random()*100); //tek tek değer atıyoruz
        }

        //Atadığımız bu değerleri ekrana yazdıralım:

        for (int i = 0; i < sayi.length; i++) {
            System.out.println(sayi[i] + " ");//9 67 98 7 52 85 68 77 84 13
        }

        System.out.println("***************");

        /*
        Şimdi küçük bir örnekle for döngüsünü pekiştirelim.
        Örnek: Uzunluğu 100 olan int bir diziye önce 1-999 arasında
        random değerler atayalım. Sonra atadığımız bu değerler arasında
        en büyük olan sayıyı ve o sayının dizideki index’ini bulalım.
         */

        int[] sayi2 = new int[100];//Uzunluğu 100 olan diziyi oluşturduk

        for (int i = 0; i < sayi2.length; i++) {
            sayi2[i] = (int) (Math.random()*1000); ////Tüm elemanlarına 0-999 arasında değerler atıyoruz
        }

        int index = 0;//başlangıç değerleri
        int max = 0;//başlangıç değerleri

        for (int i = 0; i < sayi2.length; i++) {
            if (sayi2[i]>max){ //max sayıdan büyük ise
                max=sayi2[i]; //max sayı değiştiriliyor
                index=i; //ve index alınıyor
            }
        }
        System.out.println("En buyuk sayi :" +max+" index :"+index);//En buyuk sayi :980 index :80







    }
}
