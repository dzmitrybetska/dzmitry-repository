package by.itacademy.courses.hw4;

public class Task1 {

    public static void main (String[] args) {

        System.out.println("     1  2  3  4  5  6  7  8  9  10");

        int i = 1;
        while (i < 11) {
            if (i < 10)
                System.out.print(" " + i + " | ");
            else
                System.out.print(i + " | ");
            int j = 1;
            while (j < 11) {
                int num = i * j;
                if (num < 10)
                    System.out.print(num + "  ");
                else
                    System.out.print(num + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
