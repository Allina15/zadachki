public class PhoneMain {
    public static void main(String[]args){
        Phone phone1 = new Phone("Iphone", "14 pro",512);
        phone1.setScreen(6.06);
        phone1.setPrice(111990);
        Phone phone2 = new Phone("Samsung", "A 50", 120);
        phone2.setScreen(6.4);
        phone2.setPrice(45000);
        System.out.println(phone1.brand+" "+phone1.version+" "+phone1.memory+"GB "+phone1.getScreen()+" inches "+phone1.getPrice()+" som");
        System.out.println(phone2.brand+" "+phone2.version+" "+phone2.memory+"GB "+phone2.getScreen()+" inches "+phone2.getPrice()+" som");
    }
}
