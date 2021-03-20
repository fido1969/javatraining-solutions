package finalmodifier;

import java.util.Scanner;

public class PiMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;

        Double radius = null;

        Double height = null;

        while (validInput == false) {

            System.out.println();

            System.out.printf("%40s", "Give the radius: ");
            String inputRadius = scanner.nextLine();

            System.out.printf("%40s", "Give the height: ");
            String inputHeight = scanner.nextLine();

            try {

                radius = Double.parseDouble(inputRadius);
                height = Double.parseDouble(inputHeight);
                validInput = true;

            } catch (NumberFormatException nfi) {
                System.out.printf("%40s", "Invalid number!");
            }
        }
        System.out.println();
        System.out.printf("%40s %6.2f", "Perimeter of the circle: ", new CircleCalculator().calculatePerimeter(radius));
        System.out.println();
        System.out.printf("%40s %6.2f", "Area of the circle: ", new CircleCalculator().calculateArea(radius));
        System.out.println();
        System.out.printf("%40s %6.2f", "Volume of the cylinder: ", new CylinderCalculator().calculateVolume(radius, height));
        System.out.println();
        System.out.printf("%40s %6.2f", "Surface area of the cylinder: ", new CylinderCalculator().calculateSurfaceArea(radius, height));
        System.out.println();
    }
}
