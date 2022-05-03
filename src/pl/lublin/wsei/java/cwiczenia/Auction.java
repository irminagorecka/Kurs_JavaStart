package pl.lublin.wsei.java.cwiczenia;

public class Auction {

    String thingToSell;
    String description;
    double price;

    Seller seller;

    public Auction(String thingToSell, String description, double price) {
        this.thingToSell = thingToSell;
        this.description = description;
        this.price = price;
    }


}
