package by.itacademy.courses.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {
        String text = "У Олега 2351 марок, у Васи 122345, а у Насти 12346";

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        int maxLenght = 0;
        String maxNumber = null;
        while (matcher.find()) {
            int start = matcher.start();;
            int end = matcher.end();
            int lenght = text.substring(start, end).length();
            if (maxLenght < lenght) {
                maxLenght = lenght;
                maxNumber = text.substring(start, end);
            }
        }
        System.out.println("Most consecutive digits: " + maxNumber);
    }

}
