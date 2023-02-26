package by.itacademy.courses.hw7;

public class Apple extends Fruit{

    String name;
    double fruitPrice;

    public Apple (String name, double weight, double fruitPrice) {
        super(weight);
        this.name = name;
        this.fruitPrice = fruitPrice;
    }

    double fruitCost () {
        return weight * fruitPrice;
    }

    String getName() {
        return name;
    }

}
