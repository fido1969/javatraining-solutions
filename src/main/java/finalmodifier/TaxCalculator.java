package finalmodifier;

import java.util.Scanner;

public class TaxCalculator {

    public static final double VAT = 27;

    public double tax(double price) {
        return price * VAT / 100.0;

    }

    public double priceWithTax(double price) {
        return price += price * VAT / 100.0;
    }

    public static void main(String[] args) {

        TaxCalculator taxCalculator = new TaxCalculator();

        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;

        Double price = null;

        while (validInput == false) {

            System.out.printf("%40s", "Give the price: ");
            String inputPrice = scanner.nextLine();

            try {

                price = Double.parseDouble(inputPrice);
                validInput = true;

            } catch (NumberFormatException nfe) {
                System.out.printf("%40s", "Invalid value of price!");
                System.out.println();
            }
        }
        System.out.println();
        System.out.printf("%40s %6.2f", "The VAT of the given price: ", taxCalculator.tax(price));
        System.out.println();
        System.out.printf("%40s %6.2f", "The given price with VAT: ", taxCalculator.priceWithTax(price));
    }
}
