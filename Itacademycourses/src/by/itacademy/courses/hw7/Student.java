package by.itacademy.courses.hw7;

public class Student extends University{
    String name;
    String surname;
    int averageRating;

    public Student (String name, String surname, int courseNumber, String groupName, int averageRating) {
        super(courseNumber, groupName);
        this.name = name;
        this.surname = surname;
        this.averageRating = averageRating;
    }

    public int scholarshipAmount() {
        int scholarshipAmount = 0;

        if (averageRating == 5) {
            return scholarshipAmount = 100;
        }
        else {
            return scholarshipAmount = 80;
        }
    }

    @Override
    public String toString() {
        return "Student: " +
                "name: " + name +
                "; surname: " + surname +
                "; averageRating = " + averageRating +
                "; courseNumber: " + courseNumber +
                "; groupName: " + groupName + ";";
    }
}
