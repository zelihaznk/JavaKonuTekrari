package _26_polymorphism;

public class _2_overloading {

    /*
   Java Polymorphism yapısında işimizi kolaylaştıran bir diğer
   yapıda Overloading’ dir. Java’da oluşturulan sınıf içerisinde
   aynı isme sahip birden fazla metodun olabilme özelliğidir.
   Burada dikkat edilmesi gereken özellik, aynı isme sahip
   metotların parametre sayıları veya parametre tiplerinde
   farklılıklar olmalıdır.
   Şöyle ki;
    */

    public class OverloadingDemo{
        public int method(int a){
            return a;

        }

        public int method(String b){
            return Integer.parseInt(b);
        }

        public int sum(int a, int b){
            return a+b;

        }

        public int sum(double c, double d){
            Double sum = c+d;
            return sum.intValue();
        }

    }

    /*
    Bu şekilde overload özelliğinden faydalanarak bir çok metot yazılabilir
    ve istediğimiz metodu istediğimiz şekilde özelleştirebiliriz. Böylelikle
    yaptığımız aynı işlem için farklı isimde metodlar oluşturmak yerine aynı
    isimde farklı parametrelerle aynı işlemi yapan metotlar elde etmiş oluruz.
     */






}
