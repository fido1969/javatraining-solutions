package introcontrol;

import java.util.Scanner;

public class IntroControlMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IntroControl introControl = new IntroControl();

        System.out.print("Give an Integer number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Give another Integer number: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(introControl.calculateConsumption(number, number1));

        System.out.print("Give an Integer number: ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(introControl.subtractTenIfGreaterThanTen(number));

        System.out.print("Give an Integer number: ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(introControl.describeNumber(number));

        System.out.print("Give your name: ");
        String name = scanner.nextLine();
        System.out.println(introControl.greetingToJoe(name));

        System.out.print("Give an Integer number: ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(introControl.calculateBonus(number));

        System.out.print("Give an Integer number: ");
        number = scanner.nextInt();
        scanner.nextLine();
        introControl.printNumbers(number);
        System.out.println();

        System.out.print("Give an Integer number: ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Give another Integer number: ");
        number1 = scanner.nextInt();
        scanner.nextLine();
        introControl.printNumbersBetween(number, number1);
    }
}
