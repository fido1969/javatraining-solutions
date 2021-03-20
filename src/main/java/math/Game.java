package math;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;

        String nameOfFirstPlayer = null;
        String nameOfSecondPlayer = null;

        Integer xCoordinateOfFirstPlayer = null;
        Integer yCoordinateOfFirstPlayer = null;
        Integer xCoordinateOfSecondPlayer = null;
        Integer yCoordinateOfSecondPlayer = null;

        while (validInput == false) {

            System.out.println();
            System.out.printf("%50s", "Give the name of the first player: ");
            nameOfFirstPlayer = scanner.nextLine();

            System.out.printf("%50s", "Give X coordinate of the first player: ");
            String inputXcoordinateOfFirstPlayer = scanner.nextLine();

            System.out.printf("%50s", "Give Y coordinate of the first player: ");
            String inputYcoordinateOfFirstPlayer = scanner.nextLine();

            System.out.printf("%50s", "Give the name of the second player: ");
            nameOfSecondPlayer = scanner.nextLine();

            System.out.printf("%50s", "Give X coordinate of the second player: ");
            String inputXcoordinateOfSecondPlayer = scanner.nextLine();

            System.out.printf("%50s", "Give Y coordinate of the second player: ");
            String inputYcoordinateOfSecondPlayer = scanner.nextLine();

            if (nameOfFirstPlayer != "" && nameOfSecondPlayer != "") {

                try {
                    xCoordinateOfFirstPlayer = Integer.parseInt(inputXcoordinateOfFirstPlayer);
                    yCoordinateOfFirstPlayer = Integer.parseInt(inputYcoordinateOfFirstPlayer);

                    xCoordinateOfSecondPlayer = Integer.parseInt(inputXcoordinateOfSecondPlayer);
                    yCoordinateOfSecondPlayer = Integer.parseInt(inputYcoordinateOfSecondPlayer);
                    validInput = true;

                } catch (IllegalArgumentException npe) {
                    System.out.printf("%50s", "Invalid parameter!");
                }
            }
            System.out.println();
        }

        Warrior warriorGood = new Warrior(nameOfFirstPlayer, new Point(xCoordinateOfFirstPlayer, yCoordinateOfFirstPlayer));
        Warrior warriorBad = new Warrior(nameOfSecondPlayer, new Point(xCoordinateOfSecondPlayer, yCoordinateOfSecondPlayer));

        for (int i = 1; warriorBad.isAlive() && warriorGood.isAlive(); i++) {

            System.out.printf(i + ". round");
            System.out.println();
            System.out.println(warriorGood.toString());
            System.out.println(warriorBad.toString());

            if (warriorGood.distance(warriorBad) != 0) {
                warriorGood.move(warriorBad);
                warriorBad.move(warriorGood);
            }

            if (warriorGood.distance(warriorBad) == 0) {
                if (warriorGood.isAlive()) {
                    warriorGood.attack(warriorBad);
                }
                if (warriorBad.isAlive()) {
                    warriorBad.attack(warriorGood);
                }
            }
        }
        System.out.println("Winner: " + (warriorGood.isAlive() ? warriorGood : warriorBad));
    }
}




