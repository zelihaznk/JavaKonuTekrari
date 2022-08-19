package _25_abstraction;

public class FirstFirmEmployee extends Employee{

    private static final int CONST_ALES = 2;
    private static final float CONST_UNI = 0.3f;
    private static final int CONST = 10000;

    public static void main(String[] args) {

        FirstFirmEmployee firstFirmEmployee = new FirstFirmEmployee();
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
        return CONST * (CONST_ALES * CONST_UNI);
    }
}
