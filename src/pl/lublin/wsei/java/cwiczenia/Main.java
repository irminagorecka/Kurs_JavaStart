package pl.lublin.wsei.java.cwiczenia;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę netto: ");
        double netto = scanner.nextDouble();
        System.out.println("Podaj stawkę VAT: ");
        double stawkaVAT = scanner.nextInt();
        double VAT=netto*(stawkaVAT/100);
        System.out.println(stawkaVAT);
        System.out.println(VAT);
        double brutto=netto+VAT;
        System.out.println(brutto);
*/

        //Employee employee1 = new Employee("Stanisław", "Wioślarz", 1988, 3);


        // Employee employee1 = new Employee("Stanisław", "Wioślarz", 1988, 3);
        // System.out.println(employee1);

//AGREGACJA I KOMPOZYCJA
        /*Address2 address2_1 = new Address2("Lwowska", 3, "Lublin", "20-809");

        Seller seller1 = new Seller("Irmina", "Górecka");
        seller1.sellerAddress=address2_1;

        Auction auction1 = new Auction("Xbox", "xyz", 999.0);
        auction1.seller=seller1;

        System.out.println("Aukcja 1: \n" + auction1.seller.name + " " + auction1.thingToSell+ " " + auction1.description+ " " + auction1.price+ " " + seller1.sellerAddress.city);

        Seller seller2= new Seller("Tomasz", "Kot");
        seller2.sellerAddress=null;
        System.out.println(seller1.sellerAddress);*/


//METODY I KONSTRUKTORY

//ex1
        /*Jednostki jednostki = new Jednostki();
        double wynik = jednostki.cmNaM(100);
        System.out.println(wynik);*/


//PRZECIĄŻANIE METOD I THIS
//ex 2

    /*Dice dice = new Dice();
    dice.roll();
    dice.show();
    dice.roll();
    dice.show();
    dice.roll();
    dice.show();*/

//STRUKTURY STERUJĄCE

        /*System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkowniku");
        System.out.println("2 - modyfikuj dane użytkownika");

        int option = scanner.nextInt();
if (option==0){
    System.out.println("bye");
}else if(option==1){
    System.out.println("show info about user");
}else if(option==2){
    System.out.println("modify users data");
}else{
    System.out.println("wrong number");
}*/
        /*System.out.println("Podaj imię");
        String name = scanner.nextLine();
switch(name) {
    case "Ala" : System.out.println("hej Ala");
    break;
    case "Ola" : System.out.println("hej Ola");
    break;
    case "Krzyś" : System.out.println("hej Krzyś");
    break;
    default:
        System.out.println("nie znam tego imienia");
}*/

//TABLICE JEDNOWYMIAROWE

        /*int[] intArray = new int[5];
        
        intArray[0]=1;
        intArray[1]=13;
        intArray[2]=8;
        intArray[3]=7;
        intArray[4]=2;
        System.out.println(intArray.length);

        String[] stringArray = {"Kasia", "Basia", "Jola"};
        System.out.println(stringArray[0]+stringArray[1]+stringArray[2]);
*/

        /*//przypisywanie nowych obiektów do tablicy
        Employee[] employees = new Employee[20]; //tworzę nową tablicę new Employee[20]; i Ctrl Alt V
        employees[0] = new Employee("Irmina", "Górecka", 1998, 5); //tworzę nowego pracownika jak nowy obiekt i od razu przypisuję go jako 1 element tablicy
        System.out.println(employees[0].getName());
        */

//ex1
        /*int[] tab1 = new int[3];
        int[] tab2 = new int[3];

        int[] tab3 = {1, 2, 3};

        int[] tablica=tab3;

        System.out.println(tab2.length);

        for (int i = 0; i < tab3.length; i++) { //wyświetla elementy
            System.out.println(tab3[i]);
        }

        System.out.println(Arrays.stream(tab3).sum()); //wyświetla sumę elementów tablicy
*/

//TABLICE WIELOWYMIAROWE

        //tworzenie tablicy wielowymiarowej z już istniejących
        /*int[] tab1 = new int[1000]; //tworzę trzy pojedyncze tablice
        int[] tab2 = new int[100];
        int[] tab3 = new int[10];

        int[][] tab3D = new int[3][]; //łączę pojedyncze tablice w jedną 3-wymiarową
        tab3D[0]=tab1;
        tab3D[1]=tab2;
        tab3D[2]=tab3;

        tab3D[2][6]=99; //inicjalizajca szóstego elementu drugiej tablicy

        System.out.println(tab3D.length); //ilość 'tablic' z jakich sklada się tab3D
        System.out.println(tab1.length); //ilość elementów w tab1
        System.out.println(tab3D[2][6]); //wartość szóstego elementu drugiej tablicy
    */

        //tworzenie tab wielowymiarowej
       /* int[][] ints = new int[2][3];//deklaracja
        ints[0][2]=99;//inicjalizacja elementu
        System.out.println(ints[0][2]);*/

//ex1
       /* double[] wartosci1 = {1.0, 1.5, 2.0};
        double[] wartosci2 = {1.5, 2.0, 2.5};
        double[] wartosci3 = {2.0, 2.5, 3.0};

        double[][] doubles = new double[3][];

        doubles[0]=wartosci1;
        doubles[1]=wartosci2;
        doubles[2]=wartosci3;

        double diagonalSum=(doubles[0][0]*doubles[1][1]*doubles[2][2]) + (doubles[0][2]*doubles[1][1]*doubles[2][0]);//suma iloczynów przekątnych tablicy
        System.out.println(diagonalSum);*/


//PĘTLE

      /*  int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i]=i+1;
        }
        for (int i = 0; i < intArray.length;i++) {
            System.out.println("Liczba: "+intArray[i]);
        }
        for (int array:intArray) {
            System.out.println("Liczba: "+array);
        }*/

        //System.out.println("Podaj liczbę: ");//lepiej pętlą do...while
        //int x = scanner.nextInt();
        /*int x;
        while ((x = scanner.nextInt()) !=0){
            System.out.println("Podaj liczbę: ");
            x = scanner.nextInt();
            System.out.println("liczba to"+x);
        }*/
//int x=2;
/*while (x<=5){
    System.out.println("liczba "+x);
    x++;
        }*/

/*do {
    System.out.println(x++);
}while(x<6);*/

       /*for(int i=0; i<3; i++) {
            System.out.println("Jestem wesołą pętelką");
        }*/

//ex1
        /*System.out.println("Ile liczb chcesz zsumować: ");
        int ileLiczb = scanner.nextInt();

        int sum=0;

        while (ileLiczb-- >0){
            System.out.println("podaj kolejną liczbę:");
            sum=sum+scanner.nextInt();
        }

        System.out.println(sum);*/

//POLIMORFIZM

        /*Dog dog = new Dog("Lola");
        Cat cat = new Cat("Kitty");
        Animal animal = new Animal("Zwierzę");

        dog.giveSound();
        cat.giveSound();
        animal.giveSound();*/


        //żeby można było przetrzymywać w tablicy:

       /* Animal[] animals = new Animal[3];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Mruczek");
        animals[2] = new Animal("Zwierzę");

        for (Animal animal : animals) {
            animal.giveSound();
        }

        private static void changeName (Animal animal, String newName){
            animal.setName(newName);
        }*/



















    }




}
