package by.itacademy.courses.hw4;

public class Task5 {

    public static void main(String[] args) {

        int[] myArray = {34, 9, 23, 17, 7, 5, 1, 3, 34, 18, 19};

        int minGrade = myArray [0];

        for (int i = 1; i < myArray.length; i = i + 2) {

            if (myArray[i] < minGrade)
                minGrade = myArray[i];
        }

        System.out.println(minGrade);

    }

}
