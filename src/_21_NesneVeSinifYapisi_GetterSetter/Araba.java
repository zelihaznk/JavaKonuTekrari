package _21_NesneVeSinifYapisi_GetterSetter;

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

    public double getVarsayilanMotorHacmi() {
        return varsayilanMotorHacmi;
    }

    public void setVarsayilanMotorHacmi(double varsayilanMotorHacmi) {
        this.varsayilanMotorHacmi = varsayilanMotorHacmi;
    }

    /*
    ArabaTest sınıfında varsayilanMotorHacmi değişkeniyle ilgili
    değişiklikleri aşağıdaki gibi yapmak daha doğru bir yaklaşım olacaktır.
     */


}
