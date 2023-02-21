package by.itacademy.courses.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {

    public static void main(String[] args) {
        String email = "u.funtic@gmail.com, doom.foot@tut.by, ret.435@gmail, 345.wert.234@yandex.ru," +
                " точно.неемэйл@яндекс.юсэй";
        Pattern pattern = Pattern.compile("(\\w+[\\.-_]*\\w+)+@(\\w+[\\.-_]*\\w+)+\\.[a-z]{2,6}");
        Matcher matcher = pattern.matcher(email);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("e-mail: " + email.substring(start, end));
        }
    }
    
}
