package by.itacademy.courses.hw7;

public abstract class Flower {

    String color;
    int freshnessPeriod;

    public Flower (String color, int freshnessPeriod) {
        this.color = color;
        this.freshnessPeriod = freshnessPeriod;
    }

    abstract double flowerPrice();

}
