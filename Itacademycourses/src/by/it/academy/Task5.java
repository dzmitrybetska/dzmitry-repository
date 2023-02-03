package by.it.academy;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value:");
        int value = in.nextInt();
        if (value % 2 == 0) {
            System.out.println("total: 0");
        } else {
            System.out.println("total: " + value % 2);
        }

    }
}
