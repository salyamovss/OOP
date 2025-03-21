package market;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        Product product = new Product();

        boolean isTrue = true;

        boolean isAuthenticated = false;

        while (isTrue){
            System.out.println("""
                      MENU
                1. Register
                2. Login
                3. Add product
                4. Get All Products
                5. Exit
                """);
            System.out.println("choose method: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1: user.register(); break;
                case 2:
                    if(user.login()){
                        isAuthenticated = true;
                    }else {
                        System.out.println("login please");
                    } break;
                case 3:
                    if (isAuthenticated){
                        product.addProduct(user);
                    } else {
                        System.out.println("authentiticade your login");
                    }break;
                case 4:
                    if (isAuthenticated){
                        System.out.println("user.getAllProducts() = " + Arrays.toString(user.getAllProducts()));
                    }else {
                        System.out.println("authentiticade your login");
                    }break;
                case 5: isTrue = false; break;
                default:
                    System.out.println("incorrect choice");
            }
        }
    }
}