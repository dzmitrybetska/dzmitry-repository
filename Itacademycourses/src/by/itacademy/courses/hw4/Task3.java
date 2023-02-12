package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task3 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = in.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println(num + " != " + result);
    }
}
