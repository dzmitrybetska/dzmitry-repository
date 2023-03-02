package by.itacademy.courses.hw4;

import java.util.Arrays;

public class Task6 {

    public static void main (String[] args){

        int[] mainArray = {-1, 25, 34, -67, 45, -3, -18, 23, 88, -88};

        int numPositive = 0;
        int numNegative = 0;

        for (int num : mainArray) {
            if (num > 0) {
                numPositive++;
            } else {
                numNegative++;
            }
        }

        int[] arrayPositive = new int[numPositive];
        int[] arrayNegative = new int[numNegative];
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < mainArray.length; i++){

            if (mainArray[i] > 0){
                arrayPositive[positive] = mainArray[i];
                positive++;
            } else {
                arrayNegative[negative] = mainArray[i];
                negative++;
            }
        }
        System.out.println(Arrays.toString(arrayPositive));
        System.out.println(Arrays.toString(arrayNegative));
    }
}
