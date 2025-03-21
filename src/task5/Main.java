package task5;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower("roza", 9, 150);
        Flower flower2 = new Flower("tulpan", 7, 200);
        Flower flower3 = new Flower("blue roza", 10, 250);
        Flower flower4 = new Flower("white roza", 8, 200);
        Flower flower5 = new Flower("piona", 9, 350);

        Flower[] flowers = {flower1, flower2, flower3, flower4, flower5};

        Flower.sortByFreshness(flowers);

        System.out.println("Цветы отсортированы по свежести:");
        for (Flower flower : flowers) {
            System.out.println(flower.getFlowerName() + " - Свежесть: " + flower.getFreshness());
        }

        Flower mostExpensive = Flower.findMostExpensiveFlower(flowers);
        System.out.println("Самый дорогой цветок: " + mostExpensive.getFlowerName() +
                           ", цена: " + mostExpensive.getPrice());
    }
}
