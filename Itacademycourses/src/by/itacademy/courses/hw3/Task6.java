package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Enter the length of the first side of the triangle");
        int side1 = in.nextInt();
        System.out.println("Enter the length of the second side of the triangle");
        int side2 = in.nextInt();
        System.out.println("Enter the length of the third side of the triangle");
        int side3 = in.nextInt();

        if (side1 < (side2 + side3) && side2 < (side1 + side3) && side3 < (side1 + side2)) {
            System.out.println("The triangle may exist");
        } else {
            System.out.println("Such a triangle does not exist.");
        }

    }
}
