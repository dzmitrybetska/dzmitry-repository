package by.itacademy.courses.hw5;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.fullName = "Dzmitry";
        person1.age = 34;

        Person person2 = new Person("Iryna", 32);

        person1.move();
        person1.talk();
        System.out.println();
        person2.move();
        person2.talk();
        System.out.println();

        Phone contact1 = new Phone();
        contact1.number = "+375293456478";
        contact1.model = "Iphone 13";
        contact1.weight = 100.15;

        Phone contact2 = new Phone("+375336428364", "Iphone X");

        Phone contact3 = new Phone("+375445728355", "Xiaomi", 115.18);

        Phone phoneBook = new Phone();

        contact1.receiveCall("Dzmitry");
        contact2.receiveCall("Iryna");
        contact3.receiveCall("Eva");
        System.out.println();

        System.out.println(contact1.getNumber());
        System.out.println(contact2.getNumber());
        System.out.println(contact3.getNumber());
        System.out.println();

        contact1.receiveCall("Dzmitry", contact1.number);
        contact2.receiveCall("Iryna", contact2.number);
        contact3.receiveCall("Eva", contact3.number);
        System.out.println();

        phoneBook.sendMessage("Call back later ", "+375294567345", "+375298764523", "+375335674323", "+375253456732", "+375335672345");

    }
}
