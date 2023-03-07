package by.itacademy.courses.hw6;

public class Task3 {

    public static void main(String[] args) {
        String text = "Я повторяю, вам этого не понять, дамы с туго набитым кошельком и кучей нарядов.";

        String[] wordArray = text.split("\\s*[\\s+\\.,]\\s*");
        int indexMax = 0;
        int indexMin = 0;
        int maxLength = 0;
        int minLength = wordArray[0].length();

        for (int i = 0; i < wordArray.length; i++) {

            if (maxLength < wordArray[i].length()) {
                maxLength = wordArray[i].length();
                indexMax = i;
            }
            if (minLength >= wordArray[i].length()) {
                minLength = wordArray[i].length();
                indexMin = i;
            }
        }

        textModification (text, indexMax, indexMin);
    }

    static void textModification (String text, int indexMax, int indexMin) {

        String[] newArray = text.split("\\s+");

        StringBuilder textMod = new StringBuilder();

        String memoryWord = newArray[indexMax];
        newArray[indexMax] = newArray[indexMin];
        newArray[indexMin] = memoryWord;

        for (String word : newArray) {
            textMod.append(word).append(" ");
        }
        System.out.println(textMod);

    }

}
