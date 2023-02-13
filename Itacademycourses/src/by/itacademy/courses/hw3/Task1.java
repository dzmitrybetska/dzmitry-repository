package by.itacademy.courses.hw3;

public class Task1 {
    public static void main (String[] args){

        int digit = 10;
        Integer digit2 = digit;

        System.out.println(digit2);

        unboxingDigit (digit, digit2);

    }

    public static void unboxingDigit (int digit, Integer digit2) {
        digit = digit2;

        System.out.println(digit);
    }
}
