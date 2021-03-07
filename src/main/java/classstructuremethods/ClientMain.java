package classstructuremethods;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give your name: ");
        client.setName(scanner.nextLine());

        System.out.print("Give your year of birth: ");
        client.setYear(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Give your address: ");
        client.setAddress(scanner.nextLine());

        System.out.println();

        System.out.println("Your name: " + client.getName());
        System.out.println("Your year of birth: " + client.getYear());
        System.out.println("Your address: " + client.getAddress());

        System.out.println();

        System.out.print("Give your new address: ");
        client.migrate(scanner.nextLine());

        System.out.println();

        System.out.println("The change of address was succesful!");
        System.out.println("Your new address: " + client.getAddress());
    }
}
