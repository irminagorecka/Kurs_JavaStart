package pl.lublin.wsei.java.cwiczenia;

public class Student { //przechowywyje info o studencie

    private static int studentsNubmer =0;

    private String name;
    private String surname;
    private int indexNumber;

    public Student(String name, String surname, int indexNumber) {
        this.name = name;
        this.surname = surname;
        this.indexNumber = indexNumber;

        studentsNubmer++; //zwiększa zmienną o 1 za każdym utworzeniem nowego studanta (wywołaniem konstruktora)
    }

    public static int getStudentsNubmer() {
        return studentsNubmer;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIndexNumber() {
        return indexNumber;
    }
//NIE MOŻE BYĆ SETTERA DLA studentsNumber bo nie chcemy ręcznie zmieniać jego wartości
    //public static void setStudentsNubmer(int studentsNubmer) {
      //  Student.studentsNubmer = studentsNubmer;
    //}

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}
