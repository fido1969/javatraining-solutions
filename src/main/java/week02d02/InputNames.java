package week02d02;

import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Please give Five names!");
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print("Give the "+(i + 1) + ".name: ");
            names[i] = scanner.nextLine();
        }

        System.out.println();
        System.out.println("The items of the array:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(i + 1 + ".item = " + names[i]);
        }
    }
}
