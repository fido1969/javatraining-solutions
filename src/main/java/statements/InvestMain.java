package statements;

import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("The invested amount: ");
        int fund = scanner.nextInt();
        scanner.nextLine();

        System.out.print("The interest rate: ");
        int interestRate = scanner.nextInt();
        scanner.nextLine();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("The fund: " + investment.getFund());
        System.out.println("The yield for 50 days: " + investment.getYield(50));
        System.out.println("The withdrawed money for 80 days: " + investment.close(80));
        System.out.println("The withdrawed money for 90 days: " + investment.close(90));
    }
}
