package by.itacademy.courses.hw9;

public class Main {

    public static void main(String[] args) {

        System.out.println("Addition result = " + Calculator.getSum(23, 12.9));
        System.out.println("Multiplication result = " + Calculator.getMultiplication(34.9, 11.5));
        System.out.println("Division result = " + Calculator.getDivision(234.6, 15));
        System.out.println("Subtraction result = " + Calculator.getSubtraction(22, 0.7));

        System.out.println("-------------------------------------");

        Pair <Integer, String> obj1 = new Pair<>(23, "Hi");

        System.out.println(obj1.getObv1());
        System.out.println(obj1.getObv2());
        System.out.println(obj1.changeSeats(new Pair<>("Hi", 23)).toString());
        obj1.setObv1(234);
        obj1.setObv2("Bye");
        System.out.println(obj1.toString());

    }
}
