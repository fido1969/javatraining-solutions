//Számológép
//Készíts egy Calculator osztályt a classstructureio csomagba! A main metódusban kérj be a felhasználótól két egész számot!
// Az első sorban írd ki a műveletet a következő formátumban: 5 + 10! A második sorban írd ki az eredményt (15)!
package classstructureio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the first number: ");
        int numberFirst = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Give the second number: ");
        int numberSecond = scanner.nextInt();
        System.out.println();
        System.out.println(numberFirst + " + " + numberSecond);
        System.out.println(numberFirst + numberSecond);
        System.out.println();
    }
}
