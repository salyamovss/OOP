package Task5;

import java.time.LocalDate;

import static Task5.Flower.bestPrice;
import static Task5.Flower.bubbleSortFlowers;

public class Main {
    public static void main(String[] args){

        Flower[] flowers = {
                new Flower("Rose", LocalDate.of(2025, 3, 10), 100),
                new Flower("Lily", LocalDate.of(2025, 3, 12), 150),
                new Flower("Tulip", LocalDate.of(2025, 3, 9), 80),
                new Flower("Orchid", LocalDate.of(2025, 3, 11), 200)
        };

        System.out.println("Самая высокая цена: " + bestPrice(flowers));
        System.out.println("До сортировки:");
        for (Flower flower : flowers) {
            System.out.println(flower.flowerName + " - " + flower.freshness);
        }

        bubbleSortFlowers(flowers);


        System.out.println("\nПосле сортировки:");
        for (Flower flower : flowers) {
            System.out.println(flower.flowerName + " - " + flower.freshness);
        }

    }


}
