package pl.lublin.wsei.java.cwiczenia;

public class University {
    public static void main(String[] args) {
        Student student = new Student("Irmina", "Górecka", 23433);
        Student student1 = new Student("Ola", "Kwiatkowska", 5432);

        System.out.println("Liczba studentów: "+Student.getStudentsNubmer());

    }
}