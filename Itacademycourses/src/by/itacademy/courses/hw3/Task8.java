package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task8 {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int numSeconds = in.nextInt();


        if (numSeconds <= 28800 && numSeconds > 17999) {
            System.out.println(numSeconds);
            System.out.println("Осталось " + numSeconds/3600 + " часов");
        } else if (numSeconds <= 17999 && numSeconds > 7199) {
            System.out.println(numSeconds);
            System.out.println("Осталось " + numSeconds/3600 + " часа");
        } else if (numSeconds <= 7199 && numSeconds > 3599) {
            System.out.println(numSeconds);
            System.out.println("Осталcя " + numSeconds/3600 + " час");
        } else if (numSeconds <= 3599 && numSeconds > 0) {
            System.out.println(numSeconds);
            System.out.println("Осталось менее часа");
        } else if (numSeconds == 0) {
            System.out.println(numSeconds);
            System.out.println("Конец рабочего дня");
        } else {
            System.out.println("Число не в диапазоне");
        }

    }

}
