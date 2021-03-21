package week04d03;


import java.util.IllegalFormatException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Random random = new Random(2);

        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        System.out.println();
        System.out.println("The number you have to guess: " + number);
        System.out.println("---------------------------------------------------------");

        int yourGuess = 0;
        int counter = 0;
        while (yourGuess != number && counter < 6) {
            System.out.print("I thought a number between 1-100. Give your guess for the number: ");

            yourGuess = Integer.parseInt(scanner.nextLine());
            counter++;

            if (yourGuess > number) {
                System.out.println("The searched number is smaller");
            } else if (yourGuess < number) {
                System.out.println("The searched number is larger");
            } else {
                System.out.println("Your guess is perfect!");
            }
        }
        if (yourGuess != number) {
            System.out.println("---------------------------------------------------------");
            System.out.println("You failed! The searched number was " + number + ".");

        } else {
            System.out.println();
        }
    }
}

