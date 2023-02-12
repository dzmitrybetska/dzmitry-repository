package by.itacademy.courses.hw4;

public class Task4 {

    public static void main(String[] args) {

        int[] array = {47, 58, 34, 88, 23, 5, 89, 32, 3, 87};
        int numMax = array [0];
        int numMin = array [0];
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > numMax) {
                numMax = array[i];
                indexMax = i;
            }
            if (array[i] < numMin) {
                numMin = array[i];
                indexMin = i;
            }
        }
        System.out.println("Minimum number index: " + indexMin);
        System.out.println("Max number index: " + indexMax);
    }
}
