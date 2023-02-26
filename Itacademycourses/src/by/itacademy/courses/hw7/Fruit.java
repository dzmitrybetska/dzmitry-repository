package by.itacademy.courses.hw7;

public abstract class Fruit {

    double weight;

    public Fruit (double weight) {
        this.weight = weight;
    }

    void printManufacturerInfo() {
        System.out.print("Made in Belarus\n");
    }
    double fruitCost () {
        double fruitPrice = 0;

        return weight * fruitPrice;
    }

    abstract String getName();

}
