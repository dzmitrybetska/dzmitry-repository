package by.itacademy.courses.hw10;

public class PetShop implements Comparable <PetShop>{

    private String name;
    private double price;
    private double age;

    PetShop (String name, double price, double age){
        this.name = name;
        this.price = price;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public int compareTo(PetShop petShop) {
        return name.compareTo(petShop.name);
    }

    @Override
    public String toString() {
        return "PetShop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

}
