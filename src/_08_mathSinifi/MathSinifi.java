package _08_mathSinifi;



public class MathSinifi {
    public static void main(String[] args) {

        /*

        Math Sınıfının methodları static methoddur.
        Ancak kısaca bahsetmek gerekirse bir sınıfın static
        olmayan bir method yada değişkenine erişmek için o sınıftan
        bir Obje oluşturmak gerekiyor. Bu nasıl oluyor diyorsak aşağıda
        bir sınıfın hem static methoduna hemde static olmayan methoduna
        nasıl erişilir örnek vereceğim.

         */


        // Static olmayan methoda ulaşmak için önce o sınıftan new kelimesi bir obje yaratılır.

        //Deneme deneme = new Deneme(); // Obje oluşturuldu

      /*
deneme.ornekMethod(); //static olmayan methoda ulaşıldı

//Static methoda ulaşmak

Deneme.ornekMethod2();
       */


        /*
        Evet yukarıdaki anlattıklarımı ilerleyen derslerde çok
        daha detaylı anlatacağız. Şuanlık ön bilgilendirme olması
        için anlatmaya çalıştım. Math Sınıfının da methodları
        static olduğu için obje oluşturmadan methodlarını kullanabiliriz.
        Ben bizim ilerleyen derslerde kullancağımız ve çok kullanılan
        Meth Sınıfı methodlarını aşağıda listeliyeceğim ve ne işe
        yaradıklarını anlatmaya çalışacağım.
         */

        /*
        ceil	Tek parametre alır(double) ve bir büyük tam sayıya yuvarlama yapar.
        Math.ceil(2.6) => 3.0

        cos	Tek parametre alır(double) ve cos değerini döner.
        Math.cos(30)

        sin	Tek parametre alır(double) ve sin değerini döner.
        Math.sin(30)

        floor	Tek parametre alır(double) ve bir küçük tam sayıya yuvarlar.
        Math.floor(2.6) => 2.0

        max	İki parametre alır ve parametrelerden büyük olan sayıyı geri döner.
        Math.max(2.5,9) =>9

        min	İki parametre alır ve parametrelerden küçük olan sayıyı geri döner.
        Math.min(2.5,9) => 2.5

        pow	İki parametre alır ve ikinci parametreyi birincinin üstü olarak kullanır.
        Math.pow(3,5) => 3^5 anlamına gelir => 243.0

        random	Parametre almaz ve 0 ile 1 arasında double bir değer döner
        Math.random()

        round	Tek parametre alır(float) ve yakın olan tam sayıya döner.
        Math.round(2.4) => 2
        Math.round(2.6) => 3
         */


        System.out.println("Math.ceil(2.6) = "+Math.ceil(2.6));
        System.out.println("Math.cos(Math.PI) = "+Math.cos(Math.PI)); //Math.PI pi sayısı değerini verir
        System.out.println("Math.cos(Math.PI / 2) = "+Math.sin(Math.PI / 2));
        System.out.println("Math.floor(2.6) = "+Math.floor(2.6));
        System.out.println("Math.max(2.5,9) = "+Math.max(2.5,9));
        System.out.println("Math.min(2.5,9) = "+Math.min(2.5,9));
        System.out.println("Math.pow(3,5) = "+Math.pow(3,5));
        System.out.println("Math.random() = "+Math.random());
        System.out.println("Math.ceil(2.4) = "+Math.ceil(2.4));
        System.out.println("Math.round(2.6) = "+Math.ceil(2.6));

        /*
        OUTPUT:
Math.ceil(2.6) = 3.0
Math.cos(Math.PI) = -1.0
Math.cos(Math.PI / 2) = 1.0
Math.floor(2.6) = 2.0
Math.max(2.5,9) = 9.0
Math.min(2.5,9) = 2.5
Math.pow(3,5) = 243.0
Math.random() = 0.3035333575900232
Math.ceil(2.4) = 3.0
Math.round(2.6) = 3.0
         */






    }
}
