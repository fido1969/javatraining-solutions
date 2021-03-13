package introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int index;

        System.out.println("           MENU list");
        System.out.println("1. Print the list of the users");
        System.out.println("2. Register a new user in the list");
        System.out.println("3. Other: Exit the list");
        System.out.println("-----------------------------------");

        do {
            System.out.print("Selet from the upper MENU: ");
            index = scanner.nextInt();
            scanner.nextLine();

            switch (index) {
                case 1: {
                    System.out.println("1. Print the list of the users");
                    break;
                }
                case 2: {
                    System.out.println("2. Register a new user in the list");
                    break;
                }
            }
        } while (index < 3);
    }
}
