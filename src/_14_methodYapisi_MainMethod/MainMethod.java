package _14_methodYapisi_MainMethod;

public class MainMethod {
   /*
    public static void main(String[] args) {
    }
    Bir java programının başlatılabilmesi için main metot olması şarttır.
    Bir önceki dersimizde bir metot’u nasıl çağırıcağımızı göstermiştik.
    Bir metotu çağırarak o metotu başlatmış oluyoruz ve içinde gerekli
    işlemleri yapıyoruz. Main metotta aynı mantık. Java programının başlaması
    ve işlemleri yapması için JVM (Java Virtual Machine) tarafından çağırılır
    main metot. Basitçe şöyle anlatabiliriz, siz bir java uygulamasını
    bilgisayarınızda başlatmak için çift tıkladınız, işte bu anda JVM
    programınızı başlatmak için yazmış olduğunuz kodlarınız arasından
    main metotu çağırır ve programınızı main metottan başlatır.
    İşte bundan dolayı bir programda sadece bir main metot olabilir.
    Birden fazla olması durumunda JVM hangisini çağıracağını bilemeyeceği
    için compile error verir kodlarınız ve derlenemez.

    Main metot her zaman public static modifier’ı ile başlar ve bir
    parametre geri dönmez. Dolayısıyla void metottur. Metotun adı main‘dir
    Parametre olarakta String tipinde array alır.

    public static void main(String [] args)

    Not : Arrayleri  ve modifier’ları (public,private,protected,static ..)
    ilerleyen derslerimizde öğreneceğiz.
    */

    //Metot Yapısı

    /*
    Metotlar dönüş tiplerine göre ikiye ayrılıyordu. Parametre dönenler
    ve parametre dönmeyen(void) metotlar . Metot tanımlaması yaparken
    bunuda(paramtre dönecekse tipini, dönmeyecekse void) tanımlıyoruz.
    Aşağıda parametre dönmeyen(void) metota örnek veriyorum.

    public static void metotAdi(parametreler) {
    //işlemler
    }

    Yukarıdaki metot tanımlaması void metota örnektir.
    Void olan bir metot geriye bir değer dönmemektedir.

    public static String metotAdi(parametreler) {
    //işlemler
    return stringvalue;
     }

     Yukarıdaki metotta ise return komutu ile geriye String değer
     dönülmektedir. Zaten metot tanımlaması yaparkende geriye String
     değer döneceği bilgisini veriyoruz.  Bu  metot geriye herhangi
     bir değer dönmezse veya String dışında bir veri geriye döndürürse
     kodumuz  hata verecektir.

     Return komutunu kullanırken dikkat edeceğimiz bir husus ise eğer
     return komutunu if yapısı içinde kullanıyorsak , kesinlikle else ‘de
     ekleyip return komutunu else’de eklememeiz gerekmektedir.
     Aşağıda yanlış bir kullanımı göstereceğim.

     public static int deger(int x){

      if(x>0 && x<10)
      return x;
      else if(x>=10 && x<50)
      return x*10;
      else if(x>=50)
      return x*50;

      }

      Yukarıdaki kod yanlış bir kullanımdır ve hata verecektir.
      Çünkü  return komutuna erişemeyebilir ve geriye bir değer dönemez.
      Böyle bir durumda zaten kullandığımız ide bizi uyaracaktır ve kodun
      en sonuna return eklememizi isteyecektir. Yukarıdaki kodun doğru
      kullanımı şu şekildedir ve hata vermeyecektir.

      public static int deger(int x){

      if(x>0 && x<10)
      return x;
      else if(x>=10 && x<50)
      return x*10;
      else
      return x*50;
      }

      Çünkü her durumda return komutu çalışacaktır.

      Ek olarak şundan bahsetmek istiyorum. Return komutu sadece parametre
      dönen metotlarda değil void metotlarda da kullanılabilir.
      Nasıl olacak o iş ve ne işimize yarayacak dediğinizi duyar gibiyim
      🙂 Kısaca şöyle anlatayım. Bir metotunuz var ve belli işlemler yapıyor.
      Ama siz belli koşullarda artık metottan çıkılmasını istiyorsunuz.
      Bu durumda aynı döngülerden break komutu ile çıktığımız gibi metotlardan
      da return komutu ile çıkabiliriz

      Örneğin:
      public static void bolmeIslemi(int bolen,int bolunen){
      ///eğer bolen sayı 0'a eşit olursa kod hata verecektir. Dolayısıyla kontrol etmemiz gerekir
      if(bolen == 0)
      return; //metot burada durur ve aşağıdaki işlemler yapılmaz

      int sonuc = bolunen/bolen;
      System.out.println("Sonuç ="+sonuc);
      }

      Overload metotların ne olduğunu bir önceki dersimizde bahsetmiştik.
      Overloading olayı javanın bize sunduğu güzelliklerden birisi.
      Aynı metot adı ile farklı parametreler ile aynı işlemi yapacak
      metotları çağırabiliriz. Örneğin toplama işlemi yapan bir metotumuz
      var . Adı da topla metotu olsun. Bu metotu hem int, hem double
      parametre alacak şekilde set edelim.

      public static int topla(int x, int y){
      return x+y;
      }
      public static double topla(double x, double y){
      return x+y;
      }

      Biz topla(3,4) (int değer döneni çağırır) veya topla(3.0 , 4.0)
      (double değer döneni çağırır) şeklinde metotları çağırdığımızda
      hangi metotun çağırılcağına compiler karar vermekte ve uygun olan
      metotu çağırmaktadır. Mesala topla(3 , 4.0) şeklinde çağırdığımızda
      metotu double değer dönen metot çağırılacak ve 3 değeri otomatik olarak
      3.0 değerine döndürülecektir.

      Sayalım ki elimizde aşağıdaki gibi iki metot bulunmakta.

      public static double topla(int x ,double y){
      return x+y;
      }
      public static double topla(double x ,int y){
      return x+y;
      }

      Yukarıdaki metotlardan ilkini topla(3 , 4.0) seklinde ikincisini
      ise topla(3.0 , 4) şeklinde çağırabiliriz. Peki topla(3 , 4)
      şeklinde çağırsak topla metotunu hangisini çağıracak compiler ?
      burada compiler hangisini seçeceğine karar veremiyeceği için
      error verecektir. Bu nedenle overloading yaparken metotları
      compiler’ın karar veremeyeceği durumları iyi düşünerek parametre
      seçimleri dikkatli yapılmalıdır.

      Son olarak şu unutulmamalıdır ki bir metota gönderdiğimiz argümentler
      (javada metota gönderilen parametreler argüment olarak adlandırılır)
       değerleri metotta hangi işlem yapılırsa yapılsın değişmeyecektir.
       Ne demek istediğimi aşağıdaki kodda anlayacaksınız.


     */

    public static void main(String args[]) {
        int x = 5;
        int y = 7;

        System.out.println("Metot'a girmeden önce :"+"x ="+x+" y ="+y);

        deneme(5,7);

        System.out.println("Metot'tan çıkınca :"+"x ="+x+" y ="+y);


    }
    public static void deneme(int x,int y){

        System.out.println("Metot'un içi işlemlerden önce :"+"x ="+x+" y ="+y);
        x += 5;
        y +=15;
        System.out.println("Metot'un içi işlemlerden sonra :"+"x ="+x+" y ="+y);


    }

    /*
    OUTPUT:
Metot'a girmeden önce :x =5 y =7
Metot'un içi işlemlerden önce :x =5 y =7
Metot'un içi işlemlerden sonra :x =10 y =22
Metot'tan çıkınca :x =5 y =7
     */

    /*
    Gördüğünüz gibi gönderdiğimiz argümentler metotta farklı işlemlerede
    girse değerleri değişmedi çünkü metot’un içindeki x, y yeni değişkenler
    oluyor ve metot çağrılırken gönderilen parametrelerle ilgisi bulunmuyor.
     */








}
