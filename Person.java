public class Person {
    String name;
    int age;
    String work;
    int salary;
    String phone;
    int phonePrice;

    public Person(String name, int age, String work, int salary, String phone, int phonePrice) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
        this.phonePrice = phonePrice;
    }

    @Override
    public String toString() {
        return "Person " +
                "name= " + name +
                ", age=" + age +
                ", work= " + work +
                ", salary=" + salary + "$"+
                ", phone= " + phone + ", Phone price=" + phonePrice+"$";
    }
}
