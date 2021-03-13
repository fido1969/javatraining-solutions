package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.println("Give 5 numbers: ");
        System.out.println("------------------");

        int number;
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". number: ");
            number = scanner.nextInt();
            scanner.nextLine();
            sum += number;
        }
        System.out.println();
        System.out.println("The sum of the 5 numbers is " + sum+".");
    }
}
