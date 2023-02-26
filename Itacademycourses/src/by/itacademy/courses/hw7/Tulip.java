package by.itacademy.courses.hw7;

public class Tulip extends Flower{

    int quantity;
    double price;

    public Tulip (String color, int freshnessPeriod, int quantity, double price) {
        super(color, freshnessPeriod);
        this.quantity = quantity;
        this.price = price;
    }
    double flowerPrice() {
        return quantity * price;
    }

}
