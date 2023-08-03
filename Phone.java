public class Phone {
    String brand;
    String version;
    int memory;
    int price;
    double screen;

    public Phone(String brand, String version, int memory) {
        this.brand = brand;
        this.version = version;
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }
}
