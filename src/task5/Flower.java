package task5;

public class Flower {
    private String flowerName;
    private int freshness;
    private double price;

    public Flower(String flowerName, int freshness, double price) {
        this.flowerName = flowerName;
        this.freshness = freshness;
        this.price = price;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getFreshness() {
        return freshness;
    }

    public double getPrice() {
        return price;
    }

    public static Flower findMostExpensiveFlower(Flower[] flowers) {
        Flower mostExpensive = flowers[0];
        for (Flower flower : flowers) {
            if (flower.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = flower;
            }
        }
        return mostExpensive;
    }

    public static void sortByFreshness(Flower[] flowers) {
        int n = flowers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (flowers[j].getFreshness() < flowers[j + 1].getFreshness()) {
                    Flower temp = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = temp;
                }
            }
        }
    }
}
