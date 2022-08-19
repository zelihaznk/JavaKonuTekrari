package _21_NesneVeSinifYapisi._25_inheritance;

public class Employee extends Person{

    private String jobtitle;

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    /*
    Employee sınıfı ise işyerine ait iş ünvan bilgisini tutmaktadır.
    İş ünvanı ile birlikte ad ve soyad gibi kişi,sel bilgileri
    Person sınıfının yanında Employee sınıfı içersinde de tutmak
    yerine Person sınıfı superclass, Employee sınıfı ise Person
    sınıfını miras alarak subclass görevi görmektedir.
     */












}
