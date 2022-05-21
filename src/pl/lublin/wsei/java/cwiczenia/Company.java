package pl.lublin.wsei.java.cwiczenia;

public class Company {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Stanisław", "Wioślarz", 1988, 3);
        //System.out.println(employee1); //wyświetli błąd
        Employee employee2 = new Employee("Anna", "Kwiatkowska", 1988, 3);
        Employee employee3 = new Employee("Tomasz", "Ogórek", 1991, 5);

       //System.out.println(employee1.this.name + employee1.surname + employee1.yearOfBirth + employee1.yearsOfExperience); //zmienić na gettery
        System.out.println(employee2.getName() + employee2.getSurname() + employee2.getYearOfBirth() + employee2.getYearsOfExperience());
        //System.out.println(employee3.name + employee3.surname + employee3.yearOfBirth + employee3.yearsOfExperience); //zmienić na gettery
    }

}
