package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TYPY DANYCH
        int age = 24;
        String initials = "IG";
        boolean initialsBoolean;

        System.out.println("Cześć Irmina, słyszałem że masz " + age + " lat i uczysz się programowania. Czy to prawda? Y/N");
        Scanner scanner = new Scanner(System.in);

        String isTrueString = scanner.nextLine();

        boolean isTrue;

        if (isTrueString.equals("Y")){
            isTrue=true;
        }else {
            isTrue=false;
        }

        String isTrueString2 = isTrue ? "-true" : "-false";
        System.out.println(isTrueString2);

        System.out.println("Czy twoje inicjały to " + initials + " ? (Y/N)");
        String initials1 = scanner.nextLine();


        if (initials1.equals("Y")){
    initialsBoolean=true;
    System.out.println("Tak, " + initialsBoolean);
}else {
    initialsBoolean=false;
    System.out.println("Nie, " + initialsBoolean);
}




    }
}
