package by.itacademy.courses.hw7;

public class Aspirant extends University{
    String name;
    String surname;
    int averageRating;
    boolean availabilityScientificWork;

    public Aspirant (String name, String surname, int courseNumber, String groupName, int averageRating, boolean availabilityScientificWork) {
        super(courseNumber, groupName);
        this.name = name;
        this.surname = surname;
        this.averageRating = averageRating;
        this.availabilityScientificWork = availabilityScientificWork;

    }

    public int scholarshipAmount () {
        int scholarshipAmount;

        if (averageRating == 5) {
            return scholarshipAmount = 200;
        }
        else {
            return scholarshipAmount = 180;
        }
    }

    @Override
    public String toString() {
        return "Aspirant: " +
                "name: " + name +
                "; surname: " + surname +
                "; averageRating = " + averageRating +
                "; availabilityScientificWork: " + availabilityScientificWork +
                "; courseNumber: " + courseNumber +
                "; groupName: " + groupName + ";";
    }
}
