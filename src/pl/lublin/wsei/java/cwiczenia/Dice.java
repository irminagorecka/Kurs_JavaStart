package pl.lublin.wsei.java.cwiczenia;

import java.util.Random;


public class Dice {
    int pole;


    public Dice(){
        roll();
    }

    public Dice(int pole) {
        this.pole = pole;
    }

public void roll () {
    Random random = new Random();
    pole = random.nextInt(6)+1;
}

public void show(){
    System.out.println(pole);
}



}
