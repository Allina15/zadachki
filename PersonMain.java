import java.util.Arrays;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Asan", 25, "Programmer", 1000, "Iphone 14pro",1200);
        Person person2 = new Person("Uson", 32, "Bankir", 300, "IPhone X", 300);
        Person person3 = new Person("Masha", 24, "teacher", 200, "Redmi",300);
        Person person4 = new Person("Dasha", 30, "Doctor", 500, "Samsung",300);
        Person person5 = new Person("Aigul", 23, "Programmer", 800, "Samsung",350);

        Person[] people = {person1, person2, person3, person4, person5};
        for (Person person : people) {
            System.out.println(Arrays.toString(new Person[]{person}));
        }
        System.out.println("Самая высокая зарплата у " + maxSalary(people));
        System.out.println("Самая низкая зарплата у "+ minSalary(people));
        System.out.println("Самый дорогой телефон у "+ expensivePhone(people));
    }


    public static Person maxSalary(Person[] people) {
        Person person = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i].salary > person.salary) {
                person = people[i];
            }
        }
        return person;
    }

    public static Person minSalary(Person[] people) {
        Person person = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i].salary < person.salary) {
                person = people[i];
            }
        }
        return person;
    }
    public static Person expensivePhone(Person[]people) {
        Person person = people[0];
        for (int i = 0; i < people.length; i++) {
            if (people[i].phonePrice > person.phonePrice) {
                person = people[i];
            }
        }
        return person;
    }
}
