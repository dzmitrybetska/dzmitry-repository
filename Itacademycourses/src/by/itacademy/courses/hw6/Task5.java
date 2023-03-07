package by.itacademy.courses.hw6;

import java.util.regex.Pattern;

public class Task5 {

    public static void main(String[] args) {
        String text = ("Object-oriented programming is a programming language model organized around objects rather" +
                "than actions and data rather than logic. Object-oriented programming blabla." +
                " Object-oriented programming bla.");

        Pattern pattern = Pattern.compile("(?i)Object-oriented programming");
        String[] arrayString = text.split("(?i)Object-oriented programming");

        for (int i = 1; i < arrayString.length; i++) {
            arrayString[i] = "Object-oriented programming" + arrayString[i];
        }
        for (int i = 1; i < arrayString.length; i++) {
            if (i % 2 == 0) {
                arrayString[i] = arrayString[i].replaceAll(pattern.pattern(), "OOP");
            }
        }
        stringModification(arrayString);
    }

    static void stringModification(String[] arrayString) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String words : arrayString) {
            stringBuilder.append(words);
        }
        System.out.println(stringBuilder);
    }

}
