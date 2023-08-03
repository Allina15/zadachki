import java.time.LocalDate;
import java.time.Period;

public class Student {
     String name;
     LocalDate dateOfBirth;
     int phoneNumber;
     String nationality;

    public Student(String name, LocalDate dateOfBirth, int phoneNumber, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }


    @Override
    public String toString() {
        return "Student " +
                "name=" + name +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber=" + phoneNumber +
                ", nationality='" + nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
