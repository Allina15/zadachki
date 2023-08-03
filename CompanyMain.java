public class CompanyMain {
    public static void main(String[]args) {
        Person2 person1 = new Person2("Amantur", "Akhunov", 2004);
        Person2 person2 = new Person2("Kambar", "Temirov", 2001);
        Group group1 = new Group("AAA", 2020, "Ainazik", person1);
        Group group2 = new Group("BBB", 2021, "Nurisa", person2);
        Group[] groups = {group1, group2};
        Company company1 = new Company("PeakSoft", "Kyrgyzstan", 2020, "Amantur Akhunov", groups, person1);
        Company company2 = new Company("IT", "Kyrgyzstan", 2019, "Iskhak B", groups, person2);

        System.out.println(company1);
        System.out.println(company2);
    }
}
