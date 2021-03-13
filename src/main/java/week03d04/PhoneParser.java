package week03d04;

import java.util.Scanner;

public class PhoneParser {

    public Phone parse(String text) {

        String prefix = text.substring(0, text.indexOf("-"));
        String number = text.substring(text.indexOf("-") + 1);
        Phone phone = new Phone(prefix, number);

        return phone;
    }

    /*public static void main(String[] args) {
        PhoneParser phoneParser = new PhoneParser();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give the text: ");
        String text = scanner.nextLine();

        System.out.println(phoneParser.parse(text));
    }*/
}
