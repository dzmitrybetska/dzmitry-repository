package by.itacademy.courses.hw5;

public class Phone {

    String number;
    String model;
    double weight;

    Phone() {
    }

    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println(name + " " + number);
    }

    String getNumber() {
        return number;
    }

    void sendMessage(String message, String... numbers) {

        for (String number : numbers) {
            System.out.println(message + number);
        }
    }

}
