package Task5;

import java.time.LocalDate;
import java.util.Arrays;

public class Flower {
    String flowerName;
    LocalDate freshness;
    int price;

    public Flower(String flowerName, LocalDate freshness, int price) {
        this.flowerName = flowerName;
        this.freshness = freshness;
        this.price = price;
    }


    public static int bestPrice(Flower[] flowers) {
        int bestPrice = 0;
        for (Flower flower : flowers) {
            if (flower.price > bestPrice) {
                bestPrice = flower.price;
            }
        }
        return bestPrice;
    }
