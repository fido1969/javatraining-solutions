package introdate;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Give your name: ");
        String name = scanner.nextLine();

        System.out.println();

        System.out.println("Give your birth of year!");
        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Month: ");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Day: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        Employee employee = new Employee(name, year, month, day);

        System.out.println("-------------------------------------------------------------------");
        System.out.println();

        System.out.println("Name of the employee: " + employee.getName());
        System.out.println("Date of birth of the employee: " + employee.getDateOfBirth());
        System.out.println("Begining of employment: " + employee.getBeginEmployment());

        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();

        System.out.print("Change your name: ");
        employee.setName(scanner.nextLine());

        System.out.print("Your new name is ");
        System.out.print(employee.getName());
    }
}
