package by.itacademy.courses.hw6;

public class Task4 {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(3).append(" + ").append(56).append(" = ").append(num1 + num2).append("\n")
                .append(3).append(" - ").append(56).append(" = ").append(num1 - num2).append("\n")
                .append(3).append(" * ").append(56).append(" = ").append(num1 * num2).append("\n");
        System.out.println(stringBuilder);

        changeStringBuilder (stringBuilder);
    }

    static void changeStringBuilder (StringBuilder stringBuilder) {
        int index;
        while ((index = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(index);
            stringBuilder.insert(index, "равно");
        }
        System.out.println(stringBuilder);
    }

}
