package _23_nesneYönelimProgramlama;

public class Polymorphism {

    //Çok Biçimlilik (Polymorphism)

    /*
    Çok Biçimliliği, ana sınıf içerisinde tanımlanan bir metodun
    alt sınıflarda değiştirilerek kullanılması olarak tanımlayabiliriz.
    Kalıtım başlığında verdiğimiz örnekte, Araba sınıfı içerisinde
    benzinDepoBuyuklugu nü dönen bir metot olsun. Bu metot binek ve
    ticari araç için farklı değerler dönerek birden fazla nesne
    tarafından farklı değerler şeklinde kullanılabilir,
    bu şekilde çok biçimlilik sağlanmış olur.

     */

    /*
    public class Araba {

    public double getBenzinDepoBuyuklugu() {
        return 50.0;
     }
    }
     */

    /*
    public class BinekAraba extends Araba {

    @Override
    public double getBenzinDepoBuyuklugu() {
        return 60.0;
    }
   }
     */

    /*
    public class TicariAraba extends Araba {

    @Override
    public double getBenzinDepoBuyuklugu() {
        return 100.0;
     }
   }
     */


}
