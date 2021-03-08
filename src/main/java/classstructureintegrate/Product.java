package classstructureintegrate;

import java.util.Scanner;

public class Product {

    private String name;

    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int amount) {
        price += amount;
    }

    public void decreasePrice(int amount) {
        price -= amount;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the name of the product: ");
        String productName = scanner.nextLine();

        System.out.print("Give the price of the " + productName + ": ");
        int price = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        Product product = new Product(productName, price);
        System.out.println("Name of the product: " + product.getName());
        System.out.println("The current price of the " + product.getName() + ": " + product.getPrice() + " Ft");

        System.out.println();

        System.out.print("Increase the price of the " + product.getName() + ": ");
        product.increasePrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("The new price of the " + product.getName() + ": " + product.getPrice() + " Ft");

        System.out.println();

        System.out.print("Decrease the price of the " + product.getName() + ": ");
        product.decreasePrice(scanner.nextInt());
        scanner.nextLine();
        System.out.println("The new price of the " + product.getName() + ": " + product.getPrice() + " Ft");
    }
}
