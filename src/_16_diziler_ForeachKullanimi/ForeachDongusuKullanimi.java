package _16_diziler_ForeachKullanimi;

public class ForeachDongusuKullanimi {
    public static void main(String[] args) {

        //Diziler foreach döngüsü kullanımı:

        /*
        Aslında Java’da foreach adında bir döngü çeşidi bulunmamaktadır.
        Foreach , C#, Php, Javascript gibi dillerde kullanılmaktadır.
        Java’da ise for içinde( ancak bu dersimize kadar kullandığımız
        for yapısından farklı bir şekilde )kullanılmaktadır.
        Yine nasıl kullanıldığını örnekler üzerinden anlatacağım.

        Dizi değerlerini okuma:
         */

        int[] sayilar = {100,200,300,400,500,600,700,800,900,1000}; //dizi tanımlanıyor

        for (int sayi: sayilar) { //sayılar dizisinin değeri tek tek sayi değişkenine atanıyor
            System.out.print(sayi + " ");//Yan yana yazdırmak için .println yerine .print kullandık
        }
        /*
        Konsol Çıktısı:
        100 200 300 400 500 600 700 800 900 1000
         */

        System.out.println("**********************");

        /*
        Gördüğünüz gibi normal for döngüsünden farkı index’i ile
        ilgilenmeden tüm değerlerine ulaşabiliyoruz.
        Bu foreach döngüsü dizinin uzunluğu kadar dönecektir
        ve her seferinde bir sonraki değeri int sayi’ya atıyacaktır.
        Foreach kullanarak genel olarak dizinin tüm değerlerini
        okuyabiliriz fakat değer atamak için foreach kullanmayız.
        Değer atamak için normal for döngüsü kullanabiliriz.

        Yukarıdaki örneğe çok benzer bir örnek verelim.
         */

        String[] meyveler = new String[]{"Portakal","Elma","Armut","Cilek"};

        for (String meyve:meyveler) {
            System.out.print(meyve+" "); //Portakal Elma Armut Cilek
        }

        System.out.println("************************");

        /*
        Örnek: Uzunluğu 100 olan int bir diziye önce 1-999 arasında
        random değerler atayalım. Sonra atadığımız bu değerler arasında
        en büyük olan sayıyı bulalım. En büyük sayıyı bulma işlemini
        foreach ile yapalım.
         */

        int [] sayilar2 = new int[100]; //Uzunluğu 100 olan diziyi oluşturduk
        int max = 0;

        for (int i = 0; i < sayilar2.length ; i++) {
            sayilar2[i] = (int)(Math.random()*1000); //Tüm elemanlarına 0-999 arasında değerler atıyoruz
                                                    //başlangıç değerleri
        }

        for (int sayi2 : sayilar2) { //Değerleri okumak için foreach

            if(sayi2 > max){ //max sayıdan büyük ise
                max = sayi2; //max sayı değiştiriliyor
            }
        }
        System.out.println("En buyuk sayi : "+max); //En buyuk sayi : 995












    }
}
