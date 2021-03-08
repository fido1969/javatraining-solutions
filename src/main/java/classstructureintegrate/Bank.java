package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("The name of the owner of the bankaccount: ");
        String name = scanner.nextLine();

        System.out.print("Opening balance: ");
        int balance = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The accountnumber format should be \"xxxx-xxxx\"");
        System.out.print("The number of the bankaccount: ");
        String accountNumber = scanner.nextLine();

        BankAccount bankAccountSource = new BankAccount(accountNumber, name, balance);
        System.out.println();

        System.out.print("The name of the owner of the bankaccount: ");
        name = scanner.nextLine();

        System.out.print("Opening balance: ");
        balance = scanner.nextInt();
        scanner.nextLine();

        System.out.println("The accountnumber format should be \"xxxx-xxxx\"");
        System.out.print("The number of the bankaccount: ");
        accountNumber = scanner.nextLine();

        BankAccount bankAccountTarget = new BankAccount(accountNumber, name, balance);
        System.out.println();

        System.out.println("Current balance: " + bankAccountSource.getInfo());
        System.out.println("Current balance: " + bankAccountTarget.getInfo());

        System.out.println();

        System.out.print("Give the amount of deposit: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        bankAccountSource.deposit(amount);
        System.out.println("Current balance: " + bankAccountSource.getInfo());
        System.out.println();

        System.out.print("Give the amount of withdraw: ");
        amount = scanner.nextInt();
        scanner.nextLine();
        bankAccountSource.withdraw(amount);
        System.out.println("Current balance: " + bankAccountSource.getInfo());
        System.out.println("Current balance: " + bankAccountTarget.getInfo());
        System.out.println();

        System.out.print("Give the amount of transfer: ");
        amount = scanner.nextInt();
        scanner.nextLine();
        bankAccountSource.transfer(bankAccountTarget, amount);
        System.out.println();
        System.out.println("Current balance: " + bankAccountSource.getInfo());
        System.out.println("Current balance: " + bankAccountTarget.getInfo());
    }
}
