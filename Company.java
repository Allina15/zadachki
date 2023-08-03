import java.util.Arrays;

public class Company {
    String companyName;
    String country;
    int yearOfFoundation;
    String founder;
    Group [] groups;
    Person2 person2;

    public Company(String companyName, String country, int yearOfFoundation, String founder, Group[] groups,Person2 person2) {
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
        this.person2 = person2;
    }

    @Override
    public String toString() {
        return "Company " +
                "companyName= " + companyName +
                ", country= " + country +
                ", yearOfFoundation=" + yearOfFoundation +
                ", founder= " + founder +
                ", groups=" + Arrays.toString(groups) +
                ", person2=" + person2 ;
    }
}
