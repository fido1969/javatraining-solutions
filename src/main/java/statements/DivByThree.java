package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give an integer number: ");

        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println(number % 3 == 0 ? number + " can be devided by 3." : number + " can not be devided by 3.6" );
    }
}
