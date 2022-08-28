package _07_javaOperatorlari;

public class KarsilastirmaOperatorlari {
    public static void main(String[] args) {

        //Karşılaştırma Operatörleri

        /*
        Karşılaştırma operatörü insteadOf olarak bilinmektedir.
         bir sınıfı bir sınıfla veya interface ile karşılaştırma yaparken
         kullanılmaktadır. Vereceğimiz örnek nesne yönelimli proglama
          bilmek gerektirdiği için üzerinde çok durmayacağız.
          Ayrıca aşağıda verdiğimiz örneği direk olarak çalıştırmaya
          çalıştığınızda hata verecektir. kodun düzgün çalışması için
           ilgili sınıfların oluşturulması gerekmektedir.
           Bu konuya ilerki derslerimizde daha detaylı yer verilecektir.
         */

        /*
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: "
            + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: "
            + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: "
            + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: "
            + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: "
            + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: "
            + (obj2 instanceof MyInterface));
         */

/*
class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}
*/


        /*
        OUTPUT:
obj1 instanceof Parent: true
obj1 instanceof Child: false
obj1 instanceof MyInterface: false
obj2 instanceof Parent: true
obj2 instanceof Child: true
obj2 instanceof MyInterface: true
         */
















    }
}
