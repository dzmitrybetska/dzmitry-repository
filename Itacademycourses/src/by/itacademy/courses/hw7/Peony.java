package by.itacademy.courses.hw7;

public class Peony extends Flower{

    int quantity;
    double price;

    public Peony (String color, int freshnessPeriod, int quantity, double price) {
        super(color, freshnessPeriod);
        this.quantity = quantity;
        this.price = price;
    }
    double flowerPrice(){
        return quantity * price;
    }

}
