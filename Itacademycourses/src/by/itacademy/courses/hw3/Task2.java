package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = in.nextInt();

        if (num % 2 != 0 && num > 0) {
            System.out.println("Number odd positive");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("Number even negative");
        }

    }
}
