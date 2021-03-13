package introcontrol;

import java.util.Scanner;

public class BoatRental {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println(" Boats for renting");
        System.out.println("1 boat for 5 persons");
        System.out.println("1 boat for 3 persons");
        System.out.println("1 boat for 2 persons");
        System.out.println("--------------------");
        System.out.println();

        System.out.print("Give the number of the persons in the group: ");
        int personsInGroup = scanner.nextInt();
        scanner.nextLine();

        int freeNumberOfBoat = 3;
        int freeEmptySpace = 10;

        if (personsInGroup > 3) {
            freeNumberOfBoat--;
            freeEmptySpace -= 5;
            personsInGroup -= 5;
            System.out.println("The boat for 5 persons was taken.");
        }

        if (personsInGroup > 2) {
            freeNumberOfBoat--;
            freeEmptySpace -= 3;
            personsInGroup -= 3;
            System.out.println("The boat for 3 persons was taken.");
        }

        if (personsInGroup > 0) {
            freeNumberOfBoat--;
            freeEmptySpace -= 2;
            personsInGroup -= 2;
            System.out.println("The boat for 2 persons was taken.");
        }
        if (personsInGroup > 0) {
            System.out.println(personsInGroup + " persons remained on the cost");
        } else {
            System.out.println("Still have " + freeEmptySpace + " empty space.");
            System.out.println("Still have " + freeNumberOfBoat + " empty boat.");
        }
    }
}
