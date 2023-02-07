package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit 1:");
        int digit1 = in.nextInt();
        System.out.println("Enter digit 2:");
        int digit2 = in.nextInt();
        System.out.println("Enter digit 3:");
        int digit3 = in.nextInt();


        if (digit1 < digit2 && digit2 < digit3) {
            System.out.printf("digit1 = %d \ndigit2 = %d \ndigit3 = %d", digit1, digit2, digit3);

        } else if (digit1 < digit3 && digit3 < digit2) {
            System.out.printf("digit1 = %d \ndigit3 = %d \ndigit2 = %d", digit1, digit3, digit2);

        } else if (digit2 < digit1 && digit1 < digit3) {
            System.out.printf("digit2 = %d \ndigit1 = %d \ndigit3 = %d", digit2, digit1, digit3);

        } else if (digit2 < digit3 && digit3 < digit1) {
            System.out.printf("digit2 = %d \ndigit3 = %d \ndigit1 = %d", digit2, digit3, digit1);

        } else if (digit3 < digit1 && digit1 < digit2) {
            System.out.printf("digit3 = %d \ndigit1 = %d \ndigit2 = %d", digit3, digit1, digit2);

        } else {
            System.out.printf("digit3 = %d \ndigit2 = %d \ndigit1 = %d", digit3, digit2, digit1);

        }
    }
}
