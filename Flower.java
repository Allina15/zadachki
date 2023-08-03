public class Flower {
    String flowerName;
    int freshness;
    int price;

    public Flower(String flowerName, int freshness, int price) {
        this.flowerName = flowerName;
        this.freshness = freshness;
        this.price = price;
    }

    @Override
    public String toString() {
        return "flower name=" + flowerName +
                ", freshness=" + freshness +
                ", price=" + price ;
    }
}
