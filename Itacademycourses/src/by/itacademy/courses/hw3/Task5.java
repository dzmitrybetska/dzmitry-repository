package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 59");
        int minute = in.nextInt();

        if (minute <= 14) {
            System.out.println("First quarter of an hour");
        } else if (minute <= 29) {
            System.out.println("Second quarter of an hour");
        } else if (minute <= 44) {
            System.out.println("Third quarter of an hour");
        } else if (minute <= 59) {
            System.out.println("Fourth quarter of an hour");
        } else {
            System.out.println("Number not in range");
        }

    }
}
