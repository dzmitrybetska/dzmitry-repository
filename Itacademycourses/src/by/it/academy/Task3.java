package by.it.academy;

public class Task3 {
    public static void main(String[] args) {
        int seconds = 236789;
        double minutes = (double)((float)seconds / 60.0F);
        double hours = minutes / 60.0;
        double days = hours / 24.0;
        double weeks = days / 7.0;
        System.out.printf("weeks: %.2f \ndays: %.2f \nhours: %.2f \nminutes: %.2f \nseconds: %d", weeks, days, hours, minutes, seconds);
    }
}
