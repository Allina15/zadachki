public class Person2 {
   String firstName;
    String lastName;
    int dateOfBirth;

    public Person2(String firstName, String lastName, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person " +
                "firstName= " + firstName +
                ", lastName= " + lastName +
                ", dateOfBirth=" + dateOfBirth;
    }
}
