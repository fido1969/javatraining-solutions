package finalmodifier;

import java.util.Scanner;

public class PiMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean invalidInput = false;

        while (invalidInput == false) {

            System.out.println();
            System.out.printf("%40s", "Give the radius: ");
            String input = scanner.nextLine();

            try {
                double radius = Double.parseDouble(input);
                invalidInput = true;
            } catch (NumberFormatException nfi) {
                System.out.printf("%40s", "Invalid number!");
            }
            System.out.println();
        }
        System.out.printf("%40s %6.2f", "Perimeter of the circle: ", new CircleCalculator().calculatePerimeter(2));
        System.out.println();
        System.out.printf("%40s %6.2f", "Area of the circle: ", new CircleCalculator().calculateArea(2));
        System.out.println();
        System.out.printf("%40s %6.2f", "Volume of the cylinder: ", new CylinderCalculator().calculateVolume(2, 2));
        System.out.println();
        System.out.printf("%40s %6.2f", "Surface area of the cylinder: ", new CylinderCalculator().calculateSurfaceArea(2, 2));
        System.out.println();
    }
}
