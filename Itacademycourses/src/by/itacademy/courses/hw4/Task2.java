package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task2 {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int digit = in.nextInt();
        int sum = 0;
        int mult = 1;

        while (digit != 0) {
            int result = digit % 10;
            sum += result;
            mult *= result;
            digit /= 10;
        }
        System.out.println("The sum of the digits of a number: " + sum);
        System.out.println("Multiplication of digits of a number: " + mult);

    }
}
