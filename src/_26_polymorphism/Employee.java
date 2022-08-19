package _26_polymorphism;

public class Employee extends Person {

    private String jobTitle;//İş ismi
    private long salary;//aylık maaş

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
