package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        int number = in.nextInt();

        switch (number) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Day off");
                break;
            default:
                System.out.println("Error: invalid number");

        }
    }
}
