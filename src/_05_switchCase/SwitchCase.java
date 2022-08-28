package _05_switchCase;

public class SwitchCase {
    public static void main(String[] args) {

        /*
        Başlangıç olarak yazacağımız uygulamada hangi ayın hangi
        sayıya denk geldiğini switch-case yapısıyla belirtip,
        seçilen ayın ismini yazdıracağız.
         */

        //Secilen ay degeri
        int ayDegeri = 7;

        //Yazdirilacak ay degeri
        String ayDegeriStr =null;

        //switch-case ile hangi aynı hangi sayıya denk geldiginin belirtildigi bolum
        switch (ayDegeri){
            case 1:
                ayDegeriStr = "Ocak";
                break;
            case 2:
                ayDegeriStr = "Şubat";
                break;
            case 3:
                ayDegeriStr = "Mart";
                break;
            case 4:
                ayDegeriStr = "Nisan";
                break;
            case 5:
                ayDegeriStr = "Mayıs";
                break;
            case 6:
                ayDegeriStr = "Haziran";
                break;
            case 7:
                ayDegeriStr = "Temmuz";
                break;
            case 8:
                ayDegeriStr = "Ağustos";
                break;
            case 9:
                ayDegeriStr = "Eylül";
                break;
            case 10:
                ayDegeriStr = "Ekim";
                break;
            case 11:
                ayDegeriStr = "Kasım";
                break;
            case 12:
                ayDegeriStr = "Aralık";
                break;
            default:
                break;

        }
        //Konsol ekranina secilen ayin yazdirildigi bolum
        System.out.println("Secilen ay degeri : " + ayDegeriStr); //Secilen ay degeri : Temmuz

        /*
        Yukarıda ki örnek kodda case içerisinde ayDegeriStr değişkenine
        hangi ay ise o ayın değeri atanmıştır ve ardından break;
        komutuyla case içerisinden çıkılmıştır. break konusuna şimdilik
        çok fazla takılmıyoruz, bu konuyla ilgili ayrıca bir dersimiz olacaktır.
         Kısaca bahsetmek gerekirse, case değeri içerisine girildikten sonra
         diğer case değerlerini kontrol etmemesi için break ile case‘den çıkılıyor.

         Yazmış olduğumuz kodun en üstünde ayDegeri olarak bir int değişken
         tanımladık ve bu değişkene 7 değerini atadık, geliştireceğiniz kodlarda
         bu kısım genellikle dışarıdan gelecek veya bir kullanıcı tarafından
         girilecektir. Bu şekilde hardcode tanımlamalar yani kodun içerisine
         gömülmüş değer tanımalaları genellikle örneklerde yapılır.
         Atadığımız bu değeri 1 ile 12 arasında istediğiniz bir değer aralığında
         verebilirsiniz. Bu değerler haricinde bir değer atadığınızda,


         default:
         break;

          bölümüne girecek ve ayDegeriStr degeri null olarak kalacaktır.
          Yukarıdaki örnekte biz ayDegeri değişkenine 7 değerini atadığımız
          için konsol ekranı aşağıdaki gibi olacaktır.

          //Secilen ay degeri : Temmuz
         */






    }
}
