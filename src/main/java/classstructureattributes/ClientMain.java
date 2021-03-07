package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give your name: ");
        String name = scanner.nextLine();
        System.out.print("Give your year of birth: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Give your address: ");
        String address = scanner.nextLine();
        System.out.println();

        System.out.println("Your name is " + name);
        System.out.println("Your year of birth: " + year);
        System.out.println("Your address: " + address);
    }
}
