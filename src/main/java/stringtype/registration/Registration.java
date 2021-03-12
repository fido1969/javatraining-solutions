package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserValidator userValidator = new UserValidator();

        System.out.print("Give your username: ");
        String userName = scanner.nextLine();
        System.out.println(userValidator.isValidUserName(userName) ? "Username is correct" : "Username is not correct");

        System.out.print("Give your username: ");
        userName = scanner.nextLine();
        System.out.println(userValidator.isValidUserName(userName) ? "Username is correct" : "Username is not correct");

        System.out.print("Give your username: ");
        userName = scanner.nextLine();
        System.out.println(userValidator.isValidUserName(userName) ? "Username is correct" : "Username is not correct");

        System.out.print("Give your password: ");
        String password1 = scanner.nextLine();
        System.out.print("Give your password again: ");
        String password2 = scanner.nextLine();
        System.out.println(userValidator.isValidPassWord(password1, password2) ? "password is correct" : "password is not correct");

        System.out.print("Give your password: ");
        password1 = scanner.nextLine();
        System.out.print("Give your password again: ");
        password2 = scanner.nextLine();
        System.out.println(userValidator.isValidPassWord(password1, password2) ? "password is correct" : "password is not correct");

        System.out.print("Give your password: ");
        password1 = scanner.nextLine();
        System.out.print("Give your password again: ");
        password2 = scanner.nextLine();
        System.out.println(userValidator.isValidPassWord(password1, password2) ? "password is correct" : "password is not correct");

        System.out.print("Give your password: ");
        password1 = scanner.nextLine();
        System.out.print("Give your password again: ");
        password2 = scanner.nextLine();
        System.out.println(userValidator.isValidPassWord(password1, password2) ? "password is correct" : "password is not correct");

        System.out.print("Give your email: ");
        String emai = scanner.nextLine();
        System.out.println(userValidator.isValidEmail(emai) ? "emai is correct" : "emai is not correct");

        System.out.print("Give your email: ");
        emai = scanner.nextLine();
        System.out.println(userValidator.isValidEmail(emai) ? "emai is correct" : "emai is not correct");

        System.out.print("Give your email: ");
        emai = scanner.nextLine();
        System.out.println(userValidator.isValidEmail(emai) ? "emai is correct" : "emai is not correct");

        System.out.print("Give your email: ");
        emai = scanner.nextLine();
        System.out.println(userValidator.isValidEmail(emai) ? "emai is correct" : "emai is not correct");

        System.out.print("Give your email: ");
        emai = scanner.nextLine();
        System.out.println(userValidator.isValidEmail(emai) ? "emai is correct" : "emai is not correct");

        System.out.print("Give your email: ");
        emai = scanner.nextLine();
        System.out.println(userValidator.isValidEmail(emai) ? "emai is correct" : "emai is not correct");
    }
}
