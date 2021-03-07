package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give your name: ");
        client.name = scanner.nextLine();
        System.out.print("Give your year of birth: ");
        client.year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Give your address: ");
        client.address = scanner.nextLine();
        System.out.println();

        System.out.println("Your name is " + client.name);
        System.out.println("Your year of birth: " + client.year);
        System.out.println("Your address: " + client.address);
    }
}
