package by.itacademy.courses.hw4;

public class Task5 {

    public static void main(String[] args) {

        int[] myArray = {34, 9, 23, 17, 7, 5, 1, 3, 34, 18, 19};

        int minGrade = myArray [0];

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] < minGrade && i %2 != 0)
                minGrade = myArray[i];
        }

        System.out.println(minGrade);

    }
}
