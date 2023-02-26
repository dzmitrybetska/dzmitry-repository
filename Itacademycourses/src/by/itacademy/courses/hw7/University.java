package by.itacademy.courses.hw7;

public abstract class University {
    int courseNumber;
    String groupName;

    public University(int courseNumber, String groupName) {
        this.courseNumber = courseNumber;
        this.groupName = groupName;
    }

    public abstract int scholarshipAmount ();

}
