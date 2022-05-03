package pl.lublin.wsei.java.cwiczenia;

public class Bank {
    public static void main(String[] args) {
//1 osoba
        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "90121112362";

        Address address1 = new Address();
address1.city="Warsaw";
address1.street="Kwiatowa";
address1.houseNumber=55;
address1.zipCode="03-813";

person1.livingAddress=person1.registeredAddress=address1;

        BankAccount account1 = new BankAccount();
        account1.balance=10000;
        account1.owner=person1;

        //2 osoba
        Person person2 = new Person();
        person2.firstName = "Maria";
        person2.lastName = "Róża";
        person2.pesel = "90121223362";

        Address address2 = new Address();
        address2.city="Warsaw";
        address2.street="Morwowa";
        address2.houseNumber=5;
        address2.zipCode="07-224";

        person2.livingAddress=address1;
        person2.registeredAddress=address2;

        BankAccount account2 = new BankAccount();
        account2.balance=15000;
        account2.owner=person2;

        System.out.println("Osoba 1:");
        System.out.println(person1.firstName + " " + person1.lastName);
        System.out.println("mieszka w miejscowości: " + person1.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("mieszka w miejscowości: " + person2.livingAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);



    }
}