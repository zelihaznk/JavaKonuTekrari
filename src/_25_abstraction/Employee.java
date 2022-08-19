package _25_abstraction;

public abstract class Employee extends Person {

    /*
    Employee.java sınıfı ise her Employee(Çalışan) bir Person(kişi)
    olacağı için Person sınıfı ile genişletilmiş olup bu sınıfı miras almıştır.
    Fakat her firmanın çalışan maaşını farklı hesapladığı bir algoritması
    olduğu düşünüldüğünde Employee sınıfı içerisinde tek bir metot yazılıp
    tüm firmalar için çalışması beklenemez. Bu gibi durumlarda superclass
    abstraction yapısından faydalanılarak miras alındığı sınıflar için farklı
    davranışlar sergileyebilir.
     */

    private String jobtitle;

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }


    public abstract float calculateSalary();

   /*
   Abstract yapısından faydalanılarak oluşturulan Employee sınıfı
   oluşturulacak diğer firma employee sınıflarına miras verilerek firmaya
   özel maaş hesaplama algoritmaları kullanılabilir.
    */
}
