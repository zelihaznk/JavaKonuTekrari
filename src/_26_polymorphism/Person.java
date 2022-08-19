package _26_polymorphism;

public class Person {

    private String name;
    private  String surname;
    private String identityNum;//kimlik numarasi
    private  int birthYear;//doğum yılı

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identityNum='" + identityNum + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }



}
