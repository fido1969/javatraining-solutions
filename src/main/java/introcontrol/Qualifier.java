package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number > 100) {
            System.out.println(number + " is larger than 100.");
        } else if (number == 100) {
            System.out.println(number + " is equal with 100.");
        } else {
            System.out.println(number + " is smaller than 100.");
        }
    }
}
