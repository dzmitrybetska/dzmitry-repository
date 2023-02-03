package homework2;

public class Task3 {

    public static void main(String[] args) {

        int seconds = 236789;
        float minutes = seconds / 60f;
        float hours = minutes / 60;
        float days = hours / 24;
        float weeks = days / 7;

        System.out.printf("weeks: %.2f \ndays: %.2f \nhours: %.2f \nminutes: %.2f \nseconds: %d", weeks, days, hours, minutes, seconds);
    }

}
