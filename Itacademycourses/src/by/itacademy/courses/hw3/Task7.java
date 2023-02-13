package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Enter the first number");
        int number1 = in.nextInt();
        System.out.println("Enter the second number");
        int number2 = in.nextInt();
        System.out.println("What is the result of multiplying the first number by the second?");
        int userResult = in.nextInt();


        String answer = userResult == number1 * number2 ? "Result is correct" : "Result is wrong" + "\nCorrect result: " + number1 * number2;
        System.out.println(answer);


    }
}
