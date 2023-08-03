public class FlowerMain {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Rose", 7, 2999);
        Flower flower2 = new Flower("Peony", 10, 3500);
        Flower flower3 = new Flower("gypsophila", 4, 2500);
        Flower flower4 = new Flower("Tulip", 8, 3200);
        Flower flower5 = new Flower("chamomile", 9, 2000);

        Flower[] flowers = {flower1, flower2, flower3, flower4, flower5};

        System.out.println("Expensive " + expensive(flowers));
        System.out.println("Freshness " + freshness(flowers));
    }

    public static Flower expensive(Flower[] flowers) {
        Flower flower = flowers[0];
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].price > flower.price) {
                flower = flowers[i];
            }
        }
        return flower;
    }

    public static Flower freshness(Flower[] flowers) {
        Flower flower = flowers[0];
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].freshness > flower.freshness) {
                flower = flowers[i];
            }
        }
        return flower;
    }
}
