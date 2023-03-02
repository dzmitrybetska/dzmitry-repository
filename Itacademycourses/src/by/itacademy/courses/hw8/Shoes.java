package by.itacademy.courses.hw8;

public class Shoes extends Shop{
    public enum DimensionsShoes{;
        static final Integer sizeShoes1 = 41;
        static final Integer sizeShoes2 = 42;
        static final Integer sizeShoes3 = 43;
        static final Integer sizeShoes4 = 44;
        static final Integer sizeShoes5 = 45;

    }

    private String manufacturer;
    private double price;
    Integer dimensionsShoes;

    Shoes (String product, String manufacturer, String color, double price, Integer dimensionsShoes) {
        super(product, color);
        this.manufacturer = manufacturer;
        this.price = price;
        this.dimensionsShoes = dimensionsShoes;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getDimensionsShoes() {
        return dimensionsShoes;
    }

    public String getInfoSize() {
        return getProduct() + " " + getManufacturer() +  " " + getColor() +  " price: " + getPrice() + " In stock";
    }

    public String getInfoColor() {
        return getProduct() + " " + getManufacturer() + " price: " + getPrice() + " " + dimensionsShoes + " In stock";
    }

}

