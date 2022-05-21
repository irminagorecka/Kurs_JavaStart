package data;

public class Car {

    private int doors;
    private String carColor;
    private String wheelsColor;
    private String tiresColor;
    private String brand;
    private String model;

    public Car(int doors, String carColor, String tiresColor, String brand, String model) {
        this.doors = doors;
        this.carColor = carColor;
        this.tiresColor = tiresColor;
        this.brand = brand;
        this.model = model;
    }


    public Car(int doors, String carColor, String wheelsColor, String tiresColor, String brand, String model) {
        this(doors, carColor, tiresColor, brand, model);
        this.wheelsColor=wheelsColor;

    }

    public void printInfo(){
       String info= Car.this.brand + " " + Car.this.model
               + ", Drzwi: " + Car.this.doors
               + ", Kolor nadwozia: " + Car.this.carColor
               + ", Kolor felg: " + Car.this.wheelsColor
               + ", Kolor opon: " + Car.this.tiresColor;
        System.out.println(info);
    }

    public void changeCarColour(String newColour){
        this.carColor=newColour;
    }

    public int getDoors() {
        return doors;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getWheelsColor() {
        return wheelsColor;
    }

    public String getTiresColor() {
        return tiresColor;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setCarColor(String carColor) {
        if (carColor == "gold"){
            System.out.println("Such colour does not exist");
        }else{
            this.carColor = carColor;
        }
    }

    public void setWheelsColor(String wheelsColor) {
        this.wheelsColor = wheelsColor;
    }

    public void setTiresColor(String tiresColor) {
        this.tiresColor = tiresColor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
