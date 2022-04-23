package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      /*  //DATA TYPES ex1
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
}*/

        //DATA TYPES ex2
       /* System.out.println("Mam Audi A4");
        System.out.println("Rocznik: ");
        System.out.println(2004);
        System.out.println("Silnik o pojemności: ");
        System.out.println(2.0);
*/

        //ZMIENNE Eex1

       /* String marka = "Ford";
        String model = "Fiesta";
        int rocznik = 2000;
        float cena = 1999.00F;

        System.out.println(marka+ model+ rocznik+ cena);
*/

        //ZMIENNE ex2

        /*String url = "http://javastart.pl";
        url = "https://javastart.pl";
        System.out.print("Strona, z której uczę się Javy to: ");
        System.out.println(url);

        int kevinYear = 1990;
        System.out.print("Film Kevin sam w domu został wydany w roku: ");
        System.out.println(kevinYear);

        var voterTurnout = 58.0;
        voterTurnout = 61.1;
        System.out.print("Procentowa frekwencja podczas ostatnich wyborów wyniosła: ");
        System.out.println(voterTurnout);

//OPERACJE NA ZMIENNYCH

        int x = 5;
        int y = 10;

        System.out.print("Czy X jest większy od Y? "); System.out.println(x > y);

        System.out.print("Czy X jest różny od Y? "); System.out.println(x != y);

        boolean instance = "Kasia" instanceof java.lang.String; System.out.println(instance); // "Kasia" jest typu String*/

       /* int x=5;
        int y=6;

        System.out.println(!(x<10&&y<10)); //warunek złożony
        System.out.println(x++); // wyświetli 5 i doda 1
        System.out.println(++x); //doda 1 i wyświetli 6*/

        //zamiana typów zmiennych
        /*double number1=10.556;
        int number2=5;

        int zawezenie = (int)number1;
        double rozszerzenie = (double)number2;

        System.out.println(zawezenie);
        System.out.println(rozszerzenie);*/

        //sumowanie znaków
        /*char letter1='k';
        char letter2='o';
        char letter3='t';
        System.out.println(""+letter1+letter2+letter3); //koniecznie dodać pusty "" na początku
        letter1++; //mogę je inkremenrować, wtedy pojawi się kolejna liczba z alfabetu
        letter2++;
        letter3++;
        System.out.println(""+letter1+letter2+letter3); //lpu*/

        //OPERACJE NA ZMIENNYCH EX1
        /*int x=6;
        int y=3;
        System.out.println(x>y);
        System.out.println((x*2)>y);
        System.out.println(y>(x+3) && y>(x-2));
        System.out.println(x*y%2==0); //sprawdzenie czy jest parzysta*/

        //OPERACJE NA ZMIENNYCH EX2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę netto: ");
        double netto = scanner.nextDouble();
        System.out.println("Podaj stawkę VAT: ");
        double stawkaVAT = scanner.nextInt();
        double VAT=netto*(stawkaVAT/100);
        System.out.println(stawkaVAT);
        System.out.println(VAT);
        double brutto=netto+VAT;
        System.out.println(brutto);


    }
}
