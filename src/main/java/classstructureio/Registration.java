package classstructureio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Give your name: ");
        String name=scanner.nextLine();
        System.out.print("Give your E-mail address: ");
        String email=scanner.nextLine();
        System.out.println();
        System.out.println("Your name: "+name);
        System.out.println("Your E-mail address: "+email);
    }
}
