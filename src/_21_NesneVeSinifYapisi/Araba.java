package _21_NesneVeSinifYapisi;

public class Araba {

    public double varsayilanMotorHacmi = 1399;

    //constructor
    Araba() {
        System.out.println("Araba nesnesi olusturuldu, yeni varsayilan motor hacmi degeri : " + varsayilanMotorHacmi);
    }

    //constructor
    Araba(double yeniMotorHacmi) {
        varsayilanMotorHacmi = yeniMotorHacmi;
        System.out.println("Araba nesnesi olusturuldu, yeni varsayilan motor hacmi degeri :" + varsayilanMotorHacmi);
    }

    //metot
    void calistir() {
        System.out.println("Araba calismaya basladi!");
    }

}
    /*
    Araba sınıfında yaptığımız değişiklikler sonucu,
    bu sınıftan nesne oluşturduğumuzda konsoldaki çıktılarla
    nesne oluşurken işlemlerin hangi sırayla çalıştığını daha
    net anlayacağız. Bir tane ArabaTest sınıfı oluşturalım ve
    bu sınıf içerisinde Araba sınıfından bir nesne oluşturalım
    ve calistir() metodunu çağıralım.
     */



