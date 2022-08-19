package _26_polymorphism;

public class _4_subtype {

   /*
   Java Polymorphism ile ilgili araştırma yaptığınızda bir çok yerde
   rastlayacağınız genel Polymorphism tanımı aslında subtype
   yapısının tanımıdır. Java’da subclass’lar (altsınıflar)
   superclass’ların onlara miras bıraktıkları değişkenleri ve metotları
   değiştirebilirler. Aynı zamanda değiştirmek istemedikleri metotları
   aynı şekilde kullanmaya devam edebilirler.

   Aşağıdaki örnek Employee sınıfı Inheritance konusunda verilen
   Employee sınıfıyla birbir aynıdır.
    */

    public class Employee extends Person {

        private String jobtitle;

        public String getJobtitle() {
            return jobtitle;
        }

        public void setJobtitle(String jobtitle) {
            this.jobtitle = jobtitle;
        }
    }

    /*
    Employee sınıfını miras alacak yeni sınıfta kullanılacak jobTitle
    değişkenlerinin hepsinin başında Senior olsun. Konu göz önünde
    bulundurularak geliştirme yapıldığında aşağıdaki gibi bir sınıf
    ortaya çıkacaktır.
     */




    public class Employeee extends Person {//aynı isim hata vermesin diye Employeee
                                           //yazıldı yoksa Employee olası gerekiyor

        private String jobtitle;

        public String getJobtitle() {
            return jobtitle;
        }

        public void setJobtitle(String jobtitle) {
            this.jobtitle = jobtitle;
        }
    }

    /*
    Employee sınıfını miras alacak yeni sınıfta kullanılacak jobTitle
    değişkenlerinin hepsinin başında Senior olsun. Konu göz önünde
    bulundurularak geliştirme yapıldığında aşağıdaki gibi bir sınıf
    ortaya çıkacaktır.
     */

    public class PolymorphismEmployee extends Employee {
        @Override
        public String getJobtitle() {
            return "Senior " + super.getJobtitle();
        }
    }

   /*
   Bu değişiklikten sonra PolymorphismEmployee sınıfından alınacak
   her jobTitle değişkeninin başında Senior javacaktır. Bu şekilde
   çalışma anında PolymorphismEmployee sınıfı Employee sınıfının
   getJobTitle() metodunu Override ederek değiştirmiştir.



    */

    /*
    SONUC:
    Java Nesne Yönelimli Programlama mantığı içerisinde
    Polymorphism geni kapsamlı bir yapıya sahiptir. Geliştirme
    esnasında bir çok kolaylık sağlar. Java’da nesne yönelimli
    programlama yapısına dikkat edilerek geliştirilen projelerde
    büyük bir yer tutar. Kodun daha okunabilir, kolay değiştirilebilir
    olmasına büyük katkı sağlar.
     */



}
