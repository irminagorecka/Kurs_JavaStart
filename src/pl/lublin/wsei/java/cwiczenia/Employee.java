package pl.lublin.wsei.java.cwiczenia;

public class Employee {

    private String name;
    private String surname;
    private int yearOfBirth;
    private int yearsOfExperience;

    public Employee(String name, String surname, int yearOfBirth, int yearsOfExperience) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.yearsOfExperience = yearsOfExperience;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
