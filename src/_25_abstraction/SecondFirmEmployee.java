package _25_abstraction;

public class SecondFirmEmployee extends Employee{

    private static final int CONST_ALES = 2;
    private static final int CONST = 10000;

    public static void main(String[] args) {

        SecondFirmEmployee firstFirmEmployee = new SecondFirmEmployee();
        firstFirmEmployee.setId(1);
        firstFirmEmployee.setName("Zeliha");
        firstFirmEmployee.setSurname("Oznuk");
        firstFirmEmployee.setJobtitle("QA");

        System.out.println(firstFirmEmployee.getName()+ " " + firstFirmEmployee.getSurname());
        System.out.println(firstFirmEmployee.getJobtitle());
        System.out.println(firstFirmEmployee.calculateSalary() + "₺");
    }

    @Override
    public float calculateSalary() {
        return CONST * (CONST_ALES * 0.75f);
    }
}


/*
SecondFirmEmployee ile FirstFirmEmployee sınıflarında maaş bilgileri farklı
hesaplanmasına rağmen diğer bilgiler aynı tutulduğu için kodun birden çok
kere yazılmasına gerek kalmadan abstraction yapısından faydalanılarak bir
çözüm bulunmuştur. Abstract bir metot oluşturularak her sınıf içerisinde
bu metot farklı işlemleri yapacak şekilde tasarlanmıştır.
Aslında biz abstraction class tanımlayarak bu sınıfı extends eden
sınıfların neleri @override etmesi gerektiği bilgisini vermiş olduk.
 */
