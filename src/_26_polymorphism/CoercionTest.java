package _26_polymorphism;

public class CoercionTest {

    public static void main(String[] args) {

        CoercionTest test = new CoercionTest();
        Employee employee = new Employee();

        employee.setName("Zeliha");
        employee.setSurname("Oznuk");
        employee.setBirthYear(1993);
        employee.setIdentityNum("123456789");
        employee.setJobTitle("QA");
        employee.setSalary(15000);

        test.writePersonInfo(employee); //Kişi Bilgilerini Yaz




    }

    private void writePersonInfo(Person person) {

        System.out.println(person.toString());
        //Person{name='Zeliha', surname='Oznuk', identityNum='123456789', birthYear=1993}
    }

}

/*
Yukarıdaki örnek kod bloğu çalıştırıldığında sadece Person sınıfına
ait bilgilerin yazdırıldığı Employee sınıfına ait jobTitle ve salary
özelliklerinin yazdırılmadığı görülecektir.
 */
