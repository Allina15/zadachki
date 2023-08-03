import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StudentMain {
    public static void main(String[]args) {
        Student student1 = new Student("Alina", LocalDate.of(2002, 8, 15), 771149031, "kyrgyz");
        Student student2 = new Student("Tunuk", LocalDate.of(2007, 7, 20), 551232114, "kyrgyz");
        Student student3 = new Student("Uulkelsin", LocalDate.of(2001, 7, 28), 775523696, "kyrgyz");
        Student student4 = new Student("Farida", LocalDate.of(2003, 7, 17), 707152634, "kyrgyz");
        Student student5 = new Student("Zalkar", LocalDate.of(2007, 6, 15), 551484950, "kyrgyz");

        LocalDate currentDate = LocalDate.now();

        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            System.out.println(Arrays.toString(new Student[]{student}));
        }

        int age = age(student1.getDateOfBirth(), currentDate);
            System.out.println("Age: " + age);
}
        public static int age(LocalDate dateOfBirth, LocalDate currentDate){
        Period period = Period.between(dateOfBirth,currentDate);
        return period.getYears();
    }
}
