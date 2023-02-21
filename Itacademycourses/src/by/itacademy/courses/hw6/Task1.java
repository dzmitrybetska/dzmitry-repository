package by.itacademy.courses.hw6;

public class Task1 {

    public static void main(String[] args) {
        String wrongString = "   Есть такая    легенда -   о птице, что поёт   лишь  один раз за всю жизнь!  ";

        wrongString = wrongString.replaceAll("\\s+", " ");
        String correctString = wrongString.trim();

        System.out.println(correctString);
    }

}
