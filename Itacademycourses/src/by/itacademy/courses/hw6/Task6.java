package by.itacademy.courses.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

    public static void main(String[] args) {
        String text = "Versions: Java  5, Java 6, Java 7, Java 8, Java 12.";

        Pattern pattern = Pattern.compile("Java\\s+\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }
    }

}
