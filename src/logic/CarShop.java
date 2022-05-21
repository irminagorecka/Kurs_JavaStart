package logic;
import data.Car;


public class CarShop {
    public static void main(String[] args) {
        Car car1 = new Car(4, "red", "black", "blue", "Audi", "A4");
        car1.changeCarColour("white");
        car1.printInfo();
        car1.setCarColor("purple");
        car1.printInfo();
        car1.setCarColor("gold");
        car1.printInfo();
    }



}
