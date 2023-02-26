package by.itacademy.courses.hw7;

public class Celsius implements Convertible {

    double degreesCelsius;

    Celsius(double degreesCelsius){
        this.degreesCelsius = degreesCelsius;
    }

    @Override
    public double conversionFahrenheit() {
        return degreesCelsius * 1.8 + 32;
    }

    @Override
    public double conversionKelvin() {
        return degreesCelsius + 273.15;
    }
}
