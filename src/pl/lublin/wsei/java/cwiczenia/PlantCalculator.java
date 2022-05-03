package pl.lublin.wsei.java.cwiczenia;

public class PlantCalculator {


    public static void main(String[] args) {

        Flower bratek = new Flower("Bratek", "Kolorowy, na zewnątrz, wieloletni", 1.2);
        Flower sygnonium = new Flower("Sygnonium", "Roślina o pięknych ozdobnie wybarwionych liściach. Pnąca", 1.0);
        Flower grubosz = new Flower("Grubosz", "Sukulent o mięsistych liściach. Wytrzymały na ciżkie wrunki atmosferyczne", 0.3);

        System.out.println(bratek.water+ sygnonium.water+ grubosz.water);
        System.out.println((bratek.water+ sygnonium.water+ grubosz.water)*7);
        System.out.println((bratek.water+ sygnonium.water+ grubosz.water)*365);


    }
}
